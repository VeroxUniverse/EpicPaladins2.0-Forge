package net.veroxuniverse.epicpaladins.common.registries.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.veroxuniverse.epicpaladins.common.registries.ItemsRegistry;

public class ItemMaterialsRegistry {

    public static final ForgeTier STEEL = new ForgeTier(3, 850, 12.0f,
            0.0f, 12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.STEEL_INGOT.get()));

    public static final ForgeTier JADE = new ForgeTier(4, 1561, 12.0f,
            0.0f, 25, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.JADE_GEM.get()));

    public static final ForgeTier ARCLIGHT = new ForgeTier(4, 1561, 12.0f,
            0.0f, 25, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.ARCLIGHT_GEM.get()));

    public static final ForgeTier MOONLIGHT = new ForgeTier(4, 1561, 12.0f,
            0.0f, 25, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.MOONLIGHT_GEM.get()));

    public static final ForgeTier SCULK = new ForgeTier(4, 1561, 12.0f,
            0.0f, 25, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.ECHO_SHARD));

    public static final ForgeTier BLOODSTONE = new ForgeTier(4, 1561, 12.0f,
            0.0f, 25, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.BLOODSTONE_GEM.get()));

    public static final ForgeTier CRYORIUM = new ForgeTier(4, 1561, 12.0f,
            0.0f, 25, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemsRegistry.CRYORIUM_GEM.get()));

}
