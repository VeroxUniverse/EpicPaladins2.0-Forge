package net.veroxuniverse.arclight.client.custom_armors.steel_armor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.SteelArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SteelKnightArmorModel extends AnimatedGeoModel<SteelArmorItem> {
    @Override
    public ResourceLocation  getModelResource(SteelArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "geo/steel_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SteelArmorItem object) {
        return new ResourceLocation(ArclightMod.MODID, "textures/models/armor/steel_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SteelArmorItem animatable) {
        return null; //return new ResourceLocation(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
