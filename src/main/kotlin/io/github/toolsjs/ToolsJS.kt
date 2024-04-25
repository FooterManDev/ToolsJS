package io.github.toolsjs

import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Mod(ToolsJS.ID)
object ToolsJS {
    const val ID = "toolsjs"
    val LOGGER: Logger = LogManager.getLogger()
}
