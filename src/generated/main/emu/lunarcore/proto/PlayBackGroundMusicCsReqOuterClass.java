// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class PlayBackGroundMusicCsReqOuterClass {
  /**
   * Protobuf type {@code PlayBackGroundMusicCsReq}
   */
  public static final class PlayBackGroundMusicCsReq extends ProtoMessage<PlayBackGroundMusicCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 play_music_id = 10;</code>
     */
    private int playMusicId;

    private PlayBackGroundMusicCsReq() {
    }

    /**
     * @return a new empty instance of {@code PlayBackGroundMusicCsReq}
     */
    public static PlayBackGroundMusicCsReq newInstance() {
      return new PlayBackGroundMusicCsReq();
    }

    /**
     * <code>optional uint32 play_music_id = 10;</code>
     * @return whether the playMusicId field is set
     */
    public boolean hasPlayMusicId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 play_music_id = 10;</code>
     * @return this
     */
    public PlayBackGroundMusicCsReq clearPlayMusicId() {
      bitField0_ &= ~0x00000001;
      playMusicId = 0;
      return this;
    }

    /**
     * <code>optional uint32 play_music_id = 10;</code>
     * @return the playMusicId
     */
    public int getPlayMusicId() {
      return playMusicId;
    }

    /**
     * <code>optional uint32 play_music_id = 10;</code>
     * @param value the playMusicId to set
     * @return this
     */
    public PlayBackGroundMusicCsReq setPlayMusicId(final int value) {
      bitField0_ |= 0x00000001;
      playMusicId = value;
      return this;
    }

    @Override
    public PlayBackGroundMusicCsReq copyFrom(final PlayBackGroundMusicCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        playMusicId = other.playMusicId;
      }
      return this;
    }

    @Override
    public PlayBackGroundMusicCsReq mergeFrom(final PlayBackGroundMusicCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPlayMusicId()) {
        setPlayMusicId(other.playMusicId);
      }
      return this;
    }

    @Override
    public PlayBackGroundMusicCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      playMusicId = 0;
      return this;
    }

    @Override
    public PlayBackGroundMusicCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PlayBackGroundMusicCsReq)) {
        return false;
      }
      PlayBackGroundMusicCsReq other = (PlayBackGroundMusicCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasPlayMusicId() || playMusicId == other.playMusicId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(playMusicId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(playMusicId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayBackGroundMusicCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // playMusicId
            playMusicId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.playMusicId, playMusicId);
      }
      output.endObject();
    }

    @Override
    public PlayBackGroundMusicCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 835898444:
          case -1319856608: {
            if (input.isAtField(FieldNames.playMusicId)) {
              if (!input.trySkipNullValue()) {
                playMusicId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public PlayBackGroundMusicCsReq clone() {
      return new PlayBackGroundMusicCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayBackGroundMusicCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayBackGroundMusicCsReq(), data).checkInitialized();
    }

    public static PlayBackGroundMusicCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayBackGroundMusicCsReq(), input).checkInitialized();
    }

    public static PlayBackGroundMusicCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayBackGroundMusicCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayBackGroundMusicCsReq messages
     */
    public static MessageFactory<PlayBackGroundMusicCsReq> getFactory() {
      return PlayBackGroundMusicCsReqFactory.INSTANCE;
    }

    private enum PlayBackGroundMusicCsReqFactory implements MessageFactory<PlayBackGroundMusicCsReq> {
      INSTANCE;

      @Override
      public PlayBackGroundMusicCsReq create() {
        return PlayBackGroundMusicCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName playMusicId = FieldName.forField("playMusicId", "play_music_id");
    }
  }
}
