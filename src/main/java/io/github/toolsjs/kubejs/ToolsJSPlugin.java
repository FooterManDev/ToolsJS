package io.github.toolsjs.kubejs;

import dev.architectury.platform.Platform;
import dev.latvian.mods.kubejs.registry.RegistryInfo;
import dev.latvian.mods.kubejs.script.ScriptType;
import io.github.toolsjs.ToolsJS;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import io.github.toolsjs.item.CucumberItemModificationEventJS;
import io.github.toolsjs.kubejs.builders.*;
import io.github.toolsjs.kubejs.builders.cucumber.*;
import io.github.toolsjs.kubejs.builders.exdeorum.CrookItemBuilder;
import io.github.toolsjs.kubejs.builders.exdeorum.ExDeWateringcanItemBuilder;
import io.github.toolsjs.kubejs.builders.exdeorum.HammerItemBuilder;
import io.github.toolsjs.kubejs.builders.sophisticated.BackpackBuilder;
import io.github.toolsjs.kubejs.events.CucumberItemEvents;

@SuppressWarnings("SpellCheckingInspection")
public class ToolsJSPlugin extends KubeJSPlugin {

    @Override
    public void init() {
        if (Platform.isModLoaded("cucumber")) {
            RegistryInfo.ITEM.addType("cucumber:scythe", ScytheItemBuilder.class, ScytheItemBuilder::new);
            RegistryInfo.ITEM.addType("cucumber:crossbow", CrossbowItemBuilder.class, CrossbowItemBuilder::new);
            RegistryInfo.ITEM.addType("cucumber:fishing_rod", FishingrodItemBuilder.class, FishingrodItemBuilder::new);
            RegistryInfo.ITEM.addType("cucumber:paxel", PaxelItemBuilder.class, PaxelItemBuilder::new);
            RegistryInfo.ITEM.addType("cucumber:sickle", SickleItemBuilder.class, SickleItemBuilder::new);
            RegistryInfo.ITEM.addType("cucumber:watering_can", CuWateringcanItemBuilder.class, CuWateringcanItemBuilder::new);
        }
        if (Platform.isModLoaded("exdeorum")) {
            RegistryInfo.ITEM.addType("exdeorum:hammer", HammerItemBuilder.class, HammerItemBuilder::new);
            RegistryInfo.ITEM.addType("exdeorum:crook", CrookItemBuilder.class, CrookItemBuilder::new);
            RegistryInfo.ITEM.addType("exdeorum:watering_can", ExDeWateringcanItemBuilder.class, ExDeWateringcanItemBuilder::new);
        }
        if (Platform.isModLoaded("sophisticatedbackpacks")) {
            RegistryInfo.ITEM.addType("sophisticatedbackpacks:backpack", BackpackBuilder.class, BackpackBuilder::new);
        }
        RegistryInfo.ITEM.addType("horse_armor", HorsearmorItemBuilder.class, HorsearmorItemBuilder::new);
        RegistryInfo.ITEM.addType("shield", ShieldBuilder.class, ShieldBuilder::new);
        ToolsJS.LOGGER.info("This is my KubeJS Plugin!");
    }

    @Override
    public void registerEvents(){
        CucumberItemEvents.GROUP.register();
    }

    @Override
    public void afterInit(){
        CucumberItemEvents.MODIFICATION.post(ScriptType.STARTUP, new CucumberItemModificationEventJS());
    }
}

