rootProject.name = "sandbox-spring-data-jpa"

pluginManagement {
    val springDependencyManagement: String by settings
    val springframeworkBoot: String by settings

    plugins {
        id("io.spring.dependency-management") version springDependencyManagement
        id("org.springframework.boot") version springframeworkBoot
    }
}

include("examples:relationships:bidirectional:many-to-many")
include("examples:relationships:bidirectional:one-to-many")
include("examples:relationships:bidirectional:one-to-one")

include("examples:relationships:unidirectional:many-to-many")
include("examples:relationships:unidirectional:one-to-many")
include("examples:relationships:unidirectional:one-to-one")