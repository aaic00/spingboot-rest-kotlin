package vip.aaic.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {

    @GetMapping("api/hello")
    fun hello(): RestResponse<String> = RestResponse.of("Hello World!")

    @GetMapping("api/ok")
    fun ok(): RestResponse<Any> = RestResponse.OK

}