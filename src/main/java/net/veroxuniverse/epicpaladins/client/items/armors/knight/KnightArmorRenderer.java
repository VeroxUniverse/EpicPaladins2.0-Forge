package net.veroxuniverse.epicpaladins.client.items.armors.knight;

import net.veroxuniverse.epicpaladins.common.items.armorItems.KnightArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class KnightArmorRenderer extends GeoArmorRenderer<KnightArmorItem> {
    public KnightArmorRenderer() {
        super(new KnightArmorModel());
    }
}
