package io.github.toolsjs.kubejs.builders.cucumber;

import com.blakebr0.cucumber.item.tool.BaseScytheItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ScytheItemBuilder extends HandheldItemBuilder {

    public ScytheItemBuilder(ResourceLocation i) {
        super(i,0f , -2f);
    }
    private int range = 3;
    @Info(value = "The range of the scythes sweeping attacks")
    public ScytheItemBuilder range(int range) {
        this.range = range;
        return this;
    }

    @Override
    public Item createObject() {
        return new BaseScytheItem(toolTier, range, properties -> createItemProperties());
    }
}