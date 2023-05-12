package net.veroxuniverse.arclight.client.custom_armors.moonlight_armor;

import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.MoonlightArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MoonlightArmorRenderer extends ArmorBase<MoonlightArmorItem> {
    public MoonlightArmorRenderer() {
        super(new MoonlightArmorModel());
    }
}
