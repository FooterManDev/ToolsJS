package io.github.toolsjs.kubejs.builders.exdeorum

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import thedarkcolour.exdeorum.item.HammerItem

class HammerItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0.5f, 0.5f) {
    override fun createObject(): Item {
        return HammerItem(toolTier, createItemProperties())
    }
}
