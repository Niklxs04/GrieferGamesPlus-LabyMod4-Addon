package com.griefergames.addon.v1_8_9.mixins;

import com.griefergames.addon.GrieferGamesAddon;
import com.griefergames.addon.v1_8_9.ItemLists;
import com.griefergames.addon.v1_8_9.ItemProperty;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Mixin(GuiContainer.class)
public class ContainerMixin {
    List<String> FakeNames = List.of("AbgegrieItHD", "AbgegrieltHD", "AbgegierftHD", "AbgegriftHD", "AbgegreiftHD", "AbgegrietfHD",
        "AbgergieftHD", "AbgegireftHD", "AbgegreftHD", "AbgegriefdHD", "AbgegriefteHD", "AbgegrifetHD", "AbgerieftHD",
        "Zwiebackgesciht", "Zwiebackgesciht", "Zwiebackgseicht", "Zwiebackgsicht","Zwiebacksicht" ,"Bntor", "Bontor",
        "Banotr","RypxeYT" , "RypxYT" , "CiIl", "EntcheBuilsds" , "EntchenBuils", "EntchenBuidls", "SyntaxOffcial");
    List<String> Team = List.of("AbgegrieftHD" , "Bantor", "giftlippenstift", "CosmoHDx", "Zwiebackgesicht", "Cill", "LeonGrieferGames",
        "RypexYT", "p4skal", "LocutusVonBorg", "Valaphee", "Mauriceneu", "LucGamesYT", "LULULULUKA", "SyntaxOfficial","EntchenBuilds",
        "Renncifer", "50U7R34P3R", "ByPander", "Lord_Bard", "Nasima", "SaVi0604","phanTom84_", "Charlet", "KiLLerTaTToo", "AMDRazer",
        "Crazyanimalx", "180erPing", "1Puumy", "4zig","Regisseur_", "Manker02", "UltraLuca");


    @Inject(method = "drawSlot", at = @At("HEAD"))
    public void onDrawSlot(Slot slot, CallbackInfo ci) {
        ItemStack stack = slot.getStack();
        GuiContainer guiContainer = (GuiContainer) (Object) this;
        IInventory inventory = guiContainer.inventorySlots.getSlot(0).inventory;

        String containerName = inventory.getDisplayName().getUnformattedText();

        if (stack != null && GrieferGamesAddon.getSharedInstance().configuration().getSupgui().getEnabled().get() && GrieferGamesAddon.getSharedInstance().configuration().enabled().get()) {
            int colorValue = GrieferGamesAddon.getSharedInstance().configuration().getSupgui().getColor().get();
            int hexColor = 0xFF000000 | colorValue;
            List<ItemProperty> properties = ItemLists.ITEM_PROPERTIES.get(stack.getItem());

            if (properties != null) {
                for (ItemProperty property : properties) {
                    boolean matchesDisplayName = stack.hasDisplayName() && EnumChatFormatting.getTextWithoutFormattingCodes(stack.getDisplayName()).toLowerCase().contains(property.getDisplayName());
                    NBTTagCompound nbtTag = stack.getTagCompound();
                    boolean matchesNbt =nbtTag != null && nbtTag.toString().contains(property.getNbtKey().toString());

                    boolean matchesEnchantments = true;

                    for (Map.Entry<Enchantment, Integer> entry : property.getEnchantments().entrySet()) {
                        int level = EnchantmentHelper.getEnchantmentLevel(entry.getKey().effectId, stack);
                        if (level != entry.getValue()) {
                            matchesEnchantments = false;
                            break;
                        }
                    }

                    if (matchesDisplayName && !matchesNbt || matchesDisplayName && !matchesEnchantments) {

                        if(GrieferGamesAddon.getSharedInstance().configuration().getSupgui().getOnlyAH().get()) {

                            if (containerName.contains("Auktion")) {
                                highlightSlot(slot.xDisplayPosition, slot.yDisplayPosition,
                                    hexColor);
                            }
                        }else{
                            highlightSlot(slot.xDisplayPosition, slot.yDisplayPosition, hexColor);
                        }

                    }
                }
            }

            if(GrieferGamesAddon.getSharedInstance().configuration().getSupgui().getFakeNames().get() && GrieferGamesAddon.getSharedInstance().configuration().enabled().get()){
                for(String Name : FakeNames){
                    if(stack.getTagCompound() != null && stack.getTagCompound().toString().contains(Name)){
                        if(GrieferGamesAddon.getSharedInstance().configuration().getSupgui().getOnlyAH().get()) {

                            if (containerName.contains("Auktion")) {
                                highlightSlot(slot.xDisplayPosition, slot.yDisplayPosition,
                                    hexColor);
                            }
                        }else{
                            highlightSlot(slot.xDisplayPosition, slot.yDisplayPosition, hexColor);
                        }
                    }
                }
            }
        }
        //OldSigns

        if(stack != null && stack.getTagCompound() != null && GrieferGamesAddon.getSharedInstance().configuration().getSignSearch().getEnabled().get() && GrieferGamesAddon.getSharedInstance().configuration().enabled().get()){
            int colorValue = GrieferGamesAddon.getSharedInstance().configuration().getSignSearch().getColor().get();
            int hexColor = 0xFF000000 | colorValue;
            Enum year =  GrieferGamesAddon.getSharedInstance().configuration().getSignSearch().getEnum().get();
            String finalYear = year.toString().substring(year.toString().length() - 4);
            if(finalYear.matches("\\d+")) {
                String pattern = "\\d{2}\\.\\d{2}\\.\\d{4}";
                Matcher m =sortNBT(pattern, stack);
                while (m.find()) {
                    String gefundenesDatum = m.group();
                    if (gefundenesDatum.contains(finalYear)) {
                        highlightSlot(slot.xDisplayPosition, slot.yDisplayPosition, hexColor);
                    }
                }
            }else if(finalYear.equals("_All")){
                if(stack.getTagCompound().toString().contains("Signiert von")){
                    highlightSlot(slot.xDisplayPosition, slot.yDisplayPosition, hexColor);
                }
            }else if(finalYear.equals("Team")){
                String pattern = "Signiert von §a([\\w]+)";
                Matcher m =sortNBT(pattern, stack);
                if (m.find()) {
                    String signiererName = m.group(1);
                    if(Team.contains(signiererName)){
                        highlightSlot(slot.xDisplayPosition, slot.yDisplayPosition, hexColor);
                    }
                }
            } else if(finalYear.equals("stom")){
                String pattern = "Signiert von §a([\\w]+)";
                Matcher m =sortNBT(pattern, stack);
                if (m.find()) {
                    String signiererName = m.group(1);
                    String Custom = GrieferGamesAddon.getSharedInstance().configuration().getSignSearch().getText().get();
                    if(Custom != null && signiererName.toLowerCase().contains(Custom.toLowerCase())){
                        highlightSlot(slot.xDisplayPosition, slot.yDisplayPosition, hexColor);
                    }
                }
            }
        }

        if(stack != null && stack.getTagCompound() != null && GrieferGamesAddon.getSharedInstance().configuration().getZauberwaldSearch().get() && GrieferGamesAddon.getSharedInstance().configuration().enabled().get()){
            if(stack.getTagCompound().toString().contains("magicforest.item")){
                highlightSlot(slot.xDisplayPosition, slot.yDisplayPosition, 0xFFB0C0FF);
            }
        }
    }



    private Matcher sortNBT(String pattern, ItemStack stack){
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(stack.getTagCompound().toString());
        return m;
    }

    private void highlightSlot(int xPosition, int yPosition, int hexColor) {
        GlStateManager.disableDepth();
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.color(1.0F, 0.0F, 0.0F, 0.5F);  // Rot mit halber Transparenz
        GuiContainer.drawRect(xPosition, yPosition, xPosition + 16, yPosition + 16, hexColor);
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
        GlStateManager.enableDepth();
    }
}



