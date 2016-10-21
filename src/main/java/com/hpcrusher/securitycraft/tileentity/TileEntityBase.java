package com.hpcrusher.securitycraft.tileentity;

import net.minecraft.tileentity.TileEntity;

import java.util.UUID;

/**
 * @author Hpcrusher
 */
public class TileEntityBase extends TileEntity {

    protected String customName;
    protected UUID owner;

    public TileEntityBase() {
        customName = "";
        owner = null;
    }


}
