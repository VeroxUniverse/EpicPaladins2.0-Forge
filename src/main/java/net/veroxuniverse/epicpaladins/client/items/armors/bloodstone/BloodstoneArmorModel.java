package net.veroxuniverse.epicpaladins.client.items.armors.bloodstone;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.AngelArmorItem;
import net.veroxuniverse.epicpaladins.common.items.armorItems.BloodstoneArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class BloodstoneArmorModel extends GeoModel<BloodstoneArmorItem> {
    @Override
    public ResourceLocation getModelResource(BloodstoneArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/bloodstone_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BloodstoneArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/armor/bloodstone_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BloodstoneArmorItem animatable) {
        return null;
    }
}
