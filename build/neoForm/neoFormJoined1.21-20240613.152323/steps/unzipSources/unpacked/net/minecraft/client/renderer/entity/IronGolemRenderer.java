package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.model.IronGolemModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.layers.IronGolemCrackinessLayer;
import net.minecraft.client.renderer.entity.layers.IronGolemFlowerLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.IronGolem;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class IronGolemRenderer extends MobRenderer<IronGolem, IronGolemModel<IronGolem>> {
    private static final ResourceLocation GOLEM_LOCATION = ResourceLocation.withDefaultNamespace("textures/entity/iron_golem/iron_golem.png");

    public IronGolemRenderer(EntityRendererProvider.Context p_174188_) {
        super(p_174188_, new IronGolemModel<>(p_174188_.bakeLayer(ModelLayers.IRON_GOLEM)), 0.7F);
        this.addLayer(new IronGolemCrackinessLayer(this));
        this.addLayer(new IronGolemFlowerLayer(this, p_174188_.getBlockRenderDispatcher()));
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getTextureLocation(IronGolem pEntity) {
        return GOLEM_LOCATION;
    }

    protected void setupRotations(IronGolem pEntity, PoseStack pPoseStack, float pBob, float pYBodyRot, float pPartialTick, float pScale) {
        super.setupRotations(pEntity, pPoseStack, pBob, pYBodyRot, pPartialTick, pScale);
        if (!((double)pEntity.walkAnimation.speed() < 0.01)) {
            float f = 13.0F;
            float f1 = pEntity.walkAnimation.position(pPartialTick) + 6.0F;
            float f2 = (Math.abs(f1 % 13.0F - 6.5F) - 3.25F) / 3.25F;
            pPoseStack.mulPose(Axis.ZP.rotationDegrees(6.5F * f2));
        }
    }
}
