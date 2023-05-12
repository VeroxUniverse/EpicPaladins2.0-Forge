package net.veroxuniverse.arclight.client.custom_blocks.pedestal_block;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.block.entities.PedestalBlockEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PedestalBlockModel extends AnimatedGeoModel<PedestalBlockEntity> {
    @Override
    public Identifier getModelLocation(PedestalBlockEntity object) {
        return new Identifier(ArclightMod.MODID, "geo/pedestal_block.geo.json");
    }

    @Override
    public Identifier getTextureLocation(PedestalBlockEntity object) {
        return new Identifier(ArclightMod.MODID, "textures/machines/pedestal_block.png");
    }

    @Override
    public Identifier getAnimationFileLocation(PedestalBlockEntity animatable) {
        return null; // new ResourceLocation(ArclightMod.MODID,"animations/...");
    }
}