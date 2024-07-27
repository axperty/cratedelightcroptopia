package net.minecraft.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ShieldModel;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.TridentModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.blockentity.SkullBlockRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.level.block.AbstractBannerBlock;
import net.minecraft.world.level.block.AbstractSkullBlock;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.entity.BannerBlockEntity;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import net.minecraft.world.level.block.entity.BedBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.entity.ConduitBlockEntity;
import net.minecraft.world.level.block.entity.DecoratedPotBlockEntity;
import net.minecraft.world.level.block.entity.EnderChestBlockEntity;
import net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.world.level.block.entity.TrappedChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockEntityWithoutLevelRenderer implements ResourceManagerReloadListener {
    private static final ShulkerBoxBlockEntity[] SHULKER_BOXES = Arrays.stream(DyeColor.values())
        .sorted(Comparator.comparingInt(DyeColor::getId))
        .map(p_172557_ -> new ShulkerBoxBlockEntity(p_172557_, BlockPos.ZERO, Blocks.SHULKER_BOX.defaultBlockState()))
        .toArray(ShulkerBoxBlockEntity[]::new);
    private static final ShulkerBoxBlockEntity DEFAULT_SHULKER_BOX = new ShulkerBoxBlockEntity(BlockPos.ZERO, Blocks.SHULKER_BOX.defaultBlockState());
    private final ChestBlockEntity chest = new ChestBlockEntity(BlockPos.ZERO, Blocks.CHEST.defaultBlockState());
    private final ChestBlockEntity trappedChest = new TrappedChestBlockEntity(BlockPos.ZERO, Blocks.TRAPPED_CHEST.defaultBlockState());
    private final EnderChestBlockEntity enderChest = new EnderChestBlockEntity(BlockPos.ZERO, Blocks.ENDER_CHEST.defaultBlockState());
    private final BannerBlockEntity banner = new BannerBlockEntity(BlockPos.ZERO, Blocks.WHITE_BANNER.defaultBlockState());
    private final BedBlockEntity bed = new BedBlockEntity(BlockPos.ZERO, Blocks.RED_BED.defaultBlockState());
    private final ConduitBlockEntity conduit = new ConduitBlockEntity(BlockPos.ZERO, Blocks.CONDUIT.defaultBlockState());
    private final DecoratedPotBlockEntity decoratedPot = new DecoratedPotBlockEntity(BlockPos.ZERO, Blocks.DECORATED_POT.defaultBlockState());
    private ShieldModel shieldModel;
    private TridentModel tridentModel;
    private Map<SkullBlock.Type, SkullModelBase> skullModels;
    private final BlockEntityRenderDispatcher blockEntityRenderDispatcher;
    private final EntityModelSet entityModelSet;

    public BlockEntityWithoutLevelRenderer(BlockEntityRenderDispatcher pBlockEntityRenderDispatcher, EntityModelSet pEntityModelSet) {
        this.blockEntityRenderDispatcher = pBlockEntityRenderDispatcher;
        this.entityModelSet = pEntityModelSet;
    }

    @Override
    public void onResourceManagerReload(ResourceManager pResourceManager) {
        this.shieldModel = new ShieldModel(this.entityModelSet.bakeLayer(ModelLayers.SHIELD));
        this.tridentModel = new TridentModel(this.entityModelSet.bakeLayer(ModelLayers.TRIDENT));
        this.skullModels = SkullBlockRenderer.createSkullRenderers(this.entityModelSet);
    }

    public void renderByItem(ItemStack pStack, ItemDisplayContext pDisplayContext, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, int pPackedOverlay) {
        Item item = pStack.getItem();
        if (item instanceof BlockItem) {
            Block block = ((BlockItem)item).getBlock();
            if (block instanceof AbstractSkullBlock abstractskullblock) {
                ResolvableProfile resolvableprofile = pStack.get(DataComponents.PROFILE);
                if (resolvableprofile != null && !resolvableprofile.isResolved()) {
                    pStack.remove(DataComponents.PROFILE);
                    resolvableprofile.resolve().thenAcceptAsync(p_329787_ -> pStack.set(DataComponents.PROFILE, p_329787_), Minecraft.getInstance());
                    resolvableprofile = null;
                }

                SkullModelBase skullmodelbase = this.skullModels.get(abstractskullblock.getType());
                RenderType rendertype = SkullBlockRenderer.getRenderType(abstractskullblock.getType(), resolvableprofile);
                SkullBlockRenderer.renderSkull(null, 180.0F, 0.0F, pPoseStack, pBuffer, pPackedLight, skullmodelbase, rendertype);
            } else {
                BlockState blockstate = block.defaultBlockState();
                BlockEntity blockentity;
                if (block instanceof AbstractBannerBlock) {
                    this.banner.fromItem(pStack, ((AbstractBannerBlock)block).getColor());
                    blockentity = this.banner;
                } else if (block instanceof BedBlock) {
                    this.bed.setColor(((BedBlock)block).getColor());
                    blockentity = this.bed;
                } else if (blockstate.is(Blocks.CONDUIT)) {
                    blockentity = this.conduit;
                } else if (blockstate.is(Blocks.CHEST)) {
                    blockentity = this.chest;
                } else if (blockstate.is(Blocks.ENDER_CHEST)) {
                    blockentity = this.enderChest;
                } else if (blockstate.is(Blocks.TRAPPED_CHEST)) {
                    blockentity = this.trappedChest;
                } else if (blockstate.is(Blocks.DECORATED_POT)) {
                    this.decoratedPot.setFromItem(pStack);
                    blockentity = this.decoratedPot;
                } else {
                    if (!(block instanceof ShulkerBoxBlock)) {
                        return;
                    }

                    DyeColor dyecolor1 = ShulkerBoxBlock.getColorFromItem(item);
                    if (dyecolor1 == null) {
                        blockentity = DEFAULT_SHULKER_BOX;
                    } else {
                        blockentity = SHULKER_BOXES[dyecolor1.getId()];
                    }
                }

                this.blockEntityRenderDispatcher.renderItem(blockentity, pPoseStack, pBuffer, pPackedLight, pPackedOverlay);
            }
        } else {
            if (pStack.is(Items.SHIELD)) {
                BannerPatternLayers bannerpatternlayers = pStack.getOrDefault(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY);
                DyeColor dyecolor = pStack.get(DataComponents.BASE_COLOR);
                boolean flag = !bannerpatternlayers.layers().isEmpty() || dyecolor != null;
                pPoseStack.pushPose();
                pPoseStack.scale(1.0F, -1.0F, -1.0F);
                Material material = flag ? ModelBakery.SHIELD_BASE : ModelBakery.NO_PATTERN_SHIELD;
                VertexConsumer vertexconsumer = material.sprite()
                    .wrap(ItemRenderer.getFoilBufferDirect(pBuffer, this.shieldModel.renderType(material.atlasLocation()), true, pStack.hasFoil()));
                this.shieldModel.handle().render(pPoseStack, vertexconsumer, pPackedLight, pPackedOverlay);
                if (flag) {
                    BannerRenderer.renderPatterns(
                        pPoseStack,
                        pBuffer,
                        pPackedLight,
                        pPackedOverlay,
                        this.shieldModel.plate(),
                        material,
                        false,
                        Objects.requireNonNullElse(dyecolor, DyeColor.WHITE),
                        bannerpatternlayers,
                        pStack.hasFoil()
                    );
                } else {
                    this.shieldModel.plate().render(pPoseStack, vertexconsumer, pPackedLight, pPackedOverlay);
                }

                pPoseStack.popPose();
            } else if (pStack.is(Items.TRIDENT)) {
                pPoseStack.pushPose();
                pPoseStack.scale(1.0F, -1.0F, -1.0F);
                VertexConsumer vertexconsumer1 = ItemRenderer.getFoilBufferDirect(
                    pBuffer, this.tridentModel.renderType(TridentModel.TEXTURE), false, pStack.hasFoil()
                );
                this.tridentModel.renderToBuffer(pPoseStack, vertexconsumer1, pPackedLight, pPackedOverlay);
                pPoseStack.popPose();
            }
        }
    }
}
