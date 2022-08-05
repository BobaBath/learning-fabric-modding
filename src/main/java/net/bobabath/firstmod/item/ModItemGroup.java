package net.bobabath.firstmod.item;

import net.bobabath.firstmod.firstmod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup HEART_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(firstmod.MOD_ID, "heart_items"), () -> new ItemStack(ModItems.HEART));

}
