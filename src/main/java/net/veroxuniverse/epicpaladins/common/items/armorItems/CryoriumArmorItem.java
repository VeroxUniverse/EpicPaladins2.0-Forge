package net.veroxuniverse.epicpaladins.common.items.armorItems;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.veroxuniverse.epicpaladins.client.items.armors.angelic.AngelArmorRenderer;
import net.veroxuniverse.epicpaladins.client.items.armors.cryorium.CryoriumArmorRenderer;
import net.veroxuniverse.epicpaladins.common.items.armorItems.geckolib.PaladinArmorItem;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class CryoriumArmorItem extends PaladinArmorItem {

    public CryoriumArmorItem(ArmorMaterial armorMaterial, Type type, Properties properties) {
        super(armorMaterial, type, properties);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {

            private CryoriumArmorRenderer renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                   EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null)
                    this.renderer = new CryoriumArmorRenderer();

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        });
    }
}