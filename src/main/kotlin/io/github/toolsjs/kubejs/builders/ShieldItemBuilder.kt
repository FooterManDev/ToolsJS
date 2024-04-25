package io.github.toolsjs.kubejs.builders

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.minecraft.world.item.ShieldItem

class ShieldItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0f, 0f) {
    override fun createObject(): Item {
        return ShieldItem(createItemProperties())
    }
}
