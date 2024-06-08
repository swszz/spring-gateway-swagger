package com.swszz.gatewayswagger.webflux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NettyBasedApplication

fun main(args: Array<String>) {
    runApplication<NettyBasedApplication>(*args)
}
