// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Document.proto

package com.blueservices.logic;

public final class DocumentMessage {
  private DocumentMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DocumentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:blueMedia.Document)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int64 id = 1;</code>
     */
    long getId();

    /**
     * <code>required string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>required string content = 3;</code>
     */
    boolean hasContent();
    /**
     * <code>required string content = 3;</code>
     */
    java.lang.String getContent();
    /**
     * <code>required string content = 3;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>required .blueMedia.Document.State state = 4;</code>
     */
    boolean hasState();
    /**
     * <code>required .blueMedia.Document.State state = 4;</code>
     */
    com.blueservices.logic.DocumentMessage.Document.State getState();

    /**
     * <code>optional string reason = 5;</code>
     */
    boolean hasReason();
    /**
     * <code>optional string reason = 5;</code>
     */
    java.lang.String getReason();
    /**
     * <code>optional string reason = 5;</code>
     */
    com.google.protobuf.ByteString
        getReasonBytes();
  }
  /**
   * Protobuf type {@code blueMedia.Document}
   */
  public static final class Document extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:blueMedia.Document)
      DocumentOrBuilder {
    // Use Document.newBuilder() to construct.
    private Document(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Document(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Document defaultInstance;
    public static Document getDefaultInstance() {
      return defaultInstance;
    }

    public Document getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Document(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt64();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              content_ = bs;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.blueservices.logic.DocumentMessage.Document.State value = com.blueservices.logic.DocumentMessage.Document.State.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                state_ = value;
              }
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              reason_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.blueservices.logic.DocumentMessage.internal_static_blueMedia_Document_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.blueservices.logic.DocumentMessage.internal_static_blueMedia_Document_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.blueservices.logic.DocumentMessage.Document.class, com.blueservices.logic.DocumentMessage.Document.Builder.class);
    }

    public static com.google.protobuf.Parser<Document> PARSER =
        new com.google.protobuf.AbstractParser<Document>() {
      public Document parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Document(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Document> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code blueMedia.Document.State}
     */
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>CREATED = 0;</code>
       */
      CREATED(0, 0),
      /**
       * <code>ACCEPTED = 1;</code>
       */
      ACCEPTED(1, 1),
      /**
       * <code>VERIFIED = 2;</code>
       */
      VERIFIED(2, 2),
      /**
       * <code>PUBLISHED = 3;</code>
       */
      PUBLISHED(3, 3),
      /**
       * <code>DELETED = 4;</code>
       */
      DELETED(4, 4),
      /**
       * <code>REJECTED = 5;</code>
       */
      REJECTED(5, 5),
      ;

      /**
       * <code>CREATED = 0;</code>
       */
      public static final int CREATED_VALUE = 0;
      /**
       * <code>ACCEPTED = 1;</code>
       */
      public static final int ACCEPTED_VALUE = 1;
      /**
       * <code>VERIFIED = 2;</code>
       */
      public static final int VERIFIED_VALUE = 2;
      /**
       * <code>PUBLISHED = 3;</code>
       */
      public static final int PUBLISHED_VALUE = 3;
      /**
       * <code>DELETED = 4;</code>
       */
      public static final int DELETED_VALUE = 4;
      /**
       * <code>REJECTED = 5;</code>
       */
      public static final int REJECTED_VALUE = 5;


      public final int getNumber() { return value; }

      public static State valueOf(int value) {
        switch (value) {
          case 0: return CREATED;
          case 1: return ACCEPTED;
          case 2: return VERIFIED;
          case 3: return PUBLISHED;
          case 4: return DELETED;
          case 5: return REJECTED;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<State>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.blueservices.logic.DocumentMessage.Document.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private State(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:blueMedia.Document.State)
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>required int64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    /**
     * <code>required string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 3;
    private java.lang.Object content_;
    /**
     * <code>required string content = 3;</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string content = 3;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          content_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string content = 3;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATE_FIELD_NUMBER = 4;
    private com.blueservices.logic.DocumentMessage.Document.State state_;
    /**
     * <code>required .blueMedia.Document.State state = 4;</code>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required .blueMedia.Document.State state = 4;</code>
     */
    public com.blueservices.logic.DocumentMessage.Document.State getState() {
      return state_;
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private java.lang.Object reason_;
    /**
     * <code>optional string reason = 5;</code>
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string reason = 5;</code>
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reason_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string reason = 5;</code>
     */
    public com.google.protobuf.ByteString
        getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      id_ = 0L;
      name_ = "";
      content_ = "";
      state_ = com.blueservices.logic.DocumentMessage.Document.State.CREATED;
      reason_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasContent()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasState()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getContentBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, state_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getReasonBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getContentBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, state_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getReasonBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.blueservices.logic.DocumentMessage.Document parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.blueservices.logic.DocumentMessage.Document parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.blueservices.logic.DocumentMessage.Document parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.blueservices.logic.DocumentMessage.Document parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.blueservices.logic.DocumentMessage.Document parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.blueservices.logic.DocumentMessage.Document parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.blueservices.logic.DocumentMessage.Document parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.blueservices.logic.DocumentMessage.Document parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.blueservices.logic.DocumentMessage.Document parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.blueservices.logic.DocumentMessage.Document parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.blueservices.logic.DocumentMessage.Document prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code blueMedia.Document}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:blueMedia.Document)
        com.blueservices.logic.DocumentMessage.DocumentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.blueservices.logic.DocumentMessage.internal_static_blueMedia_Document_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.blueservices.logic.DocumentMessage.internal_static_blueMedia_Document_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.blueservices.logic.DocumentMessage.Document.class, com.blueservices.logic.DocumentMessage.Document.Builder.class);
      }

      // Construct using com.blueservices.logic.DocumentMessage.Document.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        content_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        state_ = com.blueservices.logic.DocumentMessage.Document.State.CREATED;
        bitField0_ = (bitField0_ & ~0x00000008);
        reason_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.blueservices.logic.DocumentMessage.internal_static_blueMedia_Document_descriptor;
      }

      public com.blueservices.logic.DocumentMessage.Document getDefaultInstanceForType() {
        return com.blueservices.logic.DocumentMessage.Document.getDefaultInstance();
      }

      public com.blueservices.logic.DocumentMessage.Document build() {
        com.blueservices.logic.DocumentMessage.Document result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.blueservices.logic.DocumentMessage.Document buildPartial() {
        com.blueservices.logic.DocumentMessage.Document result = new com.blueservices.logic.DocumentMessage.Document(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.content_ = content_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.reason_ = reason_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.blueservices.logic.DocumentMessage.Document) {
          return mergeFrom((com.blueservices.logic.DocumentMessage.Document)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.blueservices.logic.DocumentMessage.Document other) {
        if (other == com.blueservices.logic.DocumentMessage.Document.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasContent()) {
          bitField0_ |= 0x00000004;
          content_ = other.content_;
          onChanged();
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasReason()) {
          bitField0_ |= 0x00000010;
          reason_ = other.reason_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasName()) {
          
          return false;
        }
        if (!hasContent()) {
          
          return false;
        }
        if (!hasState()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.blueservices.logic.DocumentMessage.Document parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.blueservices.logic.DocumentMessage.Document) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long id_ ;
      /**
       * <code>required int64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>required string content = 3;</code>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string content = 3;</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            content_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string content = 3;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string content = 3;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string content = 3;</code>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000004);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>required string content = 3;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        content_ = value;
        onChanged();
        return this;
      }

      private com.blueservices.logic.DocumentMessage.Document.State state_ = com.blueservices.logic.DocumentMessage.Document.State.CREATED;
      /**
       * <code>required .blueMedia.Document.State state = 4;</code>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required .blueMedia.Document.State state = 4;</code>
       */
      public com.blueservices.logic.DocumentMessage.Document.State getState() {
        return state_;
      }
      /**
       * <code>required .blueMedia.Document.State state = 4;</code>
       */
      public Builder setState(com.blueservices.logic.DocumentMessage.Document.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .blueMedia.Document.State state = 4;</code>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000008);
        state_ = com.blueservices.logic.DocumentMessage.Document.State.CREATED;
        onChanged();
        return this;
      }

      private java.lang.Object reason_ = "";
      /**
       * <code>optional string reason = 5;</code>
       */
      public boolean hasReason() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string reason = 5;</code>
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reason_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string reason = 5;</code>
       */
      public com.google.protobuf.ByteString
          getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string reason = 5;</code>
       */
      public Builder setReason(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string reason = 5;</code>
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000010);
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       * <code>optional string reason = 5;</code>
       */
      public Builder setReasonBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        reason_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:blueMedia.Document)
    }

    static {
      defaultInstance = new Document(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blueMedia.Document)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blueMedia_Document_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blueMedia_Document_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Document.proto\022\tblueMedia\"\313\001\n\010Document" +
      "\022\n\n\002id\030\001 \002(\003\022\014\n\004name\030\002 \002(\t\022\017\n\007content\030\003 " +
      "\002(\t\022(\n\005state\030\004 \002(\0162\031.blueMedia.Document." +
      "State\022\016\n\006reason\030\005 \001(\t\"Z\n\005State\022\013\n\007CREATE" +
      "D\020\000\022\014\n\010ACCEPTED\020\001\022\014\n\010VERIFIED\020\002\022\r\n\tPUBLI" +
      "SHED\020\003\022\013\n\007DELETED\020\004\022\014\n\010REJECTED\020\005B)\n\026com" +
      ".blueservices.logicB\017DocumentMessage"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_blueMedia_Document_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_blueMedia_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_blueMedia_Document_descriptor,
        new java.lang.String[] { "Id", "Name", "Content", "State", "Reason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
