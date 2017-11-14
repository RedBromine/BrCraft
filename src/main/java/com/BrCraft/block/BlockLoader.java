package com.BrCraft.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader
{
    public static Block saltOreBlock = new SaltOreBlock();
    public static Block pyriteBlock = new PyriteBlock();
    public static Block magnetiteBlock = new MagnetiteBlock();
    public static Block chromiteBlock = new ChromiteBlock();
    public static Block hematiteBlock = new HematiteBlock();
    public static Block ilmeniteBlock = new IlmeniteBlock();
    public static Block niobiteBlock = new NioboteBlock();
    public static Block tantaliteBlock = new TantaliteBlock();
    public BlockLoader(FMLPreInitializationEvent event)
    {
        register(saltOreBlock, "salt_ore_block");
        register(pyriteBlock,"pyrite_block");
        register(magnetiteBlock,"magnetite_block");
        register(chromiteBlock,"chromite_block");
        register(hematiteBlock,"hematite_block");
        register(ilmeniteBlock,"ilmenite_block");
        register(niobiteBlock,"niobite_block");
        register(tantaliteBlock,"tantalite_block");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(saltOreBlock);
        registerRender(pyriteBlock);
        registerRender(magnetiteBlock);
        registerRender(chromiteBlock);
        registerRender(hematiteBlock);
        registerRender(ilmeniteBlock);
        registerRender(niobiteBlock);
        registerRender(tantaliteBlock);
    }

    private static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block.setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
    }
}