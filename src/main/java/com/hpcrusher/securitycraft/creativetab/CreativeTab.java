package com.hpcrusher.securitycraft.creativetab;

import com.hpcrusher.securitycraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * @author Hpcrusher
 */
public class CreativeTab {

    public static final CreativeTabs SC_TAB = new CreativeTabs(Reference.MOD_ID) {

        @Override
        public Item getTabIconItem() {
            //TODO When represenativ Item or Block exist change the return
            //return ModItems.;
            return Items.SLIME_BALL;
        }
    };

}
