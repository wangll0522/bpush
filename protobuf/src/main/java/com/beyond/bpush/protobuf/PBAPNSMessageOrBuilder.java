// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb_message.proto

package com.beyond.bpush.protobuf;

public interface PBAPNSMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:message.PBAPNSMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 offlineMode = 1;</code>
   */
  boolean hasOfflineMode();
  /**
   * <code>optional int32 offlineMode = 1;</code>
   */
  int getOfflineMode();

  /**
   * <code>required .message.PBAPNSBody aps = 2;</code>
   */
  boolean hasAps();
  /**
   * <code>required .message.PBAPNSBody aps = 2;</code>
   */
  com.beyond.bpush.protobuf.PBAPNSBody getAps();
  /**
   * <code>required .message.PBAPNSBody aps = 2;</code>
   */
  com.beyond.bpush.protobuf.PBAPNSBodyOrBuilder getApsOrBuilder();

  /**
   * <code>repeated .message.PBAPNSUserInfo userInfo = 3;</code>
   */
  java.util.List<com.beyond.bpush.protobuf.PBAPNSUserInfo> 
      getUserInfoList();
  /**
   * <code>repeated .message.PBAPNSUserInfo userInfo = 3;</code>
   */
  com.beyond.bpush.protobuf.PBAPNSUserInfo getUserInfo(int index);
  /**
   * <code>repeated .message.PBAPNSUserInfo userInfo = 3;</code>
   */
  int getUserInfoCount();
  /**
   * <code>repeated .message.PBAPNSUserInfo userInfo = 3;</code>
   */
  java.util.List<? extends com.beyond.bpush.protobuf.PBAPNSUserInfoOrBuilder> 
      getUserInfoOrBuilderList();
  /**
   * <code>repeated .message.PBAPNSUserInfo userInfo = 3;</code>
   */
  com.beyond.bpush.protobuf.PBAPNSUserInfoOrBuilder getUserInfoOrBuilder(
          int index);

  /**
   * <code>optional int32 apnsMode = 4;</code>
   */
  boolean hasApnsMode();
  /**
   * <code>optional int32 apnsMode = 4;</code>
   */
  int getApnsMode();
}
