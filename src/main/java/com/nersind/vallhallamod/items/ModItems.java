package com.nersind.vallhallamod.items;

import com.nersind.vallhallamod.ModTab;
import com.nersind.vallhallamod.VallhallaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VallhallaMod.MOD_ID);

    //ingredients
    public static final RegistryObject<Item> ADELHYDE = ITEMS.register("adelhyde",
            () -> new Item(new Item.Properties().tab(ModTab.VALLHALLA_TAB)));
    public static final RegistryObject<Item> BRONSONEXT = ITEMS.register("bronson_extract",
            () -> new Item(new Item.Properties().tab(ModTab.VALLHALLA_TAB)));
    public static final RegistryObject<Item> FLANERGIDE = ITEMS.register("flanergide",
            () -> new Item(new Item.Properties().tab(ModTab.VALLHALLA_TAB)));
    public static final RegistryObject<Item> KARMOTRINE = ITEMS.register("karmotrine",
            () -> new Item(new Item.Properties().tab(ModTab.VALLHALLA_TAB)));
    public static final RegistryObject<Item> PWDDELTA = ITEMS.register("powdered_delta",
            () -> new Item(new Item.Properties().tab(ModTab.VALLHALLA_TAB)));
    //проникновение ))))
    public static final RegistryObject<Item> BADTOUCH = ITEMS.register("badtouch",
            () -> new Item(new Item.Properties().tab(ModTab.VALLHALLA_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
