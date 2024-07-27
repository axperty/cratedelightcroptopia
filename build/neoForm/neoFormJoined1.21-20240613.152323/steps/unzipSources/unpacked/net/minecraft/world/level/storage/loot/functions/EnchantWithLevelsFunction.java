package net.minecraft.world.level.storage.loot.functions;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistryCodecs;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParam;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.NumberProviders;

/**
 * Applies a random enchantment to the stack.
 *
 * @see EnchantmentHelper#enchantItem
 */
public class EnchantWithLevelsFunction extends LootItemConditionalFunction {
    public static final MapCodec<EnchantWithLevelsFunction> CODEC = RecordCodecBuilder.mapCodec(
        p_344692_ -> commonFields(p_344692_)
                .and(
                    p_344692_.group(
                        NumberProviders.CODEC.fieldOf("levels").forGetter(p_298844_ -> p_298844_.levels),
                        RegistryCodecs.homogeneousList(Registries.ENCHANTMENT).optionalFieldOf("options").forGetter(p_344691_ -> p_344691_.options)
                    )
                )
                .apply(p_344692_, EnchantWithLevelsFunction::new)
    );
    private final NumberProvider levels;
    private final Optional<HolderSet<Enchantment>> options;

    EnchantWithLevelsFunction(List<LootItemCondition> p_298580_, NumberProvider p_165194_, Optional<HolderSet<Enchantment>> p_345769_) {
        super(p_298580_);
        this.levels = p_165194_;
        this.options = p_345769_;
    }

    @Override
    public LootItemFunctionType<EnchantWithLevelsFunction> getType() {
        return LootItemFunctions.ENCHANT_WITH_LEVELS;
    }

    @Override
    public Set<LootContextParam<?>> getReferencedContextParams() {
        return this.levels.getReferencedContextParams();
    }

    /**
     * Called to perform the actual action of this function, after conditions have been checked.
     */
    @Override
    public ItemStack run(ItemStack pStack, LootContext pContext) {
        RandomSource randomsource = pContext.getRandom();
        RegistryAccess registryaccess = pContext.getLevel().registryAccess();
        return EnchantmentHelper.enchantItem(randomsource, pStack, this.levels.getInt(pContext), registryaccess, this.options);
    }

    public static EnchantWithLevelsFunction.Builder enchantWithLevels(HolderLookup.Provider pRegistries, NumberProvider pLevels) {
        return new EnchantWithLevelsFunction.Builder(pLevels)
            .fromOptions(pRegistries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(EnchantmentTags.ON_RANDOM_LOOT));
    }

    public static class Builder extends LootItemConditionalFunction.Builder<EnchantWithLevelsFunction.Builder> {
        private final NumberProvider levels;
        private Optional<HolderSet<Enchantment>> options = Optional.empty();

        public Builder(NumberProvider pLevels) {
            this.levels = pLevels;
        }

        protected EnchantWithLevelsFunction.Builder getThis() {
            return this;
        }

        public EnchantWithLevelsFunction.Builder fromOptions(HolderSet<Enchantment> pOptions) {
            this.options = Optional.of(pOptions);
            return this;
        }

        @Override
        public LootItemFunction build() {
            return new EnchantWithLevelsFunction(this.getConditions(), this.levels, this.options);
        }
    }
}
