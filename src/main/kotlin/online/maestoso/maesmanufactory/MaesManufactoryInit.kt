package online.maestoso.maesmanufactory

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents
import net.minecraft.util.Identifier
import online.maestoso.maesmanufactory.block.MaesManufactoryBlocks
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class MaesManufactoryInit : ModInitializer {
    companion object {
        val LOGGER: Logger = LoggerFactory.getLogger("Mae's Manufactory")
        val MODID: String = "maesmanufactory"
        fun id(id: String): Identifier {
            return Identifier.of(MODID, id)
        }
    }

    override fun onInitialize() {
        MaesManufactoryBlocks.init()
    }
}
