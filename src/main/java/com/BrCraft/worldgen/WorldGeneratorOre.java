package com.BrCraft.worldgen;

import com.BrCraft.BrCraft;
import com.BrCraft.block.BlockLoader;
import com.BrCraft.block.PyriteBlock;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

import java.util.Random;


public class WorldGeneratorOre extends net.minecraft.world.gen.feature.WorldGenerator {

    private final net.minecraft.world.gen.feature.WorldGenerator pyriteGenerator = new WorldGenMinable(BlockLoader.pyriteBlock.getDefaultState(), 7);
    private final net.minecraft.world.gen.feature.WorldGenerator ilmeniteGenerator = new WorldGenMinable(BlockLoader.ilmeniteBlock.getDefaultState(), 7);
    private final net.minecraft.world.gen.feature.WorldGenerator hematiteGenerator = new WorldGenMinable(BlockLoader.hematiteBlock.getDefaultState(), 7);
    private final net.minecraft.world.gen.feature.WorldGenerator chromiteGenerator = new WorldGenMinable(BlockLoader.chromiteBlock.getDefaultState(), 5);
    private final net.minecraft.world.gen.feature.WorldGenerator magnetiteGenerator = new WorldGenMinable(BlockLoader.magnetiteBlock.getDefaultState(), 7);
    private final net.minecraft.world.gen.feature.WorldGenerator niobiteGenerator = new WorldGenMinable(BlockLoader.niobiteBlock.getDefaultState(), 3);
    private final net.minecraft.world.gen.feature.WorldGenerator tantaliteGenerator = new WorldGenMinable(BlockLoader.tantaliteBlock.getDefaultState(), 3);
    private final net.minecraft.world.gen.feature.WorldGenerator azuriteGenerator = new WorldGenMinable(BlockLoader.azuriteBlock.getDefaultState(), 5);
    private final net.minecraft.world.gen.feature.WorldGenerator borniteGenerator = new WorldGenMinable(BlockLoader.borniteBlock.getDefaultState(), 5);
    private final net.minecraft.world.gen.feature.WorldGenerator chalcociteGenerator = new WorldGenMinable(BlockLoader.chalcociteBlock.getDefaultState(), 5);
    private final net.minecraft.world.gen.feature.WorldGenerator chalcopyriteGenerator = new WorldGenMinable(BlockLoader.chalcopyriteBlock.getDefaultState(), 5);
    private final net.minecraft.world.gen.feature.WorldGenerator cinnabarGenerator = new WorldGenMinable(BlockLoader.cinnabarBlock.getDefaultState(), 3);
    private final net.minecraft.world.gen.feature.WorldGenerator orpimentGenerator = new WorldGenMinable(BlockLoader.orpimentBlock.getDefaultState(), 4);
    private final net.minecraft.world.gen.feature.WorldGenerator realgarGenerator = new WorldGenMinable(BlockLoader.realgarBlock.getDefaultState(), 4);

    @Override
    public boolean generate(World world, Random rand, BlockPos pos)
    {
        if (TerrainGen.generateOre(world, rand, this, pos, OreGenEvent.GenerateMinable.EventType.CUSTOM))
        {
            for (int i = 0; i < 4; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 1 + rand.nextInt(55);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                magnetiteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 4; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 1 + rand.nextInt(40);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                pyriteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 4; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 5 + rand.nextInt(55);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                ilmeniteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 4; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 10 + rand.nextInt(55);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                hematiteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 4; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 1 + rand.nextInt(20);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                chromiteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 3; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 1 + rand.nextInt(20);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                niobiteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 2; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 1 + rand.nextInt(15);
                int posZ = pos.getZ() + rand.nextInt(12);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                tantaliteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 4; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 30 + rand.nextInt(30);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                azuriteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 3; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 10 + rand.nextInt(50);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                borniteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 3; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 10 + rand.nextInt(50);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                chalcociteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 3; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 1 + rand.nextInt(40);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                chalcopyriteGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 3; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 1 + rand.nextInt(30);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                cinnabarGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 3; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 1 + rand.nextInt(30);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                orpimentGenerator.generate(world,rand,blockpos);
            }
            for (int i = 0; i < 3; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 1 + rand.nextInt(30);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);
                realgarGenerator.generate(world,rand,blockpos);
            }
        }
        return true;
    }
}
