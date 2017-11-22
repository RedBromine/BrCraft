package com.BrCraft.block;

import com.BrCraft.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.BlockStateContainer;


public class PyriteBlock extends Block {
    public PyriteBlock(){
        super(Material.ROCK);
        this.setUnlocalizedName("pyriteBlock");
        this.setHardness(3F);
        this.setResistance(5F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe",1);
        this.setCreativeTab(CreativeTabsLoader.tabBrCraft);
    }
}
