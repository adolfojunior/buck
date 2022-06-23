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

package com.facebook.buck.installer;

import com.facebook.buck.install.model.*;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InstallerService extends InstallerGrpc.InstallerImplBase {
  /** Installer Service that implemts Installer.proto */
  public final InstallType installer;

  public SettableFuture<Boolean> installFinished = SettableFuture.create();;

  public InstallerService(InstallType installer) {
    this.installer = installer;
  }

  @Override
  public void fileReadyRequest(FileReady request, StreamObserver<FileResponse> responseObserver) {
    Boolean err;
    String errMsg = "";
    FileResponse rep;
    try {
      System.out.printf("About to install:%s %s\n", request.getName(), request.getPath());
      Path path = Paths.get(request.getPath());
      InstallResult res = installer.install(path);
      err = res.isErr;
      errMsg = res.errMsg;
    } catch (IOException | InterruptedException ex) {
      err = true;
      errMsg = ex.toString();
    }
    rep =
        FileResponse.newBuilder()
            .setName(request.getName())
            .setPath(request.getPath())
            .setErr(err)
            .setErrMsg(errMsg)
            .build();

    responseObserver.onNext(rep);
    responseObserver.onCompleted();
  }

  @Override
  public void shutdownServer(Shutdown request, StreamObserver<ShutdownResponse> responseObserver) {
    responseObserver.onNext(ShutdownResponse.newBuilder().build());
    responseObserver.onCompleted();
    installFinished.set(true);
  }

  public SettableFuture<Boolean> isInstallFinished() {
    return installFinished;
  }
}