package io.github.toolsjs.common

import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import java.net.URL
import io.github.toolsjs.ToolsJS
import net.minecraft.network.chat.Component
import net.minecraftforge.event.entity.player.PlayerEvent

@Mod.EventBusSubscriber(modid = ToolsJS.ID)
class AnnouncementChecker {
    companion object {
        @SubscribeEvent
        fun onPlayerLogin(event: PlayerEvent.PlayerLoggedInEvent) {
            val url = URL("https://raw.githubusercontent.com/Footermandev/ToolsJS/master/announcement.json")
            val announcement = url.readText()
            val player = event.entity
            player.sendSystemMessage(Component.literal("woah announcement babe $announcement"))
        }
    }
}