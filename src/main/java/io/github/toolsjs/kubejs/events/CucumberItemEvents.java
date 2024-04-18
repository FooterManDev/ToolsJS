package io.github.toolsjs.kubejs.events;

import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventHandler;
import io.github.toolsjs.item.CucumberItemModificationEventJS;

public interface CucumberItemEvents {
    EventGroup GROUP = EventGroup.of("CucumberItems");

    EventHandler MODIFICATION = GROUP.startup("modification", () -> CucumberItemModificationEventJS.class);
}
