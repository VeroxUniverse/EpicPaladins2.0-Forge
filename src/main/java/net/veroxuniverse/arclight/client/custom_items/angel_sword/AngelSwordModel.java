package net.veroxuniverse.arclight.client.custom_items.angel_sword;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.AngelSwordItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AngelSwordModel extends AnimatedGeoModel<AngelSwordItem> {

    @Override
    public Identifier getModelLocation(AngelSwordItem object) {
        return new Identifier(ArclightMod.MODID, "geo/angel_sword.geo.json");
    }

    @Override
    public Identifier getTextureLocation(AngelSwordItem object) {
        return new Identifier(ArclightMod.MODID, "textures/item/angel_sword.png");
    }

    @Override
    public Identifier getAnimationFileLocation(AngelSwordItem animatable) {
        return null; // new Identifier(ArclightMod.MODID, "animations/item_animation.json");
    }
}
