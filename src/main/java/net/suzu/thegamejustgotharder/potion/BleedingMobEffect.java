
package net.suzu.thegamejustgotharder.potion;

import net.suzu.thegamejustgotharder.procedures.BleedingEffectStartedappliedProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BleedingMobEffect extends MobEffect {
	public BleedingMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_game_just_got_harder.bleeding";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		BleedingEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
