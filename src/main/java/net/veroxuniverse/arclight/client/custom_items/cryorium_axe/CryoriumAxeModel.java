package net.veroxuniverse.arclight.client.custom_items.cryorium_axe;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.CryoriumAxeItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CryoriumAxeModel extends AnimatedGeoModel<CryoriumAxeItem> {

    @Override
    public Identifier getModelLocation(CryoriumAxeItem object) {
        return new Identifier(ArclightMod.MODID, "geo/cryorium_battle_axe.geo.json");
    }

    @Override
    public Identifier getTextureLocation(CryoriumAxeItem object) {
        return new Identifier(ArclightMod.MODID, "textures/item/cryorium_battle_axe.png");
    }

    @Override
    public Identifier getAnimationFileLocation(CryoriumAxeItem animatable) {
        return null; // new Identifier(ArclightMod.MODID, "animations/item_animation.json");
    }
}
