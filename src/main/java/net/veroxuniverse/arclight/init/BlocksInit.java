package net.veroxuniverse.arclight.init;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.block.ArmorForgeBlock;
import net.veroxuniverse.arclight.block.PedestalBlock;
import net.veroxuniverse.arclight.util.ArclightModCreativeTabs;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class BlocksInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ArclightMod.MODID);

    //Altar

    public static final RegistryObject<Block> PEDESTAL_BLOCK = registerBlockWithoutBlockItem("pedestal_block",
            () -> new PedestalBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ARMOR_FORGE = registerBlock("armor_forge",
            () -> new ArmorForgeBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ArclightModCreativeTabs.BUILDING_TAB);

    //ResourceBlocks

    public static final RegistryObject<Block> ARCLIGHT_BLOCK = registerBlock("arclight_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> MOONLIGHT_BLOCK = registerBlock("moonlight_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> BLOODSTONE_BLOCK = registerBlock("bloodstone_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> CRYORIUM_BLOCK = registerBlock("cryorium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> ARCLIGHT_ORE = registerBlock("arclight_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> JADE_ORE = registerBlock("jade_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> MOONLIGHT_ORE = registerBlock("moonlight_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> BLOODSTONE_ORE = registerBlock("bloodstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> CRYORIUM_ORE = registerBlock("cryorium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ARCLIGHT_ORE = registerBlock("deepslate_arclight_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> DEEPSLATE_BLOODSTONE_ORE = registerBlock("deepslate_bloodstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);
    public static final RegistryObject<Block> DEEPSLATE_CRYORIUM_ORE = registerBlock("deepslate_cryorium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ArclightModCreativeTabs.BUILDING_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ItemsInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}