package net.veroxuniverse.arclight.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.init.BlocksInit;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    //OVERWORLD

    public static final List<OreFeatureConfig.Target> OVERWORLD_ARCLIGHT_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, BlocksInit.ARCLIGHT_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_ARCLIGHT_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_BLOODSTONE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, BlocksInit.BLOODSTONE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_BLOODSTONE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_CRYORIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, BlocksInit.CRYORIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_CRYORIUM_ORE.getDefaultState()));

    //END

    public static final List<OreFeatureConfig.Target> END_JADE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), BlocksInit.JADE_ORE.getDefaultState()));

    //NETHER

    public static final List<OreFeatureConfig.Target> NETHER_MOONLIGHT_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, BlocksInit.MOONLIGHT_ORE.getDefaultState()));


    //SPECIFY ORES

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ARCLIGHT_ORE = ConfiguredFeatures.register("arclight_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ARCLIGHT_ORES,9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYORIUM_ORE = ConfiguredFeatures.register("cryorium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_CRYORIUM_ORES,9));
    
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BLOODSTONE_ORE = ConfiguredFeatures.register("bloodstone_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_BLOODSTONE_ORES,9));
    
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_JADE_ORE = ConfiguredFeatures.register("end_jade_ore", Feature.ORE, new OreFeatureConfig(END_JADE_ORES,9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_MOONLIGHT_ORE = ConfiguredFeatures.register("nether_moonlight_ore", Feature.ORE, new OreFeatureConfig(NETHER_MOONLIGHT_ORES,9));

    public static void register() {
    }
}