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
    public static final RegistryObject<Block> ARTICHOKE_CRATE = registerBlock("artichoke_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Asparagus Crate
    public static final RegistryObject<Block> ASPARAGUS_CRATE = registerBlock("asparagus_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Barley Crate
    public static final RegistryObject<Block> BARLEY_CRATE = registerBlock("barley_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Bell Pepper Crate
    public static final RegistryObject<Block> BELL_PEPPER_CRATE = registerBlock("bell_pepper_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Blackberry Crate
    public static final RegistryObject<Block> BLACKBERRY_CRATE = registerBlock("blackberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Broccoli Crate
    public static final RegistryObject<Block> BROCCOLI_CRATE = registerBlock("broccoli_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Cabbage Crate
    public static final RegistryObject<Block> CABBAGE_CRATE = registerBlock("cabbage_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Cantaloupe Crate
    public static final RegistryObject<Block> CANTALOUPE_CRATE = registerBlock("cantaloupe_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Cauliflower Crate
    public static final RegistryObject<Block> CAULIFLOWER_CRATE = registerBlock("cauliflower_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Celery Crate
    public static final RegistryObject<Block> CELERY_CRATE = registerBlock("celery_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Chile Pepper Crate
    public static final RegistryObject<Block> CHILE_PEPPER_CRATE = registerBlock("chile_pepper_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Corn Crate
    public static final RegistryObject<Block> CORN_CRATE = registerBlock("corn_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Cucumber Crate
    public static final RegistryObject<Block> CUCUMBER_CRATE = registerBlock("cucumber_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Eggplant Crate
    public static final RegistryObject<Block> EGGPLANT_CRATE = registerBlock("eggplant_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Elderberry Crate
    public static final RegistryObject<Block> ELDERBERRY_CRATE = registerBlock("elderberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Garlic Crate
    public static final RegistryObject<Block> GARLIC_CRATE = registerBlock("garlic_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Ginger Crate
    public static final RegistryObject<Block> GINGER_CRATE = registerBlock("ginger_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Grape Crate
    public static final RegistryObject<Block> GRAPE_CRATE = registerBlock("grape_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Green Bean Crate
    public static final RegistryObject<Block> GREEN_BEAN_CRATE = registerBlock("green_bean_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Green Onion Crate
    public static final RegistryObject<Block> GREEN_ONION_CRATE = registerBlock("green_onion_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Honeydew Crate
    public static final RegistryObject<Block> HONEYDEW_CRATE = registerBlock("honeydew_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Hops Crate
    public static final RegistryObject<Block> HOPS_CRATE = registerBlock("hops_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Kiwi Crate
    public static final RegistryObject<Block> KIWI_CRATE = registerBlock("kiwi_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Leek Crate
    public static final RegistryObject<Block> LEEK_CRATE = registerBlock("leek_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Lettuce Crate
    public static final RegistryObject<Block> LETTUCE_CRATE = registerBlock("lettuce_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Mustard Crate
    public static final RegistryObject<Block> MUSTARD_CRATE = registerBlock("mustard_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Onion Crate
    public static final RegistryObject<Block> ONION_CRATE = registerBlock("onion_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Pineapple Crate
    public static final RegistryObject<Block> PINEAPPLE_CRATE = registerBlock("pineapple_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Radish Crate
    public static final RegistryObject<Block> RADISH_CRATE = registerBlock("radish_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Raspberry Crate
    public static final RegistryObject<Block> RASPBERRY_CRATE = registerBlock("raspberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Rhubarb Crate
    public static final RegistryObject<Block> RHUBARB_CRATE = registerBlock("rhubarb_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Rutabaga Crate
    public static final RegistryObject<Block> RUTABAGA_CRATE = registerBlock("rutabaga_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Saguaro Crate
    public static final RegistryObject<Block> SAGUARO_CRATE = registerBlock("saguaro_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Squash Crate
    public static final RegistryObject<Block> SQUASH_CRATE = registerBlock("squash_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Strawberry Crate
    public static final RegistryObject<Block> STRAWBERRY_CRATE = registerBlock("strawberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Sweet Potato Crate
    public static final RegistryObject<Block> SWEET_POTATO_CRATE = registerBlock("sweet_potato_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Tomatillo Crate
    public static final RegistryObject<Block> TOMATILLO_CRATE = registerBlock("tomatillo_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Tomato Crate
    public static final RegistryObject<Block> TOMATO_CRATE = registerBlock("tomato_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Turmeric Crate
    public static final RegistryObject<Block> TURMERIC_CRATE = registerBlock("turmeric_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Turnip Crate
    public static final RegistryObject<Block> TURNIP_CRATE = registerBlock("turnip_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Vanilla Crate
    public static final RegistryObject<Block> VANILLA_CRATE = registerBlock("vanilla_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Yam Crate
    public static final RegistryObject<Block> YAM_CRATE = registerBlock("yam_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Zucchini Crate
    public static final RegistryObject<Block> ZUCCHINI_CRATE = registerBlock("zucchini_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    // Black Bean Bag
    public static final RegistryObject<Block> BLACK_BEAN_BAG = registerBlock("black_bean_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Blueberry Bag
    public static final RegistryObject<Block> BLUEBERRY_BAG = registerBlock("blueberry_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Basil Bag
    public static final RegistryObject<Block> BASIL_BAG = registerBlock("basil_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Cranberry Bag
    public static final RegistryObject<Block> CRANBERRY_BAG = registerBlock("cranberry_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Currant Bag
    public static final RegistryObject<Block> CURRANT_BAG = registerBlock("currant_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Kale Bag
    public static final RegistryObject<Block> KALE_BAG = registerBlock("kale_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Oats Bag
    public static final RegistryObject<Block> OATS_BAG = registerBlock("oats_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Olive Bag
    public static final RegistryObject<Block> OLIVE_BAG = registerBlock("olive_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Peanut Bag
    public static final RegistryObject<Block> PEANUT_BAG = registerBlock("peanut_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Rice Bag
    public static final RegistryObject<Block> RICE_BAG = registerBlock("rice_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Soybeans Bag
    public static final RegistryObject<Block> SOYBEANS_BAG = registerBlock("soybeans_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Spinach Bag
    public static final RegistryObject<Block> SPINACH_BAG = registerBlock("spinach_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Tea Leaves Bag
    public static final RegistryObject<Block> TEA_LEAVES_BAG = registerBlock("tea_leaves_bag",
            () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));

    // Almond Bag
    public static final RegistryObject<Block> ALMOND_BAG = registerBlock("almond_bag",
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
