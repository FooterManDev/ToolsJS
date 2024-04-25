package io.github.toolsjs.kubejs.events

import dev.latvian.mods.kubejs.event.EventGroup
import dev.latvian.mods.kubejs.event.EventHandler
import io.github.toolsjs.item.CucumberItemModificationEventJS

interface CucumberItemEvents {
    companion object {
        val GROUP: EventGroup = EventGroup.of("CucumberItems")

        val MODIFICATION: EventHandler = GROUP.startup("modification") { CucumberItemModificationEventJS::class.java }
    }
}
