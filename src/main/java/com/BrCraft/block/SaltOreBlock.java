package com.BrCraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SaltOreBlock extends Block {
    public SaltOreBlock(){
        super(Material.ground);
        this.setUnlocalizedName("saltOreBlock");
        this.setHardness(1F);
        this,setHarvestLevel(,1);
        this.setResistance(8F);

    }
}
