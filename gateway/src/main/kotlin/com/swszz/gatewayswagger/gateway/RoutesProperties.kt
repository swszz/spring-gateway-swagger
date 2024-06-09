package com.swszz.gatewayswagger.gateway

import org.springframework.cloud.gateway.route.RouteDefinition

interface RoutesProperties {
    val routes: Map<String, RouteDefinition>
}