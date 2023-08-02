package net.veroxuniverse.epicpaladins.client.items.weapons.sword;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.weapons.AngelSwordItem;
import software.bernie.geckolib.model.GeoModel;

public class AngelSwordModel extends GeoModel<AngelSwordItem> {


    @Override
    public ResourceLocation getModelResource(AngelSwordItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/angel_sword.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AngelSwordItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/item/angel_sword.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AngelSwordItem animatable) {
        return null;
    }
}