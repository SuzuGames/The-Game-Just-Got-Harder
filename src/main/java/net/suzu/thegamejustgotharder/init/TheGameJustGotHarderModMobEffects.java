
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thegamejustgotharder.init;

import net.suzu.thegamejustgotharder.potion.InfectionMobEffect;
import net.suzu.thegamejustgotharder.potion.BleedingMobEffect;
import net.suzu.thegamejustgotharder.TheGameJustGotHarderMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class TheGameJustGotHarderModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TheGameJustGotHarderMod.MODID);
	public static final RegistryObject<MobEffect> INFECTION = REGISTRY.register("infection", () -> new InfectionMobEffect());
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
}
