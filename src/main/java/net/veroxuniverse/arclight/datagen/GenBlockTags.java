package net.veroxuniverse.arclight.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.veroxuniverse.arclight.init.BlocksInit;

public class GenBlockTags implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(BlockTagGenerator::new);
    }

    private static class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {

        public BlockTagGenerator(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
            getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "ores")))
                    .add(BlocksInit.ARCLIGHT_ORE).add(BlocksInit.BLOODSTONE_ORE).add(BlocksInit.CRYORIUM_ORE)
                    .add(BlocksInit.DEEPSLATE_ARCLIGHT_ORE).add(BlocksInit.DEEPSLATE_BLOODSTONE_ORE)
                    .add(BlocksInit.DEEPSLATE_CRYORIUM_ORE).add(BlocksInit.JADE_ORE).add(BlocksInit.MOONLIGHT_ORE);
        }
    }
}
