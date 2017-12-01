package com.BrCraft.item;

import com.BrCraft.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemIronOxide extends Item {
    public ItemIronOxide(){
        super();
        this.setUnlocalizedName("ironOxide");
        this.setCreativeTab(CreativeTabsLoader.tabBrCraft);
    }
}
