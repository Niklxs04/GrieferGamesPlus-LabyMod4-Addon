package com.griefergames.addon.config;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.color.ColorPickerWidget.ColorPickerSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.annotation.SettingSection;
import net.labymod.api.util.Color;


@ConfigName("settings")
public class ggConfig extends AddonConfig {


    @SwitchSetting
    private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);




    @SettingSection("NoFakeItems")
    private final NoFakeItemSubConfig NFsupgui = new NoFakeItemSubConfig();

    @SwitchSetting
    private final OldSignsConfig signSearch = new OldSignsConfig();

    @SwitchSetting
    private final ConfigProperty<Boolean> ZauberwaldSearch = new ConfigProperty<>(false);

    @SettingSection("Chat")
    @SwitchSetting
    private final ConfigProperty<Boolean> ShorterNumber = new ConfigProperty<>(false);
    @SwitchSetting
    private final ConfigProperty<Boolean> PublicTab = new ConfigProperty<>(true);

    @SettingSection("Other")

    @SwitchSetting
    private final ConfigProperty<Boolean> Zauberer = new ConfigProperty<>(true);

    @SwitchSetting
    private final ConfigProperty<Boolean> AfkPortal = new ConfigProperty<>(true);






    //@ColorPickerSetting(chroma = true, alpha = true)
    //private final ConfigProperty<Color> color = new ConfigProperty<>(Color.ofRGB(9, 58, 142, 70));

    @Override
    public ConfigProperty<Boolean> enabled() {
        return enabled;
    }
    public ConfigProperty<Boolean> getZauberwaldSearch() {return ZauberwaldSearch;}
    public ConfigProperty<Boolean> getShorterNumber() {return ShorterNumber;}
    public ConfigProperty<Boolean> getZauberer() {return Zauberer;}
    public ConfigProperty<Boolean> getAfkPortal() {return AfkPortal;}
    public ConfigProperty<Boolean> getPublicTab() {return PublicTab;}

    public NoFakeItemSubConfig getSupgui(){return NFsupgui;}

    public OldSignsConfig getSignSearch(){return signSearch;}

}
