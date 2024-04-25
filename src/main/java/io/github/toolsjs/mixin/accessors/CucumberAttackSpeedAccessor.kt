package io.github.toolsjs.mixin.accessors;

import com.blakebr0.cucumber.item.tool.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value = {BaseAxeItem.class, BaseHoeItem.class, BasePickaxeItem.class, BaseShovelItem.class, BaseSwordItem.class, BaseScytheItem.class, BaseSickleItem.class}, remap = false)
public interface CucumberAttackSpeedAccessor {

    @Mutable
    @Accessor("attackSpeed")
    void kjs_ccmbr$setAttackSpeed(float speed);
}
