package net.veroxuniverse.arclight.client.custom_armors.copper_knight;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.CopperArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CopperKnightArmorModel extends AnimatedGeoModel<CopperArmorItem> {
    @Override
    public Identifier  getModelLocation(CopperArmorItem object) {
        return new Identifier(ArclightMod.MODID, "geo/copper_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(CopperArmorItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/copper_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(CopperArmorItem animatable) {
        return null; //return new Identifier(ArclightMod.MODID, "animations/armor_animation.json");
    }

}
