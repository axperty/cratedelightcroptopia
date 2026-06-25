package com.axperty.cratedelightcroptopia.registry;

import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CrateDelightCroptopia.MOD_ID);

    // Artichoke Crate
    public static final DeferredBlock<Block> ARTICHOKE_CRATE = BLOCKS.registerBlock("artichoke_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Asparagus Crate
    public static final DeferredBlock<Block> ASPARAGUS_CRATE = BLOCKS.registerBlock("asparagus_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Barley Crate
    public static final DeferredBlock<Block> BARLEY_CRATE = BLOCKS.registerBlock("barley_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Bell Pepper Crate
    public static final DeferredBlock<Block> BELL_PEPPER_CRATE = BLOCKS.registerBlock("bell_pepper_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Blackberry Crate
    public static final DeferredBlock<Block> BLACKBERRY_CRATE = BLOCKS.registerBlock("blackberry_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Broccoli Crate
    public static final DeferredBlock<Block> BROCCOLI_CRATE = BLOCKS.registerBlock("broccoli_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Cabbage Crate
    public static final DeferredBlock<Block> CABBAGE_CRATE = BLOCKS.registerBlock("cabbage_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Cantaloupe Crate
    public static final DeferredBlock<Block> CANTALOUPE_CRATE = BLOCKS.registerBlock("cantaloupe_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Cauliflower Crate
    public static final DeferredBlock<Block> CAULIFLOWER_CRATE = BLOCKS.registerBlock("cauliflower_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Celery Crate
    public static final DeferredBlock<Block> CELERY_CRATE = BLOCKS.registerBlock("celery_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Chile Pepper Crate
    public static final DeferredBlock<Block> CHILE_PEPPER_CRATE = BLOCKS.registerBlock("chile_pepper_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Corn Crate
    public static final DeferredBlock<Block> CORN_CRATE = BLOCKS.registerBlock("corn_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Cucumber Crate
    public static final DeferredBlock<Block> CUCUMBER_CRATE = BLOCKS.registerBlock("cucumber_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Eggplant Crate
    public static final DeferredBlock<Block> EGGPLANT_CRATE = BLOCKS.registerBlock("eggplant_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Elderberry Crate
    public static final DeferredBlock<Block> ELDERBERRY_CRATE = BLOCKS.registerBlock("elderberry_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Garlic Crate
    public static final DeferredBlock<Block> GARLIC_CRATE = BLOCKS.registerBlock("garlic_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Ginger Crate
    public static final DeferredBlock<Block> GINGER_CRATE = BLOCKS.registerBlock("ginger_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Grape Crate
    public static final DeferredBlock<Block> GRAPE_CRATE = BLOCKS.registerBlock("grape_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Green Bean Crate
    public static final DeferredBlock<Block> GREEN_BEAN_CRATE = BLOCKS.registerBlock("green_bean_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Green Onion Crate
    public static final DeferredBlock<Block> GREEN_ONION_CRATE = BLOCKS.registerBlock("green_onion_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Honeydew Crate
    public static final DeferredBlock<Block> HONEYDEW_CRATE = BLOCKS.registerBlock("honeydew_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Hops Crate
    public static final DeferredBlock<Block> HOPS_CRATE = BLOCKS.registerBlock("hops_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Kiwi Crate
    public static final DeferredBlock<Block> KIWI_CRATE = BLOCKS.registerBlock("kiwi_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Leek Crate
    public static final DeferredBlock<Block> LEEK_CRATE = BLOCKS.registerBlock("leek_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Lettuce Crate
    public static final DeferredBlock<Block> LETTUCE_CRATE = BLOCKS.registerBlock("lettuce_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Mustard Crate
    public static final DeferredBlock<Block> MUSTARD_CRATE = BLOCKS.registerBlock("mustard_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Onion Crate
    public static final DeferredBlock<Block> ONION_CRATE = BLOCKS.registerBlock("onion_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Pineapple Crate
    public static final DeferredBlock<Block> PINEAPPLE_CRATE = BLOCKS.registerBlock("pineapple_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Radish Crate
    public static final DeferredBlock<Block> RADISH_CRATE = BLOCKS.registerBlock("radish_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Raspberry Crate
    public static final DeferredBlock<Block> RASPBERRY_CRATE = BLOCKS.registerBlock("raspberry_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Rhubarb Crate
    public static final DeferredBlock<Block> RHUBARB_CRATE = BLOCKS.registerBlock("rhubarb_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Rutabaga Crate
    public static final DeferredBlock<Block> RUTABAGA_CRATE = BLOCKS.registerBlock("rutabaga_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Saguaro Crate
    public static final DeferredBlock<Block> SAGUARO_CRATE = BLOCKS.registerBlock("saguaro_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Squash Crate
    public static final DeferredBlock<Block> SQUASH_CRATE = BLOCKS.registerBlock("squash_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Strawberry Crate
    public static final DeferredBlock<Block> STRAWBERRY_CRATE = BLOCKS.registerBlock("strawberry_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Sweet Potato Crate
    public static final DeferredBlock<Block> SWEET_POTATO_CRATE = BLOCKS.registerBlock("sweet_potato_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Tomatillo Crate
    public static final DeferredBlock<Block> TOMATILLO_CRATE = BLOCKS.registerBlock("tomatillo_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Tomato Crate
    public static final DeferredBlock<Block> TOMATO_CRATE = BLOCKS.registerBlock("tomato_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Turmeric Potato Crate
    public static final DeferredBlock<Block> TURMERIC_CRATE = BLOCKS.registerBlock("turmeric_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Turnip Crate
    public static final DeferredBlock<Block> TURNIP_CRATE = BLOCKS.registerBlock("turnip_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Vanilla Crate
    public static final DeferredBlock<Block> VANILLA_CRATE = BLOCKS.registerBlock("vanilla_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Yam Crate
    public static final DeferredBlock<Block> YAM_CRATE = BLOCKS.registerBlock("yam_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Zucchini Crate
    public static final DeferredBlock<Block> ZUCCHINI_CRATE = BLOCKS.registerBlock("zucchini_crate", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Black Bean Bag
    public static final DeferredBlock<Block> BLACK_BEAN_BAG = BLOCKS.registerBlock("black_bean_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Blueberry Bag
    public static final DeferredBlock<Block> BLUEBERRY_BAG = BLOCKS.registerBlock("blueberry_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Basil Bag
    public static final DeferredBlock<Block> BASIL_BAG = BLOCKS.registerBlock("basil_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Cranberry Bag
    public static final DeferredBlock<Block> CRANBERRY_BAG = BLOCKS.registerBlock("cranberry_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Currant Bag
    public static final DeferredBlock<Block> CURRANT_BAG = BLOCKS.registerBlock("currant_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Kale Bag
    public static final DeferredBlock<Block> KALE_BAG = BLOCKS.registerBlock("kale_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Oats Bag
    public static final DeferredBlock<Block> OATS_BAG = BLOCKS.registerBlock("oats_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Olive Bag
    public static final DeferredBlock<Block> OLIVE_BAG = BLOCKS.registerBlock("olive_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Peanut Bag
    public static final DeferredBlock<Block> PEANUT_BAG = BLOCKS.registerBlock("peanut_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Rice Bag
    public static final DeferredBlock<Block> RICE_BAG = BLOCKS.registerBlock("rice_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Soybeans Bag
    public static final DeferredBlock<Block> SOYBEANS_BAG = BLOCKS.registerBlock("soybeans_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Spinach Bag
    public static final DeferredBlock<Block> SPINACH_BAG = BLOCKS.registerBlock("spinach_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Tea Leaves Bag
    public static final DeferredBlock<Block> TEA_LEAVES_BAG = BLOCKS.registerBlock("tea_leaves_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

    // Almond Bag
    public static final DeferredBlock<Block> ALMOND_BAG = BLOCKS.registerBlock("almond_bag", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(MapColor.WOOD));

}
