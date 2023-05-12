package net.veroxuniverse.arclight.client.custom_armors.jade_armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.JadeArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JadeArmorModel extends AnimatedGeoModel<JadeArmorItem> {
    @Override
    public Identifier  getModelLocation(JadeArmorItem object) {
        return new Identifier(ArclightMod.MODID, "geo/jade_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(JadeArmorItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/jade_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(JadeArmorItem animatable) {
        return null; //return new Identifier(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
