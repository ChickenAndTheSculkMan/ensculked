package com.sculkman.ensculked.entity;

import com.sculkman.ensculked.Ensculked;
import com.sculkman.ensculked.entity.custom.EbonyStarProjectileEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<EbonyStarProjectileEntity> EBONY_STAR_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Ensculked.MOD_ID, "scorch_projectile"),
            FabricEntityTypeBuilder.<EbonyStarProjectileEntity>create(SpawnGroup.MISC, EbonyStarProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());


    public static void RegisterModEntites() {

    }
}
