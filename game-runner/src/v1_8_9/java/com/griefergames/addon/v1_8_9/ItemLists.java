package com.griefergames.addon.v1_8_9;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemLists {
    public static final Map<Item, List<ItemProperty>> ITEM_PROPERTIES = new HashMap<>();

    static {
        // prefixe
        ITEM_PROPERTIES.put(Items.skull, List.of(
            new ItemProperty("weißgraue farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("gelb-weiße farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("rainbow farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("herbst farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("halloween farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("frühlings farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 0)),
            new ItemProperty("lucky farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("pinkweiße farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("sommer farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("frost farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("weihnachts farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("früchte farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("freundliche herbst farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("grünweiße farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("viollettweiße farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("3d-farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("ocean farbe", "von §aGrieferGames", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("zuckerstangen farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("inferno farbe", "von §aGrieferGames", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("gelbgrünee farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("flower farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("galaxy farbe", "von §aGrieferGames", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("oster farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("flower farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("österrich farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("schweiz farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("deutschland farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("rainbow schrift", "von §aAbgegrieftHD", Map.of(Enchantment.unbreaking, 0)),
            new ItemProperty("sommer schrift", "von §aAbgegrieftHD", Map.of(Enchantment.unbreaking, 0)),
            new ItemProperty("lucky-kiste", "von §aAbgegrieftHD", Map.of(Enchantment.unbreaking, 0))
        ));



        //Prefixe

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.lit_pumpkin), List.of(
            new ItemProperty("halloween farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.leaves), List.of(
            new ItemProperty("weihnachts farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.stained_glass_pane), List.of(
            new ItemProperty("weiße farbe", "von §aAbgegrieftHD", Map.of(Enchantment.looting, 0)),
            new ItemProperty("magische farbe", "von §aAbgegrieftHD", Map.of(Enchantment.looting, 0)),
            new ItemProperty("rote farbe", "von §aAbgegrieftHD", Map.of(Enchantment.looting, 0)),
            new ItemProperty("goldene farbe", "von §aAbgegrieftHD", Map.of(Enchantment.looting, 0)),
            new ItemProperty("blaue farbe", "von §aAbgegrieftHD", Map.of(Enchantment.looting, 0)),
            new ItemProperty("grüne farbe", "von §aAbgegrieftHD", Map.of(Enchantment.looting, 0))
        ));


        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.quartz_ore), List.of(
            new ItemProperty("rotweiße farbe", "von §aAbgegrieftHD", Map.of(Enchantment.fireAspect, 1)),
            new ItemProperty("rotweiße-farbe", "scam", Map.of(Enchantment.fireAspect, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.lapis_ore), List.of(
            new ItemProperty("doppelblaue farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("doppelblaue-farbe", "scam", Map.of(Enchantment.sharpness, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.gold_ore), List.of(
            new ItemProperty("doppelgelbe farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("doppelgelbe-farbe", "scam", Map.of(Enchantment.sharpness, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.stained_hardened_clay), List.of(
            new ItemProperty("poppellilane farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("poppellilane-farbe", "scam", Map.of(Enchantment.sharpness, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.redstone_ore), List.of(
            new ItemProperty("doppelrote farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("doppelrote-farbe", "scam", Map.of(Enchantment.sharpness, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.coal_ore), List.of(
            new ItemProperty("doppelgraue farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("doppelgraue-farbe", "scam", Map.of(Enchantment.sharpness, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.emerald_ore), List.of(
            new ItemProperty("doppelgrüne farbe", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("doppelgrüne-farbe", "scam", Map.of(Enchantment.sharpness, 1))
        ));



    //Einlösbar

        ITEM_PROPERTIES.put(Items.dye, List.of(
            new ItemProperty("supreme-rang", "von §aAbgegrieftHD", Map.of(Enchantment.fortune, 1)),
            new ItemProperty("partikel-effekt", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 0)),
            new ItemProperty("bunte-clan-tags", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 0)),
            new ItemProperty("clan sondercodes", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 0))
        ));

        ITEM_PROPERTIES.put(Items.glowstone_dust, List.of(
            new ItemProperty("hero-rang", "von §aAbgegrieftHD", Map.of(Enchantment.fortune, 5))
        ));

        ITEM_PROPERTIES.put(Items.golden_helmet, List.of(
            new ItemProperty("+1 clanmitglied", "von §aAbgegrieftHD", Map.of(Enchantment.fortune, 0))
        ));

        ITEM_PROPERTIES.put(Items.nether_star, List.of(
            new ItemProperty("community-kiste", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 0)),
            new ItemProperty("community kiste", "Scam", Map.of(Enchantment.sharpness, 0))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.ender_chest), List.of(
            new ItemProperty("enderchest downgrade", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 0)),
            new ItemProperty("enderchest upgrade", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 0)),
            new ItemProperty("epische kiste", "von §aAbgegrieftHD", Map.of(Enchantment.unbreaking, 0)),
            new ItemProperty("epische-kiste", "Scam", Map.of(Enchantment.unbreaking, 0))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.sapling), List.of(
            new ItemProperty("spawn-gs", "Dieser Code schützt", Map.of(Enchantment.fortune, 100))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.double_plant), List.of(
            new ItemProperty("sommer-kiste", "von §aAbgegrieftHD", Map.of(Enchantment.unbreaking, 0))
        ));


        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.chest), List.of(
            new ItemProperty("vote-kiste", "von §aAbgegrieftHD", Map.of(Enchantment.fortune, 0)),
            new ItemProperty("vote kiste", "Scam", Map.of(Enchantment.fortune, 0))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.end_portal_frame), List.of(
            new ItemProperty("supreme-kiste", "von §aAbgegrieftHD", Map.of(Enchantment.unbreaking, 0)),
            new ItemProperty("supreme kiste", "Scam", Map.of(Enchantment.unbreaking, 0)),
            new ItemProperty("mobiles caseopening", "für Zocker!", Map.of(Enchantment.fortune, 1))
        ));

        ITEM_PROPERTIES.put(Items.fire_charge, List.of(
            new ItemProperty("bonze-booster", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("bonze booster", "scam", Map.of(Enchantment.sharpness, 1))
        ));

        ITEM_PROPERTIES.put(Items.emerald, List.of(
            new ItemProperty("money-kiste", "von §aAbgegrieftHD", Map.of(Enchantment.infinity, 1)),
            new ItemProperty("money kiste", "scam", Map.of(Enchantment.infinity, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.slime_block), List.of(
            new ItemProperty("frühlings-kiste", "von §aAbgegrieftHD", Map.of(Enchantment.infinity, 0)),
            new ItemProperty("frühlings kiste", "scam", Map.of(Enchantment.infinity, 0))
        ));

        ITEM_PROPERTIES.put(Items.gold_ingot, List.of(
            new ItemProperty("pay-all rechte", "von §aAbgegrieftHD", Map.of(Enchantment.infinity, 0)),
            new ItemProperty("payall rechte", "scam", Map.of(Enchantment.infinity, 0)),
            new ItemProperty("pay-all-rechte", "scam", Map.of(Enchantment.infinity, 0))
        ));

        ITEM_PROPERTIES.put(Items.name_tag, List.of(
            new ItemProperty("mob-token", "Schützt nur vor", Map.of(Enchantment.infinity, 0)),
            new ItemProperty("markiere ein tier als haustier", "Klicke auf ein Tier", Map.of(Enchantment.infinity, 0))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.beacon), List.of(
            new ItemProperty("wintter-kiste", "von §aAbgegrieftHD", Map.of(Enchantment.infinity, 0)),
            new ItemProperty("winter kiste", "Scam", Map.of(Enchantment.infinity, 0)),
            new ItemProperty("goldene herbst-kiste", "von §aAbgegrieftHD", Map.of(Enchantment.infinity, 0)),
            new ItemProperty("goldene-herbst-kiste", "Scam", Map.of(Enchantment.infinity, 0)),
            new ItemProperty("goldene herbst kiste", "Scam", Map.of(Enchantment.infinity, 0))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.enchanting_table), List.of(
            new ItemProperty("vote-streak-retter", "darf nicht älter als", Map.of(Enchantment.infinity, 0))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.iron_door), List.of(
            new ItemProperty("+1 grundstück-slot", "von §aAbgegrieftHD", Map.of(Enchantment.infinity, 0))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.oak_door), List.of(
            new ItemProperty("+1 homes", "von §aAbgegrieftHD", Map.of(Enchantment.infinity, 0))
        ));

        ITEM_PROPERTIES.put(Items.book, List.of(
            new ItemProperty("/signinv-recht", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("/signinv recht", "scam", Map.of(Enchantment.sharpness, 1)),
            new ItemProperty("merge-gutschein", "eine Richtung gratis mergen.", Map.of(Enchantment.sharpness, 0))

        ));

        ITEM_PROPERTIES.put(Items.feather, List.of(
            new ItemProperty("plot-fliegen", "das Fliegen aktivieren", Map.of(Enchantment.sharpness, 0))
        ));

        ITEM_PROPERTIES.put(Items.armor_stand, List.of(
            new ItemProperty("+1 hologramme", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 0))
        ));

        ITEM_PROPERTIES.put(Items.paper, List.of(
            new ItemProperty("grundstück-gutschein", "gratis in Besitz", Map.of(Enchantment.sharpness, 0)),
            new ItemProperty("rentner-ausweis", "", Map.of(Enchantment.unbreaking, 99)),
            new ItemProperty("zertifikat", "Über /zertifikat sign können Spieler", Map.of(Enchantment.unbreaking, 0))
        ));
//----------------------
        ITEM_PROPERTIES.put(Items.potionitem, List.of(
            new ItemProperty("abbautrank", "schneller abbauen", Map.of(Enchantment.fortune, 0)),
            new ItemProperty("flugtrank", "fliegen", Map.of(Enchantment.fortune, 0))
        ));

    //Sonstig



        ITEM_PROPERTIES.put(Items.stick, List.of(
            new ItemProperty("op-stick", "", Map.of(Enchantment.looting, 3)),
            new ItemProperty("mhh..", "", Map.of(Enchantment.knockback, 15))
        ));



        ITEM_PROPERTIES.put(Items.cake, List.of(
            new ItemProperty("lordvarus kuchen", "von §aAbgegrieftHD", Map.of(Enchantment.unbreaking, 3))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.anvil), List.of(
            new ItemProperty("der bannhammer", "von §aBantor", Map.of(Enchantment.unbreaking, 0)),
            new ItemProperty("/amboss-recht", "von §aAbgegrieftHD", Map.of(Enchantment.sharpness, 1))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.red_flower), List.of(
            new ItemProperty("lordvarus-freundesblume", "<3", Map.of(Enchantment.unbreaking, 3))
        ));

        ITEM_PROPERTIES.put(Items.sugar, List.of(
            new ItemProperty("verbuggtes bett", "Das is nen scam", Map.of(Enchantment.unbreaking, 0)),
            new ItemProperty("buggy holzstufe", "Das is nen scam", Map.of(Enchantment.unbreaking, 0)),
            new ItemProperty("buggy stone monster egg", "Das is nen scam", Map.of(Enchantment.unbreaking, 0))
        ));
        ITEM_PROPERTIES.put(Items.spawn_egg, List.of(
            new ItemProperty("*iced out* dorfbewohner", "Sehr sicher scam", Map.of(Enchantment.luckOfTheSea, 1))
        ));


        ITEM_PROPERTIES.put(Items.diamond_sword, List.of(
            new ItemProperty("birth klinge", "", Map.of(Enchantment.looting, 21)),
            new ItemProperty("klinge von grafbonze", " von §aGrafBonze", Map.of(Enchantment.looting, 21))
        ));


        ITEM_PROPERTIES.put(Items.wooden_axe, List.of(
            new ItemProperty("lordvarus trollaxt", "", Map.of(Enchantment.fireAspect, 2))
        ));

        ITEM_PROPERTIES.put(Items.diamond_pickaxe, List.of(
            new ItemProperty("moderne baumeister picke", "", Map.of(Enchantment.fortune, 6))
        ));

        ITEM_PROPERTIES.put(Items.bow, List.of(
            new ItemProperty("birth-bogen", "von §aAbgegrieftHD", Map.of(Enchantment.looting, 22))
        ));

        ITEM_PROPERTIES.put(Item.getItemFromBlock(Blocks.noteblock), List.of(
            new ItemProperty("mobiles 4-gewinnt", "Wird zerstört beim Abbauen", Map.of(Enchantment.fortune, 1))
        ));



    }





    }





