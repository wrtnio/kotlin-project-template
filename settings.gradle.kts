pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version ("0.4.0")
    }
}

val PROJECT_NAME = "wrtn-template"

rootProject.name = "$PROJECT_NAME-root"

include(":app")
include(":core")
include(":domain")
include(":infrastructure")
include(":messages")
