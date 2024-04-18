package io.github.toolsjs.kubejs.builders.sophisticated;

import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.p3pp3rf1y.sophisticatedbackpacks.backpack.BackpackBlock;
import net.p3pp3rf1y.sophisticatedbackpacks.backpack.BackpackItem;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class BackpackBuilder extends HandheldItemBuilder {
    public IntSupplier slots = () -> 29;
    public IntSupplier upgrade_slots = () -> 1;
    Supplier<BackpackBlock> block = BackpackBlock::new;
    public BackpackBuilder(ResourceLocation i) {
        super(i, 0,0);
    }

    @Override
    public Item createObject() {
        return new BackpackItem(slots, upgrade_slots, block);
    }

    public BackpackBuilder setSlots(int slots) {
        this.slots = () -> slots;
        return this;
    }

    public BackpackBuilder setUpgradeSlots(int upgrade_slots) {
        this.upgrade_slots = () -> upgrade_slots;
        return this;
    }
}
