package com.gh.demo;

/**
 * <p>Created by IntelliJ IDEA.
 * <p>Date: 12/1/22
 * <p>Time: 12:45 AM
 *
 * @author Miguel Mu\u00f1oz
 */
public class Access {
  private String accessToken;
  private String tokenType;
  private long expiresIn;

  public Access(final String accessToken, final String tokenType, final long expiresIn) {
    this.accessToken = accessToken;
    this.tokenType = tokenType;
    this.expiresIn = expiresIn;
  }

  public String getAccessToken() {return accessToken;}

  public void setAccessToken(final String accessToken) {this.accessToken = accessToken;}

  public String getTokenType() {return tokenType;}

  public void setTokenType(final String tokenType) {this.tokenType = tokenType;}

  public long getExpiresIn() {return expiresIn;}

  public void setExpiresIn(final long expiresIn) {this.expiresIn = expiresIn;}
}
