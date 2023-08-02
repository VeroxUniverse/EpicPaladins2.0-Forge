package net.veroxuniverse.epicpaladins.client.items.weapons.battleaxe;

import net.veroxuniverse.epicpaladins.common.items.weapons.CryoriumAxeItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class CryoriumAxeRenderer extends GeoItemRenderer<CryoriumAxeItem> {
    public CryoriumAxeRenderer() {
        super(new CryoriumAxeModel());
    }
}
