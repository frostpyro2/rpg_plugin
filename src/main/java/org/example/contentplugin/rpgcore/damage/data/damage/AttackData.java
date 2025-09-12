package org.example.contentplugin.rpgcore.damage.data.damage;

import org.bukkit.entity.LivingEntity;
import org.example.contentplugin.rpgcore.entity.EntityData;

public class AttackData {
    private EntityData attacker;
    private LivingEntity damaged;
    private DamageData data;
    public AttackData(EntityData attacker, LivingEntity damaged, DamageData data){
        this.attacker = attacker;
        this.damaged = damaged;
        this.data = data;
    }

    public EntityData getAttacker(){
        return attacker;
    }

    public DamageData getData() {
        return data;
    }

    public LivingEntity getDamaged() {
        return damaged;
    }
}
