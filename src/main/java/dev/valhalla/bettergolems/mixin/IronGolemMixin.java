package dev.valhalla.bettergolems.mixin;

import dev.valhalla.bettergolems.BetterGolems;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(IronGolemEntity.class)
public abstract class IronGolemMixin extends GolemEntity implements Angerable {

	protected IronGolemMixin(EntityType<? extends GolemEntity> entityType, World world) {
		super(entityType, world);
	}

	@Inject(at = @At("HEAD"), method = "initGoals")
	private void initGoals(CallbackInfo info) {

		BetterGolems.LOGGER.info("This line is printed by an example mod mixin!");
	}

}
