package com.BrCraft.item;

import com.BrCraft.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemSaltOre extends Item{
    public ItemSaltOre(){
        super();
        this.setUnlocalizedName("saltOre");
        this.setCreativeTab(CreativeTabsLoader.tabBrCraft);
    }
}