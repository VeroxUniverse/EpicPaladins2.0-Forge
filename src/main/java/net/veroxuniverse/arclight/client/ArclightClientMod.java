package net.veroxuniverse.arclight.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.veroxuniverse.arclight.block.entities.ModBlockEntities;
import net.veroxuniverse.arclight.client.custom_armors.angel_armor.AngelArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.arclight_armor.ArclightArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.copper_knight.CopperKnightArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.cryorium_armor.CryoriumArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.jade_armor.JadeArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.moonlight_armor.MoonlightArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.scorpion_armor.ScorpionArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.sculk_armor.SculkArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.shadow_armor.ShadowArmorRenderer;
import net.veroxuniverse.arclight.client.custom_armors.steel_armor.SteelKnightArmorRenderer;
import net.veroxuniverse.arclight.client.custom_blocks.pedestal_block.PedestalBlockRenderer;
import net.veroxuniverse.arclight.client.custom_items.angel_sword.AngelSwordRenderer;
import net.veroxuniverse.arclight.client.custom_items.cryorium_axe.CryoriumAxeRenderer;
import net.veroxuniverse.arclight.client.custom_items.moonlight_glaive.MoonlightGlaiveRenderer;
import net.veroxuniverse.arclight.client.custom_items.pedestal_block_item.PedestalBlockItemRenderer;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.init.ItemsInit;
import net.veroxuniverse.arclight.screen.ArmorForgeScreen;
import net.veroxuniverse.arclight.screen.ModMenuTypes;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ArclightClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        GeoArmorRenderer.registerArmorRenderer(new ArclightArmorRenderer(), ItemsInit.ARCLIGHTS_HELMET, ItemsInit.ARCLIGHTS_CHESTLATE, ItemsInit.ARCLIGHTS_LEGGINGS, ItemsInit.ARCLIGHTS_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new MoonlightArmorRenderer(), ItemsInit.MOONLIGHT_HELMET, ItemsInit.MOONLIGHT_CHESTLATE, ItemsInit.MOONLIGHT_LEGGINGS, ItemsInit.MOONLIGHT_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new ScorpionArmorRenderer(), ItemsInit.SCORPION_HELMET, ItemsInit.SCORPION_CHESTPLATE, ItemsInit.SCORPION_LEGGINGS, ItemsInit.SCORPION_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new CopperKnightArmorRenderer(), ItemsInit.COPPERKNIGHT_HELMET, ItemsInit.COPPERKNIGHT_CHESTLATE, ItemsInit.COPPERKNIGHT_LEGGINGS, ItemsInit.COPPERKNIGHT_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new CryoriumArmorRenderer(), ItemsInit.CRYO_HELMET, ItemsInit.CRYO_CHESTPLATE, ItemsInit.CRYO_LEGGINGS, ItemsInit.CRYO_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new JadeArmorRenderer(), ItemsInit.JADE_HELMET, ItemsInit.JADE_CHESTLATE, ItemsInit.JADE_LEGGINGS, ItemsInit.JADE_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new SculkArmorRenderer(), ItemsInit.SCULK_HELMET, ItemsInit.SCULK_CHESTLATE, ItemsInit.SCULK_LEGGINGS, ItemsInit.SCULK_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new ShadowArmorRenderer(), ItemsInit.SHADOW_HELMET, ItemsInit.SHADOW_CHESTLATE, ItemsInit.SHADOW_LEGGINGS, ItemsInit.SHADOW_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new SteelKnightArmorRenderer(), ItemsInit.STEEL_HELMET, ItemsInit.STEEL_CHESTLATE, ItemsInit.STEEL_LEGGINGS, ItemsInit.STEEL_BOOTS);
        GeoArmorRenderer.registerArmorRenderer(new AngelArmorRenderer(), ItemsInit.ANGEL_HELMET, ItemsInit.ANGEL_CHESTPLATE, ItemsInit.ANGEL_LEGGINGS, ItemsInit.ANGEL_BOOTS);

        BlockEntityRendererRegistry.register(ModBlockEntities.PEDESTAL_BLOCK_ENTITY, PedestalBlockRenderer::new);
        BuiltinItemRendererRegistry.INSTANCE.register(ItemsInit.ANGEL_SWORD, new AngelSwordRenderer());
        BuiltinItemRendererRegistry.INSTANCE.register(ItemsInit.CRYORIUM_BATTLE_AXE, new CryoriumAxeRenderer());
        BuiltinItemRendererRegistry.INSTANCE.register(ItemsInit.MOONLIGHT_GLAIVE, new MoonlightGlaiveRenderer());
        BuiltinItemRendererRegistry.INSTANCE.register(ItemsInit.PEDESTAL_BLOCK_ITEM, new PedestalBlockItemRenderer());

        HandledScreens.register(ModMenuTypes.ARMOR_FORGE_MENU, ArmorForgeScreen::new);
    }
}

