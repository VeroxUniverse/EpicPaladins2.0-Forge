package net.veroxuniverse.arclight.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.init.ItemsInit;

public class ArclightModCreativeTabs {

    public static final ItemGroup RESOURCES_TAB = FabricItemGroupBuilder.build(
            new Identifier(ArclightMod.MODID, "arclight_resources"),
            () -> new ItemStack(ItemsInit.ARCLIGHT_GEM));

    public static final ItemGroup BUILDING_TAB = FabricItemGroupBuilder.build(
            new Identifier(ArclightMod.MODID, "arclight_building"),
            () -> new ItemStack(BlocksInit.ARCLIGHT_BLOCK));

    public static final ItemGroup ARCLIGHT_TAB = FabricItemGroupBuilder.build(
            new Identifier(ArclightMod.MODID, "arclight_tab"),
            () -> new ItemStack(ItemsInit.ANGEL_SWORD));
}

