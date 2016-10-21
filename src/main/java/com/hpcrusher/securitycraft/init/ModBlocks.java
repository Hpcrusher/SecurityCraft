package com.hpcrusher.securitycraft.init;

import com.hpcrusher.securitycraft.block.BlockBase;
import com.hpcrusher.securitycraft.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hpcrusher
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    private static final List<BlockBase> BLOCKS = new ArrayList<>();

    //public static final BlockBase NAME =

    private ModBlocks() {}

    public static List<BlockBase> getBlocks() {
        return BLOCKS;
    }

    public static void register(BlockBase block) {
        BLOCKS.add(block);
    }

}
