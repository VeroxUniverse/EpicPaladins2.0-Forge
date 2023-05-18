package net.veroxuniverse.arclight.init;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.entity.ModEntityTypes;
import net.veroxuniverse.arclight.item.*;
import net.veroxuniverse.arclight.util.ArclightModCreativeTabs;

@SuppressWarnings("unused")
public class ItemsInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArclightMod.MODID);

    //3DItems

    public static final RegistryObject<Item> ANGEL_SWORD = ITEMS.register("angel_sword",
            () -> new AngelSwordItem(ItemMaterialsInit.ARCLIGHT, 10, -2.4f,
                    new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> MOONLIGHT_GLAIVE = ITEMS.register("moonlight_glaive",
            () -> new MoonlightGlaiveItem(ItemMaterialsInit.MOONLIGHT, 11, -2.2f,
                    new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB).rarity(Rarity.EPIC)));
 public static final RegistryObject<Item> CRYORIUM_BATTLE_AXE = ITEMS.register("cryorium_battle_axe",
         () -> new CryoriumAxeItem(ItemMaterialsInit.CRYORIUM, 10, -3.0f,
                 new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB).rarity(Rarity.EPIC)));


 //Cores

    public static final RegistryObject<Item> ARCLIGHT_CORE = ITEMS.register("arclight_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> MOONLIGHT_CORE = ITEMS.register("moonlight_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SCORPION_CORE = ITEMS.register("scorpion_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CRYORIUM_CORE = ITEMS.register("cryorium_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> JADE_CORE = ITEMS.register("jade_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SCULK_CORE = ITEMS.register("sculk_core",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).rarity(Rarity.RARE)));


    //Resources

    public static final RegistryObject<Item> ARCLIGHT_GEM = ITEMS.register("arclight_gem",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_INGOT = ITEMS.register("arclight_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> JADE_GEM = ITEMS.register("jade_gem",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> JADE_INGOT = ITEMS.register("jade_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_CRYSTAL = ITEMS.register("moonlight_crystal",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_INGOT = ITEMS.register("moonlight_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
   /*

   public static final RegistryObject<Item> MOONLIGHT_JELLYBALL = ITEMS.register("moonlight_jellyball",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_CRYSTALIZED = ITEMS.register("moonlight_crystalized",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));

    */
    public static final RegistryObject<Item> BLOODSTONE_GEM = ITEMS.register("bloodstone_gem",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_INGOT = ITEMS.register("bloodstone_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> CRYORIUM_GEM = ITEMS.register("cryorium_gem",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> CRYORIUM_INGOT = ITEMS.register("cryorium_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> SCULK_INGOT = ITEMS.register("sculk_ingot",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
   /*
    public static final RegistryObject<Item> HEART = ITEMS.register("heart",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> SCORPION_SCALE = ITEMS.register("scorpion_scale",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    */

    public static final RegistryObject<Item> ANGEL_FEATHER = ITEMS.register("angel_feather",
            () -> new Item(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB)));
    public static final RegistryObject<Item> ANGEL_SPAWN = ITEMS.register("angel_spawn",
            () -> new AngelSpawnItem(new Item.Properties().tab(ArclightModCreativeTabs.RESOURCES_TAB).durability(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ANGEL_SPAWN_EGG = ITEMS.register("angel_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ANGEL, 0xE1EF05, 0x6FF2FA,new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


 //Armor

    public static final RegistryObject<Item> ARCLIGHTS_HELMET = ITEMS.register("arclight_helmet",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHTS_CHESTLATE = ITEMS.register("arclight_chestplate",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHTS_LEGGINGS = ITEMS.register("arclight_leggings",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHTS_BOOTS = ITEMS.register("arclight_boots",
            () -> new ArclightArmorItem(ArmorMaterialsInit.ARCLIGHT, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_HELMET = ITEMS.register("moonlight_helmet",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_CHESTLATE = ITEMS.register("moonlight_chestplate",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_LEGGINGS = ITEMS.register("moonlight_leggings",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_BOOTS = ITEMS.register("moonlight_boots",
            () -> new MoonlightArmorItem(ArmorMaterialsInit.MOONLIGHT, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCORPION_HELMET = ITEMS.register("scorpion_helmet",
            () -> new ScorpionArmorItem(ArmorMaterialsInit.SCORPIONSCALE, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCORPION_CHESTPLATE = ITEMS.register("scorpion_chestplate",
            () -> new ScorpionArmorItem(ArmorMaterialsInit.SCORPIONSCALE, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCORPION_LEGGINGS = ITEMS.register("scorpion_leggings",
            () -> new ScorpionArmorItem(ArmorMaterialsInit.SCORPIONSCALE, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCORPION_BOOTS = ITEMS.register("scorpion_boots",
            () -> new ScorpionArmorItem(ArmorMaterialsInit.SCORPIONSCALE, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYO_HELMET = ITEMS.register("cryo_helmet",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYO_CHESTPLATE = ITEMS.register("cryo_chestplate",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYO_LEGGINGS = ITEMS.register("cryo_leggings",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYO_BOOTS = ITEMS.register("cryo_boots",
            () -> new CryoArmorItem(ArmorMaterialsInit.CRYO, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> COPPERKNIGHT_HELMET = ITEMS.register("copperknight_helmet",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> COPPERKNIGHT_CHESTLATE = ITEMS.register("copperknight_chestplate",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> COPPERKNIGHT_LEGGINGS = ITEMS.register("copperknight_leggings",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> COPPERKNIGHT_BOOTS = ITEMS.register("copperknight_boots",
            () -> new CopperArmorItem(ArmorMaterialsInit.COPPER, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCULK_HELMET = ITEMS.register("sculk_helmet",
            () -> new SculkArmorItem(ArmorMaterialsInit.SCULK, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCULK_CHESTLATE = ITEMS.register("sculk_chestplate",
            () -> new SculkArmorItem(ArmorMaterialsInit.SCULK, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCULK_LEGGINGS = ITEMS.register("sculk_leggings",
            () -> new SculkArmorItem(ArmorMaterialsInit.SCULK, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCULK_BOOTS = ITEMS.register("sculk_boots",
            () -> new SculkArmorItem(ArmorMaterialsInit.SCULK, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",
            () -> new JadeArmorItem(ArmorMaterialsInit.JADE, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_CHESTLATE = ITEMS.register("jade_chestplate",
            () -> new JadeArmorItem(ArmorMaterialsInit.JADE, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",
            () -> new JadeArmorItem(ArmorMaterialsInit.JADE, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",
            () -> new JadeArmorItem(ArmorMaterialsInit.JADE, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new SteelArmorItem(ArmorMaterialsInit.STEEL, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> STEEL_CHESTLATE = ITEMS.register("steel_chestplate",
            () -> new SteelArmorItem(ArmorMaterialsInit.STEEL, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new SteelArmorItem(ArmorMaterialsInit.STEEL, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new SteelArmorItem(ArmorMaterialsInit.STEEL, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SHADOW_HELMET = ITEMS.register("shadow_helmet",
            () -> new ShadowArmorItem(ArmorMaterialsInit.SHADOW, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SHADOW_CHESTLATE = ITEMS.register("shadow_chestplate",
            () -> new ShadowArmorItem(ArmorMaterialsInit.SHADOW, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SHADOW_LEGGINGS = ITEMS.register("shadow_leggings",
            () -> new ShadowArmorItem(ArmorMaterialsInit.SHADOW, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SHADOW_BOOTS = ITEMS.register("shadow_boots",
            () -> new ShadowArmorItem(ArmorMaterialsInit.SHADOW, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ANGEL_HELMET = ITEMS.register("angel_helmet",
            () -> new AngelWingItem(ArmorMaterialsInit.ANGEL, EquipmentSlot.HEAD, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ANGEL_CHESTPLATE = ITEMS.register("angel_chestplate",
            () -> new AngelWingItem(ArmorMaterialsInit.ANGEL, EquipmentSlot.CHEST, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ANGEL_LEGGINGS = ITEMS.register("angel_leggings",
            () -> new AngelWingItem(ArmorMaterialsInit.ANGEL, EquipmentSlot.LEGS, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ANGEL_BOOTS = ITEMS.register("angel_boots",
            () -> new AngelWingItem(ArmorMaterialsInit.ANGEL, EquipmentSlot.FEET, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));


    //Tools

    public static final RegistryObject<Item> ARCLIGHT_SWORD = ITEMS.register("arclight_sword",
            () -> new SwordItem(ItemMaterialsInit.ARCLIGHT,7,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_PICKAXE = ITEMS.register("arclight_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.ARCLIGHT,5,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_AXE = ITEMS.register("arclight_axe",
            () -> new AxeItem(ItemMaterialsInit.ARCLIGHT,9,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_SHOVEL = ITEMS.register("arclight_shovel",
            () -> new ShovelItem(ItemMaterialsInit.ARCLIGHT,5,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> ARCLIGHT_HOE = ITEMS.register("arclight_hoe",
            () -> new HoeItem(ItemMaterialsInit.ARCLIGHT,1,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword",
            () -> new SwordItem(ItemMaterialsInit.JADE,7,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.JADE,5,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe",
            () -> new AxeItem(ItemMaterialsInit.JADE,9,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel",
            () -> new ShovelItem(ItemMaterialsInit.JADE,5,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe",
            () -> new HoeItem(ItemMaterialsInit.JADE,1,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final RegistryObject<Item> MOONLIGHT_SWORD = ITEMS.register("moonlight_sword",
            () -> new SwordItem(ItemMaterialsInit.MOONLIGHT,7,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_PICKAXE = ITEMS.register("moonlight_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.MOONLIGHT,5,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_AXE = ITEMS.register("moonlight_axe",
            () -> new AxeItem(ItemMaterialsInit.MOONLIGHT,9,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_SHOVEL = ITEMS.register("moonlight_shovel",
            () -> new ShovelItem(ItemMaterialsInit.MOONLIGHT,5,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> MOONLIGHT_HOE = ITEMS.register("moonlight_hoe",
            () -> new HoeItem(ItemMaterialsInit.MOONLIGHT,1,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final RegistryObject<Item> BLOODSTONE_SWORD = ITEMS.register("bloodstone_sword",
            () -> new SwordItem(ItemMaterialsInit.BLOODSTONE,7,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_PICKAXE = ITEMS.register("bloodstone_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.BLOODSTONE,5,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_AXE = ITEMS.register("bloodstone_axe",
            () -> new AxeItem(ItemMaterialsInit.BLOODSTONE,9,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_SHOVEL = ITEMS.register("bloodstone_shovel",
            () -> new ShovelItem(ItemMaterialsInit.BLOODSTONE,5,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> BLOODSTONE_HOE = ITEMS.register("bloodstone_hoe",
            () -> new HoeItem(ItemMaterialsInit.BLOODSTONE,1,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final RegistryObject<Item> CRYORIUM_SWORD = ITEMS.register("cryorium_sword",
            () -> new SwordItem(ItemMaterialsInit.CRYORIUM,7,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYORIUM_PICKAXE = ITEMS.register("cryorium_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.CRYORIUM,5,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYORIUM_AXE = ITEMS.register("cryorium_axe",
            () -> new AxeItem(ItemMaterialsInit.CRYORIUM,9,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYORIUM_SHOVEL = ITEMS.register("cryorium_shovel",
            () -> new ShovelItem(ItemMaterialsInit.CRYORIUM,5,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> CRYORIUM_HOE = ITEMS.register("cryorium_hoe",
            () -> new HoeItem(ItemMaterialsInit.CRYORIUM,1,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));

    public static final RegistryObject<Item> SCULK_SWORD = ITEMS.register("sculk_sword",
            () -> new SwordItem(ItemMaterialsInit.SCULK,7,-2.4f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCULK_PICKAXE = ITEMS.register("sculk_pickaxe",
            () -> new PickaxeItem(ItemMaterialsInit.SCULK,5,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCULK_AXE = ITEMS.register("sculk_axe",
            () -> new AxeItem(ItemMaterialsInit.SCULK,9,-3f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCULK_SHOVEL = ITEMS.register("sculk_shovel",
            () -> new ShovelItem(ItemMaterialsInit.SCULK,5,-2.8f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));
    public static final RegistryObject<Item> SCULK_HOE = ITEMS.register("sculk_hoe",
            () -> new HoeItem(ItemMaterialsInit.SCULK,1,0f, new Item.Properties().tab(ArclightModCreativeTabs.ARCLIGHT_TAB)));


    //Blocks

    public static final RegistryObject<Item> PEDESTAL_BLOCK_ITEM = ITEMS.register("pedestal_block",
            () -> new PedestalBlockItem(BlocksInit.PEDESTAL_BLOCK.get(),
                    new Item.Properties().tab(ArclightModCreativeTabs.BUILDING_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
