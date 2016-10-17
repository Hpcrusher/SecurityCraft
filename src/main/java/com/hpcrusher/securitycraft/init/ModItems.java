package com.hpcrusher.securitycraft.init;

import com.hpcrusher.securitycraft.item.ItemComputer;
import com.hpcrusher.securitycraft.item.ItemSC;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Hpcrusher
 */
public class ModItems {

    public static final ItemSC computer = new ItemComputer();

    public static void init() {
        GameRegistry.registerItem(computer, computer.getUnlocalizedName());
    }

}
