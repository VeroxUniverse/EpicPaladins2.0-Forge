package net.veroxuniverse.arclight.init;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.*;
import net.veroxuniverse.arclight.util.ArclightModCreativeTabs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ItemsInit {
    //3DItems

    public static final Item ANGEL_SWORD = registerItem("angel_sword",
            () -> new AngelSwordItem(ItemMaterialsInit.ARCLIGHT, 11, -2.4f,
                    new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB).rarity(Rarity.EPIC)));
    public static final Item MOONLIGHT_GLAIVE = registerItem("moonlight_glaive",
            () -> new MoonlightGlaiveItem(ItemMaterialsInit.MOONLIGHT, 11, -3.0f,
                    new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB).rarity(Rarity.EPIC)));
 public static final Item CRYORIUM_BATTLE_AXE = registerItem("cryorium_battle_axe",
         () -> new CryoriumAxeItem(ItemMaterialsInit.CRYORIUM, 13, -3.0f,
                 new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB).rarity(Rarity.EPIC)));


 //Cores

    public static final Item ARCLIGHT_CORE = registerItem("arclight_core",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final Item MOONLIGHT_CORE = registerItem("moonlight_core",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final Item SCORPION_CORE = registerItem("scorpion_core",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final Item CRYORIUM_CORE = registerItem("cryorium_core",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final Item JADE_CORE = registerItem("jade_core",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final Item SCULK_CORE = registerItem("sculk_core",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));


    //Resources

    public static final Item ARCLIGHT_GEM = registerItem("arclight_gem",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item ARCLIGHT_INGOT = registerItem("arclight_ingot",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item JADE_GEM = registerItem("jade_gem",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item JADE_INGOT = registerItem("jade_ingot",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item MOONLIGHT_CRYSTAL = registerItem("moonlight_crystal",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item MOONLIGHT_INGOT = registerItem("moonlight_ingot",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
   /*

   public static final Item MOONLIGHT_JELLYBALL = registerItem("moonlight_jellyball",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item MOONLIGHT_CRYSTALIZED = registerItem("moonlight_crystalized",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));

    */
    public static final Item BLOODSTONE_GEM = registerItem("bloodstone_gem",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item BLOODSTONE_INGOT = registerItem("bloodstone_ingot",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item CRYORIUM_GEM = registerItem("cryorium_gem",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item CRYORIUM_INGOT = registerItem("cryorium_ingot",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item SCULK_INGOT = registerItem("sculk_ingot",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
   /*
    public static final Item HEART = registerItem("heart",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final Item SCORPION_SCALE = registerItem("scorpion_scale",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));
    */

    public static final Item ANGEL_FEATHER = registerItem("angel_feather",
            () -> new Item(new Item.Settings().group(ArclightModCreativeTabs.RESOURCES_TAB)));


 //Armor

    public static final Item ARCLIGHTS_HELMET = registerItem("arclight_helmet",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ARCLIGHTS_CHESTLATE = registerItem("arclight_chestplate",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ARCLIGHTS_LEGGINGS = registerItem("arclight_leggings",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ARCLIGHTS_BOOTS = registerItem("arclight_boots",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item MOONLIGHT_HELMET = registerItem("moonlight_helmet",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item MOONLIGHT_CHESTLATE = registerItem("moonlight_chestplate",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item MOONLIGHT_LEGGINGS = registerItem("moonlight_leggings",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item MOONLIGHT_BOOTS = registerItem("moonlight_boots",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCORPION_HELMET = registerItem("scorpion_helmet",
            () -> new BloodstoneArmorItem(ArmorMaterialsInit.BLOODSTONE, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCORPION_CHESTPLATE = registerItem("scorpion_chestplate",
            () -> new BloodstoneArmorItem(ArmorMaterialsInit.BLOODSTONE, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCORPION_LEGGINGS = registerItem("scorpion_leggings",
            () -> new BloodstoneArmorItem(ArmorMaterialsInit.BLOODSTONE, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCORPION_BOOTS = registerItem("scorpion_boots",
            () -> new BloodstoneArmorItem(ArmorMaterialsInit.BLOODSTONE, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item CRYO_HELMET = registerItem("cryo_helmet",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item CRYO_CHESTPLATE = registerItem("cryo_chestplate",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item CRYO_LEGGINGS = registerItem("cryo_leggings",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item CRYO_BOOTS = registerItem("cryo_boots",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item COPPERKNIGHT_HELMET = registerItem("copperknight_helmet",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item COPPERKNIGHT_CHESTLATE = registerItem("copperknight_chestplate",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item COPPERKNIGHT_LEGGINGS = registerItem("copperknight_leggings",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item COPPERKNIGHT_BOOTS = registerItem("copperknight_boots",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCULK_HELMET = registerItem("sculk_helmet",
            () -> new SculkArmorItem(ArmorMaterialsInit.SCULK, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCULK_CHESTLATE = registerItem("sculk_chestplate",
            () -> new SculkArmorItem(ArmorMaterialsInit.SCULK, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCULK_LEGGINGS = registerItem("sculk_leggings",
            () -> new SculkArmorItem(ArmorMaterialsInit.SCULK, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCULK_BOOTS = registerItem("sculk_boots",
            () -> new SculkArmorItem(ArmorMaterialsInit.SCULK, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item JADE_HELMET = registerItem("jade_helmet",
            () -> new JadeArmorItem(ArmorMaterialsInit.JADE, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item JADE_CHESTLATE = registerItem("jade_chestplate",
            () -> new JadeArmorItem(ArmorMaterialsInit.JADE, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item JADE_LEGGINGS = registerItem("jade_leggings",
            () -> new JadeArmorItem(ArmorMaterialsInit.JADE, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item JADE_BOOTS = registerItem("jade_boots",
            () -> new JadeArmorItem(ArmorMaterialsInit.JADE, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            () -> new SteelArmorItem(ArmorMaterialsInit.STEEL, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item STEEL_CHESTLATE = registerItem("steel_chestplate",
            () -> new SteelArmorItem(ArmorMaterialsInit.STEEL, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            () -> new SteelArmorItem(ArmorMaterialsInit.STEEL, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            () -> new SteelArmorItem(ArmorMaterialsInit.STEEL, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SHADOW_HELMET = registerItem("shadow_helmet",
            () -> new ShadowArmorItem(ArmorMaterialsInit.SHADOW, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SHADOW_CHESTLATE = registerItem("shadow_chestplate",
            () -> new ShadowArmorItem(ArmorMaterialsInit.SHADOW, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SHADOW_LEGGINGS = registerItem("shadow_leggings",
            () -> new ShadowArmorItem(ArmorMaterialsInit.SHADOW, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SHADOW_BOOTS = registerItem("shadow_boots",
            () -> new ShadowArmorItem(ArmorMaterialsInit.SHADOW, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ANGEL_HELMET = registerItem("angel_helmet",
            () -> new AngelWingItem(ArmorMaterialsInit.ANGEL, EquipmentSlot.HEAD, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ANGEL_CHESTPLATE = registerItem("angel_chestplate",
            () -> new AngelWingItem(ArmorMaterialsInit.ANGEL, EquipmentSlot.CHEST, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ANGEL_LEGGINGS = registerItem("angel_leggings",
            () -> new AngelWingItem(ArmorMaterialsInit.ANGEL, EquipmentSlot.LEGS, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ANGEL_BOOTS = registerItem("angel_boots",
            () -> new AngelWingItem(ArmorMaterialsInit.ANGEL, EquipmentSlot.FEET, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));


    //Tools

    public static final Item ARCLIGHT_SWORD = registerItem("arclight_sword",
            () -> new SwordItem(ItemMaterialsInit.ARCLIGHT,2,-2.4f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ARCLIGHT_PICKAXE = registerItem("arclight_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.ARCLIGHT,0,-2.8f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ARCLIGHT_AXE = registerItem("arclight_axe",
            () -> new AxeItem(ItemMaterialsInit.ARCLIGHT,4,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ARCLIGHT_SHOVEL = registerItem("arclight_shovel",
            () -> new ShovelItem(ItemMaterialsInit.ARCLIGHT,0,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item ARCLIGHT_HOE = registerItem("arclight_hoe",
            () -> new HoeItem(ItemMaterialsInit.ARCLIGHT,-4,0f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final Item JADE_SWORD = registerItem("jade_sword",
            () -> new SwordItem(ItemMaterialsInit.JADE,3,-2.4f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item JADE_PICKAXE = registerItem("jade_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.JADE,1,-2.8f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item JADE_AXE = registerItem("jade_axe",
            () -> new AxeItem(ItemMaterialsInit.JADE,5,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item JADE_SHOVEL = registerItem("jade_shovel",
            () -> new ShovelItem(ItemMaterialsInit.JADE,1,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item JADE_HOE = registerItem("jade_hoe",
            () -> new HoeItem(ItemMaterialsInit.JADE,-4,0f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final Item MOONLIGHT_SWORD = registerItem("moonlight_sword",
            () -> new SwordItem(ItemMaterialsInit.MOONLIGHT,3,-2.4f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item MOONLIGHT_PICKAXE = registerItem("moonlight_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.MOONLIGHT,1,-2.8f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item MOONLIGHT_AXE = registerItem("moonlight_axe",
            () -> new AxeItem(ItemMaterialsInit.MOONLIGHT,5,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item MOONLIGHT_SHOVEL = registerItem("moonlight_shovel",
            () -> new ShovelItem(ItemMaterialsInit.MOONLIGHT,1,-2.8f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item MOONLIGHT_HOE = registerItem("moonlight_hoe",
            () -> new HoeItem(ItemMaterialsInit.MOONLIGHT,-3,0f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final Item BLOODSTONE_SWORD = registerItem("bloodstone_sword",
            () -> new SwordItem(ItemMaterialsInit.BLOODSTONE,2,-2.4f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item BLOODSTONE_PICKAXE = registerItem("bloodstone_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.BLOODSTONE,0,-2.8f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item BLOODSTONE_AXE = registerItem("bloodstone_axe",
            () -> new AxeItem(ItemMaterialsInit.BLOODSTONE,4,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item BLOODSTONE_SHOVEL = registerItem("bloodstone_shovel",
            () -> new ShovelItem(ItemMaterialsInit.BLOODSTONE,0,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item BLOODSTONE_HOE = registerItem("bloodstone_hoe",
            () -> new HoeItem(ItemMaterialsInit.BLOODSTONE,-4,0f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final Item CRYORIUM_SWORD = registerItem("cryorium_sword",
            () -> new SwordItem(ItemMaterialsInit.CRYORIUM,2,-2.4f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item CRYORIUM_PICKAXE = registerItem("cryorium_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.CRYORIUM,0,-2.8f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item CRYORIUM_AXE = registerItem("cryorium_axe",
            () -> new AxeItem(ItemMaterialsInit.CRYORIUM,4,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item CRYORIUM_SHOVEL = registerItem("cryorium_shovel",
            () -> new ShovelItem(ItemMaterialsInit.CRYORIUM,0,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item CRYORIUM_HOE = registerItem("cryorium_hoe",
            () -> new HoeItem(ItemMaterialsInit.CRYORIUM,-4,0f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final Item SCULK_SWORD = registerItem("sculk_sword",
            () -> new SwordItem(ItemMaterialsInit.SCULK,3,-2.4f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCULK_PICKAXE = registerItem("sculk_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.SCULK,1,-2.8f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCULK_AXE = registerItem("sculk_axe",
            () -> new AxeItem(ItemMaterialsInit.SCULK,5,-3f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCULK_SHOVEL = registerItem("sculk_shovel",
            () -> new ShovelItem(ItemMaterialsInit.SCULK,1,-2.8f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final Item SCULK_HOE = registerItem("sculk_hoe",
            () -> new HoeItem(ItemMaterialsInit.SCULK,-3,0f, new Item.Settings().group(ArclightModCreativeTabs.ARCLIGHT_TAB)));


    //Blocks

    public static final Item PEDESTAL_BLOCK_ITEM = registerItem("pedestal_block",
            () -> new PedestalBlockItem(BlocksInit.PEDESTAL_BLOCK,
                    new Item.Settings().group(ArclightModCreativeTabs.BUILDING_TAB)));

    private static Item registerItem(String name, Supplier<Item> item) {
     Item i = item.get();
     Registry.register(Registry.ITEM, new Identifier(ArclightMod.MODID, name), i);
     return i;
    }

    public static void register() {
    }
}
