package io.github.toolsjs.kubejs.builders;

import com.blakebr0.cucumber.item.BaseWateringCanItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class WateringcanItemBuilder extends HandheldItemBuilder {
    private int chance = 100;
    private int range = 1;

    public WateringcanItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }

    @Info(value = "The range of farmland the watering can can water around the center")
    public WateringcanItemBuilder range(int range) {
        this.range = range;
        return this;
    }
    @Info(value = "The chance that the watering can bonemeals a crop per each use")
    public WateringcanItemBuilder chance(int chance) {
        this.chance = chance;
        return this;
    }
    @Override
    public Item createObject() {
        return new BaseWateringCanItem(range, chance);
    }
}