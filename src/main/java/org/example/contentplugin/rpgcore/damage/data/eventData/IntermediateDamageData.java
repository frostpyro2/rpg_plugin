package org.example.contentplugin.rpgcore.damage.data.eventData;

import org.bukkit.event.entity.EntityDamageEvent;

//modify current damage (by stat, by passive, etc...)
public class IntermediateDamageData implements EventData {
    private OriginalData original;

    private EntityDamageEvent event;

    public IntermediateDamageData(OriginalData original){
        this.original = original;
        event = original.getEvent();
    }

    public OriginalData getOriginal(){
        return original;
    }

    public EntityDamageEvent getEvent(){
        return event;
    }

    public void modifyEvent(EntityDamageEvent event){
        this.event = event;
    }

    @Override
    public EventData getData() {
        return original;
    }
}
