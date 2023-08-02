package net.veroxuniverse.epicpaladins.client.items.armors.assassin;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.items.armorItems.AngelArmorItem;
import net.veroxuniverse.epicpaladins.common.items.armorItems.AssassinArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class AssassinArmorModel extends GeoModel<AssassinArmorItem> {
    @Override
    public ResourceLocation getModelResource(AssassinArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "geo/assassin_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AssassinArmorItem animatable) {
        return new ResourceLocation(EpicPaladinsMod.MOD_ID, "textures/armor/assassin_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AssassinArmorItem animatable) {
        return null;
    }
}
