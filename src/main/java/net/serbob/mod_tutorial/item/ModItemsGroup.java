package net.serbob.mod_tutorial.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.serbob.mod_tutorial.ModTutorial;

public class ModItemsGroup {
    public static final ItemGroup MOD_TUTORIAL_TAB = FabricItemGroupBuilder.build(
            new Identifier(ModTutorial.MOD_ID, "mod_tutorial_tab"), () -> new ItemStack(ModItems.RUBY));
}
