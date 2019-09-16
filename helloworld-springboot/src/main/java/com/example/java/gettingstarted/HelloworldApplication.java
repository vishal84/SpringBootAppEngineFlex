/*
 * Copyright 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.java.gettingstarted;

import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

  private static final Log LOG = LogFactory.getLog(HelloworldApplication.class);

  @RequestMapping("/")
  public String home() {
    return "Hello World!";
  }

  /**
   * (Optional) App Engine health check endpoint mapping.
   * @see <a href="https://cloud.google.com/appengine/docs/flexible/java/how-instances-are-managed#health_checking"></a>
   * If your app does not handle health checks, a HTTP 404 response is interpreted
   *     as a successful reply.
   */
  @RequestMapping("/readiness_check")
  public String readiness_check() {
    // Message body required though ignored
    return "Ready to go!";
  }

  /**
   * (Optional) App Engine health check endpoint mapping.
   * @see <a href="https://cloud.google.com/appengine/docs/flexible/java/how-instances-are-managed#health_checking"></a>
   * If your app does not handle health checks, a HTTP 404 response is interpreted
   *     as a successful reply.
   */
  @RequestMapping("/liveness_check")
  public String liveness_check() {
    // Message body required though ignored
    return "Still ticking...!";
  }

  /**
   * Return the # of headers present
   */
  /* @RequestMapping("/headers")
  public ResponseEntity<String> listAllHeaders(@RequestHeader Map<String, String> headers) {
      headers.forEach((key, value) -> {
        LOG.info(String.format("Header '%s' = %s", key, value));
      });
  
      return new ResponseEntity<String>(String.format("Listed %d headers", headers.size()), HttpStatus.OK);
  } */

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }
}
