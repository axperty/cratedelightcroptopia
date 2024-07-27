package net.minecraft.world.level.block.entity;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult.Error;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Spawner;
import net.minecraft.world.level.block.TrialSpawnerBlock;
import net.minecraft.world.level.block.entity.trialspawner.PlayerDetector;
import net.minecraft.world.level.block.entity.trialspawner.TrialSpawner;
import net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.slf4j.Logger;

public class TrialSpawnerBlockEntity extends BlockEntity implements Spawner, TrialSpawner.StateAccessor {
    private static final Logger LOGGER = LogUtils.getLogger();
    private TrialSpawner trialSpawner;

    public TrialSpawnerBlockEntity(BlockPos pPos, BlockState pState) {
        super(BlockEntityType.TRIAL_SPAWNER, pPos, pState);
        PlayerDetector playerdetector = PlayerDetector.NO_CREATIVE_PLAYERS;
        PlayerDetector.EntitySelector playerdetector$entityselector = PlayerDetector.EntitySelector.SELECT_FROM_LEVEL;
        this.trialSpawner = new TrialSpawner(this, playerdetector, playerdetector$entityselector);
    }

    @Override
    protected void loadAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {
        super.loadAdditional(pTag, pRegistries);
        if (pTag.contains("normal_config")) {
            CompoundTag compoundtag = pTag.getCompound("normal_config").copy();
            pTag.put("ominous_config", compoundtag.merge(pTag.getCompound("ominous_config")));
        }

        this.trialSpawner.codec().parse(NbtOps.INSTANCE, pTag).resultOrPartial(LOGGER::error).ifPresent(p_311911_ -> this.trialSpawner = p_311911_);
        if (this.level != null) {
            this.markUpdated();
        }
    }

    @Override
    protected void saveAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {
        super.saveAdditional(pTag, pRegistries);
        this.trialSpawner
            .codec()
            .encodeStart(NbtOps.INSTANCE, this.trialSpawner)
            .ifSuccess(p_312175_ -> pTag.merge((CompoundTag)p_312175_))
            .ifError(p_338001_ -> LOGGER.warn("Failed to encode TrialSpawner {}", p_338001_.message()));
    }

    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider pRegistries) {
        return this.trialSpawner.getData().getUpdateTag(this.getBlockState().getValue(TrialSpawnerBlock.STATE));
    }

    @Override
    public boolean onlyOpCanSetNbt() {
        return true;
    }

    @Override
    public void setEntityId(EntityType<?> pEntityType, RandomSource pRandom) {
        this.trialSpawner.getData().setEntityId(this.trialSpawner, pRandom, pEntityType);
        this.setChanged();
    }

    public TrialSpawner getTrialSpawner() {
        return this.trialSpawner;
    }

    @Override
    public TrialSpawnerState getState() {
        return !this.getBlockState().hasProperty(BlockStateProperties.TRIAL_SPAWNER_STATE)
            ? TrialSpawnerState.INACTIVE
            : this.getBlockState().getValue(BlockStateProperties.TRIAL_SPAWNER_STATE);
    }

    @Override
    public void setState(Level pLevel, TrialSpawnerState pState) {
        this.setChanged();
        pLevel.setBlockAndUpdate(this.worldPosition, this.getBlockState().setValue(BlockStateProperties.TRIAL_SPAWNER_STATE, pState));
    }

    @Override
    public void markUpdated() {
        this.setChanged();
        if (this.level != null) {
            this.level.sendBlockUpdated(this.worldPosition, this.getBlockState(), this.getBlockState(), 3);
        }
    }
}
