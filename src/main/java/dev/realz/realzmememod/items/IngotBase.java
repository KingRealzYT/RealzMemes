package dev.realz.realzmememod.items;

import dev.realz.realzmememod.init.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static dev.realz.realzmememod.RealzMemes.MOD_ID;

public class IngotBase extends Item {
    public IngotBase() {
        super(new Item.Properties());
    }
}
