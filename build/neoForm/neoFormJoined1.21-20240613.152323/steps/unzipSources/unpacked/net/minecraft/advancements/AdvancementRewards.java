package net.minecraft.advancements;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import net.minecraft.commands.CacheableFunction;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.functions.CommandFunction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;

public record AdvancementRewards(int experience, List<ResourceKey<LootTable>> loot, List<ResourceLocation> recipes, Optional<CacheableFunction> function) {
    public static final Codec<AdvancementRewards> CODEC = RecordCodecBuilder.create(
        p_337339_ -> p_337339_.group(
                    Codec.INT.optionalFieldOf("experience", Integer.valueOf(0)).forGetter(AdvancementRewards::experience),
                    ResourceKey.codec(Registries.LOOT_TABLE).listOf().optionalFieldOf("loot", List.of()).forGetter(AdvancementRewards::loot),
                    ResourceLocation.CODEC.listOf().optionalFieldOf("recipes", List.of()).forGetter(AdvancementRewards::recipes),
                    CacheableFunction.CODEC.optionalFieldOf("function").forGetter(AdvancementRewards::function)
                )
                .apply(p_337339_, AdvancementRewards::new)
    );
    public static final AdvancementRewards EMPTY = new AdvancementRewards(0, List.of(), List.of(), Optional.empty());

    public void grant(ServerPlayer pPlayer) {
        pPlayer.giveExperiencePoints(this.experience);
        LootParams lootparams = new LootParams.Builder(pPlayer.serverLevel())
            .withParameter(LootContextParams.THIS_ENTITY, pPlayer)
            .withParameter(LootContextParams.ORIGIN, pPlayer.position())
            .withLuck(pPlayer.getLuck()) // Forge: Add luck to LootContext
            .create(LootContextParamSets.ADVANCEMENT_REWARD);
        boolean flag = false;

        for (ResourceKey<LootTable> resourcekey : this.loot) {
            for (ItemStack itemstack : pPlayer.server.reloadableRegistries().getLootTable(resourcekey).getRandomItems(lootparams)) {
                if (pPlayer.addItem(itemstack)) {
                    pPlayer.level()
                        .playSound(
                            null,
                            pPlayer.getX(),
                            pPlayer.getY(),
                            pPlayer.getZ(),
                            SoundEvents.ITEM_PICKUP,
                            SoundSource.PLAYERS,
                            0.2F,
                            ((pPlayer.getRandom().nextFloat() - pPlayer.getRandom().nextFloat()) * 0.7F + 1.0F) * 2.0F
                        );
                    flag = true;
                } else {
                    ItemEntity itementity = pPlayer.drop(itemstack, false);
                    if (itementity != null) {
                        itementity.setNoPickUpDelay();
                        itementity.setTarget(pPlayer.getUUID());
                    }
                }
            }
        }

        if (flag) {
            pPlayer.containerMenu.broadcastChanges();
        }

        if (!this.recipes.isEmpty()) {
            pPlayer.awardRecipesByKey(this.recipes);
        }

        MinecraftServer minecraftserver = pPlayer.server;
        this.function
            .flatMap(p_311397_ -> p_311397_.get(minecraftserver.getFunctions()))
            .ifPresent(
                p_352658_ -> minecraftserver.getFunctions()
                        .execute((CommandFunction<CommandSourceStack>)p_352658_, pPlayer.createCommandSourceStack().withSuppressedOutput().withPermission(2))
            );
    }

    public static class Builder {
        private int experience;
        private final ImmutableList.Builder<ResourceKey<LootTable>> loot = ImmutableList.builder();
        private final ImmutableList.Builder<ResourceLocation> recipes = ImmutableList.builder();
        private Optional<ResourceLocation> function = Optional.empty();

        /**
         * Creates a new builder with the given amount of experience as a reward
         */
        public static AdvancementRewards.Builder experience(int pExperience) {
            return new AdvancementRewards.Builder().addExperience(pExperience);
        }

        /**
         * Adds the given amount of experience. (Not a direct setter)
         */
        public AdvancementRewards.Builder addExperience(int pExperience) {
            this.experience += pExperience;
            return this;
        }

        public static AdvancementRewards.Builder loot(ResourceKey<LootTable> pLootTable) {
            return new AdvancementRewards.Builder().addLootTable(pLootTable);
        }

        public AdvancementRewards.Builder addLootTable(ResourceKey<LootTable> pLootTable) {
            this.loot.add(pLootTable);
            return this;
        }

        /**
         * Creates a new builder with the given recipe as a reward.
         */
        public static AdvancementRewards.Builder recipe(ResourceLocation pRecipeId) {
            return new AdvancementRewards.Builder().addRecipe(pRecipeId);
        }

        /**
         * Adds the given recipe to the rewards.
         */
        public AdvancementRewards.Builder addRecipe(ResourceLocation pRecipeId) {
            this.recipes.add(pRecipeId);
            return this;
        }

        public static AdvancementRewards.Builder function(ResourceLocation pFunctionId) {
            return new AdvancementRewards.Builder().runs(pFunctionId);
        }

        public AdvancementRewards.Builder runs(ResourceLocation pFunctionId) {
            this.function = Optional.of(pFunctionId);
            return this;
        }

        public AdvancementRewards build() {
            return new AdvancementRewards(this.experience, this.loot.build(), this.recipes.build(), this.function.map(CacheableFunction::new));
        }
    }
}
