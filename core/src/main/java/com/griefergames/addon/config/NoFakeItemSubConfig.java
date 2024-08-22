package com.griefergames.addon.config;

import net.labymod.api.Laby;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.gui.screen.key.Key;
import net.labymod.api.client.gui.screen.widget.widgets.input.ButtonWidget.ButtonSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.KeybindWidget.KeyBindSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.MultiKeybindWidget.MultiKeyBindSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.color.ColorPickerWidget.ColorPickerSetting;
import net.labymod.api.configuration.loader.Config;

import net.labymod.api.configuration.loader.annotation.ShowSettingInParent;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.Setting;
import net.labymod.api.notification.Notification;
import net.labymod.api.util.Color;
import net.labymod.api.util.MethodOrder;
import java.lang.reflect.Type;

public class NoFakeItemSubConfig extends Config {


    @ShowSettingInParent
    @SwitchSetting
    private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

    @ColorPickerSetting
    private final ConfigProperty<Integer> color = new ConfigProperty<>(-43691);

    @SwitchSetting
    private final ConfigProperty<Boolean> OnlyAH = new ConfigProperty<>(false);
    @SwitchSetting
    private final ConfigProperty<Boolean> FakeNames = new ConfigProperty<>(true);


    public ConfigProperty<Boolean> getEnabled() {return enabled;}
    public ConfigProperty<Boolean> getOnlyAH() {return OnlyAH;}
    public ConfigProperty<Boolean> getFakeNames() {return FakeNames;}
    public ConfigProperty<Integer> getColor() {return color;}



}
