package net.veroxuniverse.arclight.client.custom_armors.arclight_armor;

import net.veroxuniverse.arclight.item.ArclightArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ArclightArmorRenderer extends GeoArmorRenderer<ArclightArmorItem> {
    public ArclightArmorRenderer() {
        super(new ArclightArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorLeftArm";
        this.leftArmBone = "armorRightArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoots";
        this.leftBootBone = "armorRightBoots";

    }
}
