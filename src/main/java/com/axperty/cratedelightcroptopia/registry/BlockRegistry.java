package com.axperty.cratedelightcroptopia.registry;

import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    // Artichoke Crate
    public static final Block ARTICHOKE_CRATE = registerBlock("artichoke_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Asparagus Crate
    public static final Block ASPARAGUS_CRATE = registerBlock("asparagus_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Barley Crate
    public static final Block BARLEY_CRATE = registerBlock("barley_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Bell Pepper Crate
    public static final Block BELL_PEPPER_CRATE = registerBlock("bell_pepper_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Blackberry Crate
    public static final Block BLACKBERRY_CRATE = registerBlock("blackberry_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Broccoli Crate
    public static final Block BROCCOLI_CRATE = registerBlock("broccoli_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Cabbage Crate
    public static final Block CABBAGE_CRATE = registerBlock("cabbage_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Cantaloupe Crate
    public static final Block CANTALOUPE_CRATE = registerBlock("cantaloupe_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Cauliflower Crate
    public static final Block CAULIFLOWER_CRATE = registerBlock("cauliflower_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Celery Crate
    public static final Block CELERY_CRATE = registerBlock("celery_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Chile Pepper Crate
    public static final Block CHILE_PEPPER_CRATE = registerBlock("chile_pepper_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Corn Crate
    public static final Block CORN_CRATE = registerBlock("corn_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Cucumber Crate
    public static final Block CUCUMBER_CRATE = registerBlock("cucumber_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Eggplant Crate
    public static final Block EGGPLANT_CRATE = registerBlock("eggplant_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Elderberry Crate
    public static final Block ELDERBERRY_CRATE = registerBlock("elderberry_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Garlic Crate
    public static final Block GARLIC_CRATE = registerBlock("garlic_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Ginger Crate
    public static final Block GINGER_CRATE = registerBlock("ginger_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Grape Crate
    public static final Block GRAPE_CRATE = registerBlock("grape_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Green Bean Crate
    public static final Block GREEN_BEAN_CRATE = registerBlock("green_bean_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Green Onion Crate
    public static final Block GREEN_ONION_CRATE = registerBlock("green_onion_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Honeydew Crate
    public static final Block HONEYDEW_CRATE = registerBlock("honeydew_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Hops Crate
    public static final Block HOPS_CRATE = registerBlock("hops_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Kiwi Crate
    public static final Block KIWI_CRATE = registerBlock("kiwi_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Leek Crate
    public static final Block LEEK_CRATE = registerBlock("leek_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Lettuce Crate
    public static final Block LETTUCE_CRATE = registerBlock("lettuce_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Mustard Crate
    public static final Block MUSTARD_CRATE = registerBlock("mustard_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Onion Crate
    public static final Block ONION_CRATE = registerBlock("onion_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Pineapple Crate
    public static final Block PINEAPPLE_CRATE = registerBlock("pineapple_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Radish Crate
    public static final Block RADISH_CRATE = registerBlock("radish_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Raspberry Crate
    public static final Block RASPBERRY_CRATE = registerBlock("raspberry_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Rhubarb Crate
    public static final Block RHUBARB_CRATE = registerBlock("rhubarb_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Rutabaga Crate
    public static final Block RUTABAGA_CRATE = registerBlock("rutabaga_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Saguaro Crate
    public static final Block SAGUARO_CRATE = registerBlock("saguaro_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Squash Crate
    public static final Block SQUASH_CRATE = registerBlock("squash_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Strawberry Crate
    public static final Block STRAWBERRY_CRATE = registerBlock("strawberry_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Sweet Potato Crate
    public static final Block SWEET_POTATO_CRATE = registerBlock("sweet_potato_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Tomatillo Crate
    public static final Block TOMATILLO_CRATE = registerBlock("tomatillo_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Tomato Crate
    public static final Block TOMATO_CRATE = registerBlock("tomato_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Turmeric Crate
    public static final Block TURMERIC_CRATE = registerBlock("turmeric_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Turnip Crate
    public static final Block TURNIP_CRATE = registerBlock("turnip_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Vanilla Crate
    public static final Block VANILLA_CRATE = registerBlock("vanilla_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Yam Crate
    public static final Block YAM_CRATE = registerBlock("yam_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Zucchini Crate
    public static final Block ZUCCHINI_CRATE = registerBlock("zucchini_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Black Bean Bag
    public static final Block BLACK_BEAN_BAG = registerBlock("black_bean_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Blueberry Bag
    public static final Block BLUEBERRY_BAG = registerBlock("blueberry_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Basil Bag
    public static final Block BASIL_BAG = registerBlock("basil_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Cranberry Bag
    public static final Block CRANBERRY_BAG = registerBlock("cranberry_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Currant Bag
    public static final Block CURRANT_BAG = registerBlock("currant_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Kale Bag
    public static final Block KALE_BAG = registerBlock("kale_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Oats Bag
    public static final Block OATS_BAG = registerBlock("oats_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Olive Bag
    public static final Block OLIVE_BAG = registerBlock("olive_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Peanut Bag
    public static final Block PEANUT_BAG = registerBlock("peanut_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Rice Bag
    public static final Block RICE_BAG = registerBlock("rice_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Soybeans Bag
    public static final Block SOYBEANS_BAG = registerBlock("soybeans_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Spinach Bag
    public static final Block SPINACH_BAG = registerBlock("spinach_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Tea Leaves Bag
    public static final Block TEA_LEAVES_BAG = registerBlock("tea_leaves_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    // Almond Bag
    public static final Block ALMOND_BAG = registerBlock("almond_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), CreativeTabRegistry.CREATIVE_MODE_TAB);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(CrateDelightCroptopia.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(CrateDelightCroptopia.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        CrateDelightCroptopia.LOGGER.debug("Registering mod blocks for " + CrateDelightCroptopia.MODID);
    }
}
