package io.github.toolsjs.kubejs.builders

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.InteractionHand
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level


// uhh doesnt work unless player is specifically on 1 health
// not really sure how we can implement but this might be useful?
import net.minecraft.world.item.Items.TOTEM_OF_UNDYING
// https://github.com/HyperPigeon/MoreTotemsOfUndying/blob/1c92779dfd45920469e10183e10d710b4189168d/common/src/main/java/net/hyper_pigeon/moretotems/mixin/LivingEntityMixin.java#L291
class CustomTotem(properties: Properties) : Item(properties) {
    override fun inventoryTick(stack: ItemStack, world: Level, entity: Entity, itemSlot: Int, isSelected: Boolean) {
        if (entity is Player) {
            val player = entity as Player
            if (player.health <= 1.0f && !world.isClientSide) {
                if (player.getItemInHand(InteractionHand.MAIN_HAND) == stack || player.getItemInHand(InteractionHand.OFF_HAND) == stack) {
                    player.health = 1.0f // Set player's health to full
                    player.addEffect(MobEffectInstance(MobEffects.REGENERATION, 400, 1)) // Apply regeneration effect
                    stack.shrink(1) // Reduce the stack size by 1
                }
            }
        }
    }
}

class TotemItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0f, 0f) {
    override fun createObject(): Item {
        return CustomTotem(createItemProperties())
    }
}