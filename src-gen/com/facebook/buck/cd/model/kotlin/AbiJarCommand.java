// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cd/resources/proto/kotlincd.proto

package com.facebook.buck.cd.model.kotlin;

/**
 * Protobuf type {@code kotlincd.api.v1.AbiJarCommand}
 */
@javax.annotation.Generated(value="protoc", comments="annotations:AbiJarCommand.java.pb.meta")
public  final class AbiJarCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kotlincd.api.v1.AbiJarCommand)
    AbiJarCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AbiJarCommand.newBuilder() to construct.
  private AbiJarCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbiJarCommand() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AbiJarCommand(
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
            com.facebook.buck.cd.model.java.BaseJarCommand.Builder subBuilder = null;
            if (baseJarCommand_ != null) {
              subBuilder = baseJarCommand_.toBuilder();
            }
            baseJarCommand_ = input.readMessage(com.facebook.buck.cd.model.java.BaseJarCommand.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(baseJarCommand_);
              baseJarCommand_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.facebook.buck.cd.model.java.JarParameters.Builder subBuilder = null;
            if (abiJarParameters_ != null) {
              subBuilder = abiJarParameters_.toBuilder();
            }
            abiJarParameters_ = input.readMessage(com.facebook.buck.cd.model.java.JarParameters.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abiJarParameters_);
              abiJarParameters_ = subBuilder.buildPartial();
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
    return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_AbiJarCommand_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_AbiJarCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.facebook.buck.cd.model.kotlin.AbiJarCommand.class, com.facebook.buck.cd.model.kotlin.AbiJarCommand.Builder.class);
  }

  public static final int BASEJARCOMMAND_FIELD_NUMBER = 1;
  private com.facebook.buck.cd.model.java.BaseJarCommand baseJarCommand_;
  /**
   * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
   */
  public boolean hasBaseJarCommand() {
    return baseJarCommand_ != null;
  }
  /**
   * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
   */
  public com.facebook.buck.cd.model.java.BaseJarCommand getBaseJarCommand() {
    return baseJarCommand_ == null ? com.facebook.buck.cd.model.java.BaseJarCommand.getDefaultInstance() : baseJarCommand_;
  }
  /**
   * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
   */
  public com.facebook.buck.cd.model.java.BaseJarCommandOrBuilder getBaseJarCommandOrBuilder() {
    return getBaseJarCommand();
  }

  public static final int ABIJARPARAMETERS_FIELD_NUMBER = 2;
  private com.facebook.buck.cd.model.java.JarParameters abiJarParameters_;
  /**
   * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
   */
  public boolean hasAbiJarParameters() {
    return abiJarParameters_ != null;
  }
  /**
   * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
   */
  public com.facebook.buck.cd.model.java.JarParameters getAbiJarParameters() {
    return abiJarParameters_ == null ? com.facebook.buck.cd.model.java.JarParameters.getDefaultInstance() : abiJarParameters_;
  }
  /**
   * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
   */
  public com.facebook.buck.cd.model.java.JarParametersOrBuilder getAbiJarParametersOrBuilder() {
    return getAbiJarParameters();
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
    if (baseJarCommand_ != null) {
      output.writeMessage(1, getBaseJarCommand());
    }
    if (abiJarParameters_ != null) {
      output.writeMessage(2, getAbiJarParameters());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (baseJarCommand_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBaseJarCommand());
    }
    if (abiJarParameters_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAbiJarParameters());
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
    if (!(obj instanceof com.facebook.buck.cd.model.kotlin.AbiJarCommand)) {
      return super.equals(obj);
    }
    com.facebook.buck.cd.model.kotlin.AbiJarCommand other = (com.facebook.buck.cd.model.kotlin.AbiJarCommand) obj;

    if (hasBaseJarCommand() != other.hasBaseJarCommand()) return false;
    if (hasBaseJarCommand()) {
      if (!getBaseJarCommand()
          .equals(other.getBaseJarCommand())) return false;
    }
    if (hasAbiJarParameters() != other.hasAbiJarParameters()) return false;
    if (hasAbiJarParameters()) {
      if (!getAbiJarParameters()
          .equals(other.getAbiJarParameters())) return false;
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
    if (hasBaseJarCommand()) {
      hash = (37 * hash) + BASEJARCOMMAND_FIELD_NUMBER;
      hash = (53 * hash) + getBaseJarCommand().hashCode();
    }
    if (hasAbiJarParameters()) {
      hash = (37 * hash) + ABIJARPARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getAbiJarParameters().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand parseFrom(
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
  public static Builder newBuilder(com.facebook.buck.cd.model.kotlin.AbiJarCommand prototype) {
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
   * Protobuf type {@code kotlincd.api.v1.AbiJarCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kotlincd.api.v1.AbiJarCommand)
      com.facebook.buck.cd.model.kotlin.AbiJarCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_AbiJarCommand_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_AbiJarCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.facebook.buck.cd.model.kotlin.AbiJarCommand.class, com.facebook.buck.cd.model.kotlin.AbiJarCommand.Builder.class);
    }

    // Construct using com.facebook.buck.cd.model.kotlin.AbiJarCommand.newBuilder()
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
      if (baseJarCommandBuilder_ == null) {
        baseJarCommand_ = null;
      } else {
        baseJarCommand_ = null;
        baseJarCommandBuilder_ = null;
      }
      if (abiJarParametersBuilder_ == null) {
        abiJarParameters_ = null;
      } else {
        abiJarParameters_ = null;
        abiJarParametersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.facebook.buck.cd.model.kotlin.KotlinCDProto.internal_static_kotlincd_api_v1_AbiJarCommand_descriptor;
    }

    @java.lang.Override
    public com.facebook.buck.cd.model.kotlin.AbiJarCommand getDefaultInstanceForType() {
      return com.facebook.buck.cd.model.kotlin.AbiJarCommand.getDefaultInstance();
    }

    @java.lang.Override
    public com.facebook.buck.cd.model.kotlin.AbiJarCommand build() {
      com.facebook.buck.cd.model.kotlin.AbiJarCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.facebook.buck.cd.model.kotlin.AbiJarCommand buildPartial() {
      com.facebook.buck.cd.model.kotlin.AbiJarCommand result = new com.facebook.buck.cd.model.kotlin.AbiJarCommand(this);
      if (baseJarCommandBuilder_ == null) {
        result.baseJarCommand_ = baseJarCommand_;
      } else {
        result.baseJarCommand_ = baseJarCommandBuilder_.build();
      }
      if (abiJarParametersBuilder_ == null) {
        result.abiJarParameters_ = abiJarParameters_;
      } else {
        result.abiJarParameters_ = abiJarParametersBuilder_.build();
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
      if (other instanceof com.facebook.buck.cd.model.kotlin.AbiJarCommand) {
        return mergeFrom((com.facebook.buck.cd.model.kotlin.AbiJarCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.facebook.buck.cd.model.kotlin.AbiJarCommand other) {
      if (other == com.facebook.buck.cd.model.kotlin.AbiJarCommand.getDefaultInstance()) return this;
      if (other.hasBaseJarCommand()) {
        mergeBaseJarCommand(other.getBaseJarCommand());
      }
      if (other.hasAbiJarParameters()) {
        mergeAbiJarParameters(other.getAbiJarParameters());
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
      com.facebook.buck.cd.model.kotlin.AbiJarCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.facebook.buck.cd.model.kotlin.AbiJarCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.facebook.buck.cd.model.java.BaseJarCommand baseJarCommand_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.java.BaseJarCommand, com.facebook.buck.cd.model.java.BaseJarCommand.Builder, com.facebook.buck.cd.model.java.BaseJarCommandOrBuilder> baseJarCommandBuilder_;
    /**
     * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
     */
    public boolean hasBaseJarCommand() {
      return baseJarCommandBuilder_ != null || baseJarCommand_ != null;
    }
    /**
     * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
     */
    public com.facebook.buck.cd.model.java.BaseJarCommand getBaseJarCommand() {
      if (baseJarCommandBuilder_ == null) {
        return baseJarCommand_ == null ? com.facebook.buck.cd.model.java.BaseJarCommand.getDefaultInstance() : baseJarCommand_;
      } else {
        return baseJarCommandBuilder_.getMessage();
      }
    }
    /**
     * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
     */
    public Builder setBaseJarCommand(com.facebook.buck.cd.model.java.BaseJarCommand value) {
      if (baseJarCommandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseJarCommand_ = value;
        onChanged();
      } else {
        baseJarCommandBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
     */
    public Builder setBaseJarCommand(
        com.facebook.buck.cd.model.java.BaseJarCommand.Builder builderForValue) {
      if (baseJarCommandBuilder_ == null) {
        baseJarCommand_ = builderForValue.build();
        onChanged();
      } else {
        baseJarCommandBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
     */
    public Builder mergeBaseJarCommand(com.facebook.buck.cd.model.java.BaseJarCommand value) {
      if (baseJarCommandBuilder_ == null) {
        if (baseJarCommand_ != null) {
          baseJarCommand_ =
            com.facebook.buck.cd.model.java.BaseJarCommand.newBuilder(baseJarCommand_).mergeFrom(value).buildPartial();
        } else {
          baseJarCommand_ = value;
        }
        onChanged();
      } else {
        baseJarCommandBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
     */
    public Builder clearBaseJarCommand() {
      if (baseJarCommandBuilder_ == null) {
        baseJarCommand_ = null;
        onChanged();
      } else {
        baseJarCommand_ = null;
        baseJarCommandBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
     */
    public com.facebook.buck.cd.model.java.BaseJarCommand.Builder getBaseJarCommandBuilder() {
      
      onChanged();
      return getBaseJarCommandFieldBuilder().getBuilder();
    }
    /**
     * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
     */
    public com.facebook.buck.cd.model.java.BaseJarCommandOrBuilder getBaseJarCommandOrBuilder() {
      if (baseJarCommandBuilder_ != null) {
        return baseJarCommandBuilder_.getMessageOrBuilder();
      } else {
        return baseJarCommand_ == null ?
            com.facebook.buck.cd.model.java.BaseJarCommand.getDefaultInstance() : baseJarCommand_;
      }
    }
    /**
     * <code>.javacd.api.v1.BaseJarCommand baseJarCommand = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.java.BaseJarCommand, com.facebook.buck.cd.model.java.BaseJarCommand.Builder, com.facebook.buck.cd.model.java.BaseJarCommandOrBuilder> 
        getBaseJarCommandFieldBuilder() {
      if (baseJarCommandBuilder_ == null) {
        baseJarCommandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.facebook.buck.cd.model.java.BaseJarCommand, com.facebook.buck.cd.model.java.BaseJarCommand.Builder, com.facebook.buck.cd.model.java.BaseJarCommandOrBuilder>(
                getBaseJarCommand(),
                getParentForChildren(),
                isClean());
        baseJarCommand_ = null;
      }
      return baseJarCommandBuilder_;
    }

    private com.facebook.buck.cd.model.java.JarParameters abiJarParameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.java.JarParameters, com.facebook.buck.cd.model.java.JarParameters.Builder, com.facebook.buck.cd.model.java.JarParametersOrBuilder> abiJarParametersBuilder_;
    /**
     * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
     */
    public boolean hasAbiJarParameters() {
      return abiJarParametersBuilder_ != null || abiJarParameters_ != null;
    }
    /**
     * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
     */
    public com.facebook.buck.cd.model.java.JarParameters getAbiJarParameters() {
      if (abiJarParametersBuilder_ == null) {
        return abiJarParameters_ == null ? com.facebook.buck.cd.model.java.JarParameters.getDefaultInstance() : abiJarParameters_;
      } else {
        return abiJarParametersBuilder_.getMessage();
      }
    }
    /**
     * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
     */
    public Builder setAbiJarParameters(com.facebook.buck.cd.model.java.JarParameters value) {
      if (abiJarParametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abiJarParameters_ = value;
        onChanged();
      } else {
        abiJarParametersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
     */
    public Builder setAbiJarParameters(
        com.facebook.buck.cd.model.java.JarParameters.Builder builderForValue) {
      if (abiJarParametersBuilder_ == null) {
        abiJarParameters_ = builderForValue.build();
        onChanged();
      } else {
        abiJarParametersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
     */
    public Builder mergeAbiJarParameters(com.facebook.buck.cd.model.java.JarParameters value) {
      if (abiJarParametersBuilder_ == null) {
        if (abiJarParameters_ != null) {
          abiJarParameters_ =
            com.facebook.buck.cd.model.java.JarParameters.newBuilder(abiJarParameters_).mergeFrom(value).buildPartial();
        } else {
          abiJarParameters_ = value;
        }
        onChanged();
      } else {
        abiJarParametersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
     */
    public Builder clearAbiJarParameters() {
      if (abiJarParametersBuilder_ == null) {
        abiJarParameters_ = null;
        onChanged();
      } else {
        abiJarParameters_ = null;
        abiJarParametersBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
     */
    public com.facebook.buck.cd.model.java.JarParameters.Builder getAbiJarParametersBuilder() {
      
      onChanged();
      return getAbiJarParametersFieldBuilder().getBuilder();
    }
    /**
     * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
     */
    public com.facebook.buck.cd.model.java.JarParametersOrBuilder getAbiJarParametersOrBuilder() {
      if (abiJarParametersBuilder_ != null) {
        return abiJarParametersBuilder_.getMessageOrBuilder();
      } else {
        return abiJarParameters_ == null ?
            com.facebook.buck.cd.model.java.JarParameters.getDefaultInstance() : abiJarParameters_;
      }
    }
    /**
     * <code>.javacd.api.v1.JarParameters abiJarParameters = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.java.JarParameters, com.facebook.buck.cd.model.java.JarParameters.Builder, com.facebook.buck.cd.model.java.JarParametersOrBuilder> 
        getAbiJarParametersFieldBuilder() {
      if (abiJarParametersBuilder_ == null) {
        abiJarParametersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.facebook.buck.cd.model.java.JarParameters, com.facebook.buck.cd.model.java.JarParameters.Builder, com.facebook.buck.cd.model.java.JarParametersOrBuilder>(
                getAbiJarParameters(),
                getParentForChildren(),
                isClean());
        abiJarParameters_ = null;
      }
      return abiJarParametersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kotlincd.api.v1.AbiJarCommand)
  }

  // @@protoc_insertion_point(class_scope:kotlincd.api.v1.AbiJarCommand)
  private static final com.facebook.buck.cd.model.kotlin.AbiJarCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.facebook.buck.cd.model.kotlin.AbiJarCommand();
  }

  public static com.facebook.buck.cd.model.kotlin.AbiJarCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbiJarCommand>
      PARSER = new com.google.protobuf.AbstractParser<AbiJarCommand>() {
    @java.lang.Override
    public AbiJarCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AbiJarCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AbiJarCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AbiJarCommand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.facebook.buck.cd.model.kotlin.AbiJarCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

