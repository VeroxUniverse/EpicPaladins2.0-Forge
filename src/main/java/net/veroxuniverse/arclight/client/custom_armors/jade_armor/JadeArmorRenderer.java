package net.veroxuniverse.arclight.client.custom_armors.jade_armor;
import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.JadeArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class JadeArmorRenderer extends ArmorBase<JadeArmorItem> {
    public JadeArmorRenderer() {
        super(new JadeArmorModel());
    }
}
