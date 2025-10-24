package org.example.contentplugin.rpgcore.damage.data.damage;

import org.example.contentplugin.rpgcore.damage.type.DamageType;

import java.util.ArrayList;
import java.util.List;

public class DamageData {
    private List<DamagePacket> damagePackets = new ArrayList<>();
    private DamagePacket init;

    private DamageType type;

    private DamageData(){
        init = null;
    }

    private DamageData(double amount, DamageType type){
        this.type = type;
        init = new DamagePacket(amount, type);
        damagePackets.add(init);
    }

    private final double MIN = .01;

    public double damage(){
        double amount = 0;
        for(DamagePacket damagePacket : damagePackets){
            amount += damagePacket.getAmount();
        }

        return Math.min(amount, MIN);
    }

    public void addPacket(double amount, DamageType type){
        damagePackets.add(new DamagePacket(amount, type));
    }

    public DamageType getType(){
        return type;
    }
}
