package me.onethecrazy.onlywaypoints.mixin.client;

import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(GameRenderer.class)
public interface GameRendererAccessor{
    @Invoker("getFov")
    float invokeGetFov(Camera camera, float tickDelta, boolean useFovEffect);
}
