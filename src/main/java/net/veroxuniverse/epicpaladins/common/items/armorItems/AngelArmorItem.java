package net.veroxuniverse.epicpaladins.common.items.armorItems;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.*;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.veroxuniverse.epicpaladins.client.items.armors.angel.AngelArmorModel;
import net.veroxuniverse.epicpaladins.client.items.armors.angel.AngelArmorRenderer;
import net.veroxuniverse.epicpaladins.client.items.armors.arclight.ArclightArmorModel;
import net.veroxuniverse.epicpaladins.client.items.armors.arclight.ArclightArmorRenderer;
import net.veroxuniverse.epicpaladins.common.items.armorItems.geckolib.PaladinArmorItem;
import net.veroxuniverse.epicpaladins.common.registries.ItemsRegistry;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;
import java.util.Set;

public class AngelArmorItem extends PaladinArmorItem implements  GeoItem {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);


    public AngelArmorItem(Holder<ArmorMaterial> material, ArmorItem.Type slot, Item.Properties properties) {
        super(material, slot, properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new AngelArmorRenderer(new AngelArmorModel());
    }

    @Override
    public boolean canElytraFly(ItemStack stack, LivingEntity entity) {
        return true;
    }

    @Override
    public boolean elytraFlightTick(ItemStack stack, LivingEntity entity, int flightTicks) {
        if (!entity.level().isClientSide && flightTicks % 10 == 0) {
            stack.hurtAndBreak(1, entity, null);
        }
        return true;
    }


    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, 20, state -> {
            state.setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));

            Entity entity = state.getData(DataTickets.ENTITY);

            if (entity instanceof ArmorStand) {
                return PlayState.CONTINUE;
            }

            if (entity instanceof LivingEntity livingEntity) {
                Set<Item> wornArmor = new ObjectOpenHashSet<>();

                wornArmor.add(livingEntity.getItemBySlot(EquipmentSlot.HEAD).getItem());
                wornArmor.add(livingEntity.getItemBySlot(EquipmentSlot.CHEST).getItem());
                wornArmor.add(livingEntity.getItemBySlot(EquipmentSlot.LEGS).getItem());
                wornArmor.add(livingEntity.getItemBySlot(EquipmentSlot.FEET).getItem());

                boolean isFullSet = wornArmor.containsAll(ObjectArrayList.of(
                        ItemsRegistry.ANGEL_HELMET.get(),
                        ItemsRegistry.ANGEL_CHESTPLATE.get(),
                        ItemsRegistry.ANGEL_LEGGINGS.get(),
                        ItemsRegistry.ANGEL_BOOTS.get()
                ));

                return isFullSet ? PlayState.CONTINUE : PlayState.STOP;
            }

            return PlayState.STOP;
        }));
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if (Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("angelarmor.chestplate").withStyle(ChatFormatting.AQUA));
        } else {
            tooltipComponents.add(Component.translatable("angelarmor.tooltip").withStyle(ChatFormatting.DARK_GRAY));
        }
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
//    @Override
//    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
//        return ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "textures/armor/angel_armor_textures.png").toString();
//    }
////    @Override
////    public ResourceLocation getCapeResourceLocation() {
////        return ResourceLocation.fromNamespaceAndPath(EpicPaladinsMod.MOD_ID, "textures/armor/angel_armor_textures.png");
////    }

}
