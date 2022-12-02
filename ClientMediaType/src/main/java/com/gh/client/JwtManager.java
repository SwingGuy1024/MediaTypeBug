package com.gh.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.*;

/**
 * <p>Created by IntelliJ IDEA.
 * <p>Date: 12/1/22
 * <p>Time: 12:47 AM
 *
 * @author Miguel Mu\u00f1oz
 */
public class JwtManager {
  private static final Logger log = LoggerFactory.getLogger(JwtManager.class);
  private final String serverUri;
  private final String secretKey;
  private final RestTemplate restTemplate = new RestTemplate();
  private final String accessUrl;

  public JwtManager(final String serverUri, final String secretKey) {
    this.serverUri = serverUri;
    this.secretKey = secretKey;
    accessUrl = serverUri + "/demo/server/getDummyData";
  }
  
  public Access getAccessToken() {
    Map<String, Object> headers = new HashMap<>();
//    headers.put("secret_key", secretKey);
    HttpEntity<MultiValueMap<String, Object>> httpEntity = makeHttpEntity(headers);
//    log.trace("Requesting with secretKey={}", secretKey);
    ResponseEntity<Access> response = restTemplate.exchange(accessUrl, GET, httpEntity, Access.class); // Exception thrown here!
    log.trace("Call returned with status = {}", response.getStatusCode());
    System.out.println("Status: " + response.getStatusCode());
    final Access body = response.getBody();
    log.trace(body.getAccessToken());
    System.out.printf("body = %s%n", body);
    return body;
  }
  
  private HttpEntity<MultiValueMap<String, Object>> makeHttpEntity(Map<String, Object> map) {
    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(List.of(MediaType.TEXT_PLAIN));
    for (String key: map.keySet()) {
      headers.put(key, List.of(map.get(key).toString()));
    }
    return new HttpEntity<>(null, headers);
  }
}
