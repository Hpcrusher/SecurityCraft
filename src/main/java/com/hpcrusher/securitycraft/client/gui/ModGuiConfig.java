package com.hpcrusher.securitycraft.client.gui;

import com.hpcrusher.securitycraft.handler.ConfigurationHandler;
import com.hpcrusher.securitycraft.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

/**
 * @author Hpcrusher
 */
public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen, new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_ID, null, false, false, GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString()));
    }

}
