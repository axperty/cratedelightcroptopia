package com.axperty.cratedelightcroptopia.registry;

import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrateDelightCroptopia.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CRATEDELIGHT_TAB = CREATIVE_MODE_TABS.register("cratedelightcroptopia_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.cratedelightcroptopia"))
            .icon(() -> ItemRegistry.RASPBERRY_CRATE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                output.accept(BlockRegistry.ARTICHOKE_CRATE.get());
                output.accept(BlockRegistry.ASPARAGUS_CRATE.get());
                output.accept(BlockRegistry.BARLEY_CRATE.get());
                output.accept(BlockRegistry.BELL_PEPPER_CRATE.get());
                output.accept(BlockRegistry.BLACKBERRY_CRATE.get());
                output.accept(BlockRegistry.BROCCOLI_CRATE.get());
                output.accept(BlockRegistry.CABBAGE_CRATE.get());
                output.accept(BlockRegistry.CANTALOUPE_CRATE.get());
                output.accept(BlockRegistry.CAULIFLOWER_CRATE.get());
                output.accept(BlockRegistry.CELERY_CRATE.get());
                output.accept(BlockRegistry.CHILE_PEPPER_CRATE.get());
                output.accept(BlockRegistry.CORN_CRATE.get());
                output.accept(BlockRegistry.CUCUMBER_CRATE.get());
                output.accept(BlockRegistry.EGGPLANT_CRATE.get());
                output.accept(BlockRegistry.ELDERBERRY_CRATE.get());
                output.accept(BlockRegistry.GARLIC_CRATE.get());
                output.accept(BlockRegistry.GINGER_CRATE.get());
                output.accept(BlockRegistry.GRAPE_CRATE.get());
                output.accept(BlockRegistry.GREEN_BEAN_CRATE.get());
                output.accept(BlockRegistry.GREEN_ONION_CRATE.get());
                output.accept(BlockRegistry.HONEYDEW_CRATE.get());
                output.accept(BlockRegistry.HOPS_CRATE.get());
                output.accept(BlockRegistry.KIWI_CRATE.get());
                output.accept(BlockRegistry.LEEK_CRATE.get());
                output.accept(BlockRegistry.LETTUCE_CRATE.get());
                output.accept(BlockRegistry.MUSTARD_CRATE.get());
                output.accept(BlockRegistry.ONION_CRATE.get());
                output.accept(BlockRegistry.PINEAPPLE_CRATE.get());
                output.accept(BlockRegistry.RADISH_CRATE.get());
                output.accept(BlockRegistry.RASPBERRY_CRATE.get());
                output.accept(BlockRegistry.RHUBARB_CRATE.get());
                output.accept(BlockRegistry.RUTABAGA_CRATE.get());
                output.accept(BlockRegistry.SAGUARO_CRATE.get());
                output.accept(BlockRegistry.SQUASH_CRATE.get());
                output.accept(BlockRegistry.STRAWBERRY_CRATE.get());
                output.accept(BlockRegistry.SWEET_POTATO_CRATE.get());
                output.accept(BlockRegistry.TOMATILLO_CRATE.get());
                output.accept(BlockRegistry.TOMATO_CRATE.get());
                output.accept(BlockRegistry.TURMERIC_CRATE.get());
                output.accept(BlockRegistry.TURNIP_CRATE.get());
                output.accept(BlockRegistry.VANILLA_CRATE.get());
                output.accept(BlockRegistry.YAM_CRATE.get());
                output.accept(BlockRegistry.ZUCCHINI_CRATE.get());
                output.accept(BlockRegistry.BLACK_BEAN_BAG.get());
                output.accept(BlockRegistry.BLUEBERRY_BAG.get());
                output.accept(BlockRegistry.BASIL_BAG.get());
                output.accept(BlockRegistry.CRANBERRY_BAG.get());
                output.accept(BlockRegistry.CURRANT_BAG.get());
                output.accept(BlockRegistry.KALE_BAG.get());
                output.accept(BlockRegistry.OATS_BAG.get());
                output.accept(BlockRegistry.OLIVE_BAG.get());
                output.accept(BlockRegistry.PEANUT_BAG.get());
                output.accept(BlockRegistry.RICE_BAG.get());
                output.accept(BlockRegistry.SOYBEANS_BAG.get());
                output.accept(BlockRegistry.SPINACH_BAG.get());
                output.accept(BlockRegistry.TEA_LEAVES_BAG.get());
                output.accept(BlockRegistry.ALMOND_BAG.get());

            }).build());
}
