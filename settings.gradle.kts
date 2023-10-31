rootProject.name = "sandbox-spring-data-jpa"

pluginManagement {
    val springDependencyManagement: String by settings
    val springframeworkBoot: String by settings

    plugins {
        id("io.spring.dependency-management") version springDependencyManagement
        id("org.springframework.boot") version springframeworkBoot
    }
}

include("examples:relationships:many-to-many")
include("examples:relationships:one-to-many")
include("examples:relationships:one-to-one")
