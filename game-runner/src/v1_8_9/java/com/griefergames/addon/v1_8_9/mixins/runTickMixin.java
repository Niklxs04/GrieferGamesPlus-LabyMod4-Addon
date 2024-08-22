package com.griefergames.addon.v1_8_9.mixins;

import net.labymod.api.Laby;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.griefergames.addon.v1_8_9.EntityHolder.SUGGESTIONS;

@Mixin(Minecraft.class)
public abstract class runTickMixin {
    private int removeTime = 600;
    private int counter = 0;
    @Inject(method = "runTick", at = @At("HEAD"))
    public void onRunTick(CallbackInfo ci) {

        if(!SUGGESTIONS.isEmpty()){
            if(SUGGESTIONS.size() >= 5){
                removeTime = 200;
            }else {
                removeTime = 600;
            }
            if(counter >= removeTime){
                SUGGESTIONS.remove(0);
                counter = 0;

            }else {
                counter++;
            }


        }

    }
   

}