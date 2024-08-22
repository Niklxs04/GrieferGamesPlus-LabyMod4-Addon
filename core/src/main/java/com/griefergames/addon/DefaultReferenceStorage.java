package com.griefergames.addon;

import net.labymod.api.reference.ReferenceStorageAccessor;
import net.labymod.api.service.annotation.AutoService;
import org.jetbrains.annotations.NotNull;

@AutoService(ReferenceStorageAccessor.class)
public class DefaultReferenceStorage implements ReferenceStorageAccessor {
    @NotNull
    public IBridge iBridge() {
        return null;
    }
}

