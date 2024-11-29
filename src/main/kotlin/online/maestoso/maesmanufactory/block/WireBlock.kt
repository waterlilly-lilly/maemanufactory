package online.maestoso.maesmanufactory.block

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.entity.LivingEntity
import net.minecraft.item.ItemStack
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import online.maestoso.maesmanufactory.wire.WireSystem

class WireBlock(settings: Settings?) : Block(settings) {
    override fun onPlaced(
        world: World?,
        pos: BlockPos?,
        state: BlockState?,
        placer: LivingEntity?,
        itemStack: ItemStack?
    ) {
        super.onPlaced(world, pos, state, placer, itemStack)
        if(!world!!.isClient) {
            WireSystem.addWire(world as ServerWorld, pos!!, state!!)
        }
    }

    override fun onStateReplaced(
        state: BlockState?,
        world: World?,
        pos: BlockPos?,
        newState: BlockState?,
        moved: Boolean
    ) {
        super.onStateReplaced(state, world, pos, newState, moved)
        if(!world!!.isClient) {
            WireSystem.deleteWire(world as ServerWorld, pos!!)
        }
    }
}