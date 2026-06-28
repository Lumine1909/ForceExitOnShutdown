package io.github.lumine1909.feos;

import net.fabricmc.api.ModInitializer;

public class ForceExitOnShutdown implements ModInitializer {

    @Override
    public void onInitialize() {
        System.out.println("[ForceExitOnShutdown] Initializing");
    }

    public static void shutdown() {
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }

            System.exit(0);
        }, "Force Shutdown").start();
    }
}