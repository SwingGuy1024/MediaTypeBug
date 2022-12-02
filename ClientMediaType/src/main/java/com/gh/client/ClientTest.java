package com.gh.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Created by IntelliJ IDEA.
 * <p>Date: 12/1/22
 * <p>Time: 1:41 AM
 *
 * @author Miguel Mu\u00f1oz
 */
public class ClientTest {
  private static final Logger log = LoggerFactory.getLogger(ClientTest.class);
  public static void main(String[] args) {
    JwtManager manager = new JwtManager("http://localhost:8080", "secret");
    Access result = manager.getAccessToken(); // getAccess throws Exception.
    log.trace("Result: {}, {}, {}", result.getAccessToken(), result.getTokenType(), result.getExpiresIn());
  }
}
