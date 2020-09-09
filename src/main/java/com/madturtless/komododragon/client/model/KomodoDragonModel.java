package com.madturtless.komododragon.client.model;

import com.madturtless.komododragon.entities.KomodoDragonEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class KomodoDragonModel <T extends KomodoDragonEntity> extends EntityModel<T> {
	
	private ModelRenderer head;
	private ModelRenderer body;
	private ModelRenderer tail;
	private ModelRenderer legFrontLeft;
	private ModelRenderer legFrontRight;
	private ModelRenderer legBackLeft;
	private ModelRenderer legBackRight;

	public void custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, 13.4F, 5.8F);
		head.setTextureOffset(0, 21).addBox(-2.5F, -3.4F, 0.2F, 6.0F, 5.0F, 9.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(3.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-7.0F, -11.0F, -7.0F, 8.0F, 7.0F, 14.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 15.6F, -11.0F);
		tail.setTextureOffset(22, 27).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 4.0F, 8.0F, 0.0F, false);

		legFrontLeft = new ModelRenderer(this);
		legFrontLeft.setRotationPoint(-2.0F, 17.0F, 3.0F);
		legFrontLeft.setTextureOffset(30, 0).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		legFrontRight = new ModelRenderer(this);
		legFrontRight.setRotationPoint(3.0F, 17.0F, 4.0F);
		legFrontRight.setTextureOffset(30, 0).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		legBackLeft = new ModelRenderer(this);
		legBackLeft.setRotationPoint(-3.0F, 17.0F, -5.0F);
		legBackLeft.setTextureOffset(30, 0).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		legBackRight = new ModelRenderer(this);
		legBackRight.setRotationPoint(3.0F, 17.0F, -4.0F);
		legBackRight.setTextureOffset(30, 0).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		legFrontLeft.render(matrixStack, buffer, packedLight, packedOverlay);
		legFrontRight.render(matrixStack, buffer, packedLight, packedOverlay);
		legBackLeft.render(matrixStack, buffer, packedLight, packedOverlay);
		legBackRight.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	 @Override
	    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
	        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
	        this.body.rotateAngleX = ((float)Math.PI / 2F);
	        this.legBackRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	        this.legBackLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	        this.legFrontRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	        this.legFrontLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	    }
}