package io.github.toolsjs.kubejs.builders.cucumber;

import com.blakebr0.cucumber.item.tool.BaseFishingRodItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class FishingrodItemBuilder extends HandheldItemBuilder {
    public FishingrodItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }

    @Override
    public Item createObject() {
        return new BaseFishingRodItem(properties -> createItemProperties());
    }
}