package com.axperty.cratedelightcroptopia;

import com.axperty.cratedelightcroptopia.item.ModCreativeTab;
import com.axperty.cratedelightcroptopia.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrateDelightCroptopia implements ModInitializer {
    public static final String MODID = "cratedelightcroptopia";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        ModCreativeTab.registerItemGroups();
        BlockRegistry.registerModBlocks();
    }
}
