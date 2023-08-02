package net.veroxuniverse.epicpaladins.client.items.armors.sculk;

import net.veroxuniverse.epicpaladins.common.items.armorItems.SculkArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SculkArmorRenderer extends GeoArmorRenderer<SculkArmorItem> {
    public SculkArmorRenderer() {
        super(new SculkArmorModel());
    }
}
