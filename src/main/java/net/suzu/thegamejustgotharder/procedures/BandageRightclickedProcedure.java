package net.suzu.thegamejustgotharder.procedures;

import net.suzu.thegamejustgotharder.init.TheGameJustGotHarderModMobEffects;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class BandageRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheGameJustGotHarderModMobEffects.BLEEDING.get()) : false) {
			(itemstack).setCount((int) ((itemstack).getCount() - 1));
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(TheGameJustGotHarderModMobEffects.BLEEDING.get());
		}
	}
}
