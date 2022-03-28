package pl.klolo.spring.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloEndpoint {

    @GetMapping("foo")
    fun foo() = "hello mister"

}