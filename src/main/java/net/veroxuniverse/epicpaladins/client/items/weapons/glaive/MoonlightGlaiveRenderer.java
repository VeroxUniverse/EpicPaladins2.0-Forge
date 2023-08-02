package net.veroxuniverse.epicpaladins.client.items.weapons.glaive;

import net.veroxuniverse.epicpaladins.common.items.weapons.MoonlightGlaiveItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MoonlightGlaiveRenderer extends GeoItemRenderer<MoonlightGlaiveItem> {
    public MoonlightGlaiveRenderer() {
        super(new MoonlightGlaiveModel());
    }
}
