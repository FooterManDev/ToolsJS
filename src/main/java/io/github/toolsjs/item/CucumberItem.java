package io.github.toolsjs.item;

import com.blakebr0.cucumber.item.tool.*;

import dev.latvian.mods.kubejs.typings.Info;
import dev.latvian.mods.rhino.util.HideFromJS;
import dev.latvian.mods.rhino.util.RemapForJS;
import dev.latvian.mods.rhino.util.RemapPrefixForJS;
import io.github.toolsjs.mixin.accessors.CucumberAttackDamageAccessor;
import io.github.toolsjs.mixin.accessors.CucumberAttackSpeedAccessor;
import io.github.toolsjs.mixin.accessors.CucumberChanceAccessor;
import io.github.toolsjs.mixin.accessors.CucumberRangeAccessor;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

@SuppressWarnings("unused")
@RemapPrefixForJS("kjs_ccmbr$")
public interface CucumberItem {

    @HideFromJS
    default Item kjs_ccmbr$self(){
        if (this instanceof Item item) return item;
        return Items.AIR;
    }

    @Info(value = "Attack damage, applicable only to `Axe`, `Hoe`, `Pickaxe`, `Shovel`, `Sword`, `Scythe`, `Sickle` and `Paxel`")
    @RemapForJS("setCucumberAttackDamage")
    default void kjs_ccmbr$setAttackDamage(float dmg) {
        if (this instanceof CucumberAttackDamageAccessor accessor){
            accessor.kjs_ccmbr$setAttackDamage(dmg);
        } else if (this instanceof DiggerItem digger){
            digger.attackDamageBaseline = dmg;
        } else throw new IllegalArgumentException(kjs_ccmbr$self().kjs$getId() + " does not support attack damage.");
    }

    @RemapForJS("getCucumberAttackDamage")
    default float kjs_ccmbr$getAttackDamage(){
        if (this instanceof CucumberAttackDamageAccessor accessor){
            return ((DiggerItem) this).getAttackDamage();
        } else throw new IllegalArgumentException(kjs_ccmbr$self().kjs$getId() + " does not support attack speed.");
    }

    @Info(value = "Attack speed, applicable only to `Axe`, `Hoe`, `Pickaxe`, `Shovel`, `Scythe`, `Sickle` and `Sword`")
    @RemapForJS("setCucumberAttackSpeed")
    default void kjs_ccmbr$setAttackSpeed(float speed){
        if (this instanceof CucumberAttackSpeedAccessor accessor){
            accessor.kjs_ccmbr$setAttackSpeed(speed);
        } throw new IllegalArgumentException(kjs_ccmbr$self().kjs$getId() + " does not support attack speed.");
    }

    @RemapForJS("getCucumberAttackSpeed")
    default float kjs_ccmbr$getAttackSpeed(){
        if (this instanceof CucumberAttackSpeedAccessor accessor){
            if (this instanceof BaseAxeItem item) return item.getAttackSpeed();
            if (this instanceof BaseHoeItem item) return item.getAttackSpeed();
            if (this instanceof BasePickaxeItem item) return item.getAttackSpeed();
            if (this instanceof BaseShovelItem item) return item.getAttackSpeed();
            if (this instanceof BaseScytheItem item) return item.getAttackSpeed();
            if (this instanceof BaseSickleItem item) return item.getAttackSpeed();
        }
        throw new IllegalArgumentException(kjs_ccmbr$self().kjs$getId() + " does not support attack speed.");
    }

    @Info(value = "Action range, applicable only to `Scythe`, `Sickle` and `Watering Can`")
    default void kjs_ccmbr$setRange(int range){
        if (this instanceof CucumberRangeAccessor accessor){
            accessor.kjs_ccmbr$setRange(range);
        } else throw new IllegalArgumentException(kjs_ccmbr$self().kjs$getId() + " does not support range.");
    }

    default int kjs_ccmbr$getRange(){
        if (this instanceof CucumberRangeAccessor accessor){
            return accessor.kjs_ccmbr$getRange();
        } else throw new IllegalArgumentException(kjs_ccmbr$self().kjs$getId() + " does not support range.");
    }

    @Info(value = "Chance to apply bonemeal, applicable only to `Watering Can`")
    default void kjs_ccmbr$setChance(double chance) {
        if (this instanceof CucumberChanceAccessor accessor){
            accessor.kjs_ccmbr$setChance(chance);
        } else throw new IllegalArgumentException(kjs_ccmbr$self().kjs$getId() + " does not support chance.");
    }

    default double kjs_ccmbr$getChance() {
        if (this instanceof CucumberChanceAccessor accessor){
            return accessor.kjs_ccmbr$getChance();
        } else throw new IllegalArgumentException(kjs_ccmbr$self().kjs$getId() + " does not support chance.");
    }
}