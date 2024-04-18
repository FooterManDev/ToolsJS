package io.github.toolsjs.kubejs;

import dev.architectury.platform.Platform;
import dev.latvian.mods.kubejs.registry.RegistryInfo;
import io.github.toolsjs.ToolsJS;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import io.github.toolsjs.kubejs.builders.*;
import io.github.toolsjs.kubejs.builders.sophisticated.BackpackBuilder;

@SuppressWarnings("SpellCheckingInspection")
public class ToolsJSPlugin extends KubeJSPlugin {

    @Override
    public void init() {
        if (Platform.isModLoaded("cucumber")) {
            RegistryInfo.ITEM.addType("scythe", ScytheItemBuilder.class, ScytheItemBuilder::new);
            RegistryInfo.ITEM.addType("crossbow", CrossbowItemBuilder.class, CrossbowItemBuilder::new);
            RegistryInfo.ITEM.addType("fishingrod", FishingrodItemBuilder.class, FishingrodItemBuilder::new);
            RegistryInfo.ITEM.addType("paxel", PaxelItemBuilder.class, PaxelItemBuilder::new);
            RegistryInfo.ITEM.addType("sickle", SickleItemBuilder.class, SickleItemBuilder::new);
            RegistryInfo.ITEM.addType("wateringcan", WateringcanItemBuilder.class, WateringcanItemBuilder::new);
        }

        if (Platform.isModLoaded("sophisticatedbackpacks")) {
            RegistryInfo.ITEM.addType("sophisticated_backpack", BackpackBuilder.class, BackpackBuilder::new);
        }
        RegistryInfo.ITEM.addType("horse_armor", HorsearmorItemBuilder.class, HorsearmorItemBuilder::new);
        RegistryInfo.ITEM.addType("shield", ShieldBuilder.class, ShieldBuilder::new);
        ToolsJS.LOGGER.info("This is my KubeJS Plugin!");
    }
}

