package net.minecraft.world.entity.ai.behavior;

import java.util.Optional;
import java.util.function.Predicate;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.behavior.declarative.BehaviorBuilder;
import net.minecraft.world.entity.ai.behavior.declarative.MemoryAccessor;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.memory.NearestVisibleLivingEntities;

public class SetEntityLookTarget {
    public static BehaviorControl<LivingEntity> create(MobCategory pCategory, float pMakDist) {
        return create(p_348230_ -> pCategory.equals(p_348230_.getType().getCategory()), pMakDist);
    }

    public static OneShot<LivingEntity> create(EntityType<?> pEntityType, float pMaxDist) {
        return create(p_348232_ -> pEntityType.equals(p_348232_.getType()), pMaxDist);
    }

    public static OneShot<LivingEntity> create(float pMaxDist) {
        return create(p_23913_ -> true, pMaxDist);
    }

    public static OneShot<LivingEntity> create(Predicate<LivingEntity> pCanLootAtTarget, float pMaxDist) {
        float f = pMaxDist * pMaxDist;
        return BehaviorBuilder.create(
            p_258663_ -> p_258663_.group(p_258663_.absent(MemoryModuleType.LOOK_TARGET), p_258663_.present(MemoryModuleType.NEAREST_VISIBLE_LIVING_ENTITIES))
                    .apply(
                        p_258663_,
                        (p_258656_, p_258657_) -> (p_258650_, p_258651_, p_258652_) -> {
                                Optional<LivingEntity> optional = p_258663_.<NearestVisibleLivingEntities>get(p_258657_)
                                    .findClosest(
                                        pCanLootAtTarget.and(p_325737_ -> p_325737_.distanceToSqr(p_258651_) <= (double)f && !p_258651_.hasPassenger(p_325737_))
                                    );
                                if (optional.isEmpty()) {
                                    return false;
                                } else {
                                    p_258656_.set(new EntityTracker(optional.get(), true));
                                    return true;
                                }
                            }
                    )
        );
    }
}
