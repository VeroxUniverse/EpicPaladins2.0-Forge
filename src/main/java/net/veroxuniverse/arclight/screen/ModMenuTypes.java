package net.veroxuniverse.arclight.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;

public class ModMenuTypes {

    public static final ScreenHandlerType<ArmorForgeMenu> ARMOR_FORGE_MENU =
            ScreenHandlerRegistry.registerSimple(new Identifier(ArclightMod.MODID, "armor_forge_menu"), ArmorForgeMenu::new);

}