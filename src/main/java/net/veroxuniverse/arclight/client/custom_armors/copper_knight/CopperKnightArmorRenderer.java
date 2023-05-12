package net.veroxuniverse.arclight.client.custom_armors.copper_knight;


import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.CopperArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CopperKnightArmorRenderer extends ArmorBase<CopperArmorItem> {
    public CopperKnightArmorRenderer() {
        super(new CopperKnightArmorModel());
    }
}
