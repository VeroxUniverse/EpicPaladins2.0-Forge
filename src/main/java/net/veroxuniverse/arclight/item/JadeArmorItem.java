package net.veroxuniverse.arclight.item;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.veroxuniverse.arclight.init.ArmorMaterialsInit;
import net.veroxuniverse.arclight.util.ArmorUtils;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.Map;
import java.util.Set;

import static net.veroxuniverse.arclight.util.ArmorUtils.*;

public class JadeArmorItem extends GeckoArmorItem implements IAnimatable {
    private final AnimationFactory FACTORY = GeckoLibUtil.createFactory(this);

    private static final Set<StatusEffectInstance> EFFECT_SET =
            (new ImmutableSet.Builder<StatusEffectInstance>())
                    .add(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0, false, false))
                    .add(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200, 4, false, false)).build();

    public JadeArmorItem(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<>(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.FACTORY;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        //event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        return PlayState.STOP;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity player, int slot, boolean selected) {
        if(!world.isClient) {
            ArmorUtils.applyIfHasFullSet(player, this.type, EFFECT_SET);
        }
    }
}