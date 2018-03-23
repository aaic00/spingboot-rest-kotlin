package vip.aaic.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestJavaController {

  @GetMapping("api/java/ok")
  public RestResponse<Object> ok() {
    return RestResponse.OK;
  }

  @GetMapping("api/java/hello")
  public RestResponse<Object> hello() {
    return RestResponse.of("Hello World!");
  }

}
