package org.example.contentplugin.rpgcore.event.attackEvent;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageEvent;
import org.example.contentplugin.rpgcore.damage.attack.AttackData;

public class AttackEvent extends Event implements Cancellable {
    private static HandlerList handlerList = new HandlerList();
    private AttackData coreData;
    private EntityDamageEvent triggerEvent;

    private boolean canceled = false;
    public AttackEvent(AttackData coreData, EntityDamageEvent triggerEvent){
        this.triggerEvent = triggerEvent;
        this.coreData = coreData;
    }

    @Override
    public boolean isCancelled() {
        return canceled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.canceled = cancel;
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
