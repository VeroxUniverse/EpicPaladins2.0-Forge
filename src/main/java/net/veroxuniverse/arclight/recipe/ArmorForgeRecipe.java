package net.veroxuniverse.arclight.recipe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ArmorForgeRecipe implements Recipe<Inventory> {

    private final Identifier id;
    private final ItemStack output;
    private final DefaultedList<Ingredient> recipeItems;

    public ArmorForgeRecipe(Identifier id, ItemStack output,
                                    DefaultedList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(@NotNull Inventory pContainer, World pLevel) {
        if(pLevel.isClient) {
            return false;
        }
        return recipeItems.get(0).test(pContainer.getStack(0)) && recipeItems.get(1).test(pContainer.getStack(1))
                && recipeItems.get(2).test(pContainer.getStack(2));
    }

    @Override
    public @NotNull DefaultedList<Ingredient> getIngredients() {
        return recipeItems;
    }

    @Override
    public @NotNull ItemStack craft(Inventory c) {
        return output;
    }

    @Override
    public boolean fits(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public @NotNull ItemStack getOutput() {
        return output.copy();
    }

    @Override
    public @NotNull Identifier getId() {
        return id;
    }

    @Override
    public @NotNull RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public @NotNull RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public @NotNull ItemStack createIcon() { return new ItemStack(BlocksInit.ARMOR_FORGE); }

    public static class Type implements RecipeType<ArmorForgeRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "armor_forging";

        @Override
        public String toString() {
            return ID;
        }
    }

    public static class Serializer implements RecipeSerializer<ArmorForgeRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final Identifier ID =
                new Identifier(ArclightMod.MODID, "armor_forging");

        @Override
        public @NotNull ArmorForgeRecipe read(@NotNull Identifier pRecipeId, @NotNull JsonObject pSerializedRecipe) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(pSerializedRecipe, "output"));

            //removed, no longer searching for an array
            //JsonArray ingredients = GsonHelper.getAsJsonArray(pSerializedRecipe, "ingredients");
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(3, Ingredient.EMPTY);

            //removing, we are no longer checking an input array
            /*for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }*/

            //instead simply manually insert each ingredient at the proper index:

            JsonElement jsonInput = pSerializedRecipe.get("input");
            inputs.set(0,Ingredient.fromJson(jsonInput));

            JsonElement jsonAddition1 = pSerializedRecipe.get("addition1");
            inputs.set(1,Ingredient.fromJson(jsonAddition1));

            JsonElement jsonAddition2 = pSerializedRecipe.get("addition2");
            inputs.set(2,Ingredient.fromJson(jsonAddition2));

            return new ArmorForgeRecipe(pRecipeId, output, inputs);
        }

        @Override
        public @Nullable ArmorForgeRecipe read(@NotNull Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            return new ArmorForgeRecipe(id, output, inputs);
        }

        @Override
        public void write(PacketByteBuf buf, ArmorForgeRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buf);
            }
            buf.writeItemStack(recipe.getOutput());
        }
    }
}
