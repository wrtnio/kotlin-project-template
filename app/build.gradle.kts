plugins {
    kotlin("plugin.spring")
    kotlin("kapt")
    id(Plugins.spring_boot)
}

springBoot {
    mainClass.set("io.wrtn.cds.app.CdsApplicationKt")
    buildInfo {
        properties {
            additional.put("name", "WrtnTemplate")
            additional.put("description", "Wrtn Backend Template")
            additional.put("java.version", JavaVersion.current())
        }
    }
}

tasks {
    test {
        // Test 시에 datadog java agent 를 사용하도록 합니다.
        jvmArgs = listOf("-javaagent:${project.rootProject.layout.projectDirectory.asFile.path}/dd-java-agent.jar")
    }
}

configurations {
    testImplementation.get().extendsFrom(compileOnly.get(), runtimeOnly.get())
}

dependencies {

    // Modules
    implementation(project(":core"))
    implementation(project(":domain"))
    implementation(project(":infrastructure"))
    implementation(project(":messages"))

    implementation(Libs.springBoot("autoconfigure"))
    kapt(Libs.springBoot("autoconfigure-processor"))
    kapt(Libs.springBoot("configuration-processor"))
    runtimeOnly(Libs.springBoot("devtools"))

    implementation(Libs.springBootStarter("webflux"))
    implementation(Libs.springBootStarter("aop"))
    implementation(Libs.springBootStarter("cache"))
    implementation(Libs.springBootStarter("validation"))
    implementation(Libs.springBootStarter("actuator"))
    testImplementation(Libs.springBootStarter("test")) {
        exclude(group = "junit", module = "junit")
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        exclude(module = "mockito-core")
    }

    // Kommons Modules
    implementation(Libs.kommons_spring_support)
    testImplementation(Libs.kommons_junit5)

    // Jackson
    implementation(Libs.kommons_json)
    implementation(Libs.jackson_databind)
    implementation(Libs.jackson_module_kotlin)

    // Coroutines
    implementation(Libs.kommons_coroutines)
    implementation(Libs.kotlinx_coroutines_core)
    implementation(Libs.kotlinx_coroutines_reactor)
    testImplementation(Libs.kotlinx_coroutines_test)

    // Reactor
    implementation(Libs.reactor_netty)
    implementation(Libs.reactor_kotlin_extensions)
    testImplementation(Libs.reactor_test)

    // Resilience4j
    implementation(Libs.kommons_resilience4j)
    implementation(Libs.resilience4j_all)
    implementation(Libs.resilience4j_spring_boot3)
    implementation(Libs.resilience4j_cache)
    implementation(Libs.micrometer_registry_prometheus)

    // Problem
    implementation(Libs.problem_spring_web)
    implementation(Libs.problem_spring_webflux)
    implementation(Libs.problem_jackson_datatype)
    implementation(Libs.jakarta_validation_api)

    // Observability
    implementation(Libs.micrometer_core)
    implementation(Libs.micrometer_observation)
    testImplementation(Libs.micrometer_observation_test)


    // SpringDoc - OpenAPI 3.0
    implementation(Libs.springdoc_openapi_starter_webflux_ui)
}
