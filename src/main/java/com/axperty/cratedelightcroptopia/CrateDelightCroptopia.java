package com.axperty.cratedelightcroptopia;

import com.axperty.cratedelightcroptopia.registry.CreativeTabRegistry;
import com.axperty.cratedelightcroptopia.registry.BlockRegistry;
import com.axperty.cratedelightcroptopia.registry.ItemRegistry;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(CrateDelightCroptopia.MOD_ID)
public class CrateDelightCroptopia
{
    public static final String MOD_ID = "cratedelightcroptopia";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CrateDelightCroptopia(IEventBus modEventBus, ModContainer modContainer) {
        BlockRegistry.BLOCKS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modEventBus);
        LOGGER.info("Crate Delight: Croptopia loaded");
    }
}
