package net.veroxuniverse.arclight.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.veroxuniverse.arclight.ArclightMod;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ArmorMaterialsInit implements ArmorMaterial {

    ARCLIGHT("arclight", 45, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(ItemsInit.ARCLIGHT_INGOT.get())),

    ANGEL("angel", 50, new int[]{5, 8, 10, 5}, 30,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.5F, 0.2F,
            () -> Ingredient.of(ItemsInit.ANGEL_FEATHER.get())),

    CRYO("cryo", 45, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(ItemsInit.CRYORIUM_INGOT.get())),

    MOONLIGHT("moonlight", 45, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(ItemsInit.MOONLIGHT_INGOT.get())),

    SHADOW("shadow", 45, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(ItemsInit.MOONLIGHT_INGOT.get())),

    JADE("jade", 45, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(ItemsInit.JADE_INGOT.get())),

    SCULK("sculk", 50, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(ItemsInit.SCULK_INGOT.get())),

    SCORPIONSCALE("scorpionscale", 50, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> Ingredient.of(ItemsInit.BLOODSTONE_INGOT.get())),

    COPPER("copper", 30, new int[]{3, 5, 7, 2}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5F, 0.0F,
            () -> Ingredient.of(Items.COPPER_INGOT)),

    STEEL("steel", 30, new int[]{3, 5, 7, 2}, 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 0.5F, 0.0F,
            () -> Ingredient.of(Items.IRON_INGOT));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ArmorMaterialsInit(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
                      SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull SoundEvent getEquipSound() {
        return this.sound;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public @NotNull String getName() {
        return ArclightMod.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}