package net.veroxuniverse.arclight.client.custom_armors.sculk_armor;

import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.SculkArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SculkArmorRenderer extends ArmorBase<SculkArmorItem> {
    public SculkArmorRenderer() {
        super(new SculkArmorModel());
    }
}
