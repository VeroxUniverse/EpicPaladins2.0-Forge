package net.veroxuniverse.epicpaladins;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.veroxuniverse.epicpaladins.common.registries.BlocksRegistry;
import net.veroxuniverse.epicpaladins.common.registries.ItemsRegistry;
import net.veroxuniverse.epicpaladins.common.registries.creativeTabs.CreativeTabRegistry;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;


@Mod(EpicPaladinsMod.MOD_ID)
public class EpicPaladinsMod {
    public static final  String MOD_ID = "epicpaladins";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EpicPaladinsMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GeckoLib.initialize();

        ItemsRegistry.register(modEventBus);
        BlocksRegistry.register(modEventBus);
        CreativeTabRegistry.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){

        }
    }

}
