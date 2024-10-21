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

public final class SummonPetScRspOuterClass {
  /**
   * Protobuf type {@code SummonPetScRsp}
   */
  public static final class SummonPetScRsp extends ProtoMessage<SummonPetScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 cur_pet_id = 2;</code>
     */
    private int curPetId;

    /**
     * <code>optional uint32 BMCOIJCMNNC = 6;</code>
     */
    private int bMCOIJCMNNC;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    private SummonPetScRsp() {
    }

    /**
     * @return a new empty instance of {@code SummonPetScRsp}
     */
    public static SummonPetScRsp newInstance() {
      return new SummonPetScRsp();
    }

    /**
     * <code>optional uint32 cur_pet_id = 2;</code>
     * @return whether the curPetId field is set
     */
    public boolean hasCurPetId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 cur_pet_id = 2;</code>
     * @return this
     */
    public SummonPetScRsp clearCurPetId() {
      bitField0_ &= ~0x00000001;
      curPetId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_pet_id = 2;</code>
     * @return the curPetId
     */
    public int getCurPetId() {
      return curPetId;
    }

    /**
     * <code>optional uint32 cur_pet_id = 2;</code>
     * @param value the curPetId to set
     * @return this
     */
    public SummonPetScRsp setCurPetId(final int value) {
      bitField0_ |= 0x00000001;
      curPetId = value;
      return this;
    }

    /**
     * <code>optional uint32 BMCOIJCMNNC = 6;</code>
     * @return whether the bMCOIJCMNNC field is set
     */
    public boolean hasBMCOIJCMNNC() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 BMCOIJCMNNC = 6;</code>
     * @return this
     */
    public SummonPetScRsp clearBMCOIJCMNNC() {
      bitField0_ &= ~0x00000002;
      bMCOIJCMNNC = 0;
      return this;
    }

    /**
     * <code>optional uint32 BMCOIJCMNNC = 6;</code>
     * @return the bMCOIJCMNNC
     */
    public int getBMCOIJCMNNC() {
      return bMCOIJCMNNC;
    }

    /**
     * <code>optional uint32 BMCOIJCMNNC = 6;</code>
     * @param value the bMCOIJCMNNC to set
     * @return this
     */
    public SummonPetScRsp setBMCOIJCMNNC(final int value) {
      bitField0_ |= 0x00000002;
      bMCOIJCMNNC = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public SummonPetScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public SummonPetScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    @Override
    public SummonPetScRsp copyFrom(final SummonPetScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        curPetId = other.curPetId;
        bMCOIJCMNNC = other.bMCOIJCMNNC;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public SummonPetScRsp mergeFrom(final SummonPetScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurPetId()) {
        setCurPetId(other.curPetId);
      }
      if (other.hasBMCOIJCMNNC()) {
        setBMCOIJCMNNC(other.bMCOIJCMNNC);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public SummonPetScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curPetId = 0;
      bMCOIJCMNNC = 0;
      retcode = 0;
      return this;
    }

    @Override
    public SummonPetScRsp clearQuick() {
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
      if (!(o instanceof SummonPetScRsp)) {
        return false;
      }
      SummonPetScRsp other = (SummonPetScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasCurPetId() || curPetId == other.curPetId)
        && (!hasBMCOIJCMNNC() || bMCOIJCMNNC == other.bMCOIJCMNNC)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(curPetId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(bMCOIJCMNNC);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curPetId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bMCOIJCMNNC);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SummonPetScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // curPetId
            curPetId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // bMCOIJCMNNC
            bMCOIJCMNNC = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // retcode
            retcode = input.readUInt32();
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
        output.writeUInt32(FieldNames.curPetId, curPetId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.bMCOIJCMNNC, bMCOIJCMNNC);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public SummonPetScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 544007226:
          case -465065190: {
            if (input.isAtField(FieldNames.curPetId)) {
              if (!input.trySkipNullValue()) {
                curPetId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1362418561: {
            if (input.isAtField(FieldNames.bMCOIJCMNNC)) {
              if (!input.trySkipNullValue()) {
                bMCOIJCMNNC = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
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
    public SummonPetScRsp clone() {
      return new SummonPetScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SummonPetScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SummonPetScRsp(), data).checkInitialized();
    }

    public static SummonPetScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SummonPetScRsp(), input).checkInitialized();
    }

    public static SummonPetScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SummonPetScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SummonPetScRsp messages
     */
    public static MessageFactory<SummonPetScRsp> getFactory() {
      return SummonPetScRspFactory.INSTANCE;
    }

    private enum SummonPetScRspFactory implements MessageFactory<SummonPetScRsp> {
      INSTANCE;

      @Override
      public SummonPetScRsp create() {
        return SummonPetScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName curPetId = FieldName.forField("curPetId", "cur_pet_id");

      static final FieldName bMCOIJCMNNC = FieldName.forField("BMCOIJCMNNC");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}