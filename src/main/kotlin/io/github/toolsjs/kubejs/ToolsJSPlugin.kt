package io.github.toolsjs.kubejs

import dev.latvian.mods.kubejs.plugin.KubeJSPlugin
import dev.latvian.mods.kubejs.registry.BuilderTypeRegistry
import io.github.toolsjs.kubejs.builders.BrushItemBuilder
import io.github.toolsjs.kubejs.builders.HorseArmorItemBuilder
import io.github.toolsjs.kubejs.builders.ShieldItemBuilder
import net.minecraft.core.registries.Registries

class ToolsJSPlugin : KubeJSPlugin
{
    override fun registerBuilderTypes(registry: BuilderTypeRegistry?) {
        registry?.of(Registries.ITEM) {reg ->
            // Horse Armor currently returns Null. Do not use.
            reg.add("horse_armor", HorseArmorItemBuilder::class.java, ::HorseArmorItemBuilder)

            reg.add("shield", ShieldItemBuilder::class.java, ::ShieldItemBuilder)
            reg.add("brush", BrushItemBuilder::class.java, ::BrushItemBuilder)
        }
    }
}