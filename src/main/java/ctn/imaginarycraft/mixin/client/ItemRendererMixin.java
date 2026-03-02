package ctn.imaginarycraft.mixin.client;

import net.minecraft.client.renderer.entity.ItemRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
//  @WrapOperation(method = "renderStatic(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;ZLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/world/level/Level;III)V",
//    at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/ItemRenderer;render(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;ZLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;IILnet/minecraft/client/resources/model/BakedModel;)V"))
//  private void renderStatic(
//    ItemRenderer instance,
//    ItemStack itemStack,
//    ItemDisplayContext diplayContext,
//    boolean leftHand,
//    PoseStack poseStack,
//    MultiBufferSource bufferSource,
//    int combinedLight,
//    int combinedOverlay,
//    BakedModel bakedmodel,
//    Operation<Void> original,
//    @Local(type = LivingEntity.class, argsOnly = true) LivingEntity livingEntity,
//    @Share(value = "sourceLivingEntity", namespace = "imaginarycraft") LocalRef<LivingEntity> sourceLivingEntity
//  ) {
//    sourceLivingEntity.set(livingEntity);
//    original.call(instance, itemStack, diplayContext, leftHand, poseStack, bufferSource, combinedLight, combinedOverlay, bakedmodel);
//  }
//
//  @WrapOperation(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/BlockEntityWithoutLevelRenderer;renderByItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;II)V"))
//  private void render(
//    BlockEntityWithoutLevelRenderer instance,
//    ItemStack itemStack,
//    ItemDisplayContext displayContext,
//    PoseStack poseStack,
//    MultiBufferSource bufferSource,
//    int combinedLight,
//    int combinedOverlay,
//    Operation<Void> original,
//    @Share(value = "sourceLivingEntity", namespace = "imaginarycraft") LocalRef<LivingEntity> sourceLivingEntity
//  ) {
//    System.out.println(sourceLivingEntity.get());
//    original.call(instance, itemStack, displayContext, poseStack, bufferSource, combinedLight, combinedOverlay);
//  }
}
