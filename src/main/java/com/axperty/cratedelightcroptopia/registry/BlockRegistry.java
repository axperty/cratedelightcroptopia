package com.axperty.cratedelightcroptopia.registry;

import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CrateDelightCroptopia.MOD_ID);

    // Artichoke Crate
    public static final RegistryObject<Block> ARTICHOKE_CRATE = BLOCKS.register("artichoke_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Asparagus Crate
    public static final RegistryObject<Block> ASPARAGUS_CRATE = BLOCKS.register("asparagus_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Barley Crate
    public static final RegistryObject<Block> BARLEY_CRATE = BLOCKS.register("barley_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Bell Pepper Crate
    public static final RegistryObject<Block> BELL_PEPPER_CRATE = BLOCKS.register("bell_pepper_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Blackberry Crate
    public static final RegistryObject<Block> BLACKBERRY_CRATE = BLOCKS.register("blackberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Broccoli Crate
    public static final RegistryObject<Block> BROCCOLI_CRATE = BLOCKS.register("broccoli_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Cabbage Crate
    public static final RegistryObject<Block> CABBAGE_CRATE = BLOCKS.register("cabbage_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Cantaloupe Crate
    public static final RegistryObject<Block> CANTALOUPE_CRATE = BLOCKS.register("cantaloupe_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Cauliflower Crate
    public static final RegistryObject<Block> CAULIFLOWER_CRATE = BLOCKS.register("cauliflower_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Celery Crate
    public static final RegistryObject<Block> CELERY_CRATE = BLOCKS.register("celery_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Chile Pepper Crate
    public static final RegistryObject<Block> CHILE_PEPPER_CRATE = BLOCKS.register("chile_pepper_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Corn Crate
    public static final RegistryObject<Block> CORN_CRATE = BLOCKS.register("corn_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Cucumber Crate
    public static final RegistryObject<Block> CUCUMBER_CRATE = BLOCKS.register("cucumber_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Eggplant Crate
    public static final RegistryObject<Block> EGGPLANT_CRATE = BLOCKS.register("eggplant_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Elderberry Crate
    public static final RegistryObject<Block> ELDERBERRY_CRATE = BLOCKS.register("elderberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Garlic Crate
    public static final RegistryObject<Block> GARLIC_CRATE = BLOCKS.register("garlic_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Ginger Crate
    public static final RegistryObject<Block> GINGER_CRATE = BLOCKS.register("ginger_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Grape Crate
    public static final RegistryObject<Block> GRAPE_CRATE = BLOCKS.register("grape_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Green Bean Crate
    public static final RegistryObject<Block> GREEN_BEAN_CRATE = BLOCKS.register("green_bean_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Green Onion Crate
    public static final RegistryObject<Block> GREEN_ONION_CRATE = BLOCKS.register("green_onion_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Honeydew Crate
    public static final RegistryObject<Block> HONEYDEW_CRATE = BLOCKS.register("honeydew_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Hops Crate
    public static final RegistryObject<Block> HOPS_CRATE = BLOCKS.register("hops_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Kiwi Crate
    public static final RegistryObject<Block> KIWI_CRATE = BLOCKS.register("kiwi_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Leek Crate
    public static final RegistryObject<Block> LEEK_CRATE = BLOCKS.register("leek_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Lettuce Crate
    public static final RegistryObject<Block> LETTUCE_CRATE = BLOCKS.register("lettuce_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Mustard Crate
    public static final RegistryObject<Block> MUSTARD_CRATE = BLOCKS.register("mustard_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Onion Crate
    public static final RegistryObject<Block> ONION_CRATE = BLOCKS.register("onion_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Pineapple Crate
    public static final RegistryObject<Block> PINEAPPLE_CRATE = BLOCKS.register("pineapple_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Radish Crate
    public static final RegistryObject<Block> RADISH_CRATE = BLOCKS.register("radish_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Raspberry Crate
    public static final RegistryObject<Block> RASPBERRY_CRATE = BLOCKS.register("raspberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Rhubarb Crate
    public static final RegistryObject<Block> RHUBARB_CRATE = BLOCKS.register("rhubarb_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Rutabaga Crate
    public static final RegistryObject<Block> RUTABAGA_CRATE = BLOCKS.register("rutabaga_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Saguaro Crate
    public static final RegistryObject<Block> SAGUARO_CRATE = BLOCKS.register("saguaro_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Squash Crate
    public static final RegistryObject<Block> SQUASH_CRATE = BLOCKS.register("squash_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Strawberry Crate
    public static final RegistryObject<Block> STRAWBERRY_CRATE = BLOCKS.register("strawberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Sweet Potato Crate
    public static final RegistryObject<Block> SWEET_POTATO_CRATE = BLOCKS.register("sweet_potato_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Tomatillo Crate
    public static final RegistryObject<Block> TOMATILLO_CRATE = BLOCKS.register("tomatillo_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Tomato Crate
    public static final RegistryObject<Block> TOMATO_CRATE = BLOCKS.register("tomato_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Turmeric Crate
    public static final RegistryObject<Block> TURMERIC_CRATE = BLOCKS.register("turmeric_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Turnip Crate
    public static final RegistryObject<Block> TURNIP_CRATE = BLOCKS.register("turnip_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Vanilla Crate
    public static final RegistryObject<Block> VANILLA_CRATE = BLOCKS.register("vanilla_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Yam Crate
    public static final RegistryObject<Block> YAM_CRATE = BLOCKS.register("yam_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Zucchini Crate
    public static final RegistryObject<Block> ZUCCHINI_CRATE = BLOCKS.register("zucchini_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Black Bean Bag
    public static final RegistryObject<Block> BLACK_BEAN_BAG = BLOCKS.register("black_bean_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Blueberry Bag
    public static final RegistryObject<Block> BLUEBERRY_BAG = BLOCKS.register("blueberry_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Basil Bag
    public static final RegistryObject<Block> BASIL_BAG = BLOCKS.register("basil_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Cranberry Bag
    public static final RegistryObject<Block> CRANBERRY_BAG = BLOCKS.register("cranberry_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Currant Bag
    public static final RegistryObject<Block> CURRANT_BAG = BLOCKS.register("currant_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Kale Bag
    public static final RegistryObject<Block> KALE_BAG = BLOCKS.register("kale_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Oats Bag
    public static final RegistryObject<Block> OATS_BAG = BLOCKS.register("oats_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Olive Bag
    public static final RegistryObject<Block> OLIVE_BAG = BLOCKS.register("olive_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Peanut Bag
    public static final RegistryObject<Block> PEANUT_BAG = BLOCKS.register("peanut_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Rice Bag
    public static final RegistryObject<Block> RICE_BAG = BLOCKS.register("rice_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Soybeans Bag
    public static final RegistryObject<Block> SOYBEANS_BAG = BLOCKS.register("soybeans_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Spinach Bag
    public static final RegistryObject<Block> SPINACH_BAG = BLOCKS.register("spinach_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Tea Leaves Bag
    public static final RegistryObject<Block> TEA_LEAVES_BAG = BLOCKS.register("tea_leaves_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Almond Bag
    public static final RegistryObject<Block> ALMOND_BAG = BLOCKS.register("almond_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
