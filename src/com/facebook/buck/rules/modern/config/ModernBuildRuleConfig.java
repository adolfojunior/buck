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

package com.facebook.buck.rules.modern.config;

import com.facebook.buck.core.config.BuckConfig;
import com.facebook.buck.core.config.ConfigView;
import com.facebook.buck.core.util.immutables.BuckStyleValue;
import org.immutables.value.Value;

/** Various configuration for ModernBuildRule behavior. */
@BuckStyleValue
public abstract class ModernBuildRuleConfig
    implements ConfigView<BuckConfig>, ModernBuildRuleStrategyConfig {
  public static final String SECTION = "modern_build_rule";

  public static ModernBuildRuleConfig of(BuckConfig delegate) {
    return ImmutableModernBuildRuleConfig.ofImpl(delegate);
  }

  @Value.Derived
  public ModernBuildRuleStrategyConfig getDefaultStrategyConfig() {
    return new ModernBuildRuleStrategyConfigFromSection(getDelegate(), SECTION);
  }

  @Override
  public ModernBuildRuleBuildStrategy getBuildStrategy(
      boolean remoteExecutionAutoEnabled, boolean forceDisableRemoteExecution) {
    return getDefaultStrategyConfig()
        .getBuildStrategy(remoteExecutionAutoEnabled, forceDisableRemoteExecution);
  }

  @Override
  public HybridLocalBuildStrategyConfig getHybridLocalConfig() {
    return getDefaultStrategyConfig().getHybridLocalConfig();
  }
}
