/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.apple;

import com.dd.plist.NSDictionary;
import com.dd.plist.PropertyListParser;
import com.facebook.buck.log.Logger;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

/**
 * Utility class to discover the location of toolchains contained inside an Xcode
 * installation.
 */
public class AppleToolchainDiscovery {

  private static final Logger LOG = Logger.get(AppleToolchainDiscovery.class);

  // Utility class; do not instantiate.
  private AppleToolchainDiscovery() { }

  /**
   * Given a path to an Xcode developer directory, walks through the
   * toolchains and builds a map of (identifier: path) pairs of the
   * toolchains inside.
   */
  public static ImmutableMap<String, Path> discoverAppleToolchainPaths(
      Path xcodeDir,
      ImmutableList<Path> extraDirs) throws IOException {
    LOG.debug("Searching for Xcode toolchains under %s", xcodeDir);

    ImmutableMap.Builder<String, Path> toolchainIdentifiersToPathsBuilder = ImmutableMap.builder();
    Path toolchainsDir = xcodeDir.resolve("Toolchains");

    Iterable<Path> toolchainPaths = Iterables.concat(
        ImmutableSet.of(toolchainsDir), extraDirs);

    for (Path toolchains : toolchainPaths) {
      if (!Files.exists(toolchains)) {
        LOG.debug("Skipping toolchain search path %s that does not exist", toolchains);
        continue;
      }

      LOG.debug("Searching for Xcode toolchains in %s", toolchains);

      try (DirectoryStream<Path> toolchainStream = Files.newDirectoryStream(
               toolchains,
               "*.xctoolchain")) {
        for (Path toolchainPath : toolchainStream) {
          LOG.debug("Getting identifier for for Xcode toolchain under %s", toolchainPath);
          addIdentiferForToolchain(toolchainPath, toolchainIdentifiersToPathsBuilder);
        }
      }
    }

    return toolchainIdentifiersToPathsBuilder.build();
  }

  private static void addIdentiferForToolchain(
        Path toolchainDir,
        ImmutableMap.Builder<String, Path> toolchainBuilder) throws IOException {
    try (InputStream toolchainInfoPlist = Files.newInputStream(
             toolchainDir.resolve("ToolchainInfo.plist"));
         BufferedInputStream bufferedToolchainInfoPlist = new BufferedInputStream(
             toolchainInfoPlist)) {
      NSDictionary parsedToolchainInfoPlist;
      try {
        parsedToolchainInfoPlist = (NSDictionary) PropertyListParser.parse(
            bufferedToolchainInfoPlist);
      } catch (Exception e) {
        throw new IOException(e);
      }
      String identifier = parsedToolchainInfoPlist.objectForKey("Identifier")
          .toString();
      LOG.debug("Mapped SDK identifier %s to path %s", identifier, toolchainDir);
      toolchainBuilder.put(identifier, toolchainDir);
    } catch (FileNotFoundException | NoSuchFileException e) {
      LOG.error(e, "No ToolchainInfo.plist found under toolchain path %s, ignoring", toolchainDir);
    }
  }
}
