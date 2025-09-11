package org.example.contentplugin.rpgcore.damage.data.damage;

import org.example.contentplugin.rpgcore.damage.type.DamageType;

public class Packet implements Cloneable{
    private double amount;
    private DamageType type;

    public Packet(double amount, DamageType type){
        this.amount = amount;
        this.type = type;
    }

    public DamageType getType(){
        return type;
    }

    public double getAmount(){
        return amount;
    }


    @Override
    public Packet clone() {
        try {
            return (Packet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
