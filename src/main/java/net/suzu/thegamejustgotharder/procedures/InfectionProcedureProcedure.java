package net.suzu.thegamejustgotharder.procedures;

import net.suzu.thegamejustgotharder.init.TheGameJustGotHarderModMobEffects;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.Difficulty;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InfectionProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheGameJustGotHarderModMobEffects.INFECTION.get()) : false)) {
			if (entity instanceof Player && (sourceentity instanceof Zombie || sourceentity instanceof ZombieVillager || sourceentity instanceof Husk || sourceentity instanceof Drowned)) {
				if (world.getDifficulty() == Difficulty.EASY) {
					if (Mth.nextInt(RandomSource.create(), 1, 100) <= 10) {
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(TheGameJustGotHarderModMobEffects.INFECTION.get(), 6000, 0, true, true));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					}
				}
				if (world.getDifficulty() == Difficulty.NORMAL) {
					if (Mth.nextInt(RandomSource.create(), 1, 100) <= 25) {
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(TheGameJustGotHarderModMobEffects.INFECTION.get(), 6000, 0, true, true));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					}
				}
				if (world.getDifficulty() == Difficulty.HARD) {
					if (Mth.nextInt(RandomSource.create(), 1, 100) <= 50) {
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(TheGameJustGotHarderModMobEffects.INFECTION.get(), 6000, 0, true, true));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
					}
				}
			}
		}
	}
}
