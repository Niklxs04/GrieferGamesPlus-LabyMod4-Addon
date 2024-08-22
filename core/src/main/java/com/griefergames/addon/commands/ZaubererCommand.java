package com.griefergames.addon.commands;

import com.griefergames.addon.GrieferGamesAddon;
import net.labymod.api.Laby;
import net.labymod.api.client.Minecraft;
import net.labymod.api.client.chat.command.Command;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.component.format.NamedTextColor;
import net.labymod.api.notification.Notification;
import net.labymod.api.util.I18n;
import org.jetbrains.annotations.NotNull;

import static com.griefergames.addon.listeners.IncChatListener.PlotID;


public class ZaubererCommand extends Command {


    public ZaubererCommand() {
        super("z" );

    }

    @Override
    public boolean execute(String s, String[] strings) {
        if(PlotID != null){
            Laby.references().chatExecutor().chat("/p h " + PlotID);
        }else {
            Laby.references().chatExecutor().displayClientMessage(GrieferGamesAddon.prefix + I18n.getTranslation("griefergames-plus.zaubererCommand.noZaubererfound"));
        }



        return true;
    }






}
