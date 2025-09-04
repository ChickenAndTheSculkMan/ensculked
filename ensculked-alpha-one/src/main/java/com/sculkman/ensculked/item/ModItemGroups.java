package com.sculkman.ensculked.item;

import com.sculkman.ensculked.Ensculked;
import com.sculkman.ensculked.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup ENSCULKED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Ensculked.MOD_ID, "ensculked"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ensculked"))
                    .icon(() -> new ItemStack(ModItems.HEART_CATALYST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HEART_CATALYST);
                        entries.add(ModItems.SCULK_POTION);
                        entries.add(ModItems.CATALYST_FRAGMENT);
                        entries.add(ModItems.WARDEN_HEART);
                        entries.add(ModItems.SOUL_BOOK);
                        entries.add(ModItems.SOUL_SNATCHER);
                        entries.add(ModItems.PLAYER_SOUL);
                        entries.add(ModItems.CLAW_OF_D);
                        entries.add(ModItems.SCULK_PILE);
                        entries.add(ModItems.PRAETORIAN);
                        entries.add(ModBlocks.KEYMIND);
                        entries.add(ModItems.SCULK_MOUTH);
                        entries.add(ModItems.MUTATIONMESSENGER);
                        entries.add(ModItems.PURIFIER);
                        entries.add(ModItems.RESONANT_HELMET);
                        entries.add(ModItems.RESONANT_CHESTPLATE);
                        entries.add(ModItems.RESONANT_LEGGINGS);
                        entries.add(ModItems.RESONANT_BOOTS);
                    }).build());
    public static void registerItemGroups() {
        Ensculked.LOGGER.info("Registering item groups for " + Ensculked.MOD_ID);
    }
}
