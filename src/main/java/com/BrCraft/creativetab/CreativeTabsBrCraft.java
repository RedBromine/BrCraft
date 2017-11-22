package com.BrCraft.creativetab;

import com.BrCraft.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsBrCraft extends CreativeTabs
{
    public CreativeTabsBrCraft()
    {
        super("BrCraft");
    }

    @Override
    public Item getTabIconItem()
    {
        return ItemLoader.saltOre;
    }
}