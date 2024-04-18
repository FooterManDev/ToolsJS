package io.github.toolsjs.kubejs.builders;

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;

public class ShieldBuilder extends HandheldItemBuilder {

    public ShieldItem shieldItem;

    public ShieldBuilder(ResourceLocation i) {
        super(i, 0, 0);
        shieldItem = new ShieldItem(createItemProperties());
    }

    @Override
    public Item createObject() {
        return shieldItem;
    }
}
