package me.justahuman.cobblemonconservation.mixin;

import com.cobblemon.mod.common.entity.pokemon.CobblemonAgingDespawner;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CobblemonAgingDespawner.class)
public class AgingDespawnerMixin<T extends Entity> {
    @Inject(at = @At("HEAD"), method = "shouldDespawn", cancellable = true, remap = false)
    public void shouldDespawn(T entity, CallbackInfoReturnable<Boolean> cir) {
        if (entity instanceof PokemonEntity pokemonEntity) {
            Pokemon pokemon = pokemonEntity.getPokemon();
            if (pokemon.getShiny() || pokemon.isLegendary() || pokemon.isMythical() || pokemon.isUltraBeast()) {
                cir.setReturnValue(false);
            }
        }
    }
}
