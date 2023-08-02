package net.veroxuniverse.epicpaladins.client.items.armors.cryorium;

import net.veroxuniverse.epicpaladins.common.items.armorItems.CryoriumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CryoriumArmorRenderer extends GeoArmorRenderer<CryoriumArmorItem> {
    public CryoriumArmorRenderer() {
        super(new CryoriumArmorModel());
    }
}
