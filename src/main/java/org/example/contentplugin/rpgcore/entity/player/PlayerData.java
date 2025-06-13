package org.example.contentplugin.rpgcore.entity.player;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.example.contentplugin.rpgcore.entity.EntityData;

public class PlayerData implements EntityData {
    private LivingEntity master;

    @Override
    public Player getEntity() {
        return (Player) master;
    }

    @Override
    public double getStat(String stat) {
        return 0;
    }
}
