package net.veroxuniverse.epicpaladins.client.items.armors.moonlight;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.AngelArmorItem;
import net.veroxuniverse.epicpaladins.common.items.armorItems.MoonlightArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class MoonlightArmorModel extends GeoModel<MoonlightArmorItem> {
    @Override
    public ResourceLocation getModelResource(MoonlightArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/moonlight_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MoonlightArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/armor/moonlight_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MoonlightArmorItem animatable) {
        return null;
    }
}
