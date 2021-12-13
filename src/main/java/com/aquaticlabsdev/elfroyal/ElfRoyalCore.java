package com.aquaticlabsdev.elfroyal;

import lombok.Getter;

public final class ElfRoyalCore {

    private static ElfRoyalCore instance;

    @Getter
    private ElfRoyalPlugin plugin;

    public ElfRoyalCore(ElfRoyalPlugin plugin) {
        if (instance != null) {
            return;
        }
        this.plugin = plugin;
        instance = this;
    }



}
