package io.github.toolsjs.kubejs.builders;

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;

public class ShieldItemBuilder extends HandheldItemBuilder {


    public ShieldItemBuilder(ResourceLocation i) {
        super(i, 0, 0);
    }

    @Override
    public Item createObject() {
        return new ShieldItem(createItemProperties());
    }
}
