package io.github.lumine1909.feos.mixin;

import io.github.lumine1909.feos.ForceExitOnShutdown;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Inject(method = "close", at = @At("TAIL"))
    private void forceExit(CallbackInfo ci) {
        ForceExitOnShutdown.shutdown();
    }
}
