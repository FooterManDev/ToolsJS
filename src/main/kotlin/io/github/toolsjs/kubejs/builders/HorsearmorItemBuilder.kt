package io.github.toolsjs.kubejs.builders

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import dev.latvian.mods.kubejs.typings.Info
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.HorseArmorItem
import net.minecraft.world.item.Item

class HorsearmorItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0.5f, -2f) {
    private var armor = 0
    private var model: ResourceLocation? = null


    @Info(value = "The amount of armor you would like the horse armor to provide to a horse when equipped")
    fun armor(armor: Int): HorsearmorItemBuilder {
        this.armor = armor
        return this
    }

    @Info(value = "The location of the horse armor model texture")
    fun model(model: ResourceLocation): HorsearmorItemBuilder {
        this.model = model
        return this
    }

    override fun createObject(): Item {
        return HorseArmorItem(armor, model, createItemProperties())
    }
}