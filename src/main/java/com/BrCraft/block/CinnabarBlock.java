package com.BrCraft.block;

import com.BrCraft.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CinnabarBlock extends Block{
    public CinnabarBlock(){
        super(Material.ROCK);
        this.setUnlocalizedName("cinnabarBlock");
        this.setHardness(3F);
        this.setResistance(5F);
        this.setHarvestLevel("pickaxe",1);
        this.setCreativeTab(CreativeTabsLoader.tabBrCraft);
    }
}
