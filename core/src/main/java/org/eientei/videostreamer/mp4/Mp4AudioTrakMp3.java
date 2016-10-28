package org.eientei.videostreamer.mp4;

import io.netty.buffer.ByteBuf;
import org.eientei.videostreamer.ws.CommType;

import java.util.List;

/**
 * Created by Alexander Tumin on 2016-10-22
 */
public class Mp4AudioTrakMp3 extends Mp4Track {
    public Mp4AudioTrakMp3(Mp4Context context, int channels, int sampleRate, int sampleCount, ByteBuf slice) {
        super(context, 1, 0, 0, sampleRate, sampleCount);
    }

    @Override
    public void update(ByteBuf readonly, int time, boolean b) {

    }

    @Override
    public void release() {

    }

    @Override
    public String getShortHandler() {
        return null;
    }

    @Override
    public String getLongHandler() {
        return null;
    }

    @Override
    public Mp4Box getInit(List<Mp4Track> tracks) {
        return null;
    }

    @Override
    public Mp4Box getMhd() {
        return null;
    }

    @Override
    public CommType getType(Mp4Frame frame) {
        return CommType.STREAM_UPDATE_A;
    }

    @Override
    public double getStart() {
        return 1.0;
    }

    @Override
    public int getFix() {
        return 0;
    }
}
