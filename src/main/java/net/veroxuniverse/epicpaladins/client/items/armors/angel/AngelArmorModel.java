package net.veroxuniverse.epicpaladins.client.items.armors.angel;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.AngelArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class AngelArmorModel extends GeoModel<AngelArmorItem> {
    @Override
    public ResourceLocation getModelResource(AngelArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "geo/angel_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AngelArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "textures/armor/angel_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AngelArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "animations/armor/angel_armor_animation.json");
    }
}
