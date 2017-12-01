package com.BrCraft.Crafting;

import com.BrCraft.block.BlockLoader;
import com.BrCraft.item.ItemLoader;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader {
    public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {

    }

    private static void registerSmelting()
    {
        GameRegistry.addSmelting(BlockLoader.magnetiteBlock, new ItemStack(ItemLoader.ironOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.ilmeniteBlock, new ItemStack(ItemLoader.ironOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.hematiteBlock, new ItemStack(ItemLoader.ironOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.tantaliteBlock, new ItemStack(ItemLoader.ironOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.niobiteBlock, new ItemStack(ItemLoader.ironOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.chromiteBlock, new ItemStack(ItemLoader.ironOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.pyriteBlock, new ItemStack(ItemLoader.ironOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.chalcociteBlock, new ItemStack(ItemLoader.copperOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.chalcopyriteBlock, new ItemStack(ItemLoader.copperOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.borniteBlock, new ItemStack(ItemLoader.copperOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.azuriteBlock, new ItemStack(ItemLoader.copperOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.cinnabarBlock, new ItemStack(ItemLoader.mercuricOxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.realgarBlock, new ItemStack(ItemLoader.arsenicTrioxide),0.5f);
        GameRegistry.addSmelting(BlockLoader.orpimentBlock, new ItemStack(ItemLoader.arsenicTrioxide),0.5f);
    }

    private static void registerFuel()
    {

    }
}
