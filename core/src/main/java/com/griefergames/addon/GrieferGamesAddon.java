package com.griefergames.addon;

import com.griefergames.addon.commands.ZaubererCommand;
import com.griefergames.addon.config.ggConfig;
import com.griefergames.addon.listeners.ChatMessageListener;
import com.griefergames.addon.listeners.ContainerListener;
import com.griefergames.addon.listeners.IncChatListener;
import com.griefergames.addon.listeners.ServerNavigationListener;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.client.entity.Entity;
import net.labymod.api.models.addon.annotation.AddonMain;


@AddonMain
public class GrieferGamesAddon extends LabyAddon<ggConfig> {
    private IBridge bridge;
    public static String prefix = "§8[§aGrieferGames§2Plus§8] ";
    private static GrieferGamesAddon SharedInstance;






    @Override
    protected void enable() {
        this.registerSettingCategory();
        registerListener(new ServerNavigationListener());
        registerListener(new ChatMessageListener());
        registerListener(new ContainerListener());
        registerListener(new IncChatListener());
        registerCommand(new ZaubererCommand());

        SharedInstance = this;
        bridge = getReferenceStorage().iBridge();
        this.registerListener(bridge);


        //Laby.references().chatExecutor().displayClientMessage("test");
    }

    @Override
    protected Class<? extends ggConfig> configurationClass() {
        return ggConfig.class;
    }
    public static GrieferGamesAddon getSharedInstance() {return SharedInstance;}

    public DefaultReferenceStorage getReferenceStorage() {return (this.referenceStorageAccessor()); }

}
