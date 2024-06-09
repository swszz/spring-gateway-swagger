package com.swszz.gatewayswagger.gateway

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.gateway.route.RouteDefinition

@ConfigurationProperties("gateway.tomcat")
data class GatewayTomcatRoutesProperties(
    override val routes: Map<String, RouteDefinition> = emptyMap(),
) : RoutesProperties