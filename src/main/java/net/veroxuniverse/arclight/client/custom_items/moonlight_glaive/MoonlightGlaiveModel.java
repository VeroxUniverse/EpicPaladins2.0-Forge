package net.veroxuniverse.arclight.client.custom_items.moonlight_glaive;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.MoonlightGlaiveItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MoonlightGlaiveModel extends AnimatedGeoModel<MoonlightGlaiveItem> {
    @Override
    public Identifier getModelLocation(MoonlightGlaiveItem object) {
        return new Identifier(ArclightMod.MODID, "geo/moonlight_glaive.geo.json");
    }

    @Override
    public Identifier getTextureLocation(MoonlightGlaiveItem object) {
        return new Identifier(ArclightMod.MODID, "textures/item/moonlight_glaive.png");
    }

    @Override
    public Identifier getAnimationFileLocation(MoonlightGlaiveItem animatable) {
        return null; // new Identifier(ArclightMod.MODID, "animations/item_animation.json");
    }
}

