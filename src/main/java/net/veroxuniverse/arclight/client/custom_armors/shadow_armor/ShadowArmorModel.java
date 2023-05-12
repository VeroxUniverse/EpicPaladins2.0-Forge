package net.veroxuniverse.arclight.client.custom_armors.shadow_armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.ShadowArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShadowArmorModel extends AnimatedGeoModel<ShadowArmorItem> {
    @Override
    public Identifier  getModelLocation(ShadowArmorItem object) {
        return new Identifier(ArclightMod.MODID, "geo/shadow_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ShadowArmorItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/shadow_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ShadowArmorItem animatable) {
        return null; //return new Identifier(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
