package io.github.toolsjs.kubejs.builders.sophisticated

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.p3pp3rf1y.sophisticatedbackpacks.backpack.BackpackBlock
import net.p3pp3rf1y.sophisticatedbackpacks.backpack.BackpackItem
import java.util.function.IntSupplier
import java.util.function.Supplier

class BackpackBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0f, 0f) {
    var slots: IntSupplier = IntSupplier { 29 }
    var upgrade_slots: IntSupplier = IntSupplier { 1 }
    var block: Supplier<BackpackBlock> = Supplier { BackpackBlock() }
    override fun createObject(): Item {
        return BackpackItem(slots, upgrade_slots, block)
    }

    fun setSlots(slots: Int): BackpackBuilder {
        this.slots = IntSupplier { slots }
        return this
    }

    fun setUpgradeSlots(upgrade_slots: Int): BackpackBuilder {
        this.upgrade_slots = IntSupplier { upgrade_slots }
        return this
    }
}
