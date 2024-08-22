package com.griefergames.addon.v1_8_9.mixins;
//
//import net.minecraft.entity.Entity;
import com.griefergames.addon.GrieferGamesAddon;
import com.ibm.icu.impl.duration.TimeUnit;
import net.labymod.api.Laby;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static com.griefergames.addon.v1_8_9.EntityHolder.SUGGESTIONS;


@Mixin(NetHandlerPlayClient.class)
public class NetHandlerPlayClientMixin {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private Minecraft mc = Minecraft.getMinecraft();
    @Inject(method = "handleChat", at = @At("HEAD"))
    private void onChat(S02PacketChat packet, CallbackInfo ci) {
        // Holen der Chat-Nachricht
        if(GrieferGamesAddon.getSharedInstance().configuration().getPublicTab().get() && GrieferGamesAddon.getSharedInstance().configuration().enabled().get()) {

            String message = packet.getChatComponent().getUnformattedText();
            String name = extractName(message);
            if (name != null && !SUGGESTIONS.contains(name)) {
                if (message.startsWith("@")) {
                    Laby.references().chatExecutor().displayClientMessage("§a§lAdd: " + name);
                    SUGGESTIONS.add(name);

                }
            }
        }


    }

    private String extractName(String message) {
        // Suche nach den Trennzeichen ┃ und »
        int startIndex = message.indexOf('┃');
        int endIndex = message.indexOf('»');

        // Prüfen, ob beide Trennzeichen gefunden wurden
        if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
            // Extrahiere den Text zwischen ┃ und »
            return message.substring(startIndex + 1, endIndex).trim();
        }
        return null; // Name nicht gefunden
    }



}
