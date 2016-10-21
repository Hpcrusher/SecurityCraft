package com.hpcrusher.securitycraft.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Hpcrusher
 */
public interface Proxy {

    void onPreInit(FMLPreInitializationEvent event);

    void onInit(FMLInitializationEvent event);

}
