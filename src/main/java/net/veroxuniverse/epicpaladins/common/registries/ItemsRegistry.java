package net.veroxuniverse.epicpaladins.common.registries;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.*;
import net.veroxuniverse.epicpaladins.common.items.weapons.AngelSwordItem;
import net.veroxuniverse.epicpaladins.common.items.weapons.CryoriumAxeItem;
import net.veroxuniverse.epicpaladins.common.items.weapons.MoonlightGlaiveItem;
import net.veroxuniverse.epicpaladins.common.registries.items.ArmorMaterialsRegistry;
import net.veroxuniverse.epicpaladins.common.registries.items.ItemMaterialsRegistry;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicPaladinsMod.MOD_ID);

    public static final RegistryObject<Item> ARCLIGHT_GEM = ITEMS.register("arclight_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_GEM = ITEMS.register("moonlight_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_GEM = ITEMS.register("jade_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_GEM = ITEMS.register("bloodstone_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYORIUM_GEM = ITEMS.register("cryorium_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARCLIGHT_TEMPLATE = ITEMS.register("arclight_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_TEMPLATE = ITEMS.register("bloodstone_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYORIUM_TEMPLATE = ITEMS.register("cryorium_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_TEMPLATE = ITEMS.register("jade_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_TEMPLATE = ITEMS.register("moonlight_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCULK_TEMPLATE = ITEMS.register("sculk_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_TEMPLATE = ITEMS.register("steel_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARCLIGHT_HELMET = ITEMS.register("arclight_helmet",
            () -> new ArclightArmorItem(ArmorMaterialsRegistry.ARCLIGHT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ARCLIGHT_CHESTPLATE = ITEMS.register("arclight_chestplate",
            () -> new ArclightArmorItem(ArmorMaterialsRegistry.ARCLIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ARCLIGHT_LEGGINGS = ITEMS.register("arclight_leggings",
            () -> new ArclightArmorItem(ArmorMaterialsRegistry.ARCLIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ARCLIGHT_BOOTS = ITEMS.register("arclight_boots",
            () -> new ArclightArmorItem(ArmorMaterialsRegistry.ARCLIGHT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ASSASSIN_HELMET = ITEMS.register("assassin_helmet",
            () -> new AssassinArmorItem(ArmorMaterialsRegistry.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ASSASSIN_CHESTPLATE = ITEMS.register("assassin_chestplate",
            () -> new AssassinArmorItem(ArmorMaterialsRegistry.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ASSASSIN_LEGGINGS = ITEMS.register("assassin_leggings",
            () -> new AssassinArmorItem(ArmorMaterialsRegistry.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ASSASSIN_BOOTS = ITEMS.register("assassin_boots",
            () -> new AssassinArmorItem(ArmorMaterialsRegistry.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> BLOODSTONE_HELMET = ITEMS.register("bloodstone_helmet",
            () -> new BloodstoneArmorItem(ArmorMaterialsRegistry.BLOODSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_CHESTPLATE = ITEMS.register("bloodstone_chestplate",
            () -> new BloodstoneArmorItem(ArmorMaterialsRegistry.BLOODSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_LEGGINGS = ITEMS.register("bloodstone_leggings",
            () -> new BloodstoneArmorItem(ArmorMaterialsRegistry.BLOODSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_BOOTS = ITEMS.register("bloodstone_boots",
            () -> new BloodstoneArmorItem(ArmorMaterialsRegistry.BLOODSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRYORIUM_HELMET = ITEMS.register("cryorium_helmet",
            () -> new CryoriumArmorItem(ArmorMaterialsRegistry.CRYORIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRYORIUM_CHESTPLATE = ITEMS.register("cryorium_chestplate",
            () -> new CryoriumArmorItem(ArmorMaterialsRegistry.CRYORIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRYORIUM_LEGGINGS = ITEMS.register("cryorium_leggings",
            () -> new CryoriumArmorItem(ArmorMaterialsRegistry.CRYORIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRYORIUM_BOOTS = ITEMS.register("cryorium_boots",
            () -> new CryoriumArmorItem(ArmorMaterialsRegistry.CRYORIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",
            () -> new JadeArmorItem(ArmorMaterialsRegistry.JADE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",
            () -> new JadeArmorItem(ArmorMaterialsRegistry.JADE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",
            () -> new JadeArmorItem(ArmorMaterialsRegistry.JADE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",
            () -> new JadeArmorItem(ArmorMaterialsRegistry.JADE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> KNIGHT_HELMET = ITEMS.register("knight_helmet",
            () -> new KnightArmorItem(ArmorMaterialsRegistry.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> KNIGHT_CHESTPLATE = ITEMS.register("knight_chestplate",
            () -> new KnightArmorItem(ArmorMaterialsRegistry.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> KNIGHT_LEGGINGS = ITEMS.register("knight_leggings",
            () -> new KnightArmorItem(ArmorMaterialsRegistry.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> KNIGHT_BOOTS = ITEMS.register("knight_boots",
            () -> new KnightArmorItem(ArmorMaterialsRegistry.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MOONLIGHT_HELMET = ITEMS.register("moonlight_helmet",
            () -> new MoonlightArmorItem(ArmorMaterialsRegistry.MOONLIGHT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_CHESTPLATE = ITEMS.register("moonlight_chestplate",
            () -> new MoonlightArmorItem(ArmorMaterialsRegistry.MOONLIGHT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_LEGGINGS = ITEMS.register("moonlight_leggings",
            () -> new MoonlightArmorItem(ArmorMaterialsRegistry.MOONLIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_BOOTS = ITEMS.register("moonlight_boots",
            () -> new MoonlightArmorItem(ArmorMaterialsRegistry.MOONLIGHT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SCULK_HELMET = ITEMS.register("sculk_helmet",
            () -> new SculkArmorItem(ArmorMaterialsRegistry.SCULK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_CHESTPLATE = ITEMS.register("sculk_chestplate",
            () -> new SculkArmorItem(ArmorMaterialsRegistry.SCULK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_LEGGINGS = ITEMS.register("sculk_leggings",
            () -> new SculkArmorItem(ArmorMaterialsRegistry.SCULK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_BOOTS = ITEMS.register("sculk_boots",
            () -> new SculkArmorItem(ArmorMaterialsRegistry.SCULK, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> ARCLIGHT_SWORD = ITEMS.register("arclight_sword",
            () -> new SwordItem(ItemMaterialsRegistry.ARCLIGHT,7,-2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ARCLIGHT_PICKAXE = ITEMS.register("arclight_pickaxe",
            () -> new PickaxeItem(ItemMaterialsRegistry.ARCLIGHT,5,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ARCLIGHT_AXE = ITEMS.register("arclight_axe",
            () -> new AxeItem(ItemMaterialsRegistry.ARCLIGHT,9,-3f, new Item.Properties()));
    public static final RegistryObject<Item> ARCLIGHT_SHOVEL = ITEMS.register("arclight_shovel",
            () -> new ShovelItem(ItemMaterialsRegistry.ARCLIGHT,5,-3f, new Item.Properties()));
    public static final RegistryObject<Item> ARCLIGHT_HOE = ITEMS.register("arclight_hoe",
            () -> new HoeItem(ItemMaterialsRegistry.ARCLIGHT,1,0f, new Item.Properties()));

    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword",
            () -> new SwordItem(ItemMaterialsRegistry.JADE,7,-2.4f, new Item.Properties()));
    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe",
            () -> new PickaxeItem(ItemMaterialsRegistry.JADE,5,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe",
            () -> new AxeItem(ItemMaterialsRegistry.JADE,9,-3f, new Item.Properties()));
    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel",
            () -> new ShovelItem(ItemMaterialsRegistry.JADE,5,-3f, new Item.Properties()));
    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe",
            () -> new HoeItem(ItemMaterialsRegistry.JADE,1,0f, new Item.Properties()));

    public static final RegistryObject<Item> MOONLIGHT_SWORD = ITEMS.register("moonlight_sword",
            () -> new SwordItem(ItemMaterialsRegistry.MOONLIGHT,7,-2.4f, new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_PICKAXE = ITEMS.register("moonlight_pickaxe",
            () -> new PickaxeItem(ItemMaterialsRegistry.MOONLIGHT,5,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_AXE = ITEMS.register("moonlight_axe",
            () -> new AxeItem(ItemMaterialsRegistry.MOONLIGHT,9,-3f, new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_SHOVEL = ITEMS.register("moonlight_shovel",
            () -> new ShovelItem(ItemMaterialsRegistry.MOONLIGHT,5,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> MOONLIGHT_HOE = ITEMS.register("moonlight_hoe",
            () -> new HoeItem(ItemMaterialsRegistry.MOONLIGHT,1,0f, new Item.Properties()));

    public static final RegistryObject<Item> BLOODSTONE_SWORD = ITEMS.register("bloodstone_sword",
            () -> new SwordItem(ItemMaterialsRegistry.BLOODSTONE,7,-2.4f, new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_PICKAXE = ITEMS.register("bloodstone_pickaxe",
            () -> new PickaxeItem(ItemMaterialsRegistry.BLOODSTONE,5,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_AXE = ITEMS.register("bloodstone_axe",
            () -> new AxeItem(ItemMaterialsRegistry.BLOODSTONE,9,-3f, new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_SHOVEL = ITEMS.register("bloodstone_shovel",
            () -> new ShovelItem(ItemMaterialsRegistry.BLOODSTONE,5,-3f, new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE_HOE = ITEMS.register("bloodstone_hoe",
            () -> new HoeItem(ItemMaterialsRegistry.BLOODSTONE,1,0f, new Item.Properties()));

    public static final RegistryObject<Item> CRYORIUM_SWORD = ITEMS.register("cryorium_sword",
            () -> new SwordItem(ItemMaterialsRegistry.CRYORIUM,7,-2.4f, new Item.Properties()));
    public static final RegistryObject<Item> CRYORIUM_PICKAXE = ITEMS.register("cryorium_pickaxe",
            () -> new PickaxeItem(ItemMaterialsRegistry.CRYORIUM,5,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> CRYORIUM_AXE = ITEMS.register("cryorium_axe",
            () -> new AxeItem(ItemMaterialsRegistry.CRYORIUM,9,-3f, new Item.Properties()));
    public static final RegistryObject<Item> CRYORIUM_SHOVEL = ITEMS.register("cryorium_shovel",
            () -> new ShovelItem(ItemMaterialsRegistry.CRYORIUM,5,-3f, new Item.Properties()));
    public static final RegistryObject<Item> CRYORIUM_HOE = ITEMS.register("cryorium_hoe",
            () -> new HoeItem(ItemMaterialsRegistry.CRYORIUM,1,0f, new Item.Properties()));

    public static final RegistryObject<Item> SCULK_SWORD = ITEMS.register("sculk_sword",
            () -> new SwordItem(ItemMaterialsRegistry.SCULK,7,-2.4f, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_PICKAXE = ITEMS.register("sculk_pickaxe",
            () -> new PickaxeItem(ItemMaterialsRegistry.SCULK,5,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_AXE = ITEMS.register("sculk_axe",
            () -> new AxeItem(ItemMaterialsRegistry.SCULK,9,-3f, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_SHOVEL = ITEMS.register("sculk_shovel",
            () -> new ShovelItem(ItemMaterialsRegistry.SCULK,5,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_HOE = ITEMS.register("sculk_hoe",
            () -> new HoeItem(ItemMaterialsRegistry.SCULK,1,0f, new Item.Properties()));

    public static final RegistryObject<Item> ANGEL_SWORD = ITEMS.register("angel_sword",
            () -> new AngelSwordItem(ItemMaterialsRegistry.SCULK,9,-2.4f, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> MOONLIGHT_GLAIVE = ITEMS.register("moonlight_glaive",
            () -> new MoonlightGlaiveItem(ItemMaterialsRegistry.SCULK,11,-3.0f, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> CRYORIUM_BATTLE_AXE = ITEMS.register("cryorium_battle_axe",
            () -> new CryoriumAxeItem(ItemMaterialsRegistry.SCULK,10,-3.0f, new Item.Properties().rarity(Rarity.EPIC)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
