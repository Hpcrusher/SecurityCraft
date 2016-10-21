package com.hpcrusher.securitycraft.item;

import com.hpcrusher.securitycraft.creativetab.CreativeTab;
import com.hpcrusher.securitycraft.init.ModItems;
import net.minecraft.item.Item;

/**
 * @author Hpcrusher
 */
public class ItemBase extends Item{

    public ItemBase(String name) {
        super();
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTab.SC_TAB);
        setMaxStackSize(1);
        setNoRepair();
        ModItems.register(this);
    }

    //@Override
    //public String getUnlocalizedName() {
    //    return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappeUnlocalizedName(super.getUnlocalizedName()));
    //}

    //@Override
    //public String getUnlocalizedName(ItemStack itemStack) {
    //    return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappeUnlocalizedName(super.getUnlocalizedName()));
    //}

    //protected String getUnwrappeUnlocalizedName(String unlocalizedName) {
    //    return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    //}
}
