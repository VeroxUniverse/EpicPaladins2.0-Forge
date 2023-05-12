package net.veroxuniverse.arclight.init;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ItemMaterialsInit implements ToolMaterial {

    ARCLIGHT(4, 2500, 12.0f,4.5f, 25,
            () -> Ingredient.ofItems(ItemsInit.ARCLIGHT_INGOT)),
    JADE(4, 2500, 12.0f,5.0f, 25,
            () -> Ingredient.ofItems(ItemsInit.JADE_INGOT)),
    MOONLIGHT(4, 2500, 12.0f,5.0f, 25,
            () -> Ingredient.ofItems(ItemsInit.MOONLIGHT_INGOT)),
    BLOODSTONE(4, 2500, 12.0f,4.5f, 24,
            () -> Ingredient.ofItems(ItemsInit.BLOODSTONE_INGOT)),
    SCULK(4, 2500, 12.0f,4.5f, 24,
            () -> Ingredient.ofItems(ItemsInit.SCULK_INGOT)),
    CRYORIUM(4, 2500, 12.0f,4.5f, 24,
            () -> Ingredient.ofItems(ItemsInit.CRYORIUM_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;
    ItemMaterialsInit(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}