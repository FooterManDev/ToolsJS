package io.github.toolsjs.kubejs.builders.exdeorum;

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import thedarkcolour.exdeorum.item.WateringCanItem;

public class ExDeWateringcanItemBuilder extends HandheldItemBuilder {
    public ExDeWateringcanItemBuilder(ResourceLocation i) {
        super(i,0.5f, -2f );
    }

    private int capacity = 1000;
    @Info(value = "The capacity of the watering can in millibuckets")
    public ExDeWateringcanItemBuilder capacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    @Override
    public Item createObject() {
        return new WateringCanItem(capacity, createItemProperties());
    }
}
