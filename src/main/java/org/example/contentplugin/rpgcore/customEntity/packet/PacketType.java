package org.example.contentplugin.rpgcore.customEntity.packet;

import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundBlockChangedAckPacket;
import net.minecraft.network.protocol.game.ClientboundDebugEntityValuePacket;
import net.minecraft.network.protocol.game.ClientboundEntityPositionSyncPacket;
import net.minecraft.network.protocol.game.ClientboundSetCursorItemPacket;
import org.bukkit.inventory.meta.BlockDataMeta;

public enum PacketType {

    ITEM_META(ClientboundSetCursorItemPacket.class),
    BLOCK_META(ClientboundBlockChangedAckPacket.class),
    ENTITY_LOCATION(ClientboundEntityPositionSyncPacket.class),
    ENTITY_VALUE(ClientboundDebugEntityValuePacket.class)
    ;
    private Class<? extends Packet<?>> key;

    PacketType(Class<? extends Packet<?>> key){
        this.key = key;
    }

    public Class<? extends Packet<?>> getKey(){
        return key;
    }

}
