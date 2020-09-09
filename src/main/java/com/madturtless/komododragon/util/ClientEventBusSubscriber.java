package com.madturtless.komododragon.util;

import com.madturtless.komododragon.KomodoDragon;
import com.madturtless.komododragon.client.render.KomodoDragonRenderer;
import com.madturtless.komododragon.init.ModEntityTypes;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = KomodoDragon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.KOMODODRAGON.get(), KomodoDragonRenderer::new);
	}
}