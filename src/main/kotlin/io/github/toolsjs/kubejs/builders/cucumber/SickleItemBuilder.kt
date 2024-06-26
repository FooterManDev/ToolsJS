package io.github.toolsjs.kubejs.builders.cucumber

import com.blakebr0.cucumber.item.tool.BaseSickleItem
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import dev.latvian.mods.kubejs.typings.Info
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item

class SickleItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0.5f, -2f) {
    private var breakingRange = 3
    @Info(value = "The range of the sickles grass breaking capabilities")
    fun breakingRange(breakingRange: Int): SickleItemBuilder {
        this.breakingRange = breakingRange
        return this
    }

    override fun createObject(): Item {
        return BaseSickleItem(toolTier, breakingRange) { properties: Item.Properties? -> createItemProperties() }
    }
}