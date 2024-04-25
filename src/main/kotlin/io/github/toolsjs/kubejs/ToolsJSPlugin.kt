package io.github.toolsjs.kubejs

import dev.architectury.platform.Platform
import dev.latvian.mods.kubejs.KubeJSPlugin
import dev.latvian.mods.kubejs.registry.RegistryInfo
import dev.latvian.mods.kubejs.script.ScriptType
import io.github.toolsjs.ToolsJS
import io.github.toolsjs.item.CucumberItemModificationEventJS
import io.github.toolsjs.kubejs.builders.BrushItemBuilder
import io.github.toolsjs.kubejs.builders.HorsearmorItemBuilder
import io.github.toolsjs.kubejs.builders.ShieldItemBuilder
import io.github.toolsjs.kubejs.builders.cucumber.*
import io.github.toolsjs.kubejs.builders.exdeorum.CrookItemBuilder
import io.github.toolsjs.kubejs.builders.exdeorum.ExDeWateringcanItemBuilder
import io.github.toolsjs.kubejs.builders.exdeorum.HammerItemBuilder
import io.github.toolsjs.kubejs.builders.sophisticated.BackpackBuilder
import io.github.toolsjs.kubejs.events.CucumberItemEvents
import net.minecraft.resources.ResourceLocation

@Suppress("SpellCheckingInspection")
class ToolsJSPlugin : KubeJSPlugin() {
    override fun init() {
        if (Platform.isModLoaded("cucumber")) {
            RegistryInfo.ITEM.addType("cucumber:scythe", ScytheItemBuilder::class.java) { i: ResourceLocation? -> ScytheItemBuilder(i) }
            RegistryInfo.ITEM.addType("cucumber:crossbow", CrossbowItemBuilder::class.java) { i: ResourceLocation? -> CrossbowItemBuilder(i) }
            RegistryInfo.ITEM.addType("cucumber:fishing_rod", FishingrodItemBuilder::class.java) { i: ResourceLocation? -> FishingrodItemBuilder(i) }
            RegistryInfo.ITEM.addType("cucumber:paxel", PaxelItemBuilder::class.java) { i: ResourceLocation? -> PaxelItemBuilder(i) }
            RegistryInfo.ITEM.addType("cucumber:sickle", SickleItemBuilder::class.java) { i: ResourceLocation? -> SickleItemBuilder(i) }
            RegistryInfo.ITEM.addType("cucumber:watering_can", CuWateringcanItemBuilder::class.java) { i: ResourceLocation? -> CuWateringcanItemBuilder(i) }
        }
        if (Platform.isModLoaded("exdeorum")) {
            RegistryInfo.ITEM.addType("exdeorum:hammer", HammerItemBuilder::class.java) { i: ResourceLocation? -> HammerItemBuilder(i) }
            RegistryInfo.ITEM.addType("exdeorum:crook", CrookItemBuilder::class.java) { i: ResourceLocation? -> CrookItemBuilder(i) }
            RegistryInfo.ITEM.addType("exdeorum:watering_can", ExDeWateringcanItemBuilder::class.java) { i: ResourceLocation? -> ExDeWateringcanItemBuilder(i) }
        }
        if (Platform.isModLoaded("sophisticatedbackpacks")) {
            RegistryInfo.ITEM.addType("sophisticatedbackpacks:backpack", BackpackBuilder::class.java) { i: ResourceLocation? -> BackpackBuilder(i) }
        }
        RegistryInfo.ITEM.addType("horse_armor", HorsearmorItemBuilder::class.java) { i: ResourceLocation? -> HorsearmorItemBuilder(i) }
        RegistryInfo.ITEM.addType("shield", ShieldItemBuilder::class.java) { i: ResourceLocation? -> ShieldItemBuilder(i) }
        RegistryInfo.ITEM.addType("brush", BrushItemBuilder::class.java) { i: ResourceLocation? -> BrushItemBuilder(i) }
        ToolsJS.LOGGER.info("ToolsJS Loaded Successfully! Happy tooling!")
    }

    override fun registerEvents() {
        CucumberItemEvents.Companion.GROUP.register()
    }

    override fun afterInit() {
        CucumberItemEvents.Companion.MODIFICATION.post(ScriptType.STARTUP, CucumberItemModificationEventJS())
    }
}

