package com.griefergames.addon.listeners;

import com.griefergames.addon.GrieferGamesAddon;
import net.labymod.api.Laby;
import net.labymod.api.client.chat.Title;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.component.format.NamedTextColor;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.chat.ChatReceiveEvent;
import net.labymod.api.notification.Notification;
import net.labymod.api.util.I18n;
import java.util.Objects;

public class IncChatListener {
    public static String PlotID;
    @Subscribe
    public void ChatListener(ChatReceiveEvent event){
        if( GrieferGamesAddon.getSharedInstance().configuration().getZauberer().get()){
            if(event.chatMessage().getOriginalPlainText().contains("[GrieferGames] Ein Zauberer ist auf dem Grundstück")){
                String[] splits = event.chatMessage().getOriginalPlainText().split(" ");
                for (String split : splits){
                    if(split.matches("-?\\d.*") ){
                        PlotID = split;
                            for(int i = 0; i <= 7; i++){

                                if(i == 3) {
                                    Laby.references().chatExecutor().displayClientMessage(I18n.getTranslation("griefergames-plus.IncChat.ZaubererErschienen") + split);
                                } else if (i ==0 || i ==7) {
                                    Laby.references().chatExecutor().displayClientMessage("§4§l---------------------------------------------------------");
                                } else if (i == 4) {
                                    Laby.references().chatExecutor().displayClientMessage(I18n.getTranslation("griefergames-plus.IncChat.directTP"));
                                }else {
                                    Laby.references().chatExecutor().displayClientMessage(" ");
                                }


                            }


                        Notification.builder()
                            .title(Component.text(Objects.requireNonNull(I18n.getTranslation(
                                "griefergames-plus.IncChat.ZaubererErschienen")), NamedTextColor.BLUE))
                            .text(Component.text(split, NamedTextColor.GOLD))
                            .buildAndPush();

                            }



                }



            }



        }





    }
}
