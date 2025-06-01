package me.justahuman.cobblemonconservation.forge;

import me.justahuman.cobblemonconservation.CobblemonConservation;
import net.neoforged.fml.common.Mod;

@Mod(CobblemonConservation.MOD_ID)
public final class CobblemonConservationForge {
    public CobblemonConservationForge() {
        CobblemonConservation.init();
    }
}
