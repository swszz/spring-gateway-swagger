package com.swszz.gatewayswagger.gateway

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.gateway.route.RouteDefinition

@ConfigurationProperties("gateway.netty")
data class GatewayNettyRoutesProperties(
    override val routes: Map<String, RouteDefinition> = emptyMap(),
) : RoutesProperties