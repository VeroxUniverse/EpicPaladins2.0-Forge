package net.veroxuniverse.epicpaladins.client.items.weapons.battleaxe;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.weapons.AngelSwordItem;
import net.veroxuniverse.epicpaladins.common.items.weapons.CryoriumAxeItem;
import software.bernie.geckolib.model.GeoModel;

public class CryoriumAxeModel extends GeoModel<CryoriumAxeItem> {


    @Override
    public ResourceLocation getModelResource(CryoriumAxeItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/cryorium_axe.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CryoriumAxeItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/item/cryorium_battle_axe.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CryoriumAxeItem animatable) {
        return null;
    }
}