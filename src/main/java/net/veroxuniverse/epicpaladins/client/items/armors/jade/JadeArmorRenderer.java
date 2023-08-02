package net.veroxuniverse.epicpaladins.client.items.armors.jade;

import net.veroxuniverse.epicpaladins.common.items.armorItems.JadeArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class JadeArmorRenderer extends GeoArmorRenderer<JadeArmorItem> {
    public JadeArmorRenderer() {
        super(new JadeArmorModel());
    }
}
