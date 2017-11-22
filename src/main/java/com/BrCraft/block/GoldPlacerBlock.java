package com.BrCraft.block;

import com.BrCraft.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GoldPlacerBlock extends Block{
    public GoldPlacerBlock(){
        super(Material.SAND);
        this.setUnlocalizedName("GoldPlacerBlock");
        this.setHardness(2F);
        this.setResistance(2F);
        this.setHarvestLevel("shovel",0);
        this.setCreativeTab(CreativeTabsLoader.tabBrCraft);
    }
}
