package com.BrCraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader
{
    public static CreativeTabs tabBrCraft;

    public CreativeTabsLoader(FMLPreInitializationEvent event)
    {
        tabBrCraft = new CreativeTabsBrCraft();
    }
}