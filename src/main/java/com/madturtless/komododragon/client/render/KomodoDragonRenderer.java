package com.madturtless.komododragon.client.render;

import com.madturtless.komododragon.KomodoDragon;
import com.madturtless.komododragon.client.model.KomodoDragonModel;
import com.madturtless.komododragon.entities.KomodoDragonEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class KomodoDragonRenderer extends MobRenderer<KomodoDragonEntity, KomodoDragonModel<KomodoDragonEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(KomodoDragon.MOD_ID, "textures/entity/komododragon.png");

	public KomodoDragonRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new KomodoDragonModel<>(), 1.0F);
	}

	@Override
	public ResourceLocation getEntityTexture(KomodoDragonEntity entity) {
		return TEXTURE;
	}
}
