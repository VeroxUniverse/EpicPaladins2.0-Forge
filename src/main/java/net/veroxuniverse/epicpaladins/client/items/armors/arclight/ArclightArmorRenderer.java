package net.veroxuniverse.epicpaladins.client.items.armors.arclight;

import net.veroxuniverse.epicpaladins.common.items.armorItems.ArclightArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ArclightArmorRenderer extends GeoArmorRenderer<ArclightArmorItem> {
    public ArclightArmorRenderer() {
        super(new ArclightArmorModel());
    }
}
