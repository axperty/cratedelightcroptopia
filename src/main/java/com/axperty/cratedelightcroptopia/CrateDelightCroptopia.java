package com.axperty.cratedelightcroptopia;

import com.axperty.cratedelightcroptopia.registry.BlockRegistry;
import com.axperty.cratedelightcroptopia.registry.CreativeTabRegistry;
import com.axperty.cratedelightcroptopia.registry.ItemRegistry;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CrateDelightCroptopia.MOD_ID)
public class CrateDelightCroptopia {
    public static final String MOD_ID = "cratedelightcroptopia";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CrateDelightCroptopia() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.register(modEventBus);
        ItemRegistry.register(modEventBus);
        CreativeTabRegistry.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
