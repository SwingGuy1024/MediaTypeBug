package com.gh.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Created by IntelliJ IDEA.
 * <p>Date: 11/30/22
 * <p>Time: 9:57 PM
 *
 * @author Miguel Mu\u00f1oz
 */
@RestController
@RequestMapping("demo/server")
public class Controller {
  private static final Logger log = LoggerFactory.getLogger(Controller.class);
  
  @GetMapping(value = "/getDummyData", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Access> getDummyData() {
    log.info("getDummyData");
    return new ResponseEntity<>(
        new Access("dummy", "Bearer", 3599L),
        HttpStatus.OK);
//    return new ResponseEntity<>(
//        "{\"accessToken\":\"dummy\",\"tokenType\":\"Bearer\",\"expiresIn\":3599}",
//        HttpStatus.ACCEPTED);
  }
}
