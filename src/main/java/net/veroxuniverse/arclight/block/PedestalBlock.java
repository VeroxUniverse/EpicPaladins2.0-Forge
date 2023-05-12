package net.veroxuniverse.arclight.block;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.veroxuniverse.arclight.block.entities.ModBlockEntities;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PedestalBlock extends BlockWithEntity {
    public PedestalBlock(Settings properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(@NotNull BlockPos pPos, @NotNull BlockState pState) {
        return ModBlockEntities.PEDESTAL_BLOCK_ENTITY.instantiate(pPos, pState);
    }

    @Override
    public @NotNull BlockRenderType getRenderType(@NotNull BlockState pState) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }
}
