package io.github.toolsjs.kubejs.builders;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.world.item.HorseArmorItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class HorsearmorItemBuilder extends HandheldItemBuilder {
    private int armor;
    private ResourceLocation location;


    public HorsearmorItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }

    @Info(value="The amount of armor you would like the horse armor to provide to a horse when equipped")
    public HorsearmorItemBuilder armor(int armor) {
        this.armor = armor;
        return this;
    }
    @Info(value="The location of the horse armor model texture")
    public HorsearmorItemBuilder location(String location) {
        this.location = new ResourceLocation(location);
        return this;
    }

    @Override
    public Item createObject() {
        return new HorseArmorItem(armor, location, createItemProperties());
    }
}