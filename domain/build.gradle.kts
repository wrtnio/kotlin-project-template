plugins {
    kotlin("plugin.spring")
    kotlin("kapt")
    id(Plugins.spring_boot)
}

configurations {
    testImplementation.get().extendsFrom(compileOnly.get(), runtimeOnly.get())
}

dependencies {

    // Modules
    implementation(project(":core"))
    implementation(project(":messages"))

    implementation(Libs.kommons_core)
    testImplementation(Libs.kommons_junit5)

    // MongoDB
    implementation(Libs.springBootStarter("data-mongodb"))
    implementation(Libs.springBootStarter("data-mongodb-reactive"))
    implementation(Libs.mongodb_driver_sync)
    implementation(Libs.mongodb_driver_reactivestreams)

    // JSON
    implementation(Libs.kommons_json)
    implementation(Libs.jackson_module_kotlin)

    // Coroutines
    implementation(Libs.kommons_coroutines)
    implementation(Libs.kotlinx_coroutines_core)
    implementation(Libs.kotlinx_coroutines_reactor)
    testImplementation(Libs.kotlinx_coroutines_test)

    implementation(Libs.reactor_kotlin_extensions)
    testImplementation(Libs.reactor_test)
    testImplementation(Libs.turbine)

    // Testcontainers
    testImplementation(Libs.kommons_testcontainers)
    testImplementation(Libs.testcontainers_mongodb)

    // Spring Boot 
    runtimeOnly(Libs.springBoot("devtools"))
    kapt(Libs.springBoot("configuration-processor"))

    testImplementation(Libs.springBootStarter("test")) {
        exclude(group = "junit", module = "junit")
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        exclude(module = "mockito-core")
    }
}
