package com.BrCraft.common;

import com.BrCraft.Crafting.CraftingLoader;
import com.BrCraft.block.BlockLoader;
import com.BrCraft.creativetab.CreativeTabsBrCraft;
import com.BrCraft.creativetab.CreativeTabsLoader;
import com.BrCraft.item.ItemLoader;
import com.BrCraft.worldgen.WorldGeneratorLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        new CreativeTabsLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
    }

    public void init(FMLInitializationEvent event)
    {
        new WorldGeneratorLoader();
        new CraftingLoader();
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        
    }

}