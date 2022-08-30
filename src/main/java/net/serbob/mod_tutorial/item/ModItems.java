package net.serbob.mod_tutorial.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.serbob.mod_tutorial.ModTutorial;

public class ModItems {
    public static final Item RUBY = ItemRegister("ruby",
            new Item(new FabricItemSettings().group(ModItemsGroup.MOD_TUTORIAL_TAB)));

    private static Item ItemRegister(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ModTutorial.MOD_ID, name), item);
    }

    public static void ModItemRegister() {
        ModTutorial.LOGGER.debug("Registering mod items");
    }
}
