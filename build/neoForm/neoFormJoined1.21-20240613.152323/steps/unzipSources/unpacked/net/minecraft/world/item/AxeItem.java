package net.minecraft.world.item;

import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class AxeItem extends DiggerItem {
    protected static final Map<Block, Block> STRIPPABLES = new Builder<Block, Block>()
        .put(Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_WOOD)
        .put(Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG)
        .put(Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD)
        .put(Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG)
        .put(Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD)
        .put(Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG)
        .put(Blocks.CHERRY_WOOD, Blocks.STRIPPED_CHERRY_WOOD)
        .put(Blocks.CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG)
        .put(Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD)
        .put(Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG)
        .put(Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD)
        .put(Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG)
        .put(Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD)
        .put(Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG)
        .put(Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM)
        .put(Blocks.WARPED_HYPHAE, Blocks.STRIPPED_WARPED_HYPHAE)
        .put(Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM)
        .put(Blocks.CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_HYPHAE)
        .put(Blocks.MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_WOOD)
        .put(Blocks.MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG)
        .put(Blocks.BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK)
        .build();

    public AxeItem(Tier p_40521_, Item.Properties p_40524_) {
        super(p_40521_, BlockTags.MINEABLE_WITH_AXE, p_40524_);
    }

    /**
     * Called when this item is used when targeting a Block
     */
    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos blockpos = pContext.getClickedPos();
        Player player = pContext.getPlayer();
        if (playerHasShieldUseIntent(pContext)) {
            return InteractionResult.PASS;
        } else {
            Optional<BlockState> optional = this.evaluateNewBlockState(level, blockpos, player, level.getBlockState(blockpos), pContext);
            if (optional.isEmpty()) {
                return InteractionResult.PASS;
            } else {
                ItemStack itemstack = pContext.getItemInHand();
                if (player instanceof ServerPlayer) {
                    CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)player, blockpos, itemstack);
                }

                level.setBlock(blockpos, optional.get(), 11);
                level.gameEvent(GameEvent.BLOCK_CHANGE, blockpos, GameEvent.Context.of(player, optional.get()));
                if (player != null) {
                    itemstack.hurtAndBreak(1, player, LivingEntity.getSlotForHand(pContext.getHand()));
                }

                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }
    }

    private static boolean playerHasShieldUseIntent(UseOnContext pContext) {
        Player player = pContext.getPlayer();
        return pContext.getHand().equals(InteractionHand.MAIN_HAND) && player.getOffhandItem().is(Items.SHIELD) && !player.isSecondaryUseActive();
    }

    private Optional<BlockState> evaluateNewBlockState(Level pLevel, BlockPos pPos, @Nullable Player pPlayer, BlockState pState, UseOnContext p_40529_) {
        Optional<BlockState> optional = Optional.ofNullable(pState.getToolModifiedState(p_40529_, net.neoforged.neoforge.common.ItemAbilities.AXE_STRIP, false));
        if (optional.isPresent()) {
            pLevel.playSound(pPlayer, pPos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            return optional;
        } else {
            Optional<BlockState> optional1 = Optional.ofNullable(pState.getToolModifiedState(p_40529_, net.neoforged.neoforge.common.ItemAbilities.AXE_SCRAPE, false));
            if (optional1.isPresent()) {
                pLevel.playSound(pPlayer, pPos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
                pLevel.levelEvent(pPlayer, 3005, pPos, 0);
                return optional1;
            } else {
                Optional<BlockState> optional2 = Optional.ofNullable(pState.getToolModifiedState(p_40529_, net.neoforged.neoforge.common.ItemAbilities.AXE_WAX_OFF, false));
                if (optional2.isPresent()) {
                    pLevel.playSound(pPlayer, pPos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
                    pLevel.levelEvent(pPlayer, 3004, pPos, 0);
                    return optional2;
                } else {
                    return Optional.empty();
                }
            }
        }
    }

    @org.jetbrains.annotations.Nullable
    public static BlockState getAxeStrippingState(BlockState originalState) {
        Block block = STRIPPABLES.get(originalState.getBlock());
        return block != null ? block.defaultBlockState().setValue(RotatedPillarBlock.AXIS, originalState.getValue(RotatedPillarBlock.AXIS)) : null;
    }

    private Optional<BlockState> getStripped(BlockState pUnstrippedState) {
        return Optional.ofNullable(STRIPPABLES.get(pUnstrippedState.getBlock()))
            .map(p_150689_ -> p_150689_.defaultBlockState().setValue(RotatedPillarBlock.AXIS, pUnstrippedState.getValue(RotatedPillarBlock.AXIS)));
    }

    @Override
    public boolean canPerformAction(ItemStack stack, net.neoforged.neoforge.common.ItemAbility itemAbility) {
        return net.neoforged.neoforge.common.ItemAbilities.DEFAULT_AXE_ACTIONS.contains(itemAbility);
    }
}
