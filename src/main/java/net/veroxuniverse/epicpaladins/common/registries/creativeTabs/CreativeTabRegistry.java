package net.veroxuniverse.epicpaladins.common.registries.creativeTabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.veroxuniverse.epicpaladins.EpicPaladinsMod;
import net.veroxuniverse.epicpaladins.common.registries.ItemsRegistry;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicPaladinsMod.MOD_ID);

    @SuppressWarnings("unused")
    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_TABS.register(
            EpicPaladinsMod.MOD_ID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + EpicPaladinsMod.MOD_ID))
                    .icon(() -> new ItemStack(ItemsRegistry.ARCLIGHT_GEM.get()))
                    .displayItems((displayParameters, output) -> {
                        for (RegistryObject<Item> item : ItemsRegistry.ITEMS.getEntries())
                            output.accept(item.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
