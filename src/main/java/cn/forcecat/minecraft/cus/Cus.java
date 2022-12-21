package cn.forcecat.minecraft.cus;

import cn.forcecat.minecraft.cus.item.ModFoodComponents;
import cn.forcecat.minecraft.cus.item.TestGuoItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Cus implements ModInitializer {
    public static final String MOD_ID = "cus";
    public static final Logger LOGGER = LoggerFactory.getLogger("cus");

    public static final Item CAT_GUO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.CAT_GUO));
    // public static final Item TEST_GUO = new TestGuoItem(new Item.Settings().group(ItemGroup.MISC).maxCount(16));
    public static final Item ENCHANTED_BAKED_POTATO = new Item(new Item.Settings().group(ItemGroup.FOOD).maxCount(64).food(ModFoodComponents.ENCHANTED_BAKED_POTATO).rarity(Rarity.EPIC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("cus", "cat_guo"), CAT_GUO);
        //Registry.register(Registry.ITEM, new Identifier("cus", "test_guo"), TEST_GUO);
        Registry.register(Registry.ITEM, new Identifier("cus", "enchanted_baked_potato"), ENCHANTED_BAKED_POTATO);
    }
}