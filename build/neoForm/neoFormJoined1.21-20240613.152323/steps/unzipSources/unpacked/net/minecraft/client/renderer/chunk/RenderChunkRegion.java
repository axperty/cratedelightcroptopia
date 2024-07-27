package net.minecraft.client.renderer.chunk;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LevelLightEngine;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderChunkRegion implements BlockAndTintGetter {
    public static final int RADIUS = 1;
    public static final int SIZE = 3;
    private final int minChunkX;
    private final int minChunkZ;
    protected final RenderChunk[] chunks;
    protected final Level level;
    private final it.unimi.dsi.fastutil.longs.Long2ObjectFunction<net.neoforged.neoforge.client.model.data.ModelData> modelDataSnapshot;

    @Deprecated
    RenderChunkRegion(Level pLevel, int pMinChunkX, int pMinChunkZ, RenderChunk[] pChunks) {
        this(pLevel, pMinChunkX, pMinChunkZ, pChunks, net.neoforged.neoforge.client.model.data.ModelDataManager.EMPTY_SNAPSHOT);
    }
    RenderChunkRegion(Level pLevel, int pMinChunkX, int pMinChunkZ, RenderChunk[] pChunks, it.unimi.dsi.fastutil.longs.Long2ObjectFunction<net.neoforged.neoforge.client.model.data.ModelData> modelDataSnapshot) {
        this.level = pLevel;
        this.minChunkX = pMinChunkX;
        this.minChunkZ = pMinChunkZ;
        this.chunks = pChunks;
        this.modelDataSnapshot = modelDataSnapshot;
    }

    @Override
    public BlockState getBlockState(BlockPos pPos) {
        return this.getChunk(SectionPos.blockToSectionCoord(pPos.getX()), SectionPos.blockToSectionCoord(pPos.getZ())).getBlockState(pPos);
    }

    @Override
    public FluidState getFluidState(BlockPos pPos) {
        return this.getChunk(SectionPos.blockToSectionCoord(pPos.getX()), SectionPos.blockToSectionCoord(pPos.getZ()))
            .getBlockState(pPos)
            .getFluidState();
    }

    @Override
    public float getShade(Direction pDirection, boolean pShade) {
        return this.level.getShade(pDirection, pShade);
    }

    @Override
    public LevelLightEngine getLightEngine() {
        return this.level.getLightEngine();
    }

    @Nullable
    @Override
    public BlockEntity getBlockEntity(BlockPos pPos) {
        return this.getChunk(SectionPos.blockToSectionCoord(pPos.getX()), SectionPos.blockToSectionCoord(pPos.getZ())).getBlockEntity(pPos);
    }

    private RenderChunk getChunk(int pX, int pZ) {
        return this.chunks[index(this.minChunkX, this.minChunkZ, pX, pZ)];
    }

    @Override
    public int getBlockTint(BlockPos pPos, ColorResolver pColorResolver) {
        return this.level.getBlockTint(pPos, pColorResolver);
    }

    @Override
    public int getMinBuildHeight() {
        return this.level.getMinBuildHeight();
    }

    @Override
    public int getHeight() {
        return this.level.getHeight();
    }

    @Override
    public float getShade(float normalX, float normalY, float normalZ, boolean shade) {
        return this.level.getShade(normalX, normalY, normalZ, shade);
    }

    @Override
    public net.neoforged.neoforge.client.model.data.ModelData getModelData(BlockPos pos) {
        return modelDataSnapshot.get(pos.asLong());
    }

    @Override
    public net.neoforged.neoforge.common.world.AuxiliaryLightManager getAuxLightManager(net.minecraft.world.level.ChunkPos pos) {
        return this.getChunk(pos.x, pos.z).wrapped.getAuxLightManager(pos);
    }

    public static int index(int pMinX, int pMinZ, int pX, int pZ) {
        return pX - pMinX + (pZ - pMinZ) * 3;
    }
}
