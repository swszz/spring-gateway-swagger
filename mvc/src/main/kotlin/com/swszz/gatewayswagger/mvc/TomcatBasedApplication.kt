package com.swszz.gatewayswagger.mvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TomcatBasedApplication

fun main(args: Array<String>) {
    runApplication<TomcatBasedApplication>(*args)
}
