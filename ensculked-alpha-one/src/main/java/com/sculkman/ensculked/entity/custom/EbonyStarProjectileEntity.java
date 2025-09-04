package com.sculkman.ensculked.entity.custom;

import com.sculkman.ensculked.entity.ModEntities;
import com.sculkman.ensculked.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class EbonyStarProjectileEntity extends ThrownItemEntity {
    public EbonyStarProjectileEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    //Entire Projectile Entity done with Kaupenjoe's help (https://www.youtube.com/watch?v=1kXQmxRwjW0&list=PLKGarocXCE1EO43Dlf5JGh7Yk-kRAXUEJ&index=37)

    public EbonyStarProjectileEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.EBONY_STAR_PROJECTILE, livingEntity, world);
    }

    public void tick() {
        super.tick();
        this.getWorld().addParticle(ParticleTypes.SCULK_CHARGE_POP, this.getX(), this.getY(), this.getZ(), 0,0, 0);
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity var3 = this.getOwner();
        if (var3 instanceof LivingEntity livingEntity) {
            entityHitResult.getEntity().damage(this.getDamageSources().mobProjectile(this, livingEntity), 10.0F);
        }
        this.discard();
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.EMPTY_ITEM;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        this.discard();
        super.onBlockHit(blockHitResult);
    }
}