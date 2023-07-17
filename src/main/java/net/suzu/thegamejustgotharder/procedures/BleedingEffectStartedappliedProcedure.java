package net.suzu.thegamejustgotharder.procedures;

import net.suzu.thegamejustgotharder.init.TheGameJustGotHarderModMobEffects;
import net.suzu.thegamejustgotharder.TheGameJustGotHarderMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class BleedingEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		TheGameJustGotHarderMod.queueServerWork(40, () -> {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheGameJustGotHarderModMobEffects.BLEEDING.get()) : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("bleeding").bypassArmor(), 1);
				BleedingEffectStartedappliedProcedure.execute(world, x, y, z, entity);
			}
		});
	}
}
