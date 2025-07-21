package org.example.contentplugin.rpgcore.event.attackEvent;

import org.bukkit.event.entity.EntityDamageEvent;
import org.example.contentplugin.rpgcore.damage.attack.AttackData;
import org.example.contentplugin.rpgcore.entity.player.PlayerData;

public class PlayerAttackData extends AttackEvent{
    private PlayerData data;
    public PlayerAttackData(AttackData coreData, EntityDamageEvent triggerEvent) {
        super(coreData, triggerEvent);
        data = (PlayerData) coreData.getAttacker();
    }

    public PlayerData getPlayer(){
        return data;
    }
}
