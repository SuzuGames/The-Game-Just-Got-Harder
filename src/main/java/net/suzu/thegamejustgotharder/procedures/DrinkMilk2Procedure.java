package net.suzu.thegamejustgotharder.procedures;

import net.suzu.thegamejustgotharder.init.TheGameJustGotHarderModMobEffects;
import net.suzu.thegamejustgotharder.TheGameJustGotHarderMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DrinkMilk2Procedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getItem());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		execute(null, world, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		TheGameJustGotHarderMod.queueServerWork(15, () -> {
			if (itemstack.getItem() == Items.MILK_BUCKET) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal((entity.getPersistentData().getDouble("infection_milk") + " " + entity.getPersistentData().getDouble("bleeding_milk"))), false);
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(TheGameJustGotHarderModMobEffects.INFECTION.get(), (int) entity.getPersistentData().getDouble("infection_milk"), 0, true, true));
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(TheGameJustGotHarderModMobEffects.BLEEDING.get(), (int) entity.getPersistentData().getDouble("bleeding_milk"), 0, true, true));
			}
		});
	}
}
