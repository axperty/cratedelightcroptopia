package com.axperty.cratedelightcroptopia.registry;

import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;
import com.axperty.cratedelightcroptopia.registry.BlockRegistry;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrateDelightCroptopia.MOD_ID);

    private static final Item.Properties DEFAULT_PROPS = new Item.Properties();

    // Artichoke Crate
    public static final RegistryObject<Item> ARTICHOKE_CRATE = ITEMS.register("artichoke_crate",
            () -> (new BlockItem(BlockRegistry.ARTICHOKE_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Asparagus Crate
    public static final RegistryObject<Item> ASPARAGUS_CRATE = ITEMS.register("asparagus_crate",
            () -> (new BlockItem(BlockRegistry.ASPARAGUS_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Barley Crate
    public static final RegistryObject<Item> BARLEY_CRATE = ITEMS.register("barley_crate",
            () -> (new BlockItem(BlockRegistry.BARLEY_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Bell Pepper Crate
    public static final RegistryObject<Item> BELL_PEPPER_CRATE = ITEMS.register("bell_pepper_crate",
            () -> (new BlockItem(BlockRegistry.BELL_PEPPER_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Blackberry Crate
    public static final RegistryObject<Item> BLACKBERRY_CRATE = ITEMS.register("blackberry_crate",
            () -> (new BlockItem(BlockRegistry.BLACKBERRY_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Broccoli Crate
    public static final RegistryObject<Item> BROCCOLI_CRATE = ITEMS.register("broccoli_crate",
            () -> (new BlockItem(BlockRegistry.BROCCOLI_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Cabbage Crate
    public static final RegistryObject<Item> CABBAGE_CRATE = ITEMS.register("cabbage_crate",
            () -> (new BlockItem(BlockRegistry.CABBAGE_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Cantaloupe Crate
    public static final RegistryObject<Item> CANTALOUPE_CRATE = ITEMS.register("cantaloupe_crate",
            () -> (new BlockItem(BlockRegistry.CANTALOUPE_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Cauliflower Crate
    public static final RegistryObject<Item> CAULIFLOWER_CRATE = ITEMS.register("cauliflower_crate",
            () -> (new BlockItem(BlockRegistry.CAULIFLOWER_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Celery Crate
    public static final RegistryObject<Item> CELERY_CRATE = ITEMS.register("celery_crate",
            () -> (new BlockItem(BlockRegistry.CELERY_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Chile Pepper Crate
    public static final RegistryObject<Item> CHILE_PEPPER_CRATE = ITEMS.register("chile_pepper_crate",
            () -> (new BlockItem(BlockRegistry.CHILE_PEPPER_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Corn Crate
    public static final RegistryObject<Item> CORN_CRATE = ITEMS.register("corn_crate",
            () -> (new BlockItem(BlockRegistry.CORN_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Cucumber Crate
    public static final RegistryObject<Item> CUCUMBER_CRATE = ITEMS.register("cucumber_crate",
            () -> (new BlockItem(BlockRegistry.CUCUMBER_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Eggplant Crate
    public static final RegistryObject<Item> EGGPLANT_CRATE = ITEMS.register("eggplant_crate",
            () -> (new BlockItem(BlockRegistry.EGGPLANT_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Elderberry Crate
    public static final RegistryObject<Item> ELDERBERRY_CRATE = ITEMS.register("elderberry_crate",
            () -> (new BlockItem(BlockRegistry.ELDERBERRY_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Garlic Crate
    public static final RegistryObject<Item> GARLIC_CRATE = ITEMS.register("garlic_crate",
            () -> (new BlockItem(BlockRegistry.GARLIC_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Ginger Crate
    public static final RegistryObject<Item> GINGER_CRATE = ITEMS.register("ginger_crate",
            () -> (new BlockItem(BlockRegistry.GINGER_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Grape Crate
    public static final RegistryObject<Item> GRAPE_CRATE = ITEMS.register("grape_crate",
            () -> (new BlockItem(BlockRegistry.GRAPE_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Green Bean Crate
    public static final RegistryObject<Item> GREEN_BEAN_CRATE = ITEMS.register("green_bean_crate",
            () -> (new BlockItem(BlockRegistry.GREEN_BEAN_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Green Onion Crate
    public static final RegistryObject<Item> GREEN_ONION_CRATE = ITEMS.register("green_onion_crate",
            () -> (new BlockItem(BlockRegistry.GREEN_ONION_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Honeydew Crate
    public static final RegistryObject<Item> HONEYDEW_CRATE = ITEMS.register("honeydew_crate",
            () -> (new BlockItem(BlockRegistry.HONEYDEW_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Hops Crate
    public static final RegistryObject<Item> HOPS_CRATE = ITEMS.register("hops_crate",
            () -> (new BlockItem(BlockRegistry.HOPS_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Kiwi Crate
    public static final RegistryObject<Item> KIWI_CRATE = ITEMS.register("kiwi_crate",
            () -> (new BlockItem(BlockRegistry.KIWI_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Leek Crate
    public static final RegistryObject<Item> LEEK_CRATE = ITEMS.register("leek_crate",
            () -> (new BlockItem(BlockRegistry.LEEK_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Lettuce Crate
    public static final RegistryObject<Item> LETTUCE_CRATE = ITEMS.register("lettuce_crate",
            () -> (new BlockItem(BlockRegistry.LETTUCE_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Mustard Crate
    public static final RegistryObject<Item> MUSTARD_CRATE = ITEMS.register("mustard_crate",
            () -> (new BlockItem(BlockRegistry.MUSTARD_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Onion Crate
    public static final RegistryObject<Item> ONION_CRATE = ITEMS.register("onion_crate",
            () -> (new BlockItem(BlockRegistry.ONION_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Pineapple Crate
    public static final RegistryObject<Item> PINEAPPLE_CRATE = ITEMS.register("pineapple_crate",
            () -> (new BlockItem(BlockRegistry.PINEAPPLE_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Radish Crate
    public static final RegistryObject<Item> RADISH_CRATE = ITEMS.register("radish_crate",
            () -> (new BlockItem(BlockRegistry.RADISH_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Raspberry Crate
    public static final RegistryObject<Item> RASPBERRY_CRATE = ITEMS.register("raspberry_crate",
            () -> (new BlockItem(BlockRegistry.RASPBERRY_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Rhubarb Crate
    public static final RegistryObject<Item> RHUBARB_CRATE = ITEMS.register("rhubarb_crate",
            () -> (new BlockItem(BlockRegistry.RHUBARB_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Rutabaga Crate
    public static final RegistryObject<Item> RUTABAGA_CRATE = ITEMS.register("rutabaga_crate",
            () -> (new BlockItem(BlockRegistry.RUTABAGA_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Saguaro Crate
    public static final RegistryObject<Item> SAGUARO_CRATE = ITEMS.register("saguaro_crate",
            () -> (new BlockItem(BlockRegistry.SAGUARO_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Squash Crate
    public static final RegistryObject<Item> SQUASH_CRATE = ITEMS.register("squash_crate",
            () -> (new BlockItem(BlockRegistry.SQUASH_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Strawberry Crate
    public static final RegistryObject<Item> STRAWBERRY_CRATE = ITEMS.register("strawberry_crate",
            () -> (new BlockItem(BlockRegistry.STRAWBERRY_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Sweet Potato Crate
    public static final RegistryObject<Item> SWEET_POTATO_CRATE = ITEMS.register("sweet_potato_crate",
            () -> (new BlockItem(BlockRegistry.SWEET_POTATO_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Tomatillo Crate
    public static final RegistryObject<Item> TOMATILLO_CRATE = ITEMS.register("tomatillo_crate",
            () -> (new BlockItem(BlockRegistry.TOMATILLO_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Tomato Crate
    public static final RegistryObject<Item> TOMATO_CRATE = ITEMS.register("tomato_crate",
            () -> (new BlockItem(BlockRegistry.TOMATO_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Turmeric Crate
    public static final RegistryObject<Item> TURMERIC_CRATE = ITEMS.register("turmeric_crate",
            () -> (new BlockItem(BlockRegistry.TURMERIC_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Turnip Crate
    public static final RegistryObject<Item> TURNIP_CRATE = ITEMS.register("turnip_crate",
            () -> (new BlockItem(BlockRegistry.TURNIP_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Vanilla Crate
    public static final RegistryObject<Item> VANILLA_CRATE = ITEMS.register("vanilla_crate",
            () -> (new BlockItem(BlockRegistry.VANILLA_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Yam Crate
    public static final RegistryObject<Item> YAM_CRATE = ITEMS.register("yam_crate",
            () -> (new BlockItem(BlockRegistry.YAM_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Zucchini Crate
    public static final RegistryObject<Item> ZUCCHINI_CRATE = ITEMS.register("zucchini_crate",
            () -> (new BlockItem(BlockRegistry.ZUCCHINI_CRATE.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Black Bean Bag
    public static final RegistryObject<Item> BLACK_BEAN_BAG = ITEMS.register("black_bean_bag",
            () -> (new BlockItem(BlockRegistry.BLACK_BEAN_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Blueberry Bag
    public static final RegistryObject<Item> BLUEBERRY_BAG = ITEMS.register("blueberry_bag",
            () -> (new BlockItem(BlockRegistry.BLUEBERRY_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Basil Bag
    public static final RegistryObject<Item> BASIL_BAG = ITEMS.register("basil_bag",
            () -> (new BlockItem(BlockRegistry.BASIL_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Cranberry Bag
    public static final RegistryObject<Item> CRANBERRY_BAG = ITEMS.register("cranberry_bag",
            () -> (new BlockItem(BlockRegistry.CRANBERRY_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Currant Bag
    public static final RegistryObject<Item> CURRANT_BAG = ITEMS.register("currant_bag",
            () -> (new BlockItem(BlockRegistry.CURRANT_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Kale Bag
    public static final RegistryObject<Item> KALE_BAG = ITEMS.register("kale_bag",
            () -> (new BlockItem(BlockRegistry.KALE_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Oats Bag
    public static final RegistryObject<Item> OATS_BAG = ITEMS.register("oats_bag",
            () -> (new BlockItem(BlockRegistry.OATS_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Olive Bag
    public static final RegistryObject<Item> OLIVE_BAG = ITEMS.register("olive_bag",
            () -> (new BlockItem(BlockRegistry.OLIVE_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Peanut Bag
    public static final RegistryObject<Item> PEANUT_BAG = ITEMS.register("peanut_bag",
            () -> (new BlockItem(BlockRegistry.PEANUT_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Rice Bag
    public static final RegistryObject<Item> RICE_BAG = ITEMS.register("rice_bag",
            () -> (new BlockItem(BlockRegistry.RICE_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Soybeans Bag
    public static final RegistryObject<Item> SOYBEANS_BAG = ITEMS.register("soybeans_bag",
            () -> (new BlockItem(BlockRegistry.SOYBEANS_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Spinach Bag
    public static final RegistryObject<Item> SPINACH_BAG = ITEMS.register("spinach_bag",
            () -> (new BlockItem(BlockRegistry.SPINACH_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Tea Leaves Bag
    public static final RegistryObject<Item> TEA_LEAVES_BAG = ITEMS.register("tea_leaves_bag",
            () -> (new BlockItem(BlockRegistry.TEA_LEAVES_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    // Almond Bag
    public static final RegistryObject<Item> ALMOND_BAG = ITEMS.register("almond_bag",
            () -> (new BlockItem(BlockRegistry.ALMOND_BAG.get(), (new Item.Properties()).tab(CrateDelightCroptopia.ITEM_GROUP))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}