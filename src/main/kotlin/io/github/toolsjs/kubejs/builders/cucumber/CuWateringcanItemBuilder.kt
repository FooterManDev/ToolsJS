package io.github.toolsjs.kubejs.builders.cucumber

import com.blakebr0.cucumber.item.BaseWateringCanItem
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import dev.latvian.mods.kubejs.typings.Info
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item

class CuWateringcanItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0.5f, -2f) {
    private var wateringChance: Double = 1.0
    private var wateringRange = 1

    @Info(value = "The range of farmland the watering can can water around the center")
    fun wateringRange(wateringRange: Int): CuWateringcanItemBuilder {
        this.wateringRange = wateringRange
        return this
    }

    @Info(value = "The chance that the watering can bonemeals a crop per each use")
    fun wateringChance(wateringChance: Double): CuWateringcanItemBuilder {
        this.wateringChance = wateringChance
        return this
    }

    override fun createObject(): Item {
        return BaseWateringCanItem(wateringRange, wateringChance)
    }
}