package net.veroxuniverse.arclight.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.block.ArmorForgeBlock;
import net.veroxuniverse.arclight.block.PedestalBlock;
import net.veroxuniverse.arclight.util.ArclightModCreativeTabs;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class BlocksInit {

    //Altar

    public static final Block PEDESTAL_BLOCK = registerBlockWithoutBlockItem("pedestal_block",
            () -> new PedestalBlock(AbstractBlock.Settings.of(Material.STONE).nonOpaque()
                    .strength(4f).requiresTool()));

    public static final Block ARMOR_FORGE = registerBlock("armor_forge",
            () -> new ArmorForgeBlock(AbstractBlock.Settings.of(Material.METAL)
                    .strength(4f).requiresTool()), ArclightModCreativeTabs.BUILDING_TAB);

    //ResourceBlocks

    public static final Block ARCLIGHT_BLOCK = registerBlock("arclight_block",
            () -> new Block(AbstractBlock.Settings.of(Material.METAL)
                    .strength(4f).requiresTool()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            () -> new Block(AbstractBlock.Settings.of(Material.METAL)
                    .strength(4f).requiresTool()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block MOONLIGHT_BLOCK = registerBlock("moonlight_block",
            () -> new Block(AbstractBlock.Settings.of(Material.METAL)
                    .strength(4f).requiresTool()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block BLOODSTONE_BLOCK = registerBlock("bloodstone_block",
            () -> new Block(AbstractBlock.Settings.of(Material.METAL)
                    .strength(4f).requiresTool()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block CRYORIUM_BLOCK = registerBlock("cryorium_block",
            () -> new Block(AbstractBlock.Settings.of(Material.METAL)
                    .strength(4f).requiresTool()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block ARCLIGHT_ORE = registerBlock("arclight_ore",
            () -> new OreBlock(AbstractBlock.Settings.of(Material.STONE)
                    .strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block JADE_ORE = registerBlock("jade_ore",
            () -> new OreBlock(AbstractBlock.Settings.of(Material.STONE)
                    .strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block MOONLIGHT_ORE = registerBlock("moonlight_ore",
            () -> new OreBlock(AbstractBlock.Settings.of(Material.STONE)
                    .strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block BLOODSTONE_ORE = registerBlock("bloodstone_ore",
            () -> new OreBlock(AbstractBlock.Settings.of(Material.STONE)
                    .strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block CRYORIUM_ORE = registerBlock("cryorium_ore",
            () -> new OreBlock(AbstractBlock.Settings.of(Material.STONE)
                    .strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block DEEPSLATE_ARCLIGHT_ORE = registerBlock("deepslate_arclight_ore",
            () -> new OreBlock(AbstractBlock.Settings.of(Material.STONE)
                    .strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block DEEPSLATE_BLOODSTONE_ORE = registerBlock("deepslate_bloodstone_ore",
            () -> new OreBlock(AbstractBlock.Settings.of(Material.STONE)
                    .strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final Block DEEPSLATE_CRYORIUM_ORE = registerBlock("deepslate_cryorium_ore",
            () -> new OreBlock(AbstractBlock.Settings.of(Material.STONE)
                    .strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);

    private static Block registerBlock(String name, Supplier<Block> block, ItemGroup tab) {
        Block b = block.get();
        Registry.register(Registry.BLOCK, new Identifier(ArclightMod.MODID, name), b);
        registerBlockItem(name, b, tab);
        return b;
    }

    private static Block registerBlockWithoutBlockItem(String name, Supplier<Block> block) {
        Block b = block.get();
        Registry.register(Registry.BLOCK, new Identifier(ArclightMod.MODID, name), b);
        return b;
    }

    private static BlockItem registerBlockItem(String name, Block block, ItemGroup tab) {
        BlockItem b = new BlockItem(block, new Item.Settings().group(tab));
        Registry.register(Registry.ITEM, new Identifier(ArclightMod.MODID, name), b);
        return b;
    }
}