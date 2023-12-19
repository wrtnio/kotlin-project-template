object Plugins {

    object Versions {
        const val dokka = "1.8.20"
        const val detekt = "1.21.0"
        const val dependency_management = "1.1.3"
        const val jooq = "3.18.6"
        const val protobuf = "0.8.19"
        const val avro = "1.7.0"

        const val jacoco = "0.8.8"
        const val jarTest = "1.0.1"
        const val testLogger = "3.2.0"
        const val shadow = "7.1.2"
        const val kotlinx_benchmark = "0.4.7"

        const val spring_boot = "3.1.6"
        const val docker_compose = "0.16.12"
    }

    const val detekt = "io.gitlab.arturbosch.detekt"
    const val dokka = "org.jetbrains.dokka"
    const val dependency_management = "io.spring.dependency-management"
    const val spring_boot = "org.springframework.boot"

    const val jooq = "nu.studer.jooq"

    // https://github.com/google/protobuf-gradle-plugin
    const val protobuf = "com.google.protobuf"

    // https://github.com/davidmc24/gradle-avro-plugin
    const val avro = "com.github.davidmc24.gradle.plugin.avro" //"com.commercehub.gradle.plugin.avro"

    const val jarTest = "com.github.hauner.jarTest"

    // https://mvnrepository.com/artifact/com.adarshr/gradle-test-logger-plugin
    const val testLogger = "com.adarshr.test-logger"
    const val shadow = "com.github.johnrengelman.shadow"

    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-benchmark-plugin
    const val kotlinx_benchmark = "org.jetbrains.kotlinx.benchmark"

    // docker-compose gradle plugin(https://plugins.gradle.org/plugin/com.avast.gradle.docker-compose)
    const val docker_compose = "com.avast.gradle.docker-compose"
}
