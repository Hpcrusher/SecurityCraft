package com.hpcrusher.securitycraft.proxy;

import com.hpcrusher.securitycraft.handler.ConfigurationHandler;
import com.hpcrusher.securitycraft.init.ModBlocks;
import com.hpcrusher.securitycraft.init.ModItems;
import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Hpcrusher
 */
public abstract class CommonProxy implements Proxy{

    @Override
    public void onPreInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModItems.getItems().forEach(GameRegistry::register);

        for (Block block : ModBlocks.getBlocks()) {
            GameRegistry.register(block);
            //GameRegistry.register(BlockUtils.getItemBlockFor(block), block.getRegistryName());
        }

    }

    @Override
    public void onInit(FMLInitializationEvent event) {

        // Initialize mod tile entities
        //TileEntities.init();

        // Register event handlers
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
        //MinecraftForge.EVENT_BUS.register(new ItemEventHandler());
        //MinecraftForge.EVENT_BUS.register(new WorldEventHandler());
        //MinecraftForge.EVENT_BUS.register(new PlayerEventHandler());
        //MinecraftForge.EVENT_BUS.register(new CraftingHandler());

        // Register our fuels
        //GameRegistry.registerFuelHandler(new FuelHandler());

        // Register the Waila data provider
        //FMLInterModComms.sendMessage("Waila", "register", "com.hpcrusher.securitycraft.waila.WailaDataProvider.callbackRegister");
    }

}
