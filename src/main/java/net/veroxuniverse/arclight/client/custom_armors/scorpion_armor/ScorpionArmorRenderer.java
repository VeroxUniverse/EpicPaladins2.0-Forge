package net.veroxuniverse.arclight.client.custom_armors.scorpion_armor;

import net.veroxuniverse.arclight.client.custom_armors.ArmorBase;
import net.veroxuniverse.arclight.item.BloodstoneArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ScorpionArmorRenderer extends ArmorBase<BloodstoneArmorItem> {
    public ScorpionArmorRenderer() {
        super(new ScorpionArmorModel());
    }
}
