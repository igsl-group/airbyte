/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.destination.opensearch;

import io.airbyte.cdk.integrations.base.ssh.SshTunnel;

public class SshPasswordOpenSearchDestinationAcceptanceTest extends SshOpenSearchDestinationAcceptanceTest {

  @Override
  public SshTunnel.TunnelMethod getTunnelMethod() {
    return SshTunnel.TunnelMethod.SSH_PASSWORD_AUTH;
  }

}