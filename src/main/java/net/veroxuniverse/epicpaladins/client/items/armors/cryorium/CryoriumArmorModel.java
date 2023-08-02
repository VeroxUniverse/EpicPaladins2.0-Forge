package net.veroxuniverse.epicpaladins.client.items.armors.cryorium;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.AngelArmorItem;
import net.veroxuniverse.epicpaladins.common.items.armorItems.CryoriumArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class CryoriumArmorModel extends GeoModel<CryoriumArmorItem> {
    @Override
    public ResourceLocation getModelResource(CryoriumArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/cryorium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CryoriumArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/armor/cryorium_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CryoriumArmorItem animatable) {
        return null;
    }
}
