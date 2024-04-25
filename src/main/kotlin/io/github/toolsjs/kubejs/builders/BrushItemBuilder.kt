package io.github.toolsjs.kubejs.builders

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BrushItem
import net.minecraft.world.item.Item

class BrushItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0.5f, -2f) {
    override fun createObject(): Item {
        return BrushItem(createItemProperties())
    }
}

