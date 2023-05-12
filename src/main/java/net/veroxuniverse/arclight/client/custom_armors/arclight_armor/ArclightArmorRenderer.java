package net.veroxuniverse.arclight.client.custom_armors.arclight_armor;

import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.ArclightArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ArclightArmorRenderer extends ArmorBase<ArclightArmorItem> {
    public ArclightArmorRenderer() {
        super(new ArclightArmorModel());
    }
}
