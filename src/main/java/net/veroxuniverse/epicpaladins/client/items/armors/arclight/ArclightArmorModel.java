package net.veroxuniverse.epicpaladins.client.items.armors.arclight;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.ArclightArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class ArclightArmorModel extends GeoModel<ArclightArmorItem> {
    @Override
    public ResourceLocation getModelResource(ArclightArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/arclight_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArclightArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/armor/arclight_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ArclightArmorItem animatable) {
        return null;
    }
}
