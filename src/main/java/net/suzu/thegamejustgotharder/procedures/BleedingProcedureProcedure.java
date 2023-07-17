package net.suzu.thegamejustgotharder.procedures;

import net.suzu.thegamejustgotharder.init.TheGameJustGotHarderModMobEffects;
import net.suzu.thegamejustgotharder.TheGameJustGotHarderMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.Difficulty;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BleedingProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheGameJustGotHarderModMobEffects.BLEEDING.get()) : false)) {
			if (entity instanceof Player) {
				entity.getPersistentData().putDouble("bleeding_random", (Mth.nextInt(RandomSource.create(), 1, 100)));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("" + entity.getPersistentData().getDouble("bleeding_random"))), false);
				if (world.getDifficulty() == Difficulty.EASY) {
					if (entity.getPersistentData().getDouble("bleeding_random") <= 30) {
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(TheGameJustGotHarderModMobEffects.BLEEDING.get(), 400, 0));
					} else {
						TheGameJustGotHarderMod.queueServerWork(5, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(TheGameJustGotHarderModMobEffects.BLEEDING.get());
						});
					}
				}
				if (world.getDifficulty() == Difficulty.NORMAL) {
					if (entity.getPersistentData().getDouble("bleeding_random") <= 60) {
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(TheGameJustGotHarderModMobEffects.BLEEDING.get(), 400, 0));
					} else {
						TheGameJustGotHarderMod.queueServerWork(5, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(TheGameJustGotHarderModMobEffects.BLEEDING.get());
						});
					}
				}
				if (world.getDifficulty() == Difficulty.HARD) {
					if (entity.getPersistentData().getDouble("bleeding_random") <= 90) {
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(TheGameJustGotHarderModMobEffects.BLEEDING.get(), 400, 0));
					} else {
						TheGameJustGotHarderMod.queueServerWork(5, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(TheGameJustGotHarderModMobEffects.BLEEDING.get());
						});
					}
				}
			}
		}
	}
}
