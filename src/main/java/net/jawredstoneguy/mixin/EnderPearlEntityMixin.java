package net.jawredstoneguy.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ThrownEnderpearl.class)
public class EnderPearlEntityMixin
{
    @Redirect(method = "tick",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;isAlive()Z"))
    private boolean isAlive(Entity owner) {
        return true;
    }
}
