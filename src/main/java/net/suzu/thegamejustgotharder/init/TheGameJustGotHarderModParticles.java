
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thegamejustgotharder.init;

import net.suzu.thegamejustgotharder.client.particle.BloodParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheGameJustGotHarderModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(TheGameJustGotHarderModParticleTypes.BLOOD.get(), BloodParticle::provider);
	}
}
