package io.github.toolsjs.item;

import dev.latvian.mods.kubejs.util.ConsoleJS;
import io.github.toolsjs.ToolsJS;
import dev.latvian.mods.kubejs.event.EventJS;
import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class CucumberItemModificationEventJS extends EventJS {

    @Info("""
		Modifies Cucumber items with the given ingredient.
					
		**NOTE**: tag ingredients are not supported at this time.
		""")
    public void modify(Ingredient in, Consumer<CucumberItem> c) {
        for (var item : in.kjs$getItemTypes()) {
            if (item instanceof CucumberItem ccItem){
                c.accept(ccItem);
            } else {
                ConsoleJS.STARTUP.warn("Trying to modify item " + item.kjs$getId() + " but it is not a Cucumber Item, skipping...");
            }
        }
    }
}