// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf;

/**
 * Protobuf type {@code EmptyMessage}
 */
public final class EmptyMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EmptyMessage)
    EmptyMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmptyMessage.newBuilder() to construct.
  private EmptyMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmptyMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmptyMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EmptyMessage(
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
    return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_EmptyMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_EmptyMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage.class, com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage)) {
      return super.equals(obj);
    }
    com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage other = (com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parseFrom(
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
  public static Builder newBuilder(com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage prototype) {
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
   * Protobuf type {@code EmptyMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EmptyMessage)
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_EmptyMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_EmptyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage.class, com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage.Builder.class);
    }

    // Construct using com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_EmptyMessage_descriptor;
    }

    @java.lang.Override
    public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage getDefaultInstanceForType() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage build() {
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage buildPartial() {
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage result = new com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage(this);
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
      if (other instanceof com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage) {
        return mergeFrom((com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage other) {
      if (other == com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage.getDefaultInstance()) return this;
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
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:EmptyMessage)
  }

  // @@protoc_insertion_point(class_scope:EmptyMessage)
  private static final com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage();
  }

  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmptyMessage>
      PARSER = new com.google.protobuf.AbstractParser<EmptyMessage>() {
    @java.lang.Override
    public EmptyMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EmptyMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmptyMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmptyMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.EmptyMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

