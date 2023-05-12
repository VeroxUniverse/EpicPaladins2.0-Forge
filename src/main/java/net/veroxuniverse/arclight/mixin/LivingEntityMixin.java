package net.veroxuniverse.arclight.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.veroxuniverse.arclight.init.ItemsInit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @ModifyVariable(method="tickFallFlying", at=@At("STORE"), ordinal=0)
    private ItemStack checkAngelWing(ItemStack is) {
        if (is.getItem() == ItemsInit.ANGEL_CHESTPLATE) {
            return new ItemStack(Items.ELYTRA);
        }
        return is;
    }
}
