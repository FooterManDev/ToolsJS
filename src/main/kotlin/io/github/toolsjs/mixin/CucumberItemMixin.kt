package io.github.toolsjs.mixin

import com.blakebr0.cucumber.item.BaseWateringCanItem
import com.blakebr0.cucumber.item.tool.*
import io.github.toolsjs.item.CucumberItem
import org.spongepowered.asm.mixin.Mixin

@Mixin(
    value = [BaseAxeItem::class, BaseHoeItem::class, BasePickaxeItem::class, BaseShovelItem::class, BaseScytheItem::class, BaseSickleItem::class, BaseSwordItem::class, BaseWateringCanItem::class, BasePaxelItem::class],
    remap = false
)
abstract class CucumberItemMixin : CucumberItem
