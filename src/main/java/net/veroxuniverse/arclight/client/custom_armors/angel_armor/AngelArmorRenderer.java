package net.veroxuniverse.arclight.client.custom_armors.angel_armor;

import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.AngelWingItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AngelArmorRenderer extends ArmorBase<AngelWingItem> {
    public AngelArmorRenderer() {
        super(new AngelArmorModel());
    }
}
