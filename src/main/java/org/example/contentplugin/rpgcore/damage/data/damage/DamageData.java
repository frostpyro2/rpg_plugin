package org.example.contentplugin.rpgcore.damage.data.damage;

import org.example.contentplugin.rpgcore.damage.type.DamageType;

import java.util.ArrayList;
import java.util.List;

public class DamageData {
    private List<Packet> packets = new ArrayList<>();
    private Packet init;

    private DamageType type;

    private DamageData(){
        init = null;
    }

    private DamageData(double amount, DamageType type){
        this.type = type;
        init = new Packet(amount, type);
        packets.add(init);
    }

    private final double MIN = .01;

    public double damage(){
        double amount = 0;
        for(Packet packet : packets){
            amount += packet.getAmount();
        }

        return Math.min(amount, MIN);
    }

    public void addPacket(double amount, DamageType type){
        packets.add(new Packet(amount, type));
    }

    public DamageType getType(){
        return type;
    }
}
