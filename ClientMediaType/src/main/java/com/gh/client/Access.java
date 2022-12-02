package com.gh.client;

/**
 * <p>Created by IntelliJ IDEA.
 * <p>Date: 12/1/22
 * <p>Time: 12:45 AM
 *
 * @author Miguel Mu\u00f1oz
 */
public class Access {
  private final String accessToken;
  private final String tokenType;
  private final long expiresIn;

  public Access(final String accessToken, final String tokenType, final long expiresIn) {
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.expiresIn = expiresIn;
  }

  public String getAccessToken() { return accessToken; }
  public String getTokenType() { return tokenType; }
  public long getExpiresIn() { return expiresIn; }
}
