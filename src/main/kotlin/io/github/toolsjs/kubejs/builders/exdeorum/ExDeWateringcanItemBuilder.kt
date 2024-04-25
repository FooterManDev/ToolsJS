package io.github.toolsjs.kubejs.builders.exdeorum

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import dev.latvian.mods.kubejs.typings.Info
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import thedarkcolour.exdeorum.item.WateringCanItem

class ExDeWateringcanItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0.5f, -2f) {
    private var capacity = 1000
    @Info(value = "The capacity of the watering can in millibuckets")
    fun capacity(capacity: Int): ExDeWateringcanItemBuilder {
        this.capacity = capacity
        return this
    }

    override fun createObject(): Item {
        return WateringCanItem(capacity, createItemProperties())
    }
}
