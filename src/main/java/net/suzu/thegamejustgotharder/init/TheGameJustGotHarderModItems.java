
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.suzu.thegamejustgotharder.init;

import net.suzu.thegamejustgotharder.item.BandageItem;
import net.suzu.thegamejustgotharder.item.AntidoteItem;
import net.suzu.thegamejustgotharder.TheGameJustGotHarderMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class TheGameJustGotHarderModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheGameJustGotHarderMod.MODID);
	public static final RegistryObject<Item> BANDAGE = REGISTRY.register("bandage", () -> new BandageItem());
	public static final RegistryObject<Item> ANTIDOTE = REGISTRY.register("antidote", () -> new AntidoteItem());
}
