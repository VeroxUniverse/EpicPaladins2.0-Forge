package net.veroxuniverse.arclight.screen;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.world.World;
import net.veroxuniverse.arclight.block.entities.ArmorForgeBlockEntity;
import org.jetbrains.annotations.NotNull;

public class ArmorForgeMenu extends ScreenHandler {
    public final Inventory blockEntity;
    private final World level;
    private final PropertyDelegate data;

    public ArmorForgeMenu(int id, PlayerInventory inv) {
        this(id, inv, new SimpleInventory(4), new ArrayPropertyDelegate(2));
    }

    public ArmorForgeMenu(int id, PlayerInventory inv, Inventory entity, PropertyDelegate data) {
        super(ModMenuTypes.ARMOR_FORGE_MENU, id);
        blockEntity = entity;
        this.level = inv.player.world;
        this.data = data;
        this.addProperties(data);

        this.addSlot(new Slot(entity, 0, 86, 15));
        this.addSlot(new Slot(entity, 1, 48, 20));
        this.addSlot(new Slot(entity, 2, 48, 40));
        this.addSlot(new Slot(entity, 3, 86, 60) {
            public boolean canInsert(ItemStack stack) {
                return false;
            }
        });

        addPlayerInventory(inv);
        addPlayerHotbar(inv);
    }

    public boolean isCrafting() {
        return data.get(0) != 0;
    }

    public int getScaledProgress() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);  // Max Progress
        int progressArrowSize = 26; // This is the height in pixels of your arrow

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.blockEntity.size()) {
                if (!this.insertItem(originalStack, this.blockEntity.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.blockEntity.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public boolean canUse(@NotNull PlayerEntity player) {
        return this.blockEntity.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 86 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 144));
        }
    }

}
