package net.serbob.mod_tutorial.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.serbob.mod_tutorial.ModTutorial;
import net.serbob.mod_tutorial.item.ModItemsGroup;

public class ModBlocks {
    public static final Block RUBY_ORE = BlockRegister("ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3,7)), ModItemsGroup.MOD_TUTORIAL_TAB);

    private static Block BlockRegisterNoItem (String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(ModTutorial.MOD_ID, name), block);
    }

    private static Block BlockRegister (String name, Block block, ItemGroup tab) {
        ItemBlockRegister(name,block,tab);
        return Registry.register(Registry.BLOCK, new Identifier(ModTutorial.MOD_ID, name), block);
    }

    public static Item ItemBlockRegister (String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(ModTutorial.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void ModBlocksRegister() {
        ModTutorial.LOGGER.debug("Registering ModBlocks - "+ModTutorial.MOD_ID);
    }
}
