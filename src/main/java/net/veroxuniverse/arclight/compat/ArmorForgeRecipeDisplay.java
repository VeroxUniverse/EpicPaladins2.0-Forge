package net.veroxuniverse.arclight.compat;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ArmorForgeRecipeDisplay extends BasicDisplay {
    @Override
    public CategoryIdentifier<? extends ArmorForgeRecipeDisplay> getCategoryIdentifier() { return ArmorForgeRecipeCategory.UID; }

    public ArmorForgeRecipeDisplay(ArmorForgeRecipe recipe) {
        this(EntryIngredients.ofIngredients(recipe.getIngredients()), Collections.singletonList(EntryIngredients.of(recipe.getOutput())), Optional.ofNullable(recipe.getId()));
    }

    public ArmorForgeRecipeDisplay(List<EntryIngredient> inputs, List<EntryIngredient> output, Optional<Identifier> loc) {
        super(inputs, output, loc);
    }

    public static BasicDisplay.Serializer<ArmorForgeRecipeDisplay> serializer() {
        return BasicDisplay.Serializer.ofSimple(ArmorForgeRecipeDisplay::new);
    }
}
