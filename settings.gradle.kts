pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version ("0.7.0")
    }
}

rootProject.name = "wrtn-kotlin-template"

include(":app")
include(":core")
include(":domain")
include(":infrastructure")
include(":events")
include(":messages")
