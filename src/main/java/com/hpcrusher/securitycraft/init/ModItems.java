package com.hpcrusher.securitycraft.init;

import com.hpcrusher.securitycraft.item.ItemBase;
import com.hpcrusher.securitycraft.item.ItemTest;
import com.hpcrusher.securitycraft.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hpcrusher
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    private static final List<ItemBase> ITEMS = new ArrayList<ItemBase>();

    public static final ItemBase TEST_ITEM = new ItemTest();

    private ModItems() {}

    public static List<ItemBase> getItems() {
        return ITEMS;
    }

    public static void register(ItemBase item) {
        ITEMS.add(item);
    }
}

