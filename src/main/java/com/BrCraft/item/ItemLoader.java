package com.BrCraft.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
    public static Item saltOre = new ItemSaltOre();
    public static Item ironOxide = new ItemIronOxide();
    public static Item copperOxide = new ItemCopperOxide();
    public static Item mercuricOxide = new ItemMercuricOxide();
    public static Item arsenicTrioxide = new ItemArsenicTrioxide();

    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(saltOre, "salt_ore");
        register(ironOxide,"iron_oxide");
        register(copperOxide,"copper_oxide");
        register(mercuricOxide,"mercuric_oxide");
        register(arsenicTrioxide,"arsenic_trioxide");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(saltOre);
        registerRender(ironOxide);
        registerRender(copperOxide);
        registerRender(mercuricOxide);
        registerRender(arsenicTrioxide);
    }

    private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item.setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }

}