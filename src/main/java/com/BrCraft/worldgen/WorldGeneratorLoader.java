package com.BrCraft.worldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class WorldGeneratorLoader {
    private static net.minecraft.world.gen.feature.WorldGenerator oregenerator = new WorldGeneratorOre();
    private BlockPos pos;
    public WorldGeneratorLoader(){
        MinecraftForge.ORE_GEN_BUS.register(this);
    }

    @SubscribeEvent
    public void onOreGenPost(OreGenEvent.Post event)
    {
        if (!event.getPos().equals(this.pos))
        {
            this.pos = event.getPos();
            oregenerator.generate(event.getWorld(), event.getRand(), event.getPos());
        }
    }

    @SubscribeEvent
    public void onOreGenGenerateMinable(OreGenEvent.GenerateMinable event){
        if(event.getType() == OreGenEvent.GenerateMinable.EventType.IRON){
            event.setResult(Event.Result.DENY);
        }
        if(event.getType() == OreGenEvent.GenerateMinable.EventType.COAL){
            Random random = new Random();
            int i = 1+random.nextInt(99);
            if(i >= 30){
                event.setResult(Event.Result.DENY);
            }
        }
    }
}
