package com.swszz.gatewayswagger.gateway

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.gateway.route.RouteDefinition

@ConfigurationProperties("gateway")
data class GatewayRoutesProperties(
    val routes: Map<String, List<RouteDefinition>> = mutableMapOf(),
)