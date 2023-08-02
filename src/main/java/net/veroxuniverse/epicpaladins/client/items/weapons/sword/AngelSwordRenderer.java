package net.veroxuniverse.epicpaladins.client.items.weapons.sword;

import net.veroxuniverse.epicpaladins.common.items.weapons.AngelSwordItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AngelSwordRenderer extends GeoItemRenderer<AngelSwordItem> {
    public AngelSwordRenderer() {
        super(new AngelSwordModel());
    }
}
