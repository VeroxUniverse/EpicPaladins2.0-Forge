package net.veroxuniverse.arclight.block.entities;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;

@SuppressWarnings("ConstantConditions")
public class ModBlockEntities {

    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ArclightMod.MODID, "pedestal_block_entity"),
                    FabricBlockEntityTypeBuilder.create(PedestalBlockEntity::new,
                            BlocksInit.PEDESTAL_BLOCK).build());

    public static final BlockEntityType<ArmorForgeBlockEntity> ARMOR_BLOCK_ENTIY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ArclightMod.MODID, "armor_block_entity"),
                    FabricBlockEntityTypeBuilder.create(ArmorForgeBlockEntity::new,
                            BlocksInit.ARMOR_FORGE).build());
}
