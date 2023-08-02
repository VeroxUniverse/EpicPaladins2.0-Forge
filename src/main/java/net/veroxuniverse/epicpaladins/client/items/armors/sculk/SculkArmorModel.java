package net.veroxuniverse.epicpaladins.client.items.armors.sculk;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.SculkArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class SculkArmorModel extends GeoModel<SculkArmorItem> {
    @Override
    public ResourceLocation getModelResource(SculkArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/sculk_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SculkArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/armor/sculk_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SculkArmorItem animatable) {
        return null;
    }
}
