package org.example.contentplugin.rpgcore.customEntity.packet;

import net.minecraft.network.protocol.Packet;

public class GetPacket {
    private Packet<?> targetPacket;

    public GetPacket(Packet<?> targetPacket){
        this.targetPacket = targetPacket;
    }
}
