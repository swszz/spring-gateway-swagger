package com.swszz.gatewayswagger.gateway

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.gateway.config.GatewayProperties
import org.springframework.cloud.gateway.config.PropertiesRouteDefinitionLocator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
@EnableConfigurationProperties(
    value = [GatewayTomcatRoutesProperties::class,
        GatewayNettyRoutesProperties::class]
)
class GatewayRoutesConfiguration {
    @Bean
    fun propertiesRouteDefinitionLocator(
        properties: GatewayProperties,
        gatewayTomcatRoutesProperties: GatewayTomcatRoutesProperties,
        gatewayNettyRoutesProperties: GatewayNettyRoutesProperties,
    ): PropertiesRouteDefinitionLocator {

        configureRoutesDefinition(
            gatewayProperties = properties,
            gatewayNettyRoutesProperties,
            gatewayTomcatRoutesProperties
        )

        return PropertiesRouteDefinitionLocator(properties)
    }

    private fun configureRoutesDefinition(
        gatewayProperties: GatewayProperties,
        vararg routesProperties: RoutesProperties,
    ) {
        gatewayProperties.routes = routesProperties.flatMap { it.routes.values }
    }
}