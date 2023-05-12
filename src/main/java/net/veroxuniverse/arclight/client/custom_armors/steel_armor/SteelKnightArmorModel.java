package net.veroxuniverse.arclight.client.custom_armors.steel_armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.SteelArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SteelKnightArmorModel extends AnimatedGeoModel<SteelArmorItem> {
    @Override
    public Identifier  getModelLocation(SteelArmorItem object) {
        return new Identifier(ArclightMod.MODID, "geo/steel_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(SteelArmorItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/steel_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(SteelArmorItem animatable) {
        return null; //return new Identifier(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
