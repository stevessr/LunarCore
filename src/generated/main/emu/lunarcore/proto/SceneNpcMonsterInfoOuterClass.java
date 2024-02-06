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

public final class SceneNpcMonsterInfoOuterClass {
  /**
   * Protobuf type {@code SceneNpcMonsterInfo}
   */
  public static final class SceneNpcMonsterInfo extends ProtoMessage<SceneNpcMonsterInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 event_id = 3;</code>
     */
    private int eventId;

    /**
     * <code>optional uint32 monster_id = 6;</code>
     */
    private int monsterId;

    /**
     * <code>optional uint32 world_level = 10;</code>
     */
    private int worldLevel;

    private SceneNpcMonsterInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneNpcMonsterInfo}
     */
    public static SceneNpcMonsterInfo newInstance() {
      return new SceneNpcMonsterInfo();
    }

    /**
     * <code>optional uint32 event_id = 3;</code>
     * @return whether the eventId field is set
     */
    public boolean hasEventId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 event_id = 3;</code>
     * @return this
     */
    public SceneNpcMonsterInfo clearEventId() {
      bitField0_ &= ~0x00000001;
      eventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 event_id = 3;</code>
     * @return the eventId
     */
    public int getEventId() {
      return eventId;
    }

    /**
     * <code>optional uint32 event_id = 3;</code>
     * @param value the eventId to set
     * @return this
     */
    public SceneNpcMonsterInfo setEventId(final int value) {
      bitField0_ |= 0x00000001;
      eventId = value;
      return this;
    }

    /**
     * <code>optional uint32 monster_id = 6;</code>
     * @return whether the monsterId field is set
     */
    public boolean hasMonsterId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 monster_id = 6;</code>
     * @return this
     */
    public SceneNpcMonsterInfo clearMonsterId() {
      bitField0_ &= ~0x00000002;
      monsterId = 0;
      return this;
    }

    /**
     * <code>optional uint32 monster_id = 6;</code>
     * @return the monsterId
     */
    public int getMonsterId() {
      return monsterId;
    }

    /**
     * <code>optional uint32 monster_id = 6;</code>
     * @param value the monsterId to set
     * @return this
     */
    public SceneNpcMonsterInfo setMonsterId(final int value) {
      bitField0_ |= 0x00000002;
      monsterId = value;
      return this;
    }

    /**
     * <code>optional uint32 world_level = 10;</code>
     * @return whether the worldLevel field is set
     */
    public boolean hasWorldLevel() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 world_level = 10;</code>
     * @return this
     */
    public SceneNpcMonsterInfo clearWorldLevel() {
      bitField0_ &= ~0x00000004;
      worldLevel = 0;
      return this;
    }

    /**
     * <code>optional uint32 world_level = 10;</code>
     * @return the worldLevel
     */
    public int getWorldLevel() {
      return worldLevel;
    }

    /**
     * <code>optional uint32 world_level = 10;</code>
     * @param value the worldLevel to set
     * @return this
     */
    public SceneNpcMonsterInfo setWorldLevel(final int value) {
      bitField0_ |= 0x00000004;
      worldLevel = value;
      return this;
    }

    @Override
    public SceneNpcMonsterInfo copyFrom(final SceneNpcMonsterInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        eventId = other.eventId;
        monsterId = other.monsterId;
        worldLevel = other.worldLevel;
      }
      return this;
    }

    @Override
    public SceneNpcMonsterInfo mergeFrom(final SceneNpcMonsterInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEventId()) {
        setEventId(other.eventId);
      }
      if (other.hasMonsterId()) {
        setMonsterId(other.monsterId);
      }
      if (other.hasWorldLevel()) {
        setWorldLevel(other.worldLevel);
      }
      return this;
    }

    @Override
    public SceneNpcMonsterInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      eventId = 0;
      monsterId = 0;
      worldLevel = 0;
      return this;
    }

    @Override
    public SceneNpcMonsterInfo clearQuick() {
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
      if (!(o instanceof SceneNpcMonsterInfo)) {
        return false;
      }
      SceneNpcMonsterInfo other = (SceneNpcMonsterInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasEventId() || eventId == other.eventId)
        && (!hasMonsterId() || monsterId == other.monsterId)
        && (!hasWorldLevel() || worldLevel == other.worldLevel);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(eventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(monsterId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(worldLevel);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(monsterId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(worldLevel);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneNpcMonsterInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // eventId
            eventId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // monsterId
            monsterId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // worldLevel
            worldLevel = input.readUInt32();
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.eventId, eventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.monsterId, monsterId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.worldLevel, worldLevel);
      }
      output.endObject();
    }

    @Override
    public SceneNpcMonsterInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1376502443:
          case 278118624: {
            if (input.isAtField(FieldNames.eventId)) {
              if (!input.trySkipNullValue()) {
                eventId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1316830571:
          case 2127946656: {
            if (input.isAtField(FieldNames.monsterId)) {
              if (!input.trySkipNullValue()) {
                monsterId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 440007442:
          case 1305257111: {
            if (input.isAtField(FieldNames.worldLevel)) {
              if (!input.trySkipNullValue()) {
                worldLevel = input.readUInt32();
                bitField0_ |= 0x00000004;
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
    public SceneNpcMonsterInfo clone() {
      return new SceneNpcMonsterInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneNpcMonsterInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneNpcMonsterInfo(), data).checkInitialized();
    }

    public static SceneNpcMonsterInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneNpcMonsterInfo(), input).checkInitialized();
    }

    public static SceneNpcMonsterInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneNpcMonsterInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneNpcMonsterInfo messages
     */
    public static MessageFactory<SceneNpcMonsterInfo> getFactory() {
      return SceneNpcMonsterInfoFactory.INSTANCE;
    }

    private enum SceneNpcMonsterInfoFactory implements MessageFactory<SceneNpcMonsterInfo> {
      INSTANCE;

      @Override
      public SceneNpcMonsterInfo create() {
        return SceneNpcMonsterInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName eventId = FieldName.forField("eventId", "event_id");

      static final FieldName monsterId = FieldName.forField("monsterId", "monster_id");

      static final FieldName worldLevel = FieldName.forField("worldLevel", "world_level");
    }
  }
}
