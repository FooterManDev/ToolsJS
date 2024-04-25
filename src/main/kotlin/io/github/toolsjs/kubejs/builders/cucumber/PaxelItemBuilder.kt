package io.github.toolsjs.kubejs.builders.cucumber

import com.blakebr0.cucumber.item.tool.BasePaxelItem
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import java.util.function.IntSupplier

// tysm to https://github.com/FooterMan15/PaxelJS
class PaxelItemBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0.5f, -2f) {
    override fun createObject(): Item {
        return BasePaxelItem(toolTier) { properties: Item.Properties? -> createItemProperties() }
    }
}