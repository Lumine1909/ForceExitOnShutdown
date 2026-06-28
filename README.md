# ForceExitOnShutdown

Fix minecraft crash on shutdown due to watchdog killing non-daemon thread by adding System.exit(0)

Minecraft do not execute `System.exit(0);` on exit anymore, so all the mods that do not clean up non-daemon executors by themselves will prevent the minecraft from fully close. Then the watchdog will kill minecraft and generate a crash.

This mod is used to fix this problem, by adding force exit as older version (26.2-) did.

> [!CAUTION]
> 
> This may cause problem, since I don't know why mojang eventually remove that exit code.
> USE AT YOUR OWN RISK!