package net.veroxuniverse.epicpaladins.client.items.armors.jade;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.AngelArmorItem;
import net.veroxuniverse.epicpaladins.common.items.armorItems.JadeArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class JadeArmorModel extends GeoModel<JadeArmorItem> {
    @Override
    public ResourceLocation getModelResource(JadeArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/jade_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JadeArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/armor/jade_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JadeArmorItem animatable) {
        return null;
    }
}
