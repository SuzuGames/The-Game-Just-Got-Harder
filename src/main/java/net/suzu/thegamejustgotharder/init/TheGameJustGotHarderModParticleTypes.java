
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thegamejustgotharder.init;

import net.suzu.thegamejustgotharder.TheGameJustGotHarderMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class TheGameJustGotHarderModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TheGameJustGotHarderMod.MODID);
	public static final RegistryObject<SimpleParticleType> BLOOD = REGISTRY.register("blood", () -> new SimpleParticleType(false));
}
