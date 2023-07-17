
package net.suzu.thegamejustgotharder.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class InfectionMobEffect extends MobEffect {
	public InfectionMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_game_just_got_harder.infection";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
