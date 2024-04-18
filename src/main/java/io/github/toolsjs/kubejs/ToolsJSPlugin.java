package io.github.toolsjs.kubejs;

import io.github.toolsjs.ToolsJS;
import dev.latvian.mods.kubejs.KubeJSPlugin;

public class ToolsJSPlugin extends KubeJSPlugin {

    @Override
    public void init() {
        ToolsJS.LOGGER.info("This is my KubeJS Plugin!");
    }
}

