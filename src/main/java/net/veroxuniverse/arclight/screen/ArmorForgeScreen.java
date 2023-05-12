package net.veroxuniverse.arclight.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.ArclightMod;
import org.jetbrains.annotations.NotNull;

public class ArmorForgeScreen extends AbstractInventoryScreen<ArmorForgeMenu> {
    private static final Identifier TEXTURE =
            new Identifier(ArclightMod.MODID,"textures/gui/armor_forge_gui.png");

    public ArmorForgeScreen(ArmorForgeMenu menu, PlayerInventory inventory, Text component) {
        super(menu, inventory, component);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        this.drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);

        renderProgressArrow(matrices, x, y);
    }

    private void renderProgressArrow(MatrixStack pPoseStack, int x, int y) {
        if (handler.isCrafting()) {
            drawTexture(pPoseStack, x + 105, y + 33, 176, 0, 8, handler.getScaledProgress());
        }
    }

    @Override
    public void render(@NotNull MatrixStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(pPoseStack, mouseX, mouseY);
    }
}
