package com.griefergames.addon.v1_8_9.mixins;

import com.griefergames.addon.GrieferGamesAddon;
import com.griefergames.addon.v1_8_9.EntityHolder;
import net.labymod.api.Laby;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandHandler;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C03PacketPlayer.C05PacketPlayerLook;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;



import static com.griefergames.addon.GrieferGamesAddon.prefix;
import static com.griefergames.addon.v1_8_9.EntityHolder.SUGGESTIONS;

@Mixin(EntityPlayerSP.class)
public class ChatScreenMixin {
    private int delay = 0;
    private Minecraft mc = Minecraft.getMinecraft();
    @Inject(method = "sendChatMessage", at = @At("HEAD"), cancellable = true)
    private void onSendChatMessage(String msg, CallbackInfo ci) {

        if (msg.equalsIgnoreCase("/sugclear")) {
            SUGGESTIONS.clear();

            ci.cancel();

        }
    }

    @Inject(method = "onLivingUpdate", at = @At("HEAD"))
    public void onLivingUpdate(CallbackInfo ci) {
        EntityPlayerSP player = (EntityPlayerSP) (Object) this;
        if (GrieferGamesAddon.getSharedInstance().configuration().getAfkPortal().get() && GrieferGamesAddon.getSharedInstance().configuration().enabled().get()) {

            if (player.timeInPortal == 1F) {
                player.timeInPortal = 0;
                float newYaw = player.rotationYaw + 60.0F;
                float backYaw = newYaw - 60.0F;
                sendPacket(new C05PacketPlayerLook(newYaw, player.rotationPitch, player.onGround));
                sendPacket(new C05PacketPlayerLook(backYaw, player.rotationPitch, player.onGround));

            }
        }
    }
    private void sendPacket(Packet<?> packet) {
        Minecraft.getMinecraft().getNetHandler().addToSendQueue(packet);
    }







}
