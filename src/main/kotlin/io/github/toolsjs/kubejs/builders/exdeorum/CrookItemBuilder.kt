package io.github.toolsjs.kubejs.builders.exdeorum

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import dev.latvian.mods.kubejs.typings.Info
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import thedarkcolour.exdeorum.item.CrookItem

class CrookItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0.5f, 0.5f) {
    private var breakingSpeed: Float = 2F
    @Info(value = "The speed of the crooks breaking capabilities")
    fun breakingSpeed(breakingSpeed: Float): CrookItemBuilder {
        this.breakingSpeed = breakingSpeed
        return this
    }
    override fun createObject(): Item {
        return CrookItem(createItemProperties(), breakingSpeed)
    }
}
