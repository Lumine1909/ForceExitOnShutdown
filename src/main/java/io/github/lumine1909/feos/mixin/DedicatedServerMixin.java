package io.github.lumine1909.feos.mixin;

import io.github.lumine1909.feos.ForceExitOnShutdown;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.server.dedicated.DedicatedServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.SERVER)
@Mixin(DedicatedServer.class)
public class DedicatedServerMixin {

    @Inject(method = "onServerExit", at = @At("TAIL"))
    private void onServerExit(CallbackInfo ci) {
        ForceExitOnShutdown.shutdown();
    }
}
