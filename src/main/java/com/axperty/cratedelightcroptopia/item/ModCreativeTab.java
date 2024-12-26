package com.axperty.cratedelightcroptopia.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;
import com.axperty.cratedelightcroptopia.registry.BlockRegistry;

public class ModCreativeTab {
    public static final ItemGroup CRATEDELIGHT_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(CrateDelightCroptopia.MODID + ":" + "cratedelightcroptopia_itemgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.cratedelightcroptopia"))
                    .icon(() -> new ItemStack(BlockRegistry.RASPBERRY_CRATE))
                    .entries((displayContext, entries) -> {

                        entries.add(BlockRegistry.ARTICHOKE_CRATE);
                        entries.add(BlockRegistry.ASPARAGUS_CRATE);
                        entries.add(BlockRegistry.BARLEY_CRATE);
                        entries.add(BlockRegistry.BELL_PEPPER_CRATE);
                        entries.add(BlockRegistry.BLACKBERRY_CRATE);
                        entries.add(BlockRegistry.BROCCOLI_CRATE);
                        entries.add(BlockRegistry.CABBAGE_CRATE);
                        entries.add(BlockRegistry.CANTALOUPE_CRATE);
                        entries.add(BlockRegistry.CAULIFLOWER_CRATE);
                        entries.add(BlockRegistry.CELERY_CRATE);
                        entries.add(BlockRegistry.CHILE_PEPPER_CRATE);
                        entries.add(BlockRegistry.CORN_CRATE);
                        entries.add(BlockRegistry.CUCUMBER_CRATE);
                        entries.add(BlockRegistry.EGGPLANT_CRATE);
                        entries.add(BlockRegistry.ELDERBERRY_CRATE);
                        entries.add(BlockRegistry.GARLIC_CRATE);
                        entries.add(BlockRegistry.GINGER_CRATE);
                        entries.add(BlockRegistry.GRAPE_CRATE);
                        entries.add(BlockRegistry.GREEN_BEAN_CRATE);
                        entries.add(BlockRegistry.GREEN_ONION_CRATE);
                        entries.add(BlockRegistry.HONEYDEW_CRATE);
                        entries.add(BlockRegistry.HOPS_CRATE);
                        entries.add(BlockRegistry.KIWI_CRATE);
                        entries.add(BlockRegistry.LEEK_CRATE);
                        entries.add(BlockRegistry.LETTUCE_CRATE);
                        entries.add(BlockRegistry.MUSTARD_CRATE);
                        entries.add(BlockRegistry.ONION_CRATE);
                        entries.add(BlockRegistry.PINEAPPLE_CRATE);
                        entries.add(BlockRegistry.RADISH_CRATE);
                        entries.add(BlockRegistry.RASPBERRY_CRATE);
                        entries.add(BlockRegistry.RHUBARB_CRATE);
                        entries.add(BlockRegistry.RUTABAGA_CRATE);
                        entries.add(BlockRegistry.SAGUARO_CRATE);
                        entries.add(BlockRegistry.SQUASH_CRATE);
                        entries.add(BlockRegistry.STRAWBERRY_CRATE);
                        entries.add(BlockRegistry.SWEET_POTATO_CRATE);
                        entries.add(BlockRegistry.TOMATILLO_CRATE);
                        entries.add(BlockRegistry.TOMATO_CRATE);
                        entries.add(BlockRegistry.TURMERIC_CRATE);
                        entries.add(BlockRegistry.TURNIP_CRATE);
                        entries.add(BlockRegistry.VANILLA_CRATE);
                        entries.add(BlockRegistry.YAM_CRATE);
                        entries.add(BlockRegistry.ZUCCHINI_CRATE);
                        entries.add(BlockRegistry.BLACK_BEAN_BAG);
                        entries.add(BlockRegistry.BLUEBERRY_BAG);
                        entries.add(BlockRegistry.BASIL_BAG);
                        entries.add(BlockRegistry.CRANBERRY_BAG);
                        entries.add(BlockRegistry.CURRANT_BAG);
                        entries.add(BlockRegistry.KALE_BAG);
                        entries.add(BlockRegistry.OATS_BAG);
                        entries.add(BlockRegistry.OLIVE_BAG);
                        entries.add(BlockRegistry.PEANUT_BAG);
                        entries.add(BlockRegistry.RICE_BAG);
                        entries.add(BlockRegistry.SOYBEANS_BAG);
                        entries.add(BlockRegistry.SPINACH_BAG);
                        entries.add(BlockRegistry.TEA_LEAVES_BAG);
                        entries.add(BlockRegistry.ALMOND_BAG);

                    })
                    .build());

    public static void registerItemGroups() {
        CrateDelightCroptopia.LOGGER.info("Registering Item Groups for " + CrateDelightCroptopia.MODID);
    }
}