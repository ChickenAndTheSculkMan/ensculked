package com.sculkman.ensculked;

import com.sculkman.ensculked.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class EnsculkedModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.EBONY_STAR_PROJECTILE, FlyingItemEntityRenderer::new);
    }
}
