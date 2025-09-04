package com.sculkman.ensculked.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class HivemindStatusEffect extends StatusEffect {
    protected HivemindStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).addExperience(1  << amplifier);
        }
    }
}
