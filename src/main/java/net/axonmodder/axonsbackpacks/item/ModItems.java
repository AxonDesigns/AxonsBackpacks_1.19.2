package net.axonmodder.axonsbackpacks.item;

import net.axonmodder.axonsbackpacks.AxonsBackpacks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item UPGRADE_BASE = registerItem("upgrade_base",
            new Item(new FabricItemSettings().group(ModItemGroup.AXONS_BACKPACKS_TAB)));

    public static final Item CRAFTING_UPGRADE = registerItem("crafting_upgrade",
            new Item(new FabricItemSettings().group(ModItemGroup.AXONS_BACKPACKS_TAB)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(AxonsBackpacks.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AxonsBackpacks.LOGGER.debug("Registering items for " + AxonsBackpacks.MOD_ID);
    }
}
