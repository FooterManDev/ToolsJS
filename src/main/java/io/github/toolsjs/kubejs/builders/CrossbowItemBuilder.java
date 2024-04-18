package io.github.toolsjs.kubejs.builders;

import com.blakebr0.cucumber.item.tool.BaseCrossbowItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class CrossbowItemBuilder extends HandheldItemBuilder {
    public CrossbowItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }

    @Override
    public Item createObject() {
        return new BaseCrossbowItem(properties -> createItemProperties());
    }
}