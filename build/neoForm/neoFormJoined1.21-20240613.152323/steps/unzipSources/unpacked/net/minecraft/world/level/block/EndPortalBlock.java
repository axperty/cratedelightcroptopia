package net.minecraft.world.level.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.TheEndPortalBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.EndPlatformFeature;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.portal.DimensionTransition;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EndPortalBlock extends BaseEntityBlock implements Portal {
    public static final MapCodec<EndPortalBlock> CODEC = simpleCodec(EndPortalBlock::new);
    protected static final VoxelShape SHAPE = Block.box(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

    @Override
    public MapCodec<EndPortalBlock> codec() {
        return CODEC;
    }

    public EndPortalBlock(BlockBehaviour.Properties p_53017_) {
        super(p_53017_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new TheEndPortalBlockEntity(pPos, pState);
    }

    @Override
    protected VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    protected void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        if (pEntity.canUsePortal(false)
            && Shapes.joinIsNotEmpty(
                Shapes.create(pEntity.getBoundingBox().move((double)(-pPos.getX()), (double)(-pPos.getY()), (double)(-pPos.getZ()))),
                pState.getShape(pLevel, pPos),
                BooleanOp.AND
            )) {
            if (!pLevel.isClientSide && pLevel.dimension() == Level.END && pEntity instanceof ServerPlayer serverplayer && !serverplayer.seenCredits) {
                serverplayer.showEndCredits();
                return;
            }

            pEntity.setAsInsidePortal(this, pPos);
        }
    }

    @Override
    public DimensionTransition getPortalDestination(ServerLevel pLevel, Entity pEntity, BlockPos pPos) {
        ResourceKey<Level> resourcekey = pLevel.dimension() == Level.END ? Level.OVERWORLD : Level.END;
        ServerLevel serverlevel = pLevel.getServer().getLevel(resourcekey);
        if (serverlevel == null) {
            return null;
        } else {
            boolean flag = resourcekey == Level.END;
            BlockPos blockpos = flag ? ServerLevel.END_SPAWN_POINT : serverlevel.getSharedSpawnPos();
            Vec3 vec3 = blockpos.getBottomCenter();
            float f = pEntity.getYRot();
            if (flag) {
                EndPlatformFeature.createEndPlatform(serverlevel, BlockPos.containing(vec3).below(), true);
                f = Direction.WEST.toYRot();
                if (pEntity instanceof ServerPlayer) {
                    vec3 = vec3.subtract(0.0, 1.0, 0.0);
                }
            } else {
                if (pEntity instanceof ServerPlayer serverplayer) {
                    return serverplayer.findRespawnPositionAndUseSpawnBlock(false, DimensionTransition.DO_NOTHING);
                }

                vec3 = pEntity.adjustSpawnLocation(serverlevel, blockpos).getBottomCenter();
            }

            return new DimensionTransition(
                serverlevel,
                vec3,
                pEntity.getDeltaMovement(),
                f,
                pEntity.getXRot(),
                DimensionTransition.PLAY_PORTAL_SOUND.then(DimensionTransition.PLACE_PORTAL_TICKET)
            );
        }
    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles).
     */
    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {
        double d0 = (double)pPos.getX() + pRandom.nextDouble();
        double d1 = (double)pPos.getY() + 0.8;
        double d2 = (double)pPos.getZ() + pRandom.nextDouble();
        pLevel.addParticle(ParticleTypes.SMOKE, d0, d1, d2, 0.0, 0.0, 0.0);
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader pLevel, BlockPos pPos, BlockState pState) {
        return ItemStack.EMPTY;
    }

    @Override
    protected boolean canBeReplaced(BlockState pState, Fluid pFluid) {
        return false;
    }
}
