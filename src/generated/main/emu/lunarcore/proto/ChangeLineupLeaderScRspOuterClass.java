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

public final class ChangeLineupLeaderScRspOuterClass {
  /**
   * Protobuf type {@code ChangeLineupLeaderScRsp}
   */
  public static final class ChangeLineupLeaderScRsp extends ProtoMessage<ChangeLineupLeaderScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 slot = 10;</code>
     */
    private int slot;

    private ChangeLineupLeaderScRsp() {
    }

    /**
     * @return a new empty instance of {@code ChangeLineupLeaderScRsp}
     */
    public static ChangeLineupLeaderScRsp newInstance() {
      return new ChangeLineupLeaderScRsp();
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return this
     */
    public ChangeLineupLeaderScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @param value the retcode to set
     * @return this
     */
    public ChangeLineupLeaderScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 slot = 10;</code>
     * @return whether the slot field is set
     */
    public boolean hasSlot() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 slot = 10;</code>
     * @return this
     */
    public ChangeLineupLeaderScRsp clearSlot() {
      bitField0_ &= ~0x00000002;
      slot = 0;
      return this;
    }

    /**
     * <code>optional uint32 slot = 10;</code>
     * @return the slot
     */
    public int getSlot() {
      return slot;
    }

    /**
     * <code>optional uint32 slot = 10;</code>
     * @param value the slot to set
     * @return this
     */
    public ChangeLineupLeaderScRsp setSlot(final int value) {
      bitField0_ |= 0x00000002;
      slot = value;
      return this;
    }

    @Override
    public ChangeLineupLeaderScRsp copyFrom(final ChangeLineupLeaderScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        slot = other.slot;
      }
      return this;
    }

    @Override
    public ChangeLineupLeaderScRsp mergeFrom(final ChangeLineupLeaderScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasSlot()) {
        setSlot(other.slot);
      }
      return this;
    }

    @Override
    public ChangeLineupLeaderScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      slot = 0;
      return this;
    }

    @Override
    public ChangeLineupLeaderScRsp clearQuick() {
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
      if (!(o instanceof ChangeLineupLeaderScRsp)) {
        return false;
      }
      ChangeLineupLeaderScRsp other = (ChangeLineupLeaderScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasSlot() || slot == other.slot);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(slot);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(slot);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChangeLineupLeaderScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // slot
            slot = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.slot, slot);
      }
      output.endObject();
    }

    @Override
    public ChangeLineupLeaderScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3533310: {
            if (input.isAtField(FieldNames.slot)) {
              if (!input.trySkipNullValue()) {
                slot = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public ChangeLineupLeaderScRsp clone() {
      return new ChangeLineupLeaderScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChangeLineupLeaderScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChangeLineupLeaderScRsp(), data).checkInitialized();
    }

    public static ChangeLineupLeaderScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChangeLineupLeaderScRsp(), input).checkInitialized();
    }

    public static ChangeLineupLeaderScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChangeLineupLeaderScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChangeLineupLeaderScRsp messages
     */
    public static MessageFactory<ChangeLineupLeaderScRsp> getFactory() {
      return ChangeLineupLeaderScRspFactory.INSTANCE;
    }

    private enum ChangeLineupLeaderScRspFactory implements MessageFactory<ChangeLineupLeaderScRsp> {
      INSTANCE;

      @Override
      public ChangeLineupLeaderScRsp create() {
        return ChangeLineupLeaderScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName slot = FieldName.forField("slot");
    }
  }
}
