package com.madturtless.komododragon;

import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.madturtless.komododragon.entities.KomodoDragonEntity;
import com.madturtless.komododragon.init.ModEntityTypes;


@Mod("komododragon")
public class KomodoDragon
{
   
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "komodo";

    public KomodoDragon() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

	@SuppressWarnings("deprecation")
	private void setup(final FMLCommonSetupEvent event) {
		DeferredWorkQueue.runLater(() -> {
			GlobalEntityTypeAttributes.put(ModEntityTypes.KOMODODRAGON.get(), KomodoDragonEntity.setCustomAttributes().create());
		});
    }

    private void doClientStuff(final FMLClientSetupEvent event) {}
    
}