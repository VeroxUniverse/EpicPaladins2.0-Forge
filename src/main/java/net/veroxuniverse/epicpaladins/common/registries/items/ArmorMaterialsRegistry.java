package net.veroxuniverse.epicpaladins.common.registries.items;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.registries.ItemsRegistry;

import java.util.EnumMap;
import java.util.List;

public class ArmorMaterialsRegistry {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, EpicPaladinsMod.MOD_ID);

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> ARCLIGHT = ARMOR_MATERIALS.register("arclight", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 5);
                        map.put(ArmorItem.Type.LEGGINGS, 8);
                        map.put(ArmorItem.Type.CHESTPLATE, 10);
                        map.put(ArmorItem.Type.HELMET, 5);
                    }),
                    20,
                    SoundEvents.ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.of(ItemsRegistry.ARCLIGHT_GEM.get()),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "arclight"))),
                    4F,
                    0.2F
            ));

    public static DeferredHolder<ArmorMaterial, ArmorMaterial> ANGEL = ARMOR_MATERIALS.register("angel", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 7);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.CHESTPLATE, 14);
                map.put(ArmorItem.Type.HELMET, 8);
            }),
            20,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.of(ItemsRegistry.ARCLIGHT_GEM.get()),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "angel"))),
            5.0F,
            0.3F
    ));

    // CRYORIUM Armor Material
    public static DeferredHolder<ArmorMaterial, ArmorMaterial> CRYORIUM =
            ARMOR_MATERIALS.register("cryorium", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 5);
                        map.put(ArmorItem.Type.LEGGINGS, 8);
                        map.put(ArmorItem.Type.CHESTPLATE, 10);
                        map.put(ArmorItem.Type.HELMET, 5);
                    }),
                    20,
                    SoundEvents.ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.of(ItemsRegistry.CRYORIUM_GEM.get()),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "cryorium"))),
                    4F,
                    0.2F
            ));

    // JADE Armor Material
    public static DeferredHolder<ArmorMaterial, ArmorMaterial> JADE =
            ARMOR_MATERIALS.register("jade", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 5);
                        map.put(ArmorItem.Type.LEGGINGS, 8);
                        map.put(ArmorItem.Type.CHESTPLATE, 10);
                        map.put(ArmorItem.Type.HELMET, 5);
                    }),
                    20,
                    SoundEvents.ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.of(ItemsRegistry.JADE_GEM.get()),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "jade"))),
                    3.5F,
                    0.5F
            ));

    // MOONLIGHT Armor Material
    public static DeferredHolder<ArmorMaterial, ArmorMaterial> MOONLIGHT =
            ARMOR_MATERIALS.register("moonlight", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 5);
                        map.put(ArmorItem.Type.LEGGINGS, 8);
                        map.put(ArmorItem.Type.CHESTPLATE, 10);
                        map.put(ArmorItem.Type.HELMET, 5);
                    }),
                    20,
                    SoundEvents.ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.of(ItemsRegistry.MOONLIGHT_GEM.get()),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "moonlight"))),
                    4.5F,
                    0.1F
            ));

    // BLOODSTONE Armor Material
    public static DeferredHolder<ArmorMaterial, ArmorMaterial> BLOODSTONE =
            ARMOR_MATERIALS.register("bloodstone", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 5);
                        map.put(ArmorItem.Type.LEGGINGS, 8);
                        map.put(ArmorItem.Type.CHESTPLATE, 10);
                        map.put(ArmorItem.Type.HELMET, 5);
                    }),
                    20,
                    SoundEvents.ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.of(ItemsRegistry.BLOODSTONE_GEM.get()),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "bloodstone"))),
                    4F,
                    0.3F
            ));

    // SCULK Armor Material
    public static DeferredHolder<ArmorMaterial, ArmorMaterial> SCULK =
            ARMOR_MATERIALS.register("sculk", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 6);
                        map.put(ArmorItem.Type.LEGGINGS, 8);
                        map.put(ArmorItem.Type.CHESTPLATE, 9);
                        map.put(ArmorItem.Type.HELMET, 5);
                    }),
                    20,
                    SoundEvents.ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.of(Items.ECHO_SHARD),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "sculk"))),
                    5.0F,
                    0.1F
            ));

    // STEEL Armor Material
    public static DeferredHolder<ArmorMaterial, ArmorMaterial> STEEL =
            ARMOR_MATERIALS.register("steel", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 3);
                        map.put(ArmorItem.Type.LEGGINGS, 4);
                        map.put(ArmorItem.Type.CHESTPLATE, 6);
                        map.put(ArmorItem.Type.HELMET, 3);
                    }),
                    20,
                    SoundEvents.ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.of(ItemsRegistry.STEEL_INGOT.get()),
                    List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "steel"))),
                    1.5F,
                    0.2F
            ));
    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }

}