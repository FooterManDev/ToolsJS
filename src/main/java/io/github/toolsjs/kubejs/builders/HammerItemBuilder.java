package io.github.toolsjs.kubejs.builders;

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import thedarkcolour.exdeorum.item.HammerItem;


public class HammerItemBuilder extends HandheldItemBuilder {
    public HammerItemBuilder(ResourceLocation i) {
        super(i, 0.5F, 0.5F);
    }

    @Override
    public Item createObject() {
        return new HammerItem(toolTier, createItemProperties());
    }
}
