package com.BrCraft.client;

import com.BrCraft.block.BlockLoader;
import com.BrCraft.item.ItemLoader;

public class ItemRenderLoader {

    public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }
}