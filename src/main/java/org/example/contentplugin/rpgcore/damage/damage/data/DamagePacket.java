package org.example.contentplugin.rpgcore.damage.damage.data;

import org.example.contentplugin.rpgcore.damage.damage.DamageType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DamagePacket implements Cloneable{
    private double damage;
    private DamageType[] types;

    public DamagePacket(double damage, DamageType...types){
        this.damage = damage;
        this.types = types;
    }

    public double getDamage(){
        return damage;
    }

    public List<DamageType> getTypes(){
        return new ArrayList<>(Arrays.asList(types));
    }


    @Override
    public DamagePacket clone() {
        try {
            return (DamagePacket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
