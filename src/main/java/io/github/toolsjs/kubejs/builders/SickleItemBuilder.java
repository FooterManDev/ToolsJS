package io.github.toolsjs.kubejs.builders;

import com.blakebr0.cucumber.item.tool.BaseSickleItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class SickleItemBuilder extends HandheldItemBuilder {

    private int range = 3;
    public SickleItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }
    @Info(value = "The range of the sickles grass breaking capabilities")
    public SickleItemBuilder range(int range) {
        this.range = range;
        return this;
    }

    @Override
    public Item createObject() {
        return new BaseSickleItem(toolTier,range,properties -> createItemProperties());
    }
}