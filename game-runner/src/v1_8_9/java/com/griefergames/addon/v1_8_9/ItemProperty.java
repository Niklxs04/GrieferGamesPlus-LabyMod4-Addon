package com.griefergames.addon.v1_8_9;

import net.minecraft.enchantment.Enchantment;
import java.util.Map;

public class ItemProperty {
    private final String displayName;
    private final String nbtKey;
    private final Map<Enchantment, Integer> enchantments;

    public ItemProperty(String displayName, String nbtKey, Map<Enchantment, Integer> enchantments) {
        this.displayName = displayName;
        this.nbtKey = nbtKey;
        this.enchantments = enchantments;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getNbtKey() {
        return nbtKey;
    }

    public Map<Enchantment, Integer> getEnchantments() {
        return enchantments;
    }


}
