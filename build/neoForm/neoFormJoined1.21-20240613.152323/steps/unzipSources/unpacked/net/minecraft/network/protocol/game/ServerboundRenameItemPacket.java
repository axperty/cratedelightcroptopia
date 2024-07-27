package net.minecraft.network.protocol.game;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketType;

public class ServerboundRenameItemPacket implements Packet<ServerGamePacketListener> {
    public static final StreamCodec<FriendlyByteBuf, ServerboundRenameItemPacket> STREAM_CODEC = Packet.codec(
        ServerboundRenameItemPacket::write, ServerboundRenameItemPacket::new
    );
    private final String name;

    public ServerboundRenameItemPacket(String pName) {
        this.name = pName;
    }

    private ServerboundRenameItemPacket(FriendlyByteBuf p_179738_) {
        this.name = p_179738_.readUtf();
    }

    /**
     * Writes the raw packet data to the data stream.
     */
    private void write(FriendlyByteBuf p_134405_) {
        p_134405_.writeUtf(this.name);
    }

    @Override
    public PacketType<ServerboundRenameItemPacket> type() {
        return GamePacketTypes.SERVERBOUND_RENAME_ITEM;
    }

    /**
     * Passes this Packet on to the NetHandler for processing.
     */
    public void handle(ServerGamePacketListener pHandler) {
        pHandler.handleRenameItem(this);
    }

    public String getName() {
        return this.name;
    }
}