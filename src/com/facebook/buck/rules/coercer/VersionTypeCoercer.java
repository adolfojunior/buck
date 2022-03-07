/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
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

package com.facebook.buck.rules.coercer;

import com.facebook.buck.core.cell.nameresolver.CellNameResolver;
import com.facebook.buck.core.filesystems.ForwardRelPath;
import com.facebook.buck.io.filesystem.ProjectFilesystem;
import com.facebook.buck.versions.Version;
import com.google.common.reflect.TypeToken;

/** Coerce to {@link Version}. */
class VersionTypeCoercer extends LeafUnconfiguredOnlyCoercer<Version> {
  @Override
  public SkylarkSpec getSkylarkSpec() {
    return () -> "attr.string()";
  }

  @Override
  public TypeToken<Version> getUnconfiguredType() {
    return TypeToken.of(Version.class);
  }

  @Override
  public Version coerceToUnconfigured(
      CellNameResolver cellRoots,
      ProjectFilesystem filesystem,
      ForwardRelPath pathRelativeToProjectRoot,
      Object object)
      throws CoerceFailedException {
    if (object instanceof String) {
      return Version.of((String) object);
    }
    throw CoerceFailedException.simple(object, getOutputType());
  }
}
