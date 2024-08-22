package com.griefergames.addon.listeners;
import jdk.jshell.SourceCodeAnalysis.Suggestion;
import net.labymod.api.Laby;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.client.Minecraft;
import net.labymod.api.client.entity.player.ClientPlayer;
import net.labymod.api.client.entity.player.Inventory;
import net.labymod.api.client.gui.ScreenUser;
import net.labymod.api.client.gui.screen.LabyScreen;
import net.labymod.api.client.gui.screen.ScreenInstance;
import net.labymod.api.client.gui.screen.widget.overlay.ScreenOverlayHandler;
import net.labymod.api.client.gui.screen.widget.widgets.activity.chat.ChatTabWidget;
import net.labymod.api.client.network.ClientPacketListener;
import net.labymod.api.client.world.item.ItemStack;
import net.labymod.api.configuration.labymod.chat.ChatTab;
import net.labymod.api.configuration.labymod.main.laby.multiplayer.TabListConfig;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.chat.ChatMessageAddEvent;
import net.labymod.api.event.client.chat.ChatMessageGuessSenderEvent;
import net.labymod.api.event.client.gui.screen.ScreenDisplayEvent;
import net.labymod.api.event.client.lifecycle.GameTickEvent;
import net.labymod.api.event.client.render.ScreenRenderEvent;
import net.labymod.autogen.api.lss.properties.accessors.ScreenRendererWidgetInteractablePropertyValueAccessor;
import java.util.Collections;


public class ContainerListener {
    @Subscribe
    public void Container(ScreenInstance event){



}}
