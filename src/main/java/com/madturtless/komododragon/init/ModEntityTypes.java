package com.madturtless.komododragon.init;

import com.madturtless.komododragon.KomodoDragon;
import com.madturtless.komododragon.entities.KomodoDragonEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
	
	public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, KomodoDragon.MOD_ID);
	
	  // Entity Types
	  public static final RegistryObject<EntityType<KomodoDragonEntity>> KOMODODRAGON = ENTITY_TYPES.register("komododragon",
	            () -> EntityType.Builder.create(KomodoDragonEntity::new, EntityClassification.CREATURE)
	                    .size(1.0f, 1.0f)
	                    .build(new ResourceLocation(KomodoDragon.MOD_ID, "komododragon").toString()));
}