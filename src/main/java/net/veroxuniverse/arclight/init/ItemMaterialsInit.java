package net.veroxuniverse.arclight.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ItemMaterialsInit {

    public static final ForgeTier ARCLIGHT = new ForgeTier(4, 2500, 12.0f,
            0f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemsInit.ARCLIGHT_INGOT.get()));

    public static final ForgeTier JADE = new ForgeTier(4, 2500, 12.0f,
            0f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemsInit.JADE_INGOT.get()));

    public static final ForgeTier MOONLIGHT = new ForgeTier(4, 1700, 10.0f,
            0f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemsInit.MOONLIGHT_INGOT.get()));

    public static final ForgeTier BLOODSTONE = new ForgeTier(4, 2500, 12.0f,
            0f, 24, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemsInit.BLOODSTONE_INGOT.get()));

    public static final ForgeTier SCULK = new ForgeTier(4, 2500, 12.0f,
            0f, 24, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemsInit.SCULK_INGOT.get()));

    public static final ForgeTier CRYORIUM = new ForgeTier(4, 2500, 12.0f,
            0f, 24, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemsInit.CRYORIUM_INGOT.get()));
}