package org.example.contentplugin.rpgcore.damage.data.eventData;

import org.bukkit.damage.DamageSource;
import org.bukkit.damage.DamageType;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class FinalDamageData implements EventData {
    private EntityDamageEvent event;
    private IntermediateDamageData intermediate;
    public FinalDamageData(IntermediateDamageData intermediate){
        this.intermediate = intermediate;
        event = intermediate.getEvent();
    }
    @Override
    public EntityDamageEvent getEvent() {
        return event;
    }

    @Override
    public EventData getData() {
        return intermediate;
    }

    public void modifyEvent(EntityDamageEvent event){
        this.event = event;
    }
}
