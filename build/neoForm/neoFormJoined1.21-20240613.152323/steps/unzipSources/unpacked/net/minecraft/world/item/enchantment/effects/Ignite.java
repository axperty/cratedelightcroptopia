package net.minecraft.world.item.enchantment.effects;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.LevelBasedValue;
import net.minecraft.world.phys.Vec3;

public record Ignite(LevelBasedValue duration) implements EnchantmentEntityEffect {
    public static final MapCodec<Ignite> CODEC = RecordCodecBuilder.mapCodec(
        p_345641_ -> p_345641_.group(LevelBasedValue.CODEC.fieldOf("duration").forGetter(p_345622_ -> p_345622_.duration)).apply(p_345641_, Ignite::new)
    );

    @Override
    public void apply(ServerLevel pLevel, int pEnchantmentLevel, EnchantedItemInUse pItem, Entity pEntity, Vec3 pOrigin) {
        pEntity.igniteForSeconds(this.duration.calculate(pEnchantmentLevel));
    }

    @Override
    public MapCodec<Ignite> codec() {
        return CODEC;
    }
}
