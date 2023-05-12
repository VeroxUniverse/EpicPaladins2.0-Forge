package net.veroxuniverse.arclight.client.custom_armors.arclight_armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.ArclightArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ArclightArmorModel extends AnimatedGeoModel<ArclightArmorItem> {
    @Override
    public Identifier getModelLocation(ArclightArmorItem object) {
        return new Identifier(ArclightMod.MODID, "geo/arclight_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ArclightArmorItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/arclight_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ArclightArmorItem animatable) {
        return null; //return new Identifier(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
