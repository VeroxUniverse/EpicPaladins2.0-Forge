package net.veroxuniverse.arclight.block.entities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;
import net.veroxuniverse.arclight.recipe.ModRecipes;
import net.veroxuniverse.arclight.screen.ArmorForgeMenu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ArmorForgeBlockEntity extends BlockEntity implements NamedScreenHandlerFactory {
    private final SimpleInventory itemHandler = new SimpleInventory(4);

    protected final PropertyDelegate data;
    private int progress = 0;
    private int maxProgress = 900;

    public ArmorForgeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ARMOR_BLOCK_ENTIY, pos, state);
        this.data = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> ArmorForgeBlockEntity.this.progress;
                    case 1 -> ArmorForgeBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
                public void set(int index, int value) {
                switch (index) {
                    case 0 -> ArmorForgeBlockEntity.this.progress = value;
                    case 1 -> ArmorForgeBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    public Inventory getInventory() { return this.itemHandler; };

    @Override
    public @NotNull Text getDisplayName() {
        return new LiteralText("Paladin Forge");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int id, @NotNull PlayerInventory inventory, @NotNull PlayerEntity player) {
        return new ArmorForgeMenu(id, inventory, this.itemHandler, this.data);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.put("Items", this.itemHandler.toNbtList());
        nbt.putInt("armor_forge.progress", this.progress);
    }

    @Override
    public void readNbt(@NotNull NbtCompound nbt) {
        super.readNbt(nbt);
        this.itemHandler.readNbtList((NbtList) nbt.get("Items"));
        this.progress = nbt.getInt("armor_forge.progress");
    }

    public void drops(){
        if (this.world == null) return;
        for (int i = 0; i < itemHandler.size(); i++) {
            Block.dropStack(this.world, this.pos, itemHandler.getStack(i));
        }
    }

    public static void tick(World level, BlockPos pos, BlockState state, ArmorForgeBlockEntity pEntity) {
        if (level.isClient) {
            return;
        }

        if (hasRecipe(pEntity)) {
            pEntity.progress++;
            markDirty(level, pos, state);

            if (pEntity.progress >= pEntity.maxProgress) {
                craftItem(pEntity);
            }
        } else {
            pEntity.resetProgress();
            markDirty(level,pos, state);
        }

    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(ArmorForgeBlockEntity pEntity) {

        World level = pEntity.world;

        if (level != null) {
            Optional<ArmorForgeRecipe> recipe = level.getRecipeManager()
                    .getFirstMatch(ArclightMod.ARMOR_FORGE_TYPE, pEntity.getInventory(), level);

            if (hasRecipe(pEntity) && recipe.isPresent()) {
                pEntity.itemHandler.getStack(0).decrement(1);
                pEntity.itemHandler.getStack(1).decrement(1);
                pEntity.itemHandler.getStack(2).decrement(1);
                pEntity.itemHandler.setStack(3, new ItemStack(recipe.get().getOutput().getItem(),
                        pEntity.itemHandler.getStack(3).getCount() + 1));

                pEntity.resetProgress();
            }
        }
    }

    private static boolean hasRecipe(ArmorForgeBlockEntity pEntity) {
        World level = pEntity.world;

        if (level != null) {
            Optional<ArmorForgeRecipe> recipe = level.getRecipeManager()
                    .getFirstMatch(ArclightMod.ARMOR_FORGE_TYPE, pEntity.getInventory(), level);

            return recipe.isPresent() && canInsertAmountIntoOutputSlot(pEntity.getInventory()) &&
                    canInsertIntoOutputSlot(pEntity.getInventory(), recipe.get().getOutput());
        }
        return false;
    }

    private static boolean canInsertIntoOutputSlot(Inventory inventory, ItemStack stack) {
        return inventory.getStack(3).getItem() == stack.getItem() || inventory.getStack(3).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(Inventory inventory) {
        return inventory.getStack(3).getMaxCount() > inventory.getStack(3).getCount();
    }
}
