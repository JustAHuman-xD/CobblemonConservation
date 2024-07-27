package me.justahuman.cobblemonconservation.forge;

import me.justahuman.cobblemonconservation.CobblemonConservation;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CobblemonConservation.MOD_ID)
public final class CobblemonConservationForge {
    public CobblemonConservationForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(CobblemonConservation.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        CobblemonConservation.init();
    }
}
