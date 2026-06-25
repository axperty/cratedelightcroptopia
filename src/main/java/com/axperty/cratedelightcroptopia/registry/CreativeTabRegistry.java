package com.axperty.cratedelightcroptopia.registry;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;

public class CreativeTabRegistry {
    public static final CreativeModeTab CRATEDELIGHT_ITEMGROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CrateDelightCroptopia.MODID, "cratedelightcroptopia_itemgroup"),
            FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cratedelightcroptopia"))
                    .icon(() -> new ItemStack(BlockRegistry.RASPBERRY_CRATE))
                    .displayItems((displayContext, entries) -> {

                        entries.accept(BlockRegistry.ARTICHOKE_CRATE);
                        entries.accept(BlockRegistry.ASPARAGUS_CRATE);
                        entries.accept(BlockRegistry.BARLEY_CRATE);
                        entries.accept(BlockRegistry.BELL_PEPPER_CRATE);
                        entries.accept(BlockRegistry.BLACKBERRY_CRATE);
                        entries.accept(BlockRegistry.BROCCOLI_CRATE);
                        entries.accept(BlockRegistry.CABBAGE_CRATE);
                        entries.accept(BlockRegistry.CANTALOUPE_CRATE);
                        entries.accept(BlockRegistry.CAULIFLOWER_CRATE);
                        entries.accept(BlockRegistry.CELERY_CRATE);
                        entries.accept(BlockRegistry.CHILE_PEPPER_CRATE);
                        entries.accept(BlockRegistry.CORN_CRATE);
                        entries.accept(BlockRegistry.CUCUMBER_CRATE);
                        entries.accept(BlockRegistry.EGGPLANT_CRATE);
                        entries.accept(BlockRegistry.ELDERBERRY_CRATE);
                        entries.accept(BlockRegistry.GARLIC_CRATE);
                        entries.accept(BlockRegistry.GINGER_CRATE);
                        entries.accept(BlockRegistry.GRAPE_CRATE);
                        entries.accept(BlockRegistry.GREEN_BEAN_CRATE);
                        entries.accept(BlockRegistry.GREEN_ONION_CRATE);
                        entries.accept(BlockRegistry.HONEYDEW_CRATE);
                        entries.accept(BlockRegistry.HOPS_CRATE);
                        entries.accept(BlockRegistry.KIWI_CRATE);
                        entries.accept(BlockRegistry.LEEK_CRATE);
                        entries.accept(BlockRegistry.LETTUCE_CRATE);
                        entries.accept(BlockRegistry.MUSTARD_CRATE);
                        entries.accept(BlockRegistry.ONION_CRATE);
                        entries.accept(BlockRegistry.PINEAPPLE_CRATE);
                        entries.accept(BlockRegistry.RADISH_CRATE);
                        entries.accept(BlockRegistry.RASPBERRY_CRATE);
                        entries.accept(BlockRegistry.RHUBARB_CRATE);
                        entries.accept(BlockRegistry.RUTABAGA_CRATE);
                        entries.accept(BlockRegistry.SAGUARO_CRATE);
                        entries.accept(BlockRegistry.SQUASH_CRATE);
                        entries.accept(BlockRegistry.STRAWBERRY_CRATE);
                        entries.accept(BlockRegistry.SWEET_POTATO_CRATE);
                        entries.accept(BlockRegistry.TOMATILLO_CRATE);
                        entries.accept(BlockRegistry.TOMATO_CRATE);
                        entries.accept(BlockRegistry.TURMERIC_CRATE);
                        entries.accept(BlockRegistry.TURNIP_CRATE);
                        entries.accept(BlockRegistry.VANILLA_CRATE);
                        entries.accept(BlockRegistry.YAM_CRATE);
                        entries.accept(BlockRegistry.ZUCCHINI_CRATE);
                        entries.accept(BlockRegistry.BLACK_BEAN_BAG);
                        entries.accept(BlockRegistry.BLUEBERRY_BAG);
                        entries.accept(BlockRegistry.BASIL_BAG);
                        entries.accept(BlockRegistry.CRANBERRY_BAG);
                        entries.accept(BlockRegistry.CURRANT_BAG);
                        entries.accept(BlockRegistry.KALE_BAG);
                        entries.accept(BlockRegistry.OATS_BAG);
                        entries.accept(BlockRegistry.OLIVE_BAG);
                        entries.accept(BlockRegistry.PEANUT_BAG);
                        entries.accept(BlockRegistry.RICE_BAG);
                        entries.accept(BlockRegistry.SOYBEANS_BAG);
                        entries.accept(BlockRegistry.SPINACH_BAG);
                        entries.accept(BlockRegistry.TEA_LEAVES_BAG);
                        entries.accept(BlockRegistry.ALMOND_BAG);

                    })
                    .build());

    public static void registerItemGroups() {}
}