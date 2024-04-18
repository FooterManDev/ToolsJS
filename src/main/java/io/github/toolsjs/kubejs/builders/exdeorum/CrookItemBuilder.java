package io.github.toolsjs.kubejs.builders.exdeorum;

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import thedarkcolour.exdeorum.item.CrookItem;


public class CrookItemBuilder extends HandheldItemBuilder {
    public CrookItemBuilder(ResourceLocation i) {
        super(i, 0.5F, 0.5F);
    }

    private int speed = 2;
    @Info(value = "The speed of the crooks breaking capabilities")
    public CrookItemBuilder speed(int speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public Item createObject() {
        return new CrookItem(createItemProperties(), 2);
    }
}
