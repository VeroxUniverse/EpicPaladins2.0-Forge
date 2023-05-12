package net.veroxuniverse.arclight.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.client.registry.screen.SimpleClickArea;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.DisplaySerializerRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;
import net.veroxuniverse.arclight.screen.ArmorForgeScreen;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class JEIArclightPlugin implements REIClientPlugin {

    public @NotNull Identifier getPluginUid() {
        return new Identifier(ArclightMod.MODID, "rei_plugin");
    }

    @Override
    public void registerCategories(CategoryRegistry registration) {
        registration.add(new ArmorForgeRecipeCategory());
        registration.addWorkstations(ArmorForgeRecipeCategory.UID, EntryStacks.of(BlocksInit.ARMOR_FORGE));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerFiller(ArmorForgeRecipe.class, ArmorForgeRecipeDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerContainerClickArea(new Rectangle(105, 33, 10, 40), ArmorForgeScreen.class,
                ArmorForgeRecipeCategory.UID);
    }

    @Override
    public void registerDisplaySerializer(DisplaySerializerRegistry registry) {
        // registry.register(ArmorForgeRecipeCategory.UID, ArmorForgeRecipeDisplay.serializer());
    }
}
