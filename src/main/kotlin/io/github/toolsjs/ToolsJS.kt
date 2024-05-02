package io.github.toolsjs

import com.google.gson.Gson
import dev.architectury.event.events.common.PlayerEvent
import io.github.toolsjs.common.AnnouncementChecker
import io.github.toolsjs.common.ConfigHandler
import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Mod(ToolsJS.ID)
object ToolsJS {
    const val ID = "toolsjs"
    val GSON: Gson = Gson()
    val LOGGER: Logger = LogManager.getLogger()
    val CONFIG = ConfigHandler().getConfig()
    init {
        PlayerEvent.PLAYER_JOIN.register(AnnouncementChecker::onPlayerLogin)
    }
}
