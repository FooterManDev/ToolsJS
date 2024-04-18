package io.github.toolsjs.mixin.accessors;

import com.blakebr0.cucumber.item.BaseWateringCanItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = BaseWateringCanItem.class, remap = false)
public interface CucumberChanceAccessor {

    @Accessor("chance")
    double kjs_ccmbr$getChance();

    @Mutable
    @Accessor("chance")
    void kjs_ccmbr$setChance(double chance);
}
