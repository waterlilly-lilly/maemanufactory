package online.maestoso.maesmanufactory.wire

import net.minecraft.block.BlockState
import net.minecraft.nbt.NbtCompound
import net.minecraft.registry.RegistryWrapper
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.math.BlockPos
import net.minecraft.world.PersistentState

object WireSystem : PersistentState() {
    fun init() {

    }
    fun addWire(world: ServerWorld, pos: BlockPos, state: BlockState) {

    }
    fun deleteWire(world: ServerWorld, pos: BlockPos) {

    }
    override fun writeNbt(nbt: NbtCompound?, registries: RegistryWrapper.WrapperLookup?): NbtCompound {
        TODO("Not yet implemented")
    }
}