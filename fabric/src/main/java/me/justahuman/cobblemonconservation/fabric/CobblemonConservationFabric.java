package me.justahuman.cobblemonconservation.fabric;

import me.justahuman.cobblemonconservation.CobblemonConservation;
import net.fabricmc.api.DedicatedServerModInitializer;

public final class CobblemonConservationFabric implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        CobblemonConservation.init();
    }
}
