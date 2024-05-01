package io.github.toolsjs.common

import kotlinx.coroutines.*
import java.net.URL
import io.github.toolsjs.ToolsJS
import net.minecraft.network.chat.Component
import net.minecraft.server.level.ServerPlayer
import net.minecraftforge.fml.common.Mod
import com.google.gson.Gson

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
                // allow url to be set in config
                val url = URL("https://raw.githubusercontent.com/FooterManDev/ToolsJS/20.1/announcement.json5")
                val rawAnnouncement = withContext(Dispatchers.IO) { url.readText() }
                val gson = Gson()
                val announcement: Announcement = gson.fromJson(rawAnnouncement, Announcement::class.java)
                // formatting is all temporary and subject to change to a better format
                // needs config files in kubejs/config for what announcement level to show
                if (announcement.importance.isNotEmpty() && announcement.title.isNotEmpty() && announcement.message.isNotEmpty()) {
                    if (announcement.importance.lowercase() == "severe") {
                        player.sendSystemMessage(Component.literal("IMPORTANT: ${announcement.message}"))
                    } else if (announcement.importance.lowercase() == "misc") {
                        player.sendSystemMessage(Component.literal("MISC: ${announcement.message}"))
                    } else if (announcement.importance.lowercase() == "debug") {
                        player.sendSystemMessage(Component.literal(announcement.message))
                    }
                } else {
                    ToolsJS.LOGGER.warn("Failed to parse announcement, report to Footerman or Blue")
                    //ToolsJS.LOGGER.warn("Failed to parse announcement JSON! Some dumbass fucked it and doesn't know how to write simple FUCKING JSON, FUCK MAN. report to footer or blue uwu :3")
                }
            }
        }
    }
}