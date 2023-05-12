package net.veroxuniverse.arclight.client.custom_items.pedestal_block_item;

import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.item.PedestalBlockItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PedestalBlockItemModel extends AnimatedGeoModel<PedestalBlockItem> {
    @Override
    public Identifier getModelLocation(PedestalBlockItem object) {
        return new Identifier(ArclightMod.MODID, "geo/pedestal_block.geo.json");
    }

    @Override
    public Identifier getTextureLocation(PedestalBlockItem object) {
        return new Identifier(ArclightMod.MODID, "textures/machines/pedestal_block.png");
    }

    @Override
    public Identifier getAnimationFileLocation(PedestalBlockItem animatable) {
        return null; //new Identifier(ArclightMod.MODID, "animations/...");
    }

}