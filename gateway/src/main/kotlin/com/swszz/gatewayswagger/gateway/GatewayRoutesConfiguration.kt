package com.swszz.gatewayswagger.gateway

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.gateway.config.GatewayProperties
import org.springframework.cloud.gateway.config.PropertiesRouteDefinitionLocator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(
    value = [GatewayRoutesProperties::class]
)
class GatewayRoutesConfiguration {
    @Bean
    fun propertiesRouteDefinitionLocator(
        properties: GatewayProperties,
        gatewayRoutesProperties: GatewayRoutesProperties,
    ): PropertiesRouteDefinitionLocator {
        properties.apply {
            routes = gatewayRoutesProperties.routes.flatMap { it.value }
        }
        return PropertiesRouteDefinitionLocator(properties)
    }

}