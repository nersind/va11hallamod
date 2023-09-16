package com.nersind.vallhallamod;

import com.nersind.vallhallamod.items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab {
    public static final CreativeModeTab VALLHALLA_TAB = new CreativeModeTab("vallhallatab") {
        @Override
        public ItemStack makeIcon() {
           return new ItemStack(ModItems.BADTOUCH.get());
        }
    };
}
