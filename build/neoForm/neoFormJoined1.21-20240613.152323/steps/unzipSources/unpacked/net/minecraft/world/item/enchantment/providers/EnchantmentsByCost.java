package net.minecraft.world.item.enchantment.providers;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistryCodecs;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.ItemEnchantments;

public record EnchantmentsByCost(HolderSet<Enchantment> enchantments, IntProvider cost) implements EnchantmentProvider {
    public static final MapCodec<EnchantmentsByCost> CODEC = RecordCodecBuilder.mapCodec(
        p_345209_ -> p_345209_.group(
                    RegistryCodecs.homogeneousList(Registries.ENCHANTMENT).fieldOf("enchantments").forGetter(EnchantmentsByCost::enchantments),
                    IntProvider.CODEC.fieldOf("cost").forGetter(EnchantmentsByCost::cost)
                )
                .apply(p_345209_, EnchantmentsByCost::new)
    );

    @Override
    public void enchant(ItemStack pStack, ItemEnchantments.Mutable pEnchantments, RandomSource pRandom, DifficultyInstance pDifficulty) {
        for (EnchantmentInstance enchantmentinstance : EnchantmentHelper.selectEnchantment(
            pRandom, pStack, this.cost.sample(pRandom), this.enchantments.stream()
        )) {
            pEnchantments.upgrade(enchantmentinstance.enchantment, enchantmentinstance.level);
        }
    }

    @Override
    public MapCodec<EnchantmentsByCost> codec() {
        return CODEC;
    }
}
