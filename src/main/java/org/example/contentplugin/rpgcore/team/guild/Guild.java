package org.example.contentplugin.rpgcore.team.guild;

import net.minecraft.server.level.EntityPlayer;
import org.bukkit.craftbukkit.v1_21_R6.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.example.contentplugin.rpgcore.entity.EntityData;
import org.example.contentplugin.rpgcore.team.TeamSystem;

import java.util.ArrayList;
import java.util.Collection;

public class Guild implements TeamSystem {
    private EntityData leader;

    private Collection<EntityData> member = new ArrayList<>();

    @Override
    public EntityData getLeader() {
        return leader;
    }

    public void addMember(EntityData data){
        member.add(data);
    }


    public void setLeader(EntityData newLeader){
        leader = newLeader;
    }
}
