package com.BrCraft;

import com.BrCraft.common.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author RedBromine
 */
@Mod(modid = BrCraft.MODID, name = BrCraft.NAME, version = BrCraft.VERSION, acceptedMinecraftVersions = "[1.10,)")
public class BrCraft
{
    public static final String MODID = "BrCraft";
    public static final String NAME = "BrCraft";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(BrCraft.MODID)
    public static BrCraft instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
    @SidedProxy(clientSide = "com.BrCraft.client.ClientProxy",
            serverSide = "com.BrCraft.common.CommonProxy")
    public static CommonProxy proxy;
}
