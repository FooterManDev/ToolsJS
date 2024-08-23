package io.github.toolsjs.kubejs.builders

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item

class HorseArmorItemBuilder(id: ResourceLocation) :
    HandheldItemBuilder(id, 0.5f, -2f)
{
    private var armor = 0
    private var model: ResourceLocation? = null

    fun armor(i: Int) : HorseArmorItemBuilder {
        this.armor = i
        return this
    }

    fun model(modelRL: ResourceLocation) : HorseArmorItemBuilder {
        this.model = modelRL
        return this
    }

    //Override f createObject() when ready to continue.
}