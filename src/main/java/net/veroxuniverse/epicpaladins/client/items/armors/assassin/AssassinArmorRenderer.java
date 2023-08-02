package net.veroxuniverse.epicpaladins.client.items.armors.assassin;

import net.veroxuniverse.epicpaladins.common.items.armorItems.AssassinArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AssassinArmorRenderer extends GeoArmorRenderer<AssassinArmorItem> {
    public AssassinArmorRenderer() {
        super(new AssassinArmorModel());
    }
}
