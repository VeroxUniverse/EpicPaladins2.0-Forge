package net.veroxuniverse.arclight.client.custom_armors.cryorium_armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.CryoArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CryoriumArmorModel extends AnimatedGeoModel<CryoArmorItem> {
    @Override
    public Identifier  getModelLocation(CryoArmorItem object) {
        return new Identifier(ArclightMod.MODID, "geo/cryorium_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(CryoArmorItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/cryorium_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(CryoArmorItem animatable) {
        return null; //return new Identifier(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
