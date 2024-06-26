package io.github.toolsjs.mixin.accessors

import com.blakebr0.cucumber.item.BaseWateringCanItem
import com.blakebr0.cucumber.item.tool.BaseScytheItem
import com.blakebr0.cucumber.item.tool.BaseSickleItem
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Mutable
import org.spongepowered.asm.mixin.gen.Accessor

@Mixin(value = [BaseScytheItem::class, BaseSickleItem::class, BaseWateringCanItem::class], remap = false)
interface CucumberRangeAccessor {
    @Accessor("range")
    fun `kjs_ccmbr$getRange`(): Int

    @Mutable
    @Accessor("range")
    fun `kjs_ccmbr$setRange`(range: Int)
}
