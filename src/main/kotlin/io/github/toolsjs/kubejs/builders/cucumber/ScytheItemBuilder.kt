package io.github.toolsjs.kubejs.builders.cucumber

import com.blakebr0.cucumber.item.tool.BaseScytheItem
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import dev.latvian.mods.kubejs.typings.Info
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item

class ScytheItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0f, -2f) {
    private var range = 3
    @Info(value = "The range of the scythes sweeping attacks")
    fun range(range: Int): ScytheItemBuilder {
        this.range = range
        return this
    }

    override fun createObject(): Item {
        return BaseScytheItem(toolTier, range) { properties: Item.Properties? -> createItemProperties() }
    }
}