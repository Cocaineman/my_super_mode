package com.nrnkd.mymod.items.base;

import net.minecraft.item.Item;

public class ItemKey extends Item {
    public ItemKey(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
