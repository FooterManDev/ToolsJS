# ToolJS
A [KubeJS](https://kubejs.com) addon for creating tools! Any type of tools! Includes all tools and features of [CucumberJS](https://git.bluemethyst.dev/CucumberJS), PaxelJS and lots of new ones!

## Dependencies
- [KubeJS](https://www.curseforge.com/minecraft/mc-mods/kubejs)
- [Rhino](https://www.curseforge.com/minecraft/mc-mods/rhino)
- [Architectury](https://www.curseforge.com/minecraft/mc-mods/architectury-api)
- [Cucumber Library](https://www.curseforge.com/minecraft/mc-mods/cucumber)
### Recommend but not required
- [ProbeJS](https://www.curseforge.com/minecraft/mc-mods/probejs)

## Creating a tool
For a more in-depth wiki refer [here](https://http.cat/501)
```js
// Inside startup_scripts, this will create a tool with no texture
StartupEvents.registry("item", (event) => {
    event.create("test_crossbow", "crossbow");
    event.create("test_fishingrod", "fishingrod");
    event.create("test_paxel", "paxel");
    event.create("test_scythe", "scythe");
    event.create("test_shear", "shears");
    event.create("test_sickle", "sickle").range(3);
    event.create("test_wateringcan", "wateringcan").range(2).chance(50);
});
```
You can also edit already exsisting tools that are made with Cucumber Library
```js
CucumberItems.modification((event) => {
    event.modify("mysticalagriculture:inferium_axe", (item) => {
        item.cucumberAttackDamage = 1000;
    });
});
```

## Credits
[FooterMan15](https://github.com/FooterMan15) - PaxelJS, and lots of work.

[Bluemethyst](https://bluemethyst.dev) - CucumberJS, and some really difficult copying and pasting.