package org.eientei.videostreamer.mp4.boxes;

import io.netty.buffer.ByteBuf;
import org.eientei.videostreamer.mp4.Mp4BoxFull;
import org.eientei.videostreamer.mp4.Mp4Context;
import org.eientei.videostreamer.mp4.Mp4Track;

/**
 * Created by Alexander Tumin on 2016-10-23
 */
public class Mp4TfhdBox extends Mp4BoxFull {
    private final Mp4Track track;

    public Mp4TfhdBox(Mp4Context context, Mp4Track track) {
        super("tfhd", context, 0, 0x20 | 0x20000);
        this.track = track;
    }

    @Override
    protected void fullWrite(ByteBuf out) {
        out.writeInt(track.id()); // track id
        out.writeInt(0x01010000); // sample flags, 0x20-controlled
    }
}