package com.griefergames.addon.v1_8_9.mixins;
import com.griefergames.addon.GrieferGamesAddon;
import net.minecraft.network.play.server.S3APacketTabComplete;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.griefergames.addon.v1_8_9.EntityHolder.SUGGESTIONS;

@Mixin(S3APacketTabComplete.class)
public class TabCompleteMixin {
    @Inject(method = "func_149630_c", at = @At("RETURN"), cancellable = true)
    private void onGetSuggestions(CallbackInfoReturnable<String[]> cir) {
        if (GrieferGamesAddon.getSharedInstance().configuration().getPublicTab().get() && GrieferGamesAddon.getSharedInstance().configuration().enabled().get()) {
            // Holen der ursprünglichen Vorschläge
            String[] originalSuggestions = cir.getReturnValue();

            if (originalSuggestions != null) {
                // Erstellen einer Liste von Vorschlägen, einschließlich des neuen Vorschlags
                List<String> suggestionsList = new ArrayList<>(Arrays.asList(originalSuggestions));
                if (!SUGGESTIONS.isEmpty()) {
                    for (String name : SUGGESTIONS) {
                        if (!suggestionsList.contains(name)) {
                            suggestionsList.add(
                                name); // Füge _custom als neuen, eigenständigen Vorschlag hinzu
                        }
                    }
                }

                // Setzen der modifizierten Vorschläge zurück in die Rückgabewerte
                cir.setReturnValue(suggestionsList.toArray(new String[0]));
            }

        }
    }
}
