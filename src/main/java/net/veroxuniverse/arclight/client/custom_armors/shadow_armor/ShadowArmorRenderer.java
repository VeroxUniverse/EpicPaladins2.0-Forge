package net.veroxuniverse.arclight.client.custom_armors.shadow_armor;

import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.ShadowArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ShadowArmorRenderer extends ArmorBase<ShadowArmorItem> {
    public ShadowArmorRenderer() {
        super(new ShadowArmorModel());
    }
}
