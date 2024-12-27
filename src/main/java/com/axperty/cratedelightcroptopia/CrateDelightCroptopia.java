package com.axperty.cratedelightcroptopia;

import com.axperty.cratedelightcroptopia.registry.BlockRegistry;
import com.axperty.cratedelightcroptopia.registry.ItemRegistry;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CrateDelightCroptopia.MOD_ID)
public class CrateDelightCroptopia {
    public static final String MOD_ID = "cratedelightcroptopia";
    public static final CreativeModeTab ITEM_GROUP = new VCItemGroup(CrateDelightCroptopia.MOD_ID);
    public static final Logger LOGGER = LogUtils.getLogger();

    public CrateDelightCroptopia() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.register(modEventBus);
        ItemRegistry.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static class VCItemGroup extends CreativeModeTab {
        public VCItemGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemRegistry.RASPBERRY_CRATE.get().getDefaultInstance();
        }
    }
}
