package net.veroxuniverse.arclight.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import net.veroxuniverse.arclight.ArclightMod;

import java.util.List;

@SuppressWarnings("unused")
public class ModPlacedFeatures {

    //OVERWORLD

    public static final RegistryEntry<PlacedFeature> ARCLIGHT_ORE_PLACED = PlacedFeatures.register("arclight_ore_placed", ModConfiguredFeatures.ARCLIGHT_ORE,
                    commonOrePlacement(3, // VeinsPerChunk
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(74), YOffset.aboveBottom(94))));

    public static final RegistryEntry<PlacedFeature> BLOODSTONE_ORE_PLACED = PlacedFeatures.register("bloodstone_ore_placed", ModConfiguredFeatures.BLOODSTONE_ORE,
                    commonOrePlacement(2, // VeinsPerChunk
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(6), YOffset.aboveBottom(30))));

    public static final RegistryEntry<PlacedFeature> CRYORIUM_ORE_PLACED = PlacedFeatures.register("cryorium_ore_placed",ModConfiguredFeatures.CRYORIUM_ORE,
                    commonOrePlacement(2, // VeinsPerChunk
                            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(30), YOffset.aboveBottom(70))));

    //END

    public static final RegistryEntry<PlacedFeature> END_JADE_ORE_PLACED = PlacedFeatures.register("end_jade_ore_placed", ModConfiguredFeatures.END_JADE_ORE, commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(10), YOffset.aboveBottom(140))));

    //NETHER

    public static final RegistryEntry<PlacedFeature> NETHER_MOONLIGHT_ORE_PLACED = PlacedFeatures.register("nether_moonlight_ore_placed", ModConfiguredFeatures.NETHER_MOONLIGHT_ORE, commonOrePlacement(2, // VeinsPerChunk
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(30), YOffset.aboveBottom(80))));





    public static List<PlacementModifier> orePlacement(PlacementModifier veins, PlacementModifier height) {
        return List.of(veins, SquarePlacementModifier.of(), height, BiomePlacementModifier.of());
    }

    public static List<PlacementModifier> commonOrePlacement(int veins, PlacementModifier height) {
        return orePlacement(CountPlacementModifier.of(veins), height);
    }

    public static List<PlacementModifier> rareOrePlacement(int chance, PlacementModifier height) {
        return orePlacement(RarityFilterPlacementModifier.of(chance), height);
    }

    public static void register() {
    }
}
