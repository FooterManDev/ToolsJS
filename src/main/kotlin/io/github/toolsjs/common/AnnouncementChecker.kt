package io.github.toolsjs.common

import kotlinx.coroutines.*
import java.net.URL
import io.github.toolsjs.ToolsJS
import net.minecraft.network.chat.Component
import net.minecraft.server.level.ServerPlayer
import net.minecraftforge.fml.common.Mod
import io.github.toolsjs.ToolsJS.GSON

data class Announcement(
    val importance: String,
    val title: String,
    val message: String
)

@Mod.EventBusSubscriber(modid = ToolsJS.ID)
class AnnouncementChecker {
    companion object {
        @OptIn(DelicateCoroutinesApi::class)
        fun onPlayerLogin(player: ServerPlayer) {
            GlobalScope.launch {
                val url = URL(ToolsJS.CONFIG?.announcementUrl)
                val rawAnnouncement = withContext(Dispatchers.IO) { url.readText() }
                val announcement: Announcement = GSON.fromJson(rawAnnouncement, Announcement::class.java)
                if (announcement.importance.isNotEmpty() && announcement.title.isNotEmpty() && announcement.message.isNotEmpty()) {
                    if (ToolsJS.CONFIG?.announcementLevel == announcement.importance) {
                        player.sendSystemMessage(Component.literal(announcement.title))
                        player.sendSystemMessage(Component.literal(announcement.message))
                    } else {
                        ToolsJS.LOGGER.info("Announcement level is not high enough to show")
                    }
                } else {
                    ToolsJS.LOGGER.warn("Failed to parse announcement, report to Footerman or Blue")
                    //ToolsJS.LOGGER.warn("Failed to parse announcement JSON! Some dumbass fucked it and doesn't know how to write simple FUCKING JSON, FUCK MAN. report to footer or blue uwu :3")
                }
            }
        }
    }
}