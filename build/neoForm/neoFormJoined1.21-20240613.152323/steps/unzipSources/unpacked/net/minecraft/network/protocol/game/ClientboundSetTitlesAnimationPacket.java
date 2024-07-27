package net.minecraft.network.protocol.game;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketType;

public class ClientboundSetTitlesAnimationPacket implements Packet<ClientGamePacketListener> {
    public static final StreamCodec<FriendlyByteBuf, ClientboundSetTitlesAnimationPacket> STREAM_CODEC = Packet.codec(
        ClientboundSetTitlesAnimationPacket::write, ClientboundSetTitlesAnimationPacket::new
    );
    private final int fadeIn;
    private final int stay;
    private final int fadeOut;

    public ClientboundSetTitlesAnimationPacket(int pFadeIn, int pStay, int pFadeOut) {
        this.fadeIn = pFadeIn;
        this.stay = pStay;
        this.fadeOut = pFadeOut;
    }

    private ClientboundSetTitlesAnimationPacket(FriendlyByteBuf p_179408_) {
        this.fadeIn = p_179408_.readInt();
        this.stay = p_179408_.readInt();
        this.fadeOut = p_179408_.readInt();
    }

    private void write(FriendlyByteBuf p_179410_) {
        p_179410_.writeInt(this.fadeIn);
        p_179410_.writeInt(this.stay);
        p_179410_.writeInt(this.fadeOut);
    }

    @Override
    public PacketType<ClientboundSetTitlesAnimationPacket> type() {
        return GamePacketTypes.CLIENTBOUND_SET_TITLES_ANIMATION;
    }

    /**
     * Passes this Packet on to the PacketListener for processing.
     */
    public void handle(ClientGamePacketListener pHandler) {
        pHandler.setTitlesAnimation(this);
    }

    public int getFadeIn() {
        return this.fadeIn;
    }

    public int getStay() {
        return this.stay;
    }

    public int getFadeOut() {
        return this.fadeOut;
    }
}
