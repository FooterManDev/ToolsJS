package io.github.toolsjs

import dev.architectury.event.events.common.PlayerEvent
import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import io.github.toolsjs.common.AnnouncementChecker

@Mod(ToolsJS.ID)
object ToolsJS {
    const val ID = "toolsjs"
    val LOGGER: Logger = LogManager.getLogger()
    init {
        PlayerEvent.PLAYER_JOIN.register(AnnouncementChecker::onPlayerLogin)
    }
}
