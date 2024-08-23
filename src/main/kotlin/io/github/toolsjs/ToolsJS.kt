package io.github.toolsjs

import net.neoforged.fml.ModList
import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

const val ID = "toolsjs"

@Mod(ID)
@Suppress("unused")
object ToolsJS {
    val logger: Logger = LogManager.getLogger()
}

fun isModLoaded(modId: String): Boolean {
    return ModList.get().isLoaded(modId)
}