package net.veroxuniverse.arclight.compat;

import com.mojang.blaze3d.systems.RenderSystem;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.DisplayRenderer;
import me.shedaniel.rei.api.client.gui.SimpleDisplayRenderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.entry.EntryStack;
import me.shedaniel.rei.api.common.entry.type.VanillaEntryTypes;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;
import net.veroxuniverse.arclight.recipe.ModRecipes;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArmorForgeRecipeCategory implements DisplayCategory<ArmorForgeRecipeDisplay> {
    public final static CategoryIdentifier<? extends ArmorForgeRecipeDisplay> UID = CategoryIdentifier.of(ArclightMod.MODID, "armor_forging");
    public static final RecipeType<ArmorForgeRecipe> RECIPE_TYPE = ArclightMod.ARMOR_FORGE_TYPE;

    public final static Identifier TEXTURE =
            new Identifier(ArclightMod.MODID, "textures/gui/armor_forge_gui.png");

    // private final IDrawable background;
    private static final EntryStack icon = EntryStacks.of(BlocksInit.ARMOR_FORGE);

    public ArmorForgeRecipeCategory() {
    }

    @Override
    public @NotNull Text getTitle() {
        return new LiteralText("Paladin Forge");
    }

    @Override
    public @NotNull EntryStack getIcon() {
        return icon;
    }

    @Override
    public @NotNull CategoryIdentifier<? extends ArmorForgeRecipeDisplay> getCategoryIdentifier() { return UID; }

    @Override
    public DisplayRenderer getDisplayRenderer(ArmorForgeRecipeDisplay recipe) {
        return SimpleDisplayRenderer.from(Collections.singletonList(recipe.getInputEntries().get(0)), recipe.getOutputEntries());
    }

    @Override
    public int getDisplayHeight() { return 86; }

    @Override
    public List<Widget> setupDisplay(ArmorForgeRecipeDisplay recipe, Rectangle bounds) {
        List<Widget> widgets = new ArrayList<>();
        widgets.add(Widgets.createRecipeBase(bounds));
        widgets.add(Widgets.createTexturedWidget(TEXTURE, bounds.x + 44, bounds.y + 4, 44, 4, 72, 76));
        widgets.add(Widgets.createDrawableWidget((helper, matrices, mouseX, mouseY, delta) -> {
            RenderSystem.setShaderTexture(0, TEXTURE);
            int j = (int) ((System.currentTimeMillis() / 4500.0) % 1.0 * 26.0);
            if (j < 0) {
                j = 0;
            }
            helper.drawTexture(matrices, bounds.x + 105, bounds.y + 33, 176, 0, 8, j);
        }));
        widgets.add(Widgets.createSlot(new Point(bounds.x + 86, bounds.y + 15)).entries(recipe.getInputEntries().get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(bounds.x + 48, bounds.y + 20)).entries(recipe.getInputEntries().get(1)).markInput());
        widgets.add(Widgets.createSlot(new Point(bounds.x + 48, bounds.y + 40)).entries(recipe.getInputEntries().get(2)).markInput());
        widgets.add(Widgets.createSlot(new Point(bounds.x + 86, bounds.y + 60)).entries(recipe.getOutputEntries().get(0)).markOutput());
        return widgets;
    }
}
