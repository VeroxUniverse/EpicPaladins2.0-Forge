package net.veroxuniverse.epicpaladins.client.items.weapons.glaive;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.weapons.AngelSwordItem;
import net.veroxuniverse.epicpaladins.common.items.weapons.MoonlightGlaiveItem;
import software.bernie.geckolib.model.GeoModel;

public class MoonlightGlaiveModel extends GeoModel<MoonlightGlaiveItem> {


    @Override
    public ResourceLocation getModelResource(MoonlightGlaiveItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/moonlight_glaive.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MoonlightGlaiveItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/item/moonlight_glaive.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MoonlightGlaiveItem animatable) {
        return null;
    }
}