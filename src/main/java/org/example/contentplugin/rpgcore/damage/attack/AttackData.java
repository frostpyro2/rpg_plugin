package org.example.contentplugin.rpgcore.damage.attack;

import org.bukkit.entity.LivingEntity;
import org.example.contentplugin.rpgcore.entity.EntityData;
import org.example.contentplugin.rpgcore.damage.damage.data.DamageData;

public class AttackData {
    private LivingEntity target;
    private EntityData attacker;

    private DamageData data;

    public AttackData(LivingEntity target, EntityData attacker, DamageData data){
        this.target = target;
        this.attacker = attacker;
        this.data = data;
    }


    public LivingEntity getTarget(){
        return target;
    }

    public EntityData getAttacker(){
        return attacker;
    }

    public DamageData getData(){
        return data;
    }

}
