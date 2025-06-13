package org.example.contentplugin.rpgcore.damage.damage.data;

import org.example.contentplugin.rpgcore.damage.damage.DamageType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DamageData {
    private DamageType[] types;

    private List<DamagePacket> packets = new ArrayList<>();

    private DamagePacket init;

    private final double MAX = 0.1;

    public DamageData(double damage, DamageType...types){
        this.types = types;
        init = new DamagePacket(damage, types);
        packets.add(init);
    }

    public double damage(){
        double val = 0;
        for(DamagePacket packet : packets){
            val += packet.getDamage();
        }

        return  Math.max(MAX, val);
    }

    public List<DamageType> getTypes(){
        return new ArrayList<>(Arrays.asList(types));
    }
}
