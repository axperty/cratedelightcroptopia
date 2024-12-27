package com.axperty.cratedelightcroptopia.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import com.axperty.cratedelightcroptopia.CrateDelightCroptopia;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreativeTabRegistry {
    public static final ItemGroup CREATIVE_MODE_TAB = FabricItemGroupBuilder.build(
            new Identifier(CrateDelightCroptopia.MODID, "creative_tab"), () -> new ItemStack(BlockRegistry.RASPBERRY_CRATE));
}