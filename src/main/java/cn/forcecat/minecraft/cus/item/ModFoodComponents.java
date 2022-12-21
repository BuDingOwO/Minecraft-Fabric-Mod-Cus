package cn.forcecat.minecraft.cus.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CAT_GUO = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).snack().build();
    public static final FoodComponent ENCHANTED_BAKED_POTATO = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0F).alwaysEdible().build();
}
