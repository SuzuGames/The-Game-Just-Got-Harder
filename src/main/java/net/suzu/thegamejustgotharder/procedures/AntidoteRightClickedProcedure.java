package net.suzu.thegamejustgotharder.procedures;

import net.suzu.thegamejustgotharder.init.TheGameJustGotHarderModMobEffects;
import net.suzu.thegamejustgotharder.init.TheGameJustGotHarderModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AntidoteRightClickedProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == TheGameJustGotHarderModItems.ANTIDOTE.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(TheGameJustGotHarderModMobEffects.INFECTION.get());
		}
	}
}
