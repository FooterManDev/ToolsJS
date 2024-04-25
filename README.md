# ToolJS
A [KubeJS](https://kubejs.com) addon for creating tools! Any type of tools! Includes all tools and features of [CucumberJS](https://git.bluemethyst.dev/CucumberJS), PaxelJS and lots of new ones!

## Dependencies
- [KubeJS](https://www.curseforge.com/minecraft/mc-mods/kubejs)
- [Rhino](https://www.curseforge.com/minecraft/mc-mods/rhino)
- [Architectury](https://www.curseforge.com/minecraft/mc-mods/architectury-api)

## Optional Dependencies
- [Cucumber Library](https://www.curseforge.com/minecraft/mc-mods/cucumber)
- [Ex Deorum](https://www.curseforge.com/minecraft/mc-mods/ex-deorum)
- [Sophisticated Backpacks](https://www.curseforge.com/minecraft/mc-mods/sophisticated-backpacks)

### Recommend but not required
- [ProbeJS](https://www.curseforge.com/minecraft/mc-mods/probejs)

## Creating a tool
For a more in-depth wiki refer [here](https://http.cat/501)
```js
// Inside startup_scripts, this will create a tool with no texture
StartupEvents.registry("item", (event) => {
    event.create("test_crossbow", "cucumber:crossbow");
    event.create("test_fishingrod", "cucumber:fishing_rod");
    event.create("test_paxel", "cucumber:paxel");
    event.create("test_scythe", "cucumber:scythe");
    event.create("test_shear", "shears");
    event.create("test_sickle", "cucumber:sickle").breakingRange(3);
    event.create("test_wateringcan", "cucumber:watering_can").wateringRange(2).wateringChance(50);
    event.create("test_hammer", "exdeorum:hammer").tag("exdeorum:hammers");
    event.create("test_crook", "exdeorum:crook").tag("exdeorum:crooks");
    event.create("test_exdewateringcan", "exdeorum:watering_can");
    event.create("test_brush", "brush");
    event.create("backpack", "sophisticatedbackpacks:backpack").setSlots(54).setUpgradeSlots(9);
});
```
You can also edit already existing tools that are made with Cucumber Library
```js
CucumberItems.modification((event) => {
    event.modify("kubejs:test_wateringcan", (item) => {
        item.range = 50;
        item.chance = 1;
    });
});
```

## Credits
[FooterMan15](https://github.com/FooterMan15) - PaxelJS, and lots of work.

[Bluemethyst](https://bluemethyst.dev) - CucumberJS, and some really difficult copying and pasting.