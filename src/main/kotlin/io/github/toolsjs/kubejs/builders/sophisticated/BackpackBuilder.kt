package io.github.toolsjs.kubejs.builders.sophisticated

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.p3pp3rf1y.sophisticatedbackpacks.backpack.BackpackBlock
import net.p3pp3rf1y.sophisticatedbackpacks.backpack.BackpackItem
import net.p3pp3rf1y.sophisticatedbackpacks.common.gui.BackpackContainer
import java.util.function.IntSupplier
import java.util.function.Supplier

class BackpackBuilder(i: ResourceLocation?) : HandheldItemBuilder(i, 0f, 0f) {
    private var slots: IntSupplier = IntSupplier { 29 }
    private var upgradeSlots: IntSupplier = IntSupplier { 1 }
    private var block: Supplier<BackpackBlock> = Supplier { BackpackBlock() }
    override fun createObject(): Item {
        return BackpackItem(slots, upgradeSlots, block)
    }

    fun setSlots(slots: Int): BackpackBuilder {
        this.slots = IntSupplier { slots }
        return this
    }

    fun setUpgradeSlots(upgradeSlots: Int): BackpackBuilder {
        this.upgradeSlots = IntSupplier { upgradeSlots }
        return this
    }
}
