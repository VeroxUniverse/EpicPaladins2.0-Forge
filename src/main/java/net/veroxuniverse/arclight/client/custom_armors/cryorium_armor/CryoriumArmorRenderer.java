package net.veroxuniverse.arclight.client.custom_armors.cryorium_armor;

import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.CryoArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CryoriumArmorRenderer extends ArmorBase<CryoArmorItem> {
    public CryoriumArmorRenderer() {
        super(new CryoriumArmorModel());
    }
}
