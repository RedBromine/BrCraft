package com.BrCraft.block;

import com.BrCraft.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OrpimentBlock extends Block{
    public OrpimentBlock(){
        super(Material.ROCK);
        this.setUnlocalizedName("orpimentBlock");
        this.setHardness(3F);
        this.setResistance(4F);
        this.setHarvestLevel("pickaxe",1);
        this.setCreativeTab(CreativeTabsLoader.tabBrCraft);
    }
}
