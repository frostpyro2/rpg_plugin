package org.example.contentplugin.rpgcore.damage.data.eventData;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;

public interface EventData {
    EntityDamageEvent getEvent();
    EventData getData();
}
