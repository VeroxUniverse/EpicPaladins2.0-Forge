package net.veroxuniverse.epicpaladins.common.items.armorItems;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.veroxuniverse.epicpaladins.client.items.armors.sculk.SculkArmorModel;
import net.veroxuniverse.epicpaladins.client.items.armors.sculk.SculkArmorRenderer;
import net.veroxuniverse.epicpaladins.common.items.armorItems.geckolib.PaladinArmorItem;

import net.veroxuniverse.epicpaladins.common.registries.ItemsRegistry;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.List;


public class SculkArmorItem extends PaladinArmorItem {
    public SculkArmorItem(Holder<ArmorMaterial> pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new SculkArmorRenderer(new SculkArmorModel());
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        // Ensure the entity is a player
        if (!level.isClientSide() && entity instanceof Player player) {
            if (player.getInventory().getArmor(EquipmentSlot.HEAD.getIndex()).is(ItemsRegistry.SCULK_HELMET.get())) {
                if (player.hasEffect(MobEffects.BLINDNESS)) player.removeEffect(MobEffects.BLINDNESS);
                if (player.hasEffect(MobEffects.DARKNESS)) player.removeEffect(MobEffects.DARKNESS);
            }

            if (player.getInventory().getArmor(EquipmentSlot.LEGS.getIndex()).is(ItemsRegistry.SCULK_LEGGINGS.get())) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 25, 0, true, false, false));
            }
        }
    }
    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if (stack.is(ItemsRegistry.SCULK_HELMET.get())) {
            tooltipComponents.add(Component.translatable("tooltip.epicpaladins.sculk_helmet")
                    .withStyle(ChatFormatting.LIGHT_PURPLE));
        }
        if (stack.is(ItemsRegistry.SCULK_LEGGINGS.get())) {
            tooltipComponents.add(Component.translatable("tooltip.epicpaladins.sculk_leggings")
                    .withStyle(ChatFormatting.LIGHT_PURPLE));
        }
    }
}