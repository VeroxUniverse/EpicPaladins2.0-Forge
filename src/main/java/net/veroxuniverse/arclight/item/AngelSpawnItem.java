package net.veroxuniverse.arclight.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.veroxuniverse.arclight.entity.ModEntityTypes;
import net.veroxuniverse.arclight.entity.custom.AngelEntity;
import net.veroxuniverse.arclight.init.BlocksInit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AngelSpawnItem extends Item {
    public AngelSpawnItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        Block blockBelow = null;
        if (!pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();

            for (int i = 0; i <= positionClicked.getY() + 2; i++) {
                blockBelow = pContext.getLevel().getBlockState(positionClicked.below(i)).getBlock();

                if (isValuableBlock(blockBelow)) {
                    Level level = pContext.getLevel();
                    AngelEntity spawnAngel = ModEntityTypes.ANGEL.get().create(level);
                    if (spawnAngel != null) {
                        spawnAngel.setPos(positionClicked.getX(), positionClicked.getY() + 15, positionClicked.getZ());
                        level.addFreshEntity(spawnAngel);
                    }
                    break;
                }
            }
        }

        if (isValuableBlock(blockBelow) && pContext.getPlayer() != null) {
            pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));
        }

        return super.useOn(pContext);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> components, @NotNull TooltipFlag flag) {
        if(Screen.hasShiftDown()) {
            components.add(Component.literal("Right click on Deepslate Pedestal to summon the Boss!").withStyle(ChatFormatting.DARK_PURPLE));
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.DARK_GRAY));
        }

        super.appendHoverText(stack, level, components, flag);
    }

    private boolean isValuableBlock(Block block) {
        return block == BlocksInit.PEDESTAL_BLOCK.get();
    }
}