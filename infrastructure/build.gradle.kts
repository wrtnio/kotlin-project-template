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

    // Json
    implementation(Libs.kommons_json)
    implementation(Libs.jackson_module_kotlin)

    // Coroutines
    implementation(Libs.kommons_coroutines)
    implementation(Libs.kotlinx_coroutines_core)
    implementation(Libs.kotlinx_coroutines_reactor)
    testImplementation(Libs.kotlinx_coroutines_test)

    // Redis
    implementation(Libs.kommons_redis)
    implementation(Libs.lettuce_core)
    implementation(Libs.redisson)
    implementation(Libs.springBootStarter("data-redis"))

    // Kafka
    compileOnly(Libs.kommons_kafka)
    compileOnly(Libs.kafka_clients)
    compileOnly(Libs.spring_kafka)
    testImplementation(Libs.spring_kafka_test)

    // Compression
    compileOnly(Libs.lz4_java)
    compileOnly(Libs.snappy_java)
    compileOnly(Libs.zstd_jni)

    // Serialization
    compileOnly(Libs.kryo)
    implementation(Libs.fury)

    // Testcontainers
    testImplementation(Libs.kommons_testcontainers)
    testImplementation(Libs.testcontainers_kafka)
}
