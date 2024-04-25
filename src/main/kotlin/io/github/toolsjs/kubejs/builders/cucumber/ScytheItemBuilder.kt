package io.github.toolsjs.kubejs.builders.cucumber

import com.blakebr0.cucumber.item.tool.BaseScytheItem
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import dev.latvian.mods.kubejs.typings.Info
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item

class ScytheItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0f, -2f) {
    private var breakingRange = 3
    @Info(value = "The range of the scythes sweeping attacks")
    fun breakingRange(breakingRange: Int): ScytheItemBuilder {
        this.breakingRange = breakingRange
        return this
    }

    override fun createObject(): Item {
        return BaseScytheItem(toolTier, breakingRange) { properties: Item.Properties? -> createItemProperties() }
    }
}