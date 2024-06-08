package com.swszz.gatewayswagger.webflux

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("netty")
class NettyBasedController {
    @GetMapping(value = ["hello"])
    fun hello() = "hello netty!"
}