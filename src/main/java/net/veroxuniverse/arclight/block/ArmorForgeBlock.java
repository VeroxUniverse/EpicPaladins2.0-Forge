package net.veroxuniverse.arclight.block;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.veroxuniverse.arclight.block.entities.ArmorForgeBlockEntity;
import net.veroxuniverse.arclight.block.entities.ModBlockEntities;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ArmorForgeBlock extends BlockWithEntity {
    public ArmorForgeBlock(Settings properties) {
        super(properties);
    }

    @Override
    public void onStateReplaced(BlockState pState, @NotNull World pLevel, @NotNull BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()){
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof ArmorForgeBlockEntity) {
                ((ArmorForgeBlockEntity) blockEntity).drops();
            }
        }

        super.onStateReplaced(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Override
    public @NotNull BlockRenderType getRenderType(@NotNull BlockState pState) {
        return BlockRenderType.MODEL;
    }

    @Override
    public @NotNull ActionResult onUse(@NotNull BlockState pState, World pLevel, @NotNull BlockPos pPos, @NotNull PlayerEntity pPlayer, @NotNull Hand pHand, @NotNull BlockHitResult pHit) {
        if (!pLevel.isClient) {
            NamedScreenHandlerFactory factory = pState.createScreenHandlerFactory(pLevel, pPos);
            if (factory != null) {
                pPlayer.openHandledScreen(factory);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new ArmorForgeBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.ARMOR_BLOCK_ENTIY, (world1, pos, state1, be) -> ArmorForgeBlockEntity.tick(world1, pos, state1, be));
    }
}
