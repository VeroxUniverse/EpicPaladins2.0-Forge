package net.veroxuniverse.epicpaladins.client.items.armors.bloodstone;

import net.veroxuniverse.epicpaladins.common.items.armorItems.BloodstoneArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BloodstoneArmorRenderer extends GeoArmorRenderer<BloodstoneArmorItem> {
    public BloodstoneArmorRenderer() {
        super(new BloodstoneArmorModel());
    }
}
