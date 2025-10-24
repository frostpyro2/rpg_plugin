package org.example.contentplugin.rpgcore.damage.data.damage;

import org.bukkit.event.entity.EntityDamageEvent;
import org.example.contentplugin.rpgcore.damage.type.DamageType;

public class DamagePacket implements Cloneable{
    private double amount;
    private DamageType type;

    private EntityDamageEvent event;

    public DamagePacket(){

    }

    public DamagePacket(double amount, DamageType type){
        this.amount = amount;
        this.type = type;
    }

    public DamageType getType(){
        return type;
    }

    public double getAmount(){
        return amount;
    }

    public EntityDamageEvent getEvent(){
        return event;
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
