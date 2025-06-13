package org.example.contentplugin.rpgcore.team;

import org.bukkit.entity.LivingEntity;
import org.example.contentplugin.rpgcore.entity.EntityData;

public class Authority implements EntityData {
    private boolean kickAble;

    private boolean inviteAble;

    private EntityData data;

    public Authority(EntityData data){
        this.data = data;
    }
    @Override
    public LivingEntity getEntity() {
        return data.getEntity();
    }

    @Override
    public double getStat(String stat) {
        return data.getStat(stat);
    }

    public void setKickAble(boolean kickAble){
        this.kickAble = kickAble;
    }

    public void setInviteAble(boolean inviteAble){
        this.inviteAble = inviteAble;
    }
}
