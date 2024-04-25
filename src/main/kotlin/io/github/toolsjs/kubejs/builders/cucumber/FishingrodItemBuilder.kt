package io.github.toolsjs.kubejs.builders.cucumber

import com.blakebr0.cucumber.item.tool.BaseFishingRodItem
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item

class FishingrodItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0.5f, -2f) {
    override fun createObject(): Item {
        return BaseFishingRodItem { properties: Item.Properties? -> createItemProperties() }
    }
}