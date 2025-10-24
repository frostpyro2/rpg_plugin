package org.example.contentplugin.rpgcore.customEntity.model.model;

import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSetCursorItemPacket;
import net.minecraft.server.level.EntityPlayer;
import net.minecraft.world.item.component.CustomModelData;
import net.minecraft.world.level.storage.loot.functions.SetCustomModelDataFunction;
import org.bukkit.craftbukkit.v1_21_R6.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.example.contentplugin.rpgcore.entity.player.PlayerData;

public class ModelUpload {
    private EntityPlayer player;
    private Packet<?> modelPacket;
    public ModelUpload(PlayerData data, Packet<?> modelPacket){
        player = ((CraftPlayer)data.getEntity()).getHandle();
        this.modelPacket = modelPacket;
    }

    public void uploadModelByPacket(){
        player.transferCookieConnection.sendPacket(modelPacket);
    }


}
