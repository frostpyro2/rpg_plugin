package org.example.contentplugin.rpgcore.event.attackEvent;

import org.bukkit.entity.ArmorStand;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageEvent;
import org.example.contentplugin.rpgcore.data.entityInteraction.attack.AttackData;

public class AttackEvent extends Event {
    private static HandlerList handlerList = new HandlerList();
    private AttackData coreData;
    private EntityDamageEvent triggerEvent;


    public AttackEvent(AttackData coreData, EntityDamageEvent triggerEvent){
        this.triggerEvent = triggerEvent;
        this.coreData = coreData;
    }

    public AttackData getCoreData(){
        return coreData;
    }

    public EntityDamageEvent getTriggerEvent(){
        return triggerEvent;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList(){
        return handlerList;
    }
}
