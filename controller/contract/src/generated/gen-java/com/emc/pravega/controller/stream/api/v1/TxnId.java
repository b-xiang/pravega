/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.emc.pravega.controller.stream.api.v1;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-28")
public class TxnId implements org.apache.thrift.TBase<TxnId, TxnId._Fields>, java.io.Serializable, Cloneable, Comparable<TxnId> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TxnId");

  private static final org.apache.thrift.protocol.TField HIGH_BITS_FIELD_DESC = new org.apache.thrift.protocol.TField("highBits", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LOW_BITS_FIELD_DESC = new org.apache.thrift.protocol.TField("lowBits", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TxnIdStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TxnIdTupleSchemeFactory());
  }

  private long highBits; // required
  private long lowBits; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HIGH_BITS((short)1, "highBits"),
    LOW_BITS((short)2, "lowBits");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HIGH_BITS
          return HIGH_BITS;
        case 2: // LOW_BITS
          return LOW_BITS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HIGHBITS_ISSET_ID = 0;
  private static final int __LOWBITS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HIGH_BITS, new org.apache.thrift.meta_data.FieldMetaData("highBits", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOW_BITS, new org.apache.thrift.meta_data.FieldMetaData("lowBits", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TxnId.class, metaDataMap);
  }

  public TxnId() {
  }

  public TxnId(
    long highBits,
    long lowBits)
  {
    this();
    this.highBits = highBits;
    setHighBitsIsSet(true);
    this.lowBits = lowBits;
    setLowBitsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TxnId(TxnId other) {
    __isset_bitfield = other.__isset_bitfield;
    this.highBits = other.highBits;
    this.lowBits = other.lowBits;
  }

  public TxnId deepCopy() {
    return new TxnId(this);
  }

  @Override
  public void clear() {
    setHighBitsIsSet(false);
    this.highBits = 0;
    setLowBitsIsSet(false);
    this.lowBits = 0;
  }

  public long getHighBits() {
    return this.highBits;
  }

  public TxnId setHighBits(long highBits) {
    this.highBits = highBits;
    setHighBitsIsSet(true);
    return this;
  }

  public void unsetHighBits() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HIGHBITS_ISSET_ID);
  }

  /** Returns true if field highBits is set (has been assigned a value) and false otherwise */
  public boolean isSetHighBits() {
    return EncodingUtils.testBit(__isset_bitfield, __HIGHBITS_ISSET_ID);
  }

  public void setHighBitsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HIGHBITS_ISSET_ID, value);
  }

  public long getLowBits() {
    return this.lowBits;
  }

  public TxnId setLowBits(long lowBits) {
    this.lowBits = lowBits;
    setLowBitsIsSet(true);
    return this;
  }

  public void unsetLowBits() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOWBITS_ISSET_ID);
  }

  /** Returns true if field lowBits is set (has been assigned a value) and false otherwise */
  public boolean isSetLowBits() {
    return EncodingUtils.testBit(__isset_bitfield, __LOWBITS_ISSET_ID);
  }

  public void setLowBitsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOWBITS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HIGH_BITS:
      if (value == null) {
        unsetHighBits();
      } else {
        setHighBits((Long)value);
      }
      break;

    case LOW_BITS:
      if (value == null) {
        unsetLowBits();
      } else {
        setLowBits((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HIGH_BITS:
      return getHighBits();

    case LOW_BITS:
      return getLowBits();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HIGH_BITS:
      return isSetHighBits();
    case LOW_BITS:
      return isSetLowBits();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TxnId)
      return this.equals((TxnId)that);
    return false;
  }

  public boolean equals(TxnId that) {
    if (that == null)
      return false;

    boolean this_present_highBits = true;
    boolean that_present_highBits = true;
    if (this_present_highBits || that_present_highBits) {
      if (!(this_present_highBits && that_present_highBits))
        return false;
      if (this.highBits != that.highBits)
        return false;
    }

    boolean this_present_lowBits = true;
    boolean that_present_lowBits = true;
    if (this_present_lowBits || that_present_lowBits) {
      if (!(this_present_lowBits && that_present_lowBits))
        return false;
      if (this.lowBits != that.lowBits)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_highBits = true;
    list.add(present_highBits);
    if (present_highBits)
      list.add(highBits);

    boolean present_lowBits = true;
    list.add(present_lowBits);
    if (present_lowBits)
      list.add(lowBits);

    return list.hashCode();
  }

  @Override
  public int compareTo(TxnId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHighBits()).compareTo(other.isSetHighBits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHighBits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.highBits, other.highBits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLowBits()).compareTo(other.isSetLowBits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLowBits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lowBits, other.lowBits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TxnId(");
    boolean first = true;

    sb.append("highBits:");
    sb.append(this.highBits);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lowBits:");
    sb.append(this.lowBits);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'highBits' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'lowBits' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TxnIdStandardSchemeFactory implements SchemeFactory {
    public TxnIdStandardScheme getScheme() {
      return new TxnIdStandardScheme();
    }
  }

  private static class TxnIdStandardScheme extends StandardScheme<TxnId> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TxnId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HIGH_BITS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.highBits = iprot.readI64();
              struct.setHighBitsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOW_BITS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lowBits = iprot.readI64();
              struct.setLowBitsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetHighBits()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'highBits' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLowBits()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'lowBits' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TxnId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HIGH_BITS_FIELD_DESC);
      oprot.writeI64(struct.highBits);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOW_BITS_FIELD_DESC);
      oprot.writeI64(struct.lowBits);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TxnIdTupleSchemeFactory implements SchemeFactory {
    public TxnIdTupleScheme getScheme() {
      return new TxnIdTupleScheme();
    }
  }

  private static class TxnIdTupleScheme extends TupleScheme<TxnId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TxnId struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.highBits);
      oprot.writeI64(struct.lowBits);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TxnId struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.highBits = iprot.readI64();
      struct.setHighBitsIsSet(true);
      struct.lowBits = iprot.readI64();
      struct.setLowBitsIsSet(true);
    }
  }

}
