package com.hpcrusher.securitycraft.block;

import com.hpcrusher.securitycraft.creativetab.CreativeTab;
import com.hpcrusher.securitycraft.init.ModBlocks;
import com.hpcrusher.securitycraft.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author Hpcrusher
 */
public class BlockBase extends Block {

    private final String BASE_NAME;

    public BlockBase(String name) {
        this(name, Material.ROCK);
    }

    public BlockBase(String name, Material material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTab.SC_TAB);
        BASE_NAME = name;
        ModBlocks.register(this);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s:%s", Reference.MOD_ID, BASE_NAME);
    }
}
