package com.swszz.gatewayswagger.mvc

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tomcat")
class TomcatBasedController {
    @GetMapping(value = ["hello"])
    fun hello() = "hello tomcat!"
}