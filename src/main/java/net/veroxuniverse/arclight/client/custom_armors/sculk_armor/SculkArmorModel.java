package net.veroxuniverse.arclight.client.custom_armors.sculk_armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.SculkArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SculkArmorModel extends AnimatedGeoModel<SculkArmorItem> {
    @Override
    public Identifier  getModelLocation(SculkArmorItem object) {
        return new Identifier(ArclightMod.MODID, "geo/sculk_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(SculkArmorItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/sculk_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(SculkArmorItem animatable) {
        return null; //return new Identifier(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
