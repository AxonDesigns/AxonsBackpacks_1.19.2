package net.axonmodder.axonsbackpacks.item;

import net.axonmodder.axonsbackpacks.AxonsBackpacks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static Block registerBlock(String name, Block block, ItemGroup group){

        return Registry.register(Registry.BLOCK, new Identifier(AxonsBackpacks.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(AxonsBackpacks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        AxonsBackpacks.LOGGER.debug("Registering block for " + AxonsBackpacks.MOD_ID);
    }
}
