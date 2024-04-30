package io.github.toolsjs

import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import io.github.toolsjs.common.AnnouncementChecker
import net.minecraftforge.common.MinecraftForge

@Mod(ToolsJS.ID)
object ToolsJS {
    const val ID = "toolsjs"
    val LOGGER: Logger = LogManager.getLogger()
    init {
        MinecraftForge.EVENT_BUS.register(AnnouncementChecker::class.java)
    }
}
