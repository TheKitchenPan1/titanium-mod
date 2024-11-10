package net.thepan.ti_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thepan.ti_mod.TitaniumMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TitaniumMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TITANIUM_ITEMS_TAB = CREATIVE_MODE_TABS.register("titanium_items_tab" ,
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM.get()))
                    .title(Component.translatable("Titanium"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TITANIUM.get());
                        output.accept(ModItems.RAW_TITANIUM.get());
                    })

                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register((eventBus));
    }
}
