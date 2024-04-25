package io.github.toolsjs.mixin.accessors

import com.blakebr0.cucumber.item.tool.*
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Mutable
import org.spongepowered.asm.mixin.gen.Accessor

@Mixin(
    value = [BaseAxeItem::class, BaseHoeItem::class, BasePickaxeItem::class, BaseShovelItem::class, BaseSwordItem::class, BaseScytheItem::class, BaseSickleItem::class],
    remap = false
)
interface CucumberAttackDamageAccessor {
    @Mutable
    @Accessor("attackDamage")
    fun `kjs_ccmbr$setAttackDamage`(dmg: Float)
}
