package dev.realz.realzmememod.init;

import dev.realz.realzmememod.RealzMemes;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RealzMemes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MEMES_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MEMES_TAB = event.registerCreativeModeTab(new ResourceLocation(RealzMemes.MOD_ID, "memes_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.MEME_ESSENCE.get()))
                        .title(Component.translatable("creativetab." + RealzMemes.MOD_ID + ".memes_tab")));
    }
}
