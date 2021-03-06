package com.BrCraft.block;

import com.BrCraft.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SaltOreBlock extends Block {
    public SaltOreBlock(){
        super(Material.GROUND);
        this.setUnlocalizedName("saltOreBlock");
        this.setHardness(1F);
        this.setResistance(2F);
        this.setLightOpacity(5);
        this.setCreativeTab(CreativeTabsLoader.tabBrCraft);
    }
}
