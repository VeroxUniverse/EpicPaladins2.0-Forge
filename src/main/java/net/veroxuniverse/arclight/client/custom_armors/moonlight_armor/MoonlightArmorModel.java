package net.veroxuniverse.arclight.client.custom_armors.moonlight_armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.MoonlightArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MoonlightArmorModel extends AnimatedGeoModel<MoonlightArmorItem> {
    @Override
    public Identifier  getModelLocation(MoonlightArmorItem object) {
        return new Identifier(ArclightMod.MODID, "geo/moonlight_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(MoonlightArmorItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/moonlight_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(MoonlightArmorItem animatable) {
        return null; //return new Identifier(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
