package io.github.toolsjs.kubejs.builders;

import com.blakebr0.cucumber.item.tool.BasePaxelItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

// tysm to https://github.com/FooterMan15/PaxelJS

public class PaxelItemBuilder extends HandheldItemBuilder {
    public PaxelItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }

    @Override
    public Item createObject() {
        return new BasePaxelItem(toolTier,properties -> createItemProperties());
    }
}