package com.axperty.cratedelightcroptopia.registry;

import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import java.util.function.Function;

public class BlockRegistry {

    // Artichoke Crate
    public static final Block ARTICHOKE_CRATE = registerBlock("artichoke_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Asparagus Crate
    public static final Block ASPARAGUS_CRATE = registerBlock("asparagus_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Barley Crate
    public static final Block BARLEY_CRATE = registerBlock("barley_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Bell Pepper Crate
    public static final Block BELL_PEPPER_CRATE = registerBlock("bell_pepper_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Blackberry Crate
    public static final Block BLACKBERRY_CRATE = registerBlock("blackberry_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Broccoli Crate
    public static final Block BROCCOLI_CRATE = registerBlock("broccoli_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Cabbage Crate
    public static final Block CABBAGE_CRATE = registerBlock("cabbage_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Cantaloupe Crate
    public static final Block CANTALOUPE_CRATE = registerBlock("cantaloupe_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Cauliflower Crate
    public static final Block CAULIFLOWER_CRATE = registerBlock("cauliflower_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Celery Crate
    public static final Block CELERY_CRATE = registerBlock("celery_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Chile Pepper Crate
    public static final Block CHILE_PEPPER_CRATE = registerBlock("chile_pepper_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Corn Crate
    public static final Block CORN_CRATE = registerBlock("corn_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Cucumber Crate
    public static final Block CUCUMBER_CRATE = registerBlock("cucumber_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Eggplant Crate
    public static final Block EGGPLANT_CRATE = registerBlock("eggplant_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Elderberry Crate
    public static final Block ELDERBERRY_CRATE = registerBlock("elderberry_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Garlic Crate
    public static final Block GARLIC_CRATE = registerBlock("garlic_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Ginger Crate
    public static final Block GINGER_CRATE = registerBlock("ginger_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Grape Crate
    public static final Block GRAPE_CRATE = registerBlock("grape_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Green Bean Crate
    public static final Block GREEN_BEAN_CRATE = registerBlock("green_bean_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Green Onion Crate
    public static final Block GREEN_ONION_CRATE = registerBlock("green_onion_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Honeydew Crate
    public static final Block HONEYDEW_CRATE = registerBlock("honeydew_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Hops Crate
    public static final Block HOPS_CRATE = registerBlock("hops_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Kiwi Crate
    public static final Block KIWI_CRATE = registerBlock("kiwi_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Leek Crate
    public static final Block LEEK_CRATE = registerBlock("leek_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Lettuce Crate
    public static final Block LETTUCE_CRATE = registerBlock("lettuce_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Mustard Crate
    public static final Block MUSTARD_CRATE = registerBlock("mustard_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Onion Crate
    public static final Block ONION_CRATE = registerBlock("onion_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Pineapple Crate
    public static final Block PINEAPPLE_CRATE = registerBlock("pineapple_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Radish Crate
    public static final Block RADISH_CRATE = registerBlock("radish_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Raspberry Crate
    public static final Block RASPBERRY_CRATE = registerBlock("raspberry_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Rhubarb Crate
    public static final Block RHUBARB_CRATE = registerBlock("rhubarb_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Rutabaga Crate
    public static final Block RUTABAGA_CRATE = registerBlock("rutabaga_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Saguaro Crate
    public static final Block SAGUARO_CRATE = registerBlock("saguaro_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Squash Crate
    public static final Block SQUASH_CRATE = registerBlock("squash_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Strawberry Crate
    public static final Block STRAWBERRY_CRATE = registerBlock("strawberry_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Sweet Potato Crate
    public static final Block SWEET_POTATO_CRATE = registerBlock("sweet_potato_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Tomatillo Crate
    public static final Block TOMATILLO_CRATE = registerBlock("tomatillo_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Tomato Crate
    public static final Block TOMATO_CRATE = registerBlock("tomato_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Turmeric Crate
    public static final Block TURMERIC_CRATE = registerBlock("turmeric_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Turnip Crate
    public static final Block TURNIP_CRATE = registerBlock("turnip_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Vanilla Crate
    public static final Block VANILLA_CRATE = registerBlock("vanilla_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Yam Crate
    public static final Block YAM_CRATE = registerBlock("yam_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Zucchini Crate
    public static final Block ZUCCHINI_CRATE = registerBlock("zucchini_crate", Block::new, Block.Properties.ofFullCopy(Blocks.OAK_PLANKS));

    // Black Bean Bag
    public static final Block BLACK_BEAN_BAG = registerBlock("black_bean_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Blueberry Bag
    public static final Block BLUEBERRY_BAG = registerBlock("blueberry_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Basil Bag
    public static final Block BASIL_BAG = registerBlock("basil_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Cranberry Bag
    public static final Block CRANBERRY_BAG = registerBlock("cranberry_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Currant Bag
    public static final Block CURRANT_BAG = registerBlock("currant_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Kale Bag
    public static final Block KALE_BAG = registerBlock("kale_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Oats Bag
    public static final Block OATS_BAG = registerBlock("oats_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Olive Bag
    public static final Block OLIVE_BAG = registerBlock("olive_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Peanut Bag
    public static final Block PEANUT_BAG = registerBlock("peanut_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Rice Bag
    public static final Block RICE_BAG = registerBlock("rice_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Soybeans Bag
    public static final Block SOYBEANS_BAG = registerBlock("soybeans_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Spinach Bag
    public static final Block SPINACH_BAG = registerBlock("spinach_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Tea Leaves Bag
    public static final Block TEA_LEAVES_BAG = registerBlock("tea_leaves_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    // Almond Bag
    public static final Block ALMOND_BAG = registerBlock("almond_bag", Block::new, Block.Properties.ofFullCopy(Blocks.WHITE_WOOL));

    private static Block registerBlock(String path, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        final Identifier identifier = Identifier.fromNamespaceAndPath(CrateDelightCroptopia.MODID, path);
        final ResourceKey<Block> registryKey = ResourceKey.create(Registries.BLOCK, identifier);
        final Block block = factory.apply(settings.setId(registryKey));
        Registry.register(BuiltInRegistries.BLOCK, registryKey, block);
        registerItem(path, itemSettings -> new BlockItem(block, itemSettings), new Item.Properties());
        return block;
    }

    public static Item registerItem(String path, Function<Item.Properties, Item> factory, Item.Properties settings) {
        final ResourceKey<Item> registryKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CrateDelightCroptopia.MODID, path));
        Item item = factory.apply(settings.setId(registryKey));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }
        return Registry.register(BuiltInRegistries.ITEM, registryKey, item);
    }

    public static void registerModBlocks() {}
}