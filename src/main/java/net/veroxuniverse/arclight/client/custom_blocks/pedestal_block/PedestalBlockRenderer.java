package net.veroxuniverse.arclight.client.custom_blocks.pedestal_block;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.veroxuniverse.arclight.block.entities.PedestalBlockEntity;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import javax.annotation.Nullable;

public class PedestalBlockRenderer extends GeoBlockRenderer<PedestalBlockEntity> {
    public PedestalBlockRenderer(BlockEntityRendererFactory.Context rendererDispatcherIn) {
        super(new PedestalBlockModel());
    }

    @Override
    public RenderLayer getRenderType(PedestalBlockEntity animatable, float partialTicks, MatrixStack stack,
                                     @Nullable VertexConsumerProvider renderTypeBuffer, @Nullable VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }
}