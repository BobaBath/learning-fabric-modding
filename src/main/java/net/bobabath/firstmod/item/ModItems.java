package net.bobabath.firstmod.item;

import net.bobabath.firstmod.firstmod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item HEART = registerItem("heart",
            new Item(new FabricItemSettings().group(ModItemGroup.HEART_ITEMS)));

    public static final Item HEART_CRYSTAL_SHARD = registerItem("heart_crystal_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.HEART_ITEMS)));

    public static final Item HEART_CRYSTAL = registerItem("heart_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.HEART_ITEMS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(firstmod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        firstmod.LOGGER.debug("Registering ModItems for " + firstmod.MOD_ID);
    }
}
