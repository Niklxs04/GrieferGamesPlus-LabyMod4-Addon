package com.griefergames.addon.config;

import com.griefergames.addon.Enum.OldSignEnum;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.color.ColorPickerWidget.ColorPickerSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.dropdown.DropdownWidget.DropdownSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ShowSettingInParent;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class OldSignsConfig extends Config {
    @ShowSettingInParent
    @SwitchSetting
    private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

    @ColorPickerSetting
    private final ConfigProperty<Integer> color = new ConfigProperty<>(-171);

    @DropdownSetting
    private ConfigProperty<OldSignEnum> Signenum = new ConfigProperty<>(OldSignEnum.Signs_2018);
    @TextFieldSetting
    private ConfigProperty<String> text = new ConfigProperty<>("Mimi494");

    public ConfigProperty<Boolean> getEnabled() {return enabled;}
    public ConfigProperty<Integer> getColor() {return color;}
    public ConfigProperty<String> getText() {return text;}
    public ConfigProperty<OldSignEnum> getEnum() {return Signenum;}


}
