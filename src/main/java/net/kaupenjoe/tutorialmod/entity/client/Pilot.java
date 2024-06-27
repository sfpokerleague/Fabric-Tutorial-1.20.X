// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.kaupenjoe.tutorialmod.entity.client;

import net.kaupenjoe.tutorialmod.entity.custom.PilotEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class Pilot<T extends PilotEntity> extends SinglePartEntityModel<T> {
	private final ModelPart body;
	private final ModelPart rightarm;
	private final ModelPart head;
	private final ModelPart leftarm;
	private final ModelPart bb_main;
	public Pilot(ModelPart root) {
		this.body = root.getChild("body");
		this.rightarm = root.getChild("rightarm");
		this.head = root.getChild("head");
		this.leftarm = root.getChild("leftarm");
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(26, 28).cuboid(-3.0F, 3.1F, -3.0F, 6.0F, 7.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(-4.0F, -4.9F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 11.9F, 0.0F));

		ModelPartData rightarm = body.addChild("rightarm", ModelPartBuilder.create().uv(0, 0).cuboid(-1.5F, -1.75F, -1.5F, 3.0F, 9.0F, 3.0F, new Dilation(0.0F))
		.uv(27, 51).cuboid(-1.0F, -4.25F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.5F, -3.15F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(32, 18).cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.9F, 0.0F));

		ModelPartData leftarm = body.addChild("leftarm", ModelPartBuilder.create().uv(27, 51).cuboid(-1.0F, -4.25F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 34).cuboid(-1.5F, -1.75F, -1.5F, 3.0F, 9.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(5.5F, -3.15F, 0.0F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -2.0F, -8.0F, 16.0F, 2.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}