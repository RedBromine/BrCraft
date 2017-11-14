package com.BrCraft.block;

import com.BrCraft.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ChromiteBlock extends Block{
    public ChromiteBlock(){
        super(Material.GROUND);
        this.setUnlocalizedName("chromiteBlock");
        this.setHardness(4F);
        this.setResistance(50F);
        this.setHarvestLevel("WOOD",0);
        this.setCreativeTab(CreativeTabsLoader.tabBrCraft);
    }
}
