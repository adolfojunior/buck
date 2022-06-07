// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cd/resources/proto/javacd.proto

package com.facebook.buck.cd.model.java;

@javax.annotation.Generated(value="protoc", comments="annotations:ResolvedJavacOptionsOrBuilder.java.pb.meta")
public interface ResolvedJavacOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:javacd.api.v1.ResolvedJavacOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string bootclasspath = 1;</code>
   */
  java.lang.String getBootclasspath();
  /**
   * <code>string bootclasspath = 1;</code>
   */
  com.google.protobuf.ByteString
      getBootclasspathBytes();

  /**
   * <code>repeated .RelPath bootclasspathList = 2;</code>
   */
  java.util.List<com.facebook.buck.cd.model.common.RelPath> 
      getBootclasspathListList();
  /**
   * <code>repeated .RelPath bootclasspathList = 2;</code>
   */
  com.facebook.buck.cd.model.common.RelPath getBootclasspathList(int index);
  /**
   * <code>repeated .RelPath bootclasspathList = 2;</code>
   */
  int getBootclasspathListCount();
  /**
   * <code>repeated .RelPath bootclasspathList = 2;</code>
   */
  java.util.List<? extends com.facebook.buck.cd.model.common.RelPathOrBuilder> 
      getBootclasspathListOrBuilderList();
  /**
   * <code>repeated .RelPath bootclasspathList = 2;</code>
   */
  com.facebook.buck.cd.model.common.RelPathOrBuilder getBootclasspathListOrBuilder(
      int index);

  /**
   * <code>.javacd.api.v1.ResolvedJavacOptions.JavacLanguageLevelOptions languageLevelOptions = 3;</code>
   */
  boolean hasLanguageLevelOptions();
  /**
   * <code>.javacd.api.v1.ResolvedJavacOptions.JavacLanguageLevelOptions languageLevelOptions = 3;</code>
   */
  com.facebook.buck.cd.model.java.ResolvedJavacOptions.JavacLanguageLevelOptions getLanguageLevelOptions();
  /**
   * <code>.javacd.api.v1.ResolvedJavacOptions.JavacLanguageLevelOptions languageLevelOptions = 3;</code>
   */
  com.facebook.buck.cd.model.java.ResolvedJavacOptions.JavacLanguageLevelOptionsOrBuilder getLanguageLevelOptionsOrBuilder();

  /**
   * <code>bool debug = 4;</code>
   */
  boolean getDebug();

  /**
   * <code>bool verbose = 5;</code>
   */
  boolean getVerbose();

  /**
   * <code>.javacd.api.v1.ResolvedJavacOptions.JavacPluginParams javaAnnotationProcessorParams = 6;</code>
   */
  boolean hasJavaAnnotationProcessorParams();
  /**
   * <code>.javacd.api.v1.ResolvedJavacOptions.JavacPluginParams javaAnnotationProcessorParams = 6;</code>
   */
  com.facebook.buck.cd.model.java.ResolvedJavacOptions.JavacPluginParams getJavaAnnotationProcessorParams();
  /**
   * <code>.javacd.api.v1.ResolvedJavacOptions.JavacPluginParams javaAnnotationProcessorParams = 6;</code>
   */
  com.facebook.buck.cd.model.java.ResolvedJavacOptions.JavacPluginParamsOrBuilder getJavaAnnotationProcessorParamsOrBuilder();

  /**
   * <code>.javacd.api.v1.ResolvedJavacOptions.JavacPluginParams standardJavacPluginParams = 7;</code>
   */
  boolean hasStandardJavacPluginParams();
  /**
   * <code>.javacd.api.v1.ResolvedJavacOptions.JavacPluginParams standardJavacPluginParams = 7;</code>
   */
  com.facebook.buck.cd.model.java.ResolvedJavacOptions.JavacPluginParams getStandardJavacPluginParams();
  /**
   * <code>.javacd.api.v1.ResolvedJavacOptions.JavacPluginParams standardJavacPluginParams = 7;</code>
   */
  com.facebook.buck.cd.model.java.ResolvedJavacOptions.JavacPluginParamsOrBuilder getStandardJavacPluginParamsOrBuilder();

  /**
   * <code>repeated string extraArguments = 8;</code>
   */
  java.util.List<java.lang.String>
      getExtraArgumentsList();
  /**
   * <code>repeated string extraArguments = 8;</code>
   */
  int getExtraArgumentsCount();
  /**
   * <code>repeated string extraArguments = 8;</code>
   */
  java.lang.String getExtraArguments(int index);
  /**
   * <code>repeated string extraArguments = 8;</code>
   */
  com.google.protobuf.ByteString
      getExtraArgumentsBytes(int index);
}