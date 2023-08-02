package net.veroxuniverse.epicpaladins.client.items.armors.moonlight;

import net.veroxuniverse.epicpaladins.common.items.armorItems.MoonlightArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MoonlightArmorRenderer extends GeoArmorRenderer<MoonlightArmorItem> {
    public MoonlightArmorRenderer() {
        super(new MoonlightArmorModel());
    }
}
