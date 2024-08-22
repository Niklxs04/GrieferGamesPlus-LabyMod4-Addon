package com.griefergames.addon.listeners;

import com.griefergames.addon.GrieferGamesAddon;
import net.labymod.api.Laby;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.chat.ChatMessageSendEvent;
import net.labymod.api.util.I18n;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.griefergames.addon.GrieferGamesAddon.prefix;

public class ChatMessageListener {
    @Subscribe
    public void onMessageSendEvent(ChatMessageSendEvent event){
        if(GrieferGamesAddon.getSharedInstance().configuration().getShorterNumber().get()){
            Pattern pattern = Pattern.compile("(\\d+\\.\\d+|\\d+)(k|m)");
            Matcher matcher = pattern.matcher(event.getMessage().toLowerCase());

            while (matcher.find()) {
                String numberPart = matcher.group(1);
                String suffix = matcher.group(2);
                String originalMatch = matcher.group(0);
                if (event.getMessage().contains("," + numberPart)) {
                    Laby.references().chatExecutor().displayClientMessage(prefix + I18n.getTranslation("griefergames-plus.ChatMessage.Onlypoint"));
                    event.setCancelled(true);
                    return;
                }
                float multiplier;
                if (suffix.equals("k")) {
                    multiplier = 1000;
                } else if (suffix.equals("m")) {
                    multiplier = 1000000;
                } else {
                    continue;
                }
                String finalSum = String.valueOf(Float.parseFloat(numberPart) * multiplier);
                if (finalSum.endsWith(".0")) {
                    finalSum = finalSum.substring(0, finalSum.length() - 2);
                }
                event.changeMessage(event.getMessage().replace(originalMatch, finalSum));
            }
        }

    }

}
