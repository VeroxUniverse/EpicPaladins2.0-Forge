package net.veroxuniverse.arclight.util;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.veroxuniverse.arclight.ArclightMod;
import net.veroxuniverse.arclight.entity.ModEntityTypes;
import net.veroxuniverse.arclight.entity.custom.AngelEntity;

@Mod.EventBusSubscriber(modid = ArclightMod.MODID)
public class ModUtils {

    @Mod.EventBusSubscriber(modid = ArclightMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.ANGEL.get(), AngelEntity.setAttributes());
        }
    }
}
