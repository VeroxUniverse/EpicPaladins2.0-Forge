package net.veroxuniverse.arclight;

import net.fabricmc.api.ModInitializer;
import java.util.logging.Logger;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.veroxuniverse.arclight.init.BlocksInit;
import net.veroxuniverse.arclight.init.ItemsInit;
import net.veroxuniverse.arclight.recipe.ArmorForgeRecipe;
import net.veroxuniverse.arclight.world.feature.ModConfiguredFeatures;
import net.veroxuniverse.arclight.world.feature.ModPlacedFeatures;
import software.bernie.geckolib3.GeckoLib;


public class ArclightMod implements ModInitializer {
    public static final String MODID = "arclight";
    private static final Logger LOGGER = Logger.getLogger(MODID);
    public static final RecipeType<ArmorForgeRecipe> ARMOR_FORGE_TYPE =
            Registry.register(Registry.RECIPE_TYPE, new Identifier(ArclightMod.MODID, "armor_forging"), ArmorForgeRecipe.Type.INSTANCE);

    public static final RecipeSerializer<ArmorForgeRecipe> ARMOR_FORGE_SERIALIZER =
            Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(ArclightMod.MODID, "armor_forging"), ArmorForgeRecipe.Serializer.INSTANCE);

    public void onInitialize() {
        ItemsInit.register();
        GeckoLib.initialize();
        ModConfiguredFeatures.register();
        ModPlacedFeatures.register();
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ARCLIGHT_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BLOODSTONE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CRYORIUM_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_JADE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_MOONLIGHT_ORE_PLACED.getKey().get());

    }
}
