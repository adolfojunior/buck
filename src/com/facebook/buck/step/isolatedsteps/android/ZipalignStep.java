/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.buck.step.isolatedsteps.android;

import com.facebook.buck.core.build.execution.context.StepExecutionContext;
import com.facebook.buck.core.filesystems.AbsPath;
import com.facebook.buck.core.sourcepath.resolver.SourcePathResolverAdapter;
import com.facebook.buck.core.toolchain.tool.Tool;
import com.facebook.buck.shell.ShellStep;
import com.google.common.collect.ImmutableList;
import java.nio.file.Path;

public class ZipalignStep extends ShellStep {

  private final Path inputFile;
  private final Path outputFile;
  private final Tool zipalignTool;
  private final SourcePathResolverAdapter sourcePathResolver;

  public ZipalignStep(
      AbsPath workingDirectory,
      Path inputFile,
      Path outputFile,
      Tool zipalignTool,
      SourcePathResolverAdapter sourcePathResolver,
      boolean withDownwardApi) {
    super(workingDirectory, withDownwardApi);
    this.inputFile = inputFile;
    this.outputFile = outputFile;
    this.zipalignTool = zipalignTool;
    this.sourcePathResolver = sourcePathResolver;
  }

  @Override
  protected ImmutableList<String> getShellCommandInternal(StepExecutionContext context) {
    ImmutableList.Builder<String> args = ImmutableList.builder();

    args.addAll(zipalignTool.getCommandPrefix(sourcePathResolver));
    args.add("-f").add("4");
    args.add(inputFile.toString());
    args.add(outputFile.toString());
    return args.build();
  }

  @Override
  public String getShortName() {
    return "zipalign";
  }
}