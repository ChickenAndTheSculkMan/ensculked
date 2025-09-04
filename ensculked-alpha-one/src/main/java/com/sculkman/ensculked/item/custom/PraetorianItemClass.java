package com.sculkman.ensculked.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PraetorianItemClass extends SwordItem {
    public PraetorianItemClass(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        user.getItemCooldownManager().set(this, 20);
        return TypedActionResult.pass(user.getStackInHand(hand));
    }
}
