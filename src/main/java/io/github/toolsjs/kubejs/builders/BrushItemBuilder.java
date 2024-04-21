package io.github.toolsjs.kubejs.builders;

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BrushItem;
import net.minecraft.world.item.Item;

public class BrushItemBuilder extends HandheldItemBuilder {

    public BrushItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }

    @Override
    public Item createObject() {
        return new BrushItem(createItemProperties());
    }
}

