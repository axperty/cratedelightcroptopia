package com.axperty.cratedelightcroptopia.registry;

import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrateDelightCroptopia.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRATEDELIGHTCROPTOPIA_TAB = CREATIVE_MODE_TABS.register("cratedelightcroptopia_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockRegistry.RASPBERRY_CRATE.get()))
                    .title(Component.translatable("itemGroup.cratedelightcroptopia"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(BlockRegistry.ARTICHOKE_CRATE.get());
                        pOutput.accept(BlockRegistry.ASPARAGUS_CRATE.get());
                        pOutput.accept(BlockRegistry.BARLEY_CRATE.get());
                        pOutput.accept(BlockRegistry.BELL_PEPPER_CRATE.get());
                        pOutput.accept(BlockRegistry.BLACKBERRY_CRATE.get());
                        pOutput.accept(BlockRegistry.BROCCOLI_CRATE.get());
                        pOutput.accept(BlockRegistry.CABBAGE_CRATE.get());
                        pOutput.accept(BlockRegistry.CANTALOUPE_CRATE.get());
                        pOutput.accept(BlockRegistry.CAULIFLOWER_CRATE.get());
                        pOutput.accept(BlockRegistry.CELERY_CRATE.get());
                        pOutput.accept(BlockRegistry.CHILE_PEPPER_CRATE.get());
                        pOutput.accept(BlockRegistry.CORN_CRATE.get());
                        pOutput.accept(BlockRegistry.CUCUMBER_CRATE.get());
                        pOutput.accept(BlockRegistry.EGGPLANT_CRATE.get());
                        pOutput.accept(BlockRegistry.ELDERBERRY_CRATE.get());
                        pOutput.accept(BlockRegistry.GARLIC_CRATE.get());
                        pOutput.accept(BlockRegistry.GINGER_CRATE.get());
                        pOutput.accept(BlockRegistry.GRAPE_CRATE.get());
                        pOutput.accept(BlockRegistry.GREEN_BEAN_CRATE.get());
                        pOutput.accept(BlockRegistry.GREEN_ONION_CRATE.get());
                        pOutput.accept(BlockRegistry.HONEYDEW_CRATE.get());
                        pOutput.accept(BlockRegistry.HOPS_CRATE.get());
                        pOutput.accept(BlockRegistry.KIWI_CRATE.get());
                        pOutput.accept(BlockRegistry.LEEK_CRATE.get());
                        pOutput.accept(BlockRegistry.LETTUCE_CRATE.get());
                        pOutput.accept(BlockRegistry.MUSTARD_CRATE.get());
                        pOutput.accept(BlockRegistry.ONION_CRATE.get());
                        pOutput.accept(BlockRegistry.PINEAPPLE_CRATE.get());
                        pOutput.accept(BlockRegistry.RADISH_CRATE.get());
                        pOutput.accept(BlockRegistry.RASPBERRY_CRATE.get());
                        pOutput.accept(BlockRegistry.RHUBARB_CRATE.get());
                        pOutput.accept(BlockRegistry.RUTABAGA_CRATE.get());
                        pOutput.accept(BlockRegistry.SAGUARO_CRATE.get());
                        pOutput.accept(BlockRegistry.SQUASH_CRATE.get());
                        pOutput.accept(BlockRegistry.STRAWBERRY_CRATE.get());
                        pOutput.accept(BlockRegistry.SWEET_POTATO_CRATE.get());
                        pOutput.accept(BlockRegistry.TOMATILLO_CRATE.get());
                        pOutput.accept(BlockRegistry.TOMATO_CRATE.get());
                        pOutput.accept(BlockRegistry.TURMERIC_CRATE.get());
                        pOutput.accept(BlockRegistry.TURNIP_CRATE.get());
                        pOutput.accept(BlockRegistry.VANILLA_CRATE.get());
                        pOutput.accept(BlockRegistry.YAM_CRATE.get());
                        pOutput.accept(BlockRegistry.ZUCCHINI_CRATE.get());
                        pOutput.accept(BlockRegistry.BLACK_BEAN_BAG.get());
                        pOutput.accept(BlockRegistry.BLUEBERRY_BAG.get());
                        pOutput.accept(BlockRegistry.BASIL_BAG.get());
                        pOutput.accept(BlockRegistry.CRANBERRY_BAG.get());
                        pOutput.accept(BlockRegistry.CURRANT_BAG.get());
                        pOutput.accept(BlockRegistry.KALE_BAG.get());
                        pOutput.accept(BlockRegistry.OATS_BAG.get());
                        pOutput.accept(BlockRegistry.OLIVE_BAG.get());
                        pOutput.accept(BlockRegistry.PEANUT_BAG.get());
                        pOutput.accept(BlockRegistry.RICE_BAG.get());
                        pOutput.accept(BlockRegistry.SOYBEANS_BAG.get());
                        pOutput.accept(BlockRegistry.SPINACH_BAG.get());
                        pOutput.accept(BlockRegistry.TEA_LEAVES_BAG.get());
                        pOutput.accept(BlockRegistry.ALMOND_BAG.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
