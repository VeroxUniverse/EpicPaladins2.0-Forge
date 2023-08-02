package net.veroxuniverse.epicpaladins.client.items.armors.knight;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.AngelArmorItem;
import net.veroxuniverse.epicpaladins.common.items.armorItems.KnightArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class KnightArmorModel extends GeoModel<KnightArmorItem> {
    @Override
    public ResourceLocation getModelResource(KnightArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/knight_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KnightArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/armor/knight_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KnightArmorItem animatable) {
        return null;
    }
}
