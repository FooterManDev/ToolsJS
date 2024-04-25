package io.github.toolsjs.mixin.accessors

import com.blakebr0.cucumber.item.BaseWateringCanItem
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Mutable
import org.spongepowered.asm.mixin.gen.Accessor

@Mixin(value = [BaseWateringCanItem::class], remap = false)
interface CucumberChanceAccessor {
    @Accessor("chance")
    fun `kjs_ccmbr$getChance`(): Double

    @Mutable
    @Accessor("chance")
    fun `kjs_ccmbr$setChance`(chance: Double)
}
