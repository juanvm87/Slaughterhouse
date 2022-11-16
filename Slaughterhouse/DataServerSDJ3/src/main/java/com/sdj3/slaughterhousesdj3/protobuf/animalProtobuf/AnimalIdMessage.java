// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf;

/**
 * Protobuf type {@code AnimalIdMessage}
 */
public final class AnimalIdMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AnimalIdMessage)
    AnimalIdMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnimalIdMessage.newBuilder() to construct.
  private AnimalIdMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnimalIdMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnimalIdMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnimalIdMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            id_ = input.readInt32();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_AnimalIdMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_AnimalIdMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage.class, com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
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
    if (!(obj instanceof com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage)) {
      return super.equals(obj);
    }
    com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage other = (com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage) obj;

    if (getId()
        != other.getId()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parseFrom(
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
  public static Builder newBuilder(com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage prototype) {
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
   * Protobuf type {@code AnimalIdMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AnimalIdMessage)
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_AnimalIdMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_AnimalIdMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage.class, com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage.Builder.class);
    }

    // Construct using com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage.newBuilder()
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
      id_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_AnimalIdMessage_descriptor;
    }

    @java.lang.Override
    public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage getDefaultInstanceForType() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage build() {
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage buildPartial() {
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage result = new com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage(this);
      result.id_ = id_;
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
      if (other instanceof com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage) {
        return mergeFrom((com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage other) {
      if (other == com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
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
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:AnimalIdMessage)
  }

  // @@protoc_insertion_point(class_scope:AnimalIdMessage)
  private static final com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage();
  }

  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnimalIdMessage>
      PARSER = new com.google.protobuf.AbstractParser<AnimalIdMessage>() {
    @java.lang.Override
    public AnimalIdMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnimalIdMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnimalIdMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnimalIdMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.AnimalIdMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

