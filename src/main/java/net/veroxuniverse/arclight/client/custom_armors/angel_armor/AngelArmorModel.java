package net.veroxuniverse.arclight.client.custom_armors.angel_armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.AngelWingItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AngelArmorModel extends AnimatedGeoModel<AngelWingItem> {
    @Override
    public Identifier getModelLocation(AngelWingItem object) {
        return new Identifier(ArclightMod.MODID, "geo/angel_armor_with_wings.geo.json");
    }

    @Override
    public Identifier getTextureLocation(AngelWingItem object) {
        return new Identifier(ArclightMod.MODID, "textures/models/armor/angel_armor_textures.png");
    }

    @Override
    public Identifier getAnimationFileLocation(AngelWingItem animatable) {
        return new Identifier(ArclightMod.MODID, "animations/angel_armor_animation.json");
    }

}
