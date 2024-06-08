rootProject.name = "spring-gateway-swagger"

include(
    "gateway",
    "mvc",
    "webflux",
)

pluginManagement {
    val kotlinVersion = "1.9.24"
    val springBootVersion = "3.2.6"
    val springDependencyVersion = "1.1.5"
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.plugin.spring" -> useVersion(kotlinVersion)
                "org.springframework.boot" -> useVersion(springBootVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyVersion)
            }
        }
    }
}