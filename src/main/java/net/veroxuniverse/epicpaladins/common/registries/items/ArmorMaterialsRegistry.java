package net.veroxuniverse.epicpaladins.common.registries.items;

import com.google.common.base.Suppliers;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.veroxuniverse.epicpaladins.common.registries.ItemsRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ArmorMaterialsRegistry implements ArmorMaterial {

    ARCLIGHT("arclight", 45, Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) -> {
        armor.put(ArmorItem.Type.BOOTS, 4);
        armor.put(ArmorItem.Type.LEGGINGS, 7);
        armor.put(ArmorItem.Type.CHESTPLATE, 9);
        armor.put(ArmorItem.Type.HELMET, 4);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.1F,
            () -> Ingredient.of(ItemsRegistry.ARCLIGHT_GEM.get())),

    CRYORIUM("cryorium", 45, Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) -> {
        armor.put(ArmorItem.Type.BOOTS, 4);
        armor.put(ArmorItem.Type.LEGGINGS, 7);
        armor.put(ArmorItem.Type.CHESTPLATE, 9);
        armor.put(ArmorItem.Type.HELMET, 4);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.1F,
            () -> Ingredient.of(ItemsRegistry.CRYORIUM_GEM.get())),

    JADE("jade", 45, Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) -> {
        armor.put(ArmorItem.Type.BOOTS, 4);
        armor.put(ArmorItem.Type.LEGGINGS, 7);
        armor.put(ArmorItem.Type.CHESTPLATE, 9);
        armor.put(ArmorItem.Type.HELMET, 4);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.1F,
            () -> Ingredient.of(ItemsRegistry.JADE_GEM.get())),

    MOONLIGHT("moonlight", 45, Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) -> {
        armor.put(ArmorItem.Type.BOOTS, 4);
        armor.put(ArmorItem.Type.LEGGINGS, 7);
        armor.put(ArmorItem.Type.CHESTPLATE, 9);
        armor.put(ArmorItem.Type.HELMET, 4);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.1F,
            () -> Ingredient.of(ItemsRegistry.MOONLIGHT_GEM.get())),

    BLOODSTONE("bloodstone", 45, Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) -> {
        armor.put(ArmorItem.Type.BOOTS, 4);
        armor.put(ArmorItem.Type.LEGGINGS, 7);
        armor.put(ArmorItem.Type.CHESTPLATE, 9);
        armor.put(ArmorItem.Type.HELMET, 4);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.1F,
            () -> Ingredient.of(ItemsRegistry.BLOODSTONE_GEM.get())),

    SCULK("sculk", 45, Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) -> {
        armor.put(ArmorItem.Type.BOOTS, 4);
        armor.put(ArmorItem.Type.LEGGINGS, 7);
        armor.put(ArmorItem.Type.CHESTPLATE, 9);
        armor.put(ArmorItem.Type.HELMET, 4);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.1F,
            () -> Ingredient.of(Items.ECHO_SHARD)),

    STEEL("steel", 45, Util.make(new EnumMap<>(ArmorItem.Type.class), (armor) -> {
        armor.put(ArmorItem.Type.BOOTS, 2);
        armor.put(ArmorItem.Type.LEGGINGS, 4);
        armor.put(ArmorItem.Type.CHESTPLATE, 6);
        armor.put(ArmorItem.Type.HELMET, 2);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.5F, 0.1F,
            () -> Ingredient.of(ItemsRegistry.STEEL_INGOT.get()));


    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ArmorMaterialsRegistry(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protection, int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protection;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurabilityForType(ArmorItem.@NotNull Type typeDurability) {
        return HEALTH_FUNCTION_FOR_TYPE.get(typeDurability) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.@NotNull Type typeDefense) {
        return this.protectionFunctionForType.get(typeDefense);
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
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return this.name;
    }
}