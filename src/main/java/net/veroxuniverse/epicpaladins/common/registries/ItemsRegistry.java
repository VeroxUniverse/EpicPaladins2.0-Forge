package net.veroxuniverse.epicpaladins.common.registries;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.*;
import net.veroxuniverse.epicpaladins.common.items.weapons.AngelSwordItem;
import net.veroxuniverse.epicpaladins.common.items.weapons.CryoriumAxeItem;
import net.veroxuniverse.epicpaladins.common.items.weapons.MoonlightGlaiveItem;
import net.veroxuniverse.epicpaladins.common.registries.items.ArmorMaterialsRegistry;

public class ItemsRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EpicPaladinsMod.MOD_ID);

    public static final DeferredItem<Item> ARCLIGHT_GEM = ITEMS.registerSimpleItem("arclight_gem");
    public static final DeferredItem<Item> MOONLIGHT_GEM = ITEMS.registerSimpleItem("moonlight_gem");
    public static final DeferredItem<Item> JADE_GEM = ITEMS.registerSimpleItem("jade_gem");
    public static final DeferredItem<Item> BLOODSTONE_GEM = ITEMS.registerSimpleItem("bloodstone_gem");

    public static final DeferredItem<Item> CRYORIUM_GEM = ITEMS.registerSimpleItem("cryorium_gem");
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot");
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.registerSimpleItem("steel_nugget");

    public static final DeferredItem<Item> ARCLIGHT_TEMPLATE = ITEMS.registerSimpleItem("arclight_template");
    public static final DeferredItem<Item> BLOODSTONE_TEMPLATE = ITEMS.registerSimpleItem("bloodstone_template");
    public static final DeferredItem<Item> CRYORIUM_TEMPLATE = ITEMS.registerSimpleItem("cryorium_template");
    public static final DeferredItem<Item> JADE_TEMPLATE = ITEMS.registerSimpleItem("jade_template");
    public static final DeferredItem<Item> MOONLIGHT_TEMPLATE = ITEMS.registerSimpleItem("moonlight_template");
    public static final DeferredItem<Item> SCULK_TEMPLATE = ITEMS.registerSimpleItem("sculk_template");

    public static final DeferredItem<Item> ANGEL_FEATHER = ITEMS.register("angel_feather",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final DeferredHolder<Item, Item> ARCLIGHT_HELMET = ITEMS.register("arclight_helmet",
            () -> new ArclightArmorItem(ArmorMaterialsRegistry.ARCLIGHT,ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> ARCLIGHT_CHESTPLATE = ITEMS.register("arclight_chestplate",
            () -> new ArclightArmorItem(ArmorMaterialsRegistry.ARCLIGHT,ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> ARCLIGHT_LEGGINGS = ITEMS.register("arclight_leggings",
            () -> new ArclightArmorItem(ArmorMaterialsRegistry.ARCLIGHT,ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> ARCLIGHT_BOOTS = ITEMS.register("arclight_boots",
            () -> new ArclightArmorItem(ArmorMaterialsRegistry.ARCLIGHT,ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(22)).rarity(Rarity.RARE)));

    public static final DeferredHolder<Item, Item> ANGEL_HELMET = ITEMS.register("angel_helmet",
            () -> new AngelArmorItem(ArmorMaterialsRegistry.ANGEL,ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(22)).rarity(Rarity.EPIC)));
    public static final DeferredHolder<Item, Item> ANGEL_CHESTPLATE = ITEMS.register("angel_chestplate",
            () -> new AngelArmorItem(ArmorMaterialsRegistry.ANGEL,ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).rarity(Rarity.EPIC)));
    public static final DeferredHolder<Item, Item> ANGEL_LEGGINGS = ITEMS.register("angel_leggings",
            () -> new AngelArmorItem(ArmorMaterialsRegistry.ANGEL,ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(22)).rarity(Rarity.EPIC)));
    public static final DeferredHolder<Item, Item> ANGEL_BOOTS = ITEMS.register("angel_boots",
            () -> new AngelArmorItem(ArmorMaterialsRegistry.ANGEL,ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(22)).rarity(Rarity.EPIC)));

    public static final DeferredHolder<Item, Item> ASSASSIN_HELMET = ITEMS.register("assassin_helmet",
            () -> new AssassinArmorItem(ArmorMaterialsRegistry.STEEL,ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> ASSASSIN_CHESTPLATE = ITEMS.register("assassin_chestplate",
            () -> new AssassinArmorItem(ArmorMaterialsRegistry.STEEL,ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> ASSASSIN_LEGGINGS = ITEMS.register("assassin_leggings",
            () -> new AssassinArmorItem(ArmorMaterialsRegistry.STEEL,ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> ASSASSIN_BOOTS = ITEMS.register("assassin_boots",
            () -> new AssassinArmorItem(ArmorMaterialsRegistry.STEEL, ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(22)).rarity(Rarity.RARE)));

    public static final DeferredHolder<Item, Item> BLOODSTONE_HELMET = ITEMS.register("bloodstone_helmet",
            () -> new BloodstoneArmorItem(ArmorMaterialsRegistry.BLOODSTONE,ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> BLOODSTONE_CHESTPLATE = ITEMS.register("bloodstone_chestplate",
            () -> new BloodstoneArmorItem(ArmorMaterialsRegistry.BLOODSTONE,ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> BLOODSTONE_LEGGINGS = ITEMS.register("bloodstone_leggings",
            () -> new BloodstoneArmorItem(ArmorMaterialsRegistry.BLOODSTONE,ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> BLOODSTONE_BOOTS = ITEMS.register("bloodstone_boots",
            () -> new BloodstoneArmorItem(ArmorMaterialsRegistry.BLOODSTONE,ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(22)).rarity(Rarity.RARE)));

    public static final DeferredHolder<Item, Item> CRYORIUM_HELMET = ITEMS.register("cryorium_helmet",
            () -> new CryoriumArmorItem(ArmorMaterialsRegistry.CRYORIUM,ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> CRYORIUM_CHESTPLATE = ITEMS.register("cryorium_chestplate",
            () -> new CryoriumArmorItem(ArmorMaterialsRegistry.CRYORIUM,ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> CRYORIUM_LEGGINGS = ITEMS.register("cryorium_leggings",
            () -> new CryoriumArmorItem(ArmorMaterialsRegistry.CRYORIUM,ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> CRYORIUM_BOOTS = ITEMS.register("cryorium_boots",
            () -> new CryoriumArmorItem(ArmorMaterialsRegistry.CRYORIUM,ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(22)).rarity(Rarity.RARE)));

    public static final DeferredHolder<Item, Item> JADE_HELMET = ITEMS.register("jade_helmet",
            () -> new JadeArmorItem(ArmorMaterialsRegistry.JADE,ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",
            () -> new JadeArmorItem(ArmorMaterialsRegistry.JADE,ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",
            () -> new JadeArmorItem(ArmorMaterialsRegistry.JADE,ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> JADE_BOOTS = ITEMS.register("jade_boots",
            () -> new JadeArmorItem(ArmorMaterialsRegistry.JADE,ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(22)).rarity(Rarity.RARE)));

    public static final DeferredHolder<Item, Item> KNIGHT_HELMET = ITEMS.register("knight_helmet",
            () -> new KnightArmorItem(ArmorMaterialsRegistry.STEEL,ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> KNIGHT_CHESTPLATE = ITEMS.register("knight_chestplate",
            () -> new KnightArmorItem(ArmorMaterialsRegistry.STEEL,ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> KNIGHT_LEGGINGS = ITEMS.register("knight_leggings",
            () -> new KnightArmorItem(ArmorMaterialsRegistry.STEEL,ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> KNIGHT_BOOTS = ITEMS.register("knight_boots",
            () -> new KnightArmorItem(ArmorMaterialsRegistry.STEEL,ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(22)).rarity(Rarity.RARE)));

    public static final DeferredHolder<Item, Item> MOONLIGHT_HELMET = ITEMS.register("moonlight_helmet",
            () -> new MoonlightArmorItem(ArmorMaterialsRegistry.MOONLIGHT,ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> MOONLIGHT_CHESTPLATE = ITEMS.register("moonlight_chestplate",
            () -> new MoonlightArmorItem(ArmorMaterialsRegistry.MOONLIGHT,ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> MOONLIGHT_LEGGINGS = ITEMS.register("moonlight_leggings",
            () -> new MoonlightArmorItem(ArmorMaterialsRegistry.MOONLIGHT,ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> MOONLIGHT_BOOTS = ITEMS.register("moonlight_boots",
            () -> new MoonlightArmorItem(ArmorMaterialsRegistry.MOONLIGHT,ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(22)).rarity(Rarity.RARE)));

    public static final DeferredHolder<Item, Item> SCULK_HELMET = ITEMS.register("sculk_helmet",
            () -> new SculkArmorItem(ArmorMaterialsRegistry.SCULK,ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.HELMET.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> SCULK_CHESTPLATE = ITEMS.register("sculk_chestplate",
            () -> new SculkArmorItem(ArmorMaterialsRegistry.SCULK,ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.CHESTPLATE.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> SCULK_LEGGINGS = ITEMS.register("sculk_leggings",
            () -> new SculkArmorItem(ArmorMaterialsRegistry.SCULK,ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.LEGGINGS.getDurability(22)).rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> SCULK_BOOTS = ITEMS.register("sculk_boots",
            () -> new SculkArmorItem(ArmorMaterialsRegistry.SCULK, ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment(1).durability(ArmorItem.Type.BOOTS.getDurability(22)).rarity(Rarity.RARE)));


    public static final DeferredHolder<Item, Item> ARCLIGHT_SWORD = ITEMS.register("arclight_sword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4, -2.2F))
                    .rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> ARCLIGHT_PICKAXE = ITEMS.register("arclight_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 5, -2.5F))
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> ARCLIGHT_AXE = ITEMS.register("arclight_axe",
            () -> new AxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, 9, -2.8F))
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> ARCLIGHT_SHOVEL = ITEMS.register("arclight_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 6, -2.2F))
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> ARCLIGHT_HOE = ITEMS.register("arclight_hoe",
            () -> new HoeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.NETHERITE, 2, 0.5F))
                    .rarity(Rarity.UNCOMMON)));

    public static final DeferredHolder<Item, Item> JADE_SWORD = ITEMS.register("jade_sword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 5, -2.5F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> JADE_AXE = ITEMS.register("jade_axe",
            () -> new AxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, 9, -2.8F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> JADE_SHOVEL = ITEMS.register("jade_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 6, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> JADE_HOE = ITEMS.register("jade_hoe",
            () -> new HoeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.NETHERITE, 2, 0.5F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));

    public static final DeferredHolder<Item, Item> MOONLIGHT_SWORD = ITEMS.register("moonlight_sword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> MOONLIGHT_PICKAXE = ITEMS.register("moonlight_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 5, -2.5F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> MOONLIGHT_AXE = ITEMS.register("moonlight_axe",
            () -> new AxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, 9, -2.8F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> MOONLIGHT_SHOVEL = ITEMS.register("moonlight_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 6, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> MOONLIGHT_HOE = ITEMS.register("moonlight_hoe",
            () -> new HoeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.NETHERITE, 2, 0.5F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));

    public static final DeferredHolder<Item, Item> BLOODSTONE_SWORD = ITEMS.register("bloodstone_sword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> BLOODSTONE_PICKAXE = ITEMS.register("bloodstone_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 5, -2.5F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> BLOODSTONE_AXE = ITEMS.register("bloodstone_axe",
            () -> new AxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, 9, -2.8F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> BLOODSTONE_SHOVEL = ITEMS.register("bloodstone_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 6, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));
    public static final DeferredHolder<Item, Item> BLOODSTONE_HOE = ITEMS.register("bloodstone_hoe",
            () -> new HoeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.NETHERITE, 2, 0.5F))
                    .durability(1750)
                    .rarity(Rarity.UNCOMMON)));

    public static final DeferredHolder<Item, Item> CRYORIUM_SWORD = ITEMS.register("cryorium_sword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> CRYORIUM_PICKAXE = ITEMS.register("cryorium_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 5, -2.5F))
                    .durability(1750)
                    .rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> CRYORIUM_AXE = ITEMS.register("cryorium_axe",
            () -> new AxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, 9, -2.8F))
                    .durability(1750)
                    .rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> CRYORIUM_SHOVEL = ITEMS.register("cryorium_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 6, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> CRYORIUM_HOE = ITEMS.register("cryorium_hoe",
            () -> new HoeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.NETHERITE, 2, 0.5F))
                    .durability(1750)
                    .rarity(Rarity.RARE)));

    public static final DeferredHolder<Item, Item> SCULK_SWORD = ITEMS.register("sculk_sword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> SCULK_PICKAXE = ITEMS.register("sculk_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 5, -2.5F))
                    .durability(1750)
                    .rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> SCULK_AXE = ITEMS.register("sculk_axe",
            () -> new AxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, 9, -2.8F))
                    .durability(1750)
                    .rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> SCULK_SHOVEL = ITEMS.register("sculk_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 6, -2.2F))
                    .durability(1750)
                    .rarity(Rarity.RARE)));
    public static final DeferredHolder<Item, Item> SCULK_HOE = ITEMS.register("sculk_hoe",
            () -> new HoeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.NETHERITE, 2, 0.5F))
                    .durability(2000)
                    .rarity(Rarity.RARE)));

    public static final DeferredHolder<Item, Item> ANGEL_SWORD = ITEMS.register("angel_sword",
            () -> new AngelSwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 10, -2.1F))
                    .rarity(Rarity.EPIC)));
    public static final DeferredHolder<Item, Item> MOONLIGHT_GLAIVE = ITEMS.register("moonlight_glaive",
            () -> new MoonlightGlaiveItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 10, -2.5F))
                    .rarity(Rarity.EPIC)));
    public static final DeferredHolder<Item, Item> CRYORIUM_BATTLE_AXE = ITEMS.register("cryorium_battle_axe",
            () -> new CryoriumAxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, 12, -3.0F))
                    .rarity(Rarity.EPIC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
