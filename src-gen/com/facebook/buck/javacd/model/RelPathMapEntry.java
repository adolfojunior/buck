// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/facebook/buck/javacd/resources/proto/javacd.proto

package com.facebook.buck.javacd.model;

/**
 * <pre>
 * protobuf map doesn't support custom type as map key, so would present a map as list of entries.
 * </pre>
 *
 * Protobuf type {@code javacd.api.v1.RelPathMapEntry}
 */
@javax.annotation.Generated(value="protoc", comments="annotations:RelPathMapEntry.java.pb.meta")
public  final class RelPathMapEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:javacd.api.v1.RelPathMapEntry)
    RelPathMapEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelPathMapEntry.newBuilder() to construct.
  private RelPathMapEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelPathMapEntry() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RelPathMapEntry(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.facebook.buck.javacd.model.RelPath.Builder subBuilder = null;
            if (key_ != null) {
              subBuilder = key_.toBuilder();
            }
            key_ = input.readMessage(com.facebook.buck.javacd.model.RelPath.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(key_);
              key_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.facebook.buck.javacd.model.RelPath.Builder subBuilder = null;
            if (value_ != null) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.facebook.buck.javacd.model.RelPath.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.facebook.buck.javacd.model.JavaCDProto.internal_static_javacd_api_v1_RelPathMapEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.facebook.buck.javacd.model.JavaCDProto.internal_static_javacd_api_v1_RelPathMapEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.facebook.buck.javacd.model.RelPathMapEntry.class, com.facebook.buck.javacd.model.RelPathMapEntry.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.facebook.buck.javacd.model.RelPath key_;
  /**
   * <code>.javacd.api.v1.RelPath key = 1;</code>
   */
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   * <code>.javacd.api.v1.RelPath key = 1;</code>
   */
  public com.facebook.buck.javacd.model.RelPath getKey() {
    return key_ == null ? com.facebook.buck.javacd.model.RelPath.getDefaultInstance() : key_;
  }
  /**
   * <code>.javacd.api.v1.RelPath key = 1;</code>
   */
  public com.facebook.buck.javacd.model.RelPathOrBuilder getKeyOrBuilder() {
    return getKey();
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.facebook.buck.javacd.model.RelPath value_;
  /**
   * <code>.javacd.api.v1.RelPath value = 2;</code>
   */
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <code>.javacd.api.v1.RelPath value = 2;</code>
   */
  public com.facebook.buck.javacd.model.RelPath getValue() {
    return value_ == null ? com.facebook.buck.javacd.model.RelPath.getDefaultInstance() : value_;
  }
  /**
   * <code>.javacd.api.v1.RelPath value = 2;</code>
   */
  public com.facebook.buck.javacd.model.RelPathOrBuilder getValueOrBuilder() {
    return getValue();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (key_ != null) {
      output.writeMessage(1, getKey());
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.facebook.buck.javacd.model.RelPathMapEntry)) {
      return super.equals(obj);
    }
    com.facebook.buck.javacd.model.RelPathMapEntry other = (com.facebook.buck.javacd.model.RelPathMapEntry) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.javacd.model.RelPathMapEntry parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.facebook.buck.javacd.model.RelPathMapEntry prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * protobuf map doesn't support custom type as map key, so would present a map as list of entries.
   * </pre>
   *
   * Protobuf type {@code javacd.api.v1.RelPathMapEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:javacd.api.v1.RelPathMapEntry)
      com.facebook.buck.javacd.model.RelPathMapEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.facebook.buck.javacd.model.JavaCDProto.internal_static_javacd_api_v1_RelPathMapEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.facebook.buck.javacd.model.JavaCDProto.internal_static_javacd_api_v1_RelPathMapEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.facebook.buck.javacd.model.RelPathMapEntry.class, com.facebook.buck.javacd.model.RelPathMapEntry.Builder.class);
    }

    // Construct using com.facebook.buck.javacd.model.RelPathMapEntry.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        key_ = null;
        keyBuilder_ = null;
      }
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.facebook.buck.javacd.model.JavaCDProto.internal_static_javacd_api_v1_RelPathMapEntry_descriptor;
    }

    @java.lang.Override
    public com.facebook.buck.javacd.model.RelPathMapEntry getDefaultInstanceForType() {
      return com.facebook.buck.javacd.model.RelPathMapEntry.getDefaultInstance();
    }

    @java.lang.Override
    public com.facebook.buck.javacd.model.RelPathMapEntry build() {
      com.facebook.buck.javacd.model.RelPathMapEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.facebook.buck.javacd.model.RelPathMapEntry buildPartial() {
      com.facebook.buck.javacd.model.RelPathMapEntry result = new com.facebook.buck.javacd.model.RelPathMapEntry(this);
      if (keyBuilder_ == null) {
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
      }
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.facebook.buck.javacd.model.RelPathMapEntry) {
        return mergeFrom((com.facebook.buck.javacd.model.RelPathMapEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.facebook.buck.javacd.model.RelPathMapEntry other) {
      if (other == com.facebook.buck.javacd.model.RelPathMapEntry.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.facebook.buck.javacd.model.RelPathMapEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.facebook.buck.javacd.model.RelPathMapEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.facebook.buck.javacd.model.RelPath key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.javacd.model.RelPath, com.facebook.buck.javacd.model.RelPath.Builder, com.facebook.buck.javacd.model.RelPathOrBuilder> keyBuilder_;
    /**
     * <code>.javacd.api.v1.RelPath key = 1;</code>
     */
    public boolean hasKey() {
      return keyBuilder_ != null || key_ != null;
    }
    /**
     * <code>.javacd.api.v1.RelPath key = 1;</code>
     */
    public com.facebook.buck.javacd.model.RelPath getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? com.facebook.buck.javacd.model.RelPath.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <code>.javacd.api.v1.RelPath key = 1;</code>
     */
    public Builder setKey(com.facebook.buck.javacd.model.RelPath value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.RelPath key = 1;</code>
     */
    public Builder setKey(
        com.facebook.buck.javacd.model.RelPath.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.RelPath key = 1;</code>
     */
    public Builder mergeKey(com.facebook.buck.javacd.model.RelPath value) {
      if (keyBuilder_ == null) {
        if (key_ != null) {
          key_ =
            com.facebook.buck.javacd.model.RelPath.newBuilder(key_).mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.RelPath key = 1;</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        key_ = null;
        keyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.RelPath key = 1;</code>
     */
    public com.facebook.buck.javacd.model.RelPath.Builder getKeyBuilder() {
      
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.javacd.api.v1.RelPath key = 1;</code>
     */
    public com.facebook.buck.javacd.model.RelPathOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            com.facebook.buck.javacd.model.RelPath.getDefaultInstance() : key_;
      }
    }
    /**
     * <code>.javacd.api.v1.RelPath key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.javacd.model.RelPath, com.facebook.buck.javacd.model.RelPath.Builder, com.facebook.buck.javacd.model.RelPathOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.facebook.buck.javacd.model.RelPath, com.facebook.buck.javacd.model.RelPath.Builder, com.facebook.buck.javacd.model.RelPathOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private com.facebook.buck.javacd.model.RelPath value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.javacd.model.RelPath, com.facebook.buck.javacd.model.RelPath.Builder, com.facebook.buck.javacd.model.RelPathOrBuilder> valueBuilder_;
    /**
     * <code>.javacd.api.v1.RelPath value = 2;</code>
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <code>.javacd.api.v1.RelPath value = 2;</code>
     */
    public com.facebook.buck.javacd.model.RelPath getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.facebook.buck.javacd.model.RelPath.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>.javacd.api.v1.RelPath value = 2;</code>
     */
    public Builder setValue(com.facebook.buck.javacd.model.RelPath value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.RelPath value = 2;</code>
     */
    public Builder setValue(
        com.facebook.buck.javacd.model.RelPath.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.RelPath value = 2;</code>
     */
    public Builder mergeValue(com.facebook.buck.javacd.model.RelPath value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            com.facebook.buck.javacd.model.RelPath.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.RelPath value = 2;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.RelPath value = 2;</code>
     */
    public com.facebook.buck.javacd.model.RelPath.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.javacd.api.v1.RelPath value = 2;</code>
     */
    public com.facebook.buck.javacd.model.RelPathOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.facebook.buck.javacd.model.RelPath.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>.javacd.api.v1.RelPath value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.javacd.model.RelPath, com.facebook.buck.javacd.model.RelPath.Builder, com.facebook.buck.javacd.model.RelPathOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.facebook.buck.javacd.model.RelPath, com.facebook.buck.javacd.model.RelPath.Builder, com.facebook.buck.javacd.model.RelPathOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:javacd.api.v1.RelPathMapEntry)
  }

  // @@protoc_insertion_point(class_scope:javacd.api.v1.RelPathMapEntry)
  private static final com.facebook.buck.javacd.model.RelPathMapEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.facebook.buck.javacd.model.RelPathMapEntry();
  }

  public static com.facebook.buck.javacd.model.RelPathMapEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelPathMapEntry>
      PARSER = new com.google.protobuf.AbstractParser<RelPathMapEntry>() {
    @java.lang.Override
    public RelPathMapEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RelPathMapEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RelPathMapEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelPathMapEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.facebook.buck.javacd.model.RelPathMapEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
