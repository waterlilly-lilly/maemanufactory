package online.maestoso.maesmanufactory.block

import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import online.maestoso.maesmanufactory.MaesManufactoryInit

object MaesManufactoryBlocks {
    val TEST_WIRE_1 = register("test_wire_1", ::WireBlock, AbstractBlock.Settings.create())
    val TEST_WIRE_2 = register("test_wire_2", ::WireBlock, AbstractBlock.Settings.create())

    private fun<T: Block> register(id: String, factory: BlockFactory<T>, settings: AbstractBlock.Settings): T {
        val key: RegistryKey<Block> = RegistryKey.of(RegistryKeys.BLOCK, MaesManufactoryInit.id(id))
        val block: T = factory.create(settings.registryKey(key))
        return Registry.register(Registries.BLOCK, key, block)
    }
    fun init() {
        MaesManufactoryInit.LOGGER.info("Initializing blocks...")
    }
    fun interface BlockFactory<T: Block> {
        fun create(settings: AbstractBlock.Settings): T
    }
}
