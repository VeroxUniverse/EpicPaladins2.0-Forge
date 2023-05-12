package net.veroxuniverse.arclight.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.veroxuniverse.arclight.init.ArmorMaterialsInit;
import net.veroxuniverse.arclight.init.ItemsInit;
import net.veroxuniverse.arclight.util.ArmorUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    @ModifyVariable(method="checkFallFlying", at=@At("STORE"), ordinal=0)
    private ItemStack checkAngelWing(ItemStack is) {
        if (is.getItem() == ItemsInit.ANGEL_CHESTPLATE) {
            return new ItemStack(Items.ELYTRA);
        }
        return is;
    }
}
