package dev.realz.realzmememod.init;

import dev.realz.realzmememod.RealzMemes;
import dev.realz.realzmememod.items.IngotBase;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RealzMemes.MOD_ID);

    public static final RegistryObject<Item> MEME_ESSENCE = ITEMS.register("meme_essence", IngotBase::new);

}
