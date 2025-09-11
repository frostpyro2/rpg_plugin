package org.example.contentplugin.rpgcore.damage.data.eventData;

import org.bukkit.event.entity.EntityDamageEvent;
import org.example.contentplugin.rpgcore.damage.data.eventData.EventData;
import org.jetbrains.annotations.NotNull;

//when server receives any damage event, each variable/method will be saved in this method (also additional variables such as stat point, damageType ect...)
public class OriginalData implements EventData {
    private EntityDamageEvent event;
    public OriginalData(@NotNull EntityDamageEvent event){
        this.event = event;
    }
    @NotNull
    public EntityDamageEvent getEvent(){
        return event;
    }

    @Override
    @Deprecated
    public EventData getData() {
        return this;
    }
}
