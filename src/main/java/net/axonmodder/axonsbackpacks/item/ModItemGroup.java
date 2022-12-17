package net.axonmodder.axonsbackpacks.item;

import net.axonmodder.axonsbackpacks.AxonsBackpacks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup AXONS_BACKPACKS_TAB = FabricItemGroupBuilder.build(
            new Identifier(AxonsBackpacks.MOD_ID, "axons_backpacks"), () -> new ItemStack(ModItems.UPGRADE_BASE));
}
