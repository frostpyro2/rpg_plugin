package org.example.contentplugin.rpgcore.data.entityInteraction.damage;

import org.bukkit.damage.DamageSource;
import org.bukkit.entity.Enemy;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.example.contentplugin.rpgcore.data.entity.EntityData;
import org.example.contentplugin.rpgcore.data.entityInteraction.attack.AttackData;
import org.example.contentplugin.rpgcore.data.entityInteraction.damage.data.DamageData;


public class DamageManage {
    public AttackData findAttack(EntityDamageEvent event){
        return prototype1(event);
    }

    private AttackData prototype1(EntityDamageEvent event){
        LivingEntity entity = (LivingEntity) event.getEntity();
        if(event instanceof EntityDamageByEntityEvent real){
            if(real.getDamager() instanceof Projectile p){
                if(!(p.getShooter() instanceof LivingEntity l)) return new AttackData(entity, null, new DamageData(event.getDamage(), findType(event)));
                EntityData data = EntityData.mapping(l);
                return new AttackData(entity, data, new DamageData(real.getDamage(), findType(real)));
            }
            EntityData data = EntityData.mapping((LivingEntity) real.getDamager());
            return new AttackData(entity, data, new DamageData(real.getDamage(), findType(real)));
        }
        return new AttackData(entity, null, new DamageData(event.getDamage(), findType(event)));
    }

    private DamageType[] findType(EntityDamageEvent event){
        switch(event.getCause()){
            case CUSTOM -> {
                return new DamageType[]{DamageType.SKILL};
            }
            case FIRE, POISON, CAMPFIRE, LAVA, SUFFOCATION, WITHER, MELTING ->{
                return new DamageType[]{DamageType.DOT, DamageType.PHYSICAL};
            }
            case PROJECTILE -> {
                return new DamageType[]{DamageType.PHYSICAL, DamageType.PROJECTILE};
            }
            case THORNS, DRAGON_BREATH ->{
                return new DamageType[]{DamageType.PHYSICAL, DamageType.MAGIC};
            }
            case ENTITY_ATTACK , ENTITY_SWEEP_ATTACK ->{
                return new DamageType[]{DamageType.PHYSICAL, DamageType.MELEE};
            }
        }
        return new DamageType[]{};
    }
}
