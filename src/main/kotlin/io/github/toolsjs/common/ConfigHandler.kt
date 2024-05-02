package io.github.toolsjs.common

import dev.latvian.mods.kubejs.KubeJSPaths
import io.github.toolsjs.ToolsJS.GSON
import java.nio.file.Files
import com.google.gson.JsonSyntaxException
import io.github.toolsjs.ToolsJS
import java.nio.charset.StandardCharsets
import java.nio.file.Path

data class Config(
    val announcementLevel: String,
    val announcementUrl: String
)

class ConfigHandler {
    private val defaultAnnouncementUrl = "https://raw.githubusercontent.com/FooterManDev/ToolsJS/20.1/announcement.json5"
    fun getConfig(): Config? {
        val configPath = KubeJSPaths.CONFIG.resolve("toolsjs.json")
        if (Files.exists(configPath)) {
            val configString = String(Files.readAllBytes(configPath))
            return try {
                ToolsJS.LOGGER.info("Config loaded")
                GSON.fromJson(configString, Config::class.java)
            } catch (e: JsonSyntaxException) {
                ToolsJS.LOGGER.info("Config is invalid, resetting to default")
                resetToDefault(configPath)
                GSON.fromJson(configString, Config::class.java)
            }
        } else {
            ToolsJS.LOGGER.info("Config not found, creating new config")
            Files.createFile(configPath)
            Files.write(configPath, GSON.toJson(Config("SEVERE", defaultAnnouncementUrl)).toByteArray(StandardCharsets.UTF_8))
            val configString = String(Files.readAllBytes(configPath))
            return GSON.fromJson(configString, Config::class.java)
        }
    }

    private fun resetToDefault(configPath: Path) {
        val defaultConfig = Config("SEVERE", defaultAnnouncementUrl)
        val defaultConfigJson = GSON.toJson(defaultConfig)
        Files.write(configPath, defaultConfigJson.toByteArray(StandardCharsets.UTF_8))
    }
}