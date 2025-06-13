package org.example.contentplugin.rpgcore.entity;

import org.bukkit.entity.LivingEntity;

public class EntityMap implements EntityData {

    private final EntityData tmp;

    public EntityMap(EntityData tmp){
        this.tmp = tmp;
    }

    @Override
    public LivingEntity getEntity() {
        return tmp.getEntity();
    }

    @Override
    public double getStat(String stat) {
        return 0;
    }
}
