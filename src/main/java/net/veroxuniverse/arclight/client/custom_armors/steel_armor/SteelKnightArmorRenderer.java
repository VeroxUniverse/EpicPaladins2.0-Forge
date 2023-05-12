package net.veroxuniverse.arclight.client.custom_armors.steel_armor;


import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.SteelArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SteelKnightArmorRenderer extends ArmorBase<SteelArmorItem> {
    public SteelKnightArmorRenderer() {
        super(new SteelKnightArmorModel());
    }
}
