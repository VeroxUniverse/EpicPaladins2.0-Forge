package net.veroxuniverse.epicpaladins.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;

@Mod.EventBusSubscriber(modid = EpicPaladinsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EpicPaladinsClientMod {

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {

    }

}
