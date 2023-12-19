object Versions {

    const val kommons = "1.0.2"

    const val kotlin = "1.9.10"
    const val kotlinx_coroutines = "1.7.3"
    const val kotlinx_serialization = "1.6.0"

    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/atomicfu
    const val kotlinx_atomicfu = "0.22.0"

    const val kotlinx_benchmark = Plugins.Versions.kotlinx_benchmark

    const val milvus = "2.2.12"

    const val spring_boot = Plugins.Versions.spring_boot
    const val spring_cloud = "2022.0.4"
    const val reactor_bom = "2022.0.10"
    const val spring_statemachine = "3.2.1"

    const val swagger = "1.6.2"
    const val springdoc_openapi = "2.2.0"    // https://springdoc.org/
    const val springfox_swagger = "3.0.0"
    const val problem = "0.29.1"

    const val bucket4j = "8.3.0"
    const val resilience4j = "2.1.0"
    const val netty = "4.1.97.Final"

    const val aws = "1.12.546"    // https://mvnrepository.com/artifact/com.amazonaws
    const val aws2 = "2.20.143"   // https://mvnrepository.com/artifact/software.amazon.awssdk/aws-sdk-java
    const val aws2_crt = "0.26.0" // https://mvnrepository.com/artifact/software.amazon.awssdk.crt
    const val aws_kotlin = "0.32.0-beta" // https://mvnrepository.com/artifact/aws.sdk.kotlin

    const val grpc = "1.58.0"       // https://mvnrepository.com/artifact/io.grpc/grpc-stub
    const val grpc_kotlin = "1.3.1" // https://mvnrepository.com/artifact/io.grpc/grpc-kotlin-stub
    const val protobuf = "3.24.3"   // https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java
    const val avro = "1.11.2"       // https://mvnrepository.com/artifact/org.apache.avro/avro

    const val feign = "12.5"        // https://mvnrepository.com/artifact/io.github.openfeign/feign-core
    const val httpclient5 = "5.2.1" // https://mvnrepository.com/artifact/org.apache.httpcomponents.client5/httpclient5
    const val retrofit2 = "2.9.0"   // https://mvnrepository.com/artifact/com.squareup.retrofit2/adapter-rxjava2
    const val okhttp3 = "4.11.0"    // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
    const val asynchttpclient = "2.12.3"

    const val jackson = "2.15.2" // https://mvnrepository.com/artifact/com.fasterxml.jackson/jackson-bom
    const val jjwt = "0.11.5"

    const val mapstruct = "1.5.5.Final"
    const val reflectasm = "1.11.9"

    const val mongo_driver = "4.10.2"   // https://mvnrepository.com/artifact/org.mongodb/mongodb-driver-sync
    const val lettuce = "6.2.6.RELEASE" // https://mvnrepository.com/artifact/io.lettuce/lettuce-core
    const val redisson = "3.23.4"       // https://mvnrepository.com/artifact/org.redisson/redisson

    // NOTE: Hibernate 는 jakarta 버전인 경우 orm, validator 등이 group 에 포함됩니다.
    // NOTE: 이 경우 기존 javax 를 사용하는 버전과 충돌이 생길 수 있으니 조심하세요 
    // https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core

    const val hibernate = "6.2.8.Final" // https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core
    const val hibernate_reactive =
        "2.0.5.Final"  // https://mvnrepository.com/artifact/org.hibernate.reactive/hibernate-reactive-core
    const val hibernate_validator =
        "8.0.1.Final" // https://mvnrepository.com/artifact/org.hibernate/hibernate-validator
    const val querydsl = "5.0.0"

    // https://mvnrepository.com/artifact/io.quarkus.platform/quarkus-blaze-persistence-bom
    const val blaze_persistence = "1.6.8"

    // https://github.com/javers/javers
    const val javers = "7.0.3"

    const val slf4j = "2.0.7" // "1.7.36"
    const val logback = "1.4.11" // "1.2.12"
    const val log4j = "2.20.0"

    const val metrics = "4.1.25"
    const val prometheus = "0.16.0"

    // NOTE: spring boot 2.7.x 를 사용할 시 micrometer는 1.9+ 를 사용해야 합니다.
    const val micrometer = "1.11.5"         // https://mvnrepository.com/artifact/io.micrometer/micrometer-core
    const val micrometerTracing = "1.1.4"   // https://mvnrepository.com/artifact/io.micrometer/micrometer-tracing

    const val opentelemetry = "1.26.0" // https://mvnrepository.com/artifact/io.opentelemetry/opentelemetry-bom
    const val opentelemetryAlpha =
        "$opentelemetry-alpha" // https://mvnrepository.com/artifact/io.opentelemetry/opentelemetry-bom-alpha
    const val opentelemetryInstrumentationAlpha =
        "$opentelemetry-alpha" // https://mvnrepository.com/artifact/io.opentelemetry.instrumentation/opentelemetry-instrumentation-bom-alpha

    const val caffeine = "3.1.8"        // Java 9+ 이상에서는 3.x 사용
    const val ehcache = "3.10.8"
    const val cache2k = "2.6.1.Final"

    const val ignite = "2.14.0"
    const val hazelcast = "5.3.1"
    const val hazelcast_client = "3.12.13"

    const val cassandra = "4.17.0"     // https://mvnrepository.com/artifact/com.datastax.oss/java-driver-core
    const val scylla_java = "4.13.0.0"
    const val elasticsearch = "8.7.0"

    const val kafka = "3.5.1"           // https://mvnrepository.com/artifact/org.apache.kafka/kafka
    const val spring_kafka = "3.0.13"   // https://mvnrepository.com/artifact/org.springframework.kafka/spring-kafka

    const val eclipse_collections = "11.1.0"
    const val jctools = "3.3.0"

    const val ow2_asm = "9.5"

    const val junit_jupiter = "5.10.0"      // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    const val junit_platform =
        "1.10.0"     // https://mvnrepository.com/artifact/org.junit.platform/junit-platform-launcher
    const val assertj_core = "3.24.2"
    const val kluent = "1.73"
    const val mockk = "1.13.7"
    const val springmockk = "4.0.2"
    const val mockito = "3.12.4"
    const val awaitility = "4.2.0"
    const val jmh = "1.37"
    const val testcontainers = "1.19.0"
    const val jna = "5.13.0"
    const val archunit = "0.21.0"

    const val datafaker = "2.0.1"
    const val snakeyaml = "2.1"
    const val random_beans = "3.9.0"

    // https://mvnrepository.com/artifact/com.github.maricn/logback-slack-appender
    const val logback_slack_appender = "1.6.1"

    // https://mvnrepository.com/artifact/io.sentry/sentry-logback
    const val sentry_logback = "6.28.0"

    // https://mvnrepository.com/artifact/com.sksamuel.scrimage/scrimage-core
    const val scrimage = "4.1.1"
}

object Libs {

    const val jetbrains_annotations = "org.jetbrains:annotations:24.0.1"

    // Kommons
    fun kommons(module: String, version: String = Versions.kommons) = "io.wrtn.kommons:kommons-$module:$version"

    val kommons_bom = kommons("bom")

    val kommons_core = kommons("core")
    val kommons_coroutines = kommons("coroutines")
    val kommons_logging = kommons("logging")
    val kommons_junit5 = kommons("junit5")
    val kommons_testcontainers = kommons("testcontainers")

    // IO
    val kommons_avro = kommons("avro")
    val kommons_cryptography = kommons("cryptography")
    val kommons_csv = kommons("csv")
    val kommons_feign = kommons("feign")
    val kommons_grpc = kommons("grpc")
    val kommons_http = kommons("http")
    val kommons_json = kommons("json")
    val kommons_netty = kommons("netty")
    val kommons_retrofit2 = kommons("retrofit2")

    // UTILS
    val kommons_geocode = kommons("geocode")
    val kommons_geoip2 = kommons("geoip2")
    val kommons_idgenerators = kommons("idgenerators")
    val kommons_images = kommons("images")
    val kommons_jwt = kommons("jwt")
    val kommons_math = kommons("math")
    val kommons_money = kommons("money")
    val kommons_times = kommons("times")
    val kommons_units = kommons("unit")

    // Data
    val kommons_cassandra = kommons("cassandra")
    val kommons_hibernate = kommons("hibernate")
    val kommons_hibernate_reactive = kommons("hibernate-reactive")
    val kommons_jdbc = kommons("jdbc")
    val kommons_r2dbc = kommons("r2dbc")
    val kommons_redis = kommons("redis")

    // Infrastructure
    val kommons_bucket4j = kommons("bucket4j")
    val kommons_cache = kommons("cache")
    val kommons_graphql = kommons("graphql")
    val kommons_kafka = kommons("kafka")
    val kommons_micrometer = kommons("micrometer")
    val kommons_nats = kommons("nats")
    val kommons_otel = kommons("otel")
    val kommons_resilience4j = kommons("resilience4j")

    // Spring
    val kommons_spring_cassandra = kommons("spring-cassandra")
    val kommons_spring_jpa = kommons("spring-jpa")
    val kommons_spring_retrofit2 = kommons("spring-retrofit2")
    val kommons_spring_security = kommons("spring-security")
    val kommons_spring_support = kommons("spring-support")

    // AWS
    val kommons_aws_core = kommons("aws-core")
    val kommons_aws_dynamodb = kommons("aws-dynamodb")
    val kommons_aws_s3 = kommons("aws-s3")
    val kommons_aws_ses = kommons("aws-ses")
    val kommons_aws_sqs = kommons("aws-sqs")

    // OpenAI
    val kommons_openai_tiktoken = kommons("openai-tiktoken")
    val kommons_openai_client = kommons("openai-client")

    // kotlin
    fun kotlin(module: String, version: String = Versions.kotlin) = "org.jetbrains.kotlin:kotlin-$module:$version"

    val kotlin_bom = kotlin("bom")
    val kotlin_stdlib = kotlin("stdlib")
    val kotlin_stdlib_common = kotlin("stdlib-common")
    val kotlin_stdlib_jdk7 = kotlin("stdlib-jdk7")
    val kotlin_stdlib_jdk8 = kotlin("stdlib-jdk8")
    val kotlin_reflect = kotlin("reflect")
    val kotlin_test = kotlin("test")
    val kotlin_test_common = kotlin("test-common")
    val kotlin_test_junit5 = kotlin("test-junit5")

    // Kotlin 1.3.40 부터는 kotlin-scripting-jsr223 만 참조하면 됩니다.
    val kotlin_scripting_jsr223 = kotlin("scripting-jsr223")
    val kotlin_compiler = kotlin("compiler")

    // Kotlin 1.4+ 부터는 kotlin-scripting-dependencies 를 참조해야 합니다.
    val kotlin_scripting_dependencies = kotlin("scripting-dependencies")

    val kotlin_compiler_embeddable = kotlin("compiler-embeddable")
    val kotlin_daemon_client = kotlin("daemon-client")
    val kotlin_scripting_common = kotlin("scripting-common")
    val kotlin_scripting_compiler_embeddable = kotlin("scripting-compiler-embeddable")
    val kotlin_scripting_jvm = kotlin("scripting-jvm")
    val kotlin_script_runtime = kotlin("script-runtime")
    val kotlin_script_util = kotlin("scripting-util")

    fun kotlinxCoroutines(module: String, version: String = Versions.kotlinx_coroutines) =
        "org.jetbrains.kotlinx:kotlinx-coroutines-$module:$version"

    val kotlinx_coroutines_bom = kotlinxCoroutines("bom")
    val kotlinx_coroutines_core = kotlinxCoroutines("core")
    val kotlinx_coroutines_core_common = kotlinxCoroutines("core-common")
    val kotlinx_coroutines_core_jvm = kotlinxCoroutines("core-jvm")
    val kotlinx_coroutines_debug = kotlinxCoroutines("debug")
    val kotlinx_coroutines_jdk7 = kotlinxCoroutines("jdk7")
    val kotlinx_coroutines_jdk8 = kotlinxCoroutines("jdk8")
    val kotlinx_coroutines_jdk9 = kotlinxCoroutines("jdk9")
    val kotlinx_coroutines_reactive = kotlinxCoroutines("reactive")
    val kotlinx_coroutines_reactor = kotlinxCoroutines("reactor")
    val kotlinx_coroutines_rx2 = kotlinxCoroutines("rx2")
    val kotlinx_coroutines_rx3 = kotlinxCoroutines("rx3")
    val kotlinx_coroutines_slf4j = kotlinxCoroutines("slf4j")
    val kotlinx_coroutines_test = kotlinxCoroutines("test")
    val kotlinx_coroutines_test_jvm = kotlinxCoroutines("test-jvm")

    // Coroutines Flow를 Reactor처럼 테스트 할 수 있도록 해줍니다.
    // 참고: https://github.com/cashapp/turbine/
    const val turbine = "app.cash.turbine:turbine:1.0.0"
    const val turbine_jvm = "app.cash.turbine:turbine-jvm:1.0.0"

    fun kotlinxSerialization(module: String, version: String = Versions.kotlinx_serialization) =
        "org.jetbrains.kotlinx:kotlinx-serialization-$module:$version"

    val kotlinx_serialization_bom = kotlinxSerialization("bom")
    val kotlinx_serialization_json = kotlinxSerialization("json")
    val kotlinx_serialization_json_jvm = kotlinxSerialization("json-jvm")
    val kotlinx_serialization_properties = kotlinxSerialization("properties")
    val kotlinx_serialization_properties_jvm = kotlinxSerialization("properties-jvm")
    val kotlinx_serialization_protobuf = kotlinxSerialization("protobuf")
    val kotlinx_serialization_protobuf_jvm = kotlinxSerialization("protobuf-jvm")

    const val kotlinx_atomicfu = "org.jetbrains.kotlinx:atomicfu:${Versions.kotlinx_atomicfu}"
    const val kotlinx_atomicfu_jvm = "org.jetbrains.kotlinx:atomicfu-jvm:${Versions.kotlinx_atomicfu}"

    // https://github.com/Kotlin/kotlinx-benchmark
    fun kotlinxBenchmark(module: String, version: String = Versions.kotlinx_benchmark) =
        "org.jetbrains.kotlinx:kotlinx-benchmark-$module:$version"

    val kotlinx_benchmark_runtime = kotlinxBenchmark("runtime")
    val kotlinx_benchmark_runtime_jvm = kotlinxBenchmark("runtime-jvm")

    // Milvus https://milvus.io/docs/install-java.md
    const val milvus_sdk_java = "io.milvus:milvus-sdk-java:${Versions.milvus}"

    // javax api
    const val javax_activation_api = "javax.activation:javax.activation-api:1.2.0"
    const val javax_annotation_api = "javax.annotation:javax.annotation-api:1.3.2"
    const val javax_cache_api = "javax.cache:cache-api:1.1.1"
    const val javax_inject = "javax.inject:javax.inject:1"
    const val javax_interceptor_api = "javax.interceptor:javax.interceptor-api:1.2.2"
    const val javax_persistence_api = "javax.persistence:javax.persistence-api:2.2"
    const val javax_servlet_api = "javax.servlet:javax.servlet-api:4.0.1"
    const val javax_transaction_api = "javax.transaction:jta:1.1"
    const val javax_validation_api = "javax.validation:validation-api:2.0.1.Final"
    const val javax_ws_rs_api = "javax.ws.rs:javax.ws.rs-api:2.1.1"
    const val javax_xml_bind = "javax.xml.bind:jaxb-api:2.3.1"

    // javax expression
    const val javax_el_api = "javax.el:javax.el-api:3.0.0"
    const val javax_el = "org.glassfish:javax.el:3.0.1-b12"

    // json 구현체
    const val javax_json_api = "javax.json:javax.json-api:1.1.4"
    const val javax_json = "org.glassfish:javax.json:1.1.4"

    // Java Money
    const val javax_money_api = "javax.money:money-api:1.1"
    const val javamoney_moneta = "org.javamoney:moneta:1.4.2"

    // jakarta
    const val jakarta_activation_api = "jakarta.activation:jakarta.activation-api:2.1.2"
    const val jakarta_annotation_api = "jakarta.annotation:jakarta.annotation-api:2.1.1"
    const val jakarta_el_api = "jakarta.el:jakarta.el-api:5.0.1"
    const val jakarta_el = "org.glassfish:jakarta.el:5.0.0-M1"
    const val jakarta_inject_api = "jakarta.inject:jakarta.inject-api:2.0.1"
    const val jakarta_interceptor_api = "jakarta.interceptor:jakarta.interceptor-api:2.1.0"
    const val jakarta_jms_api = "jakarta.jms:jakarta.jms-api:3.1.0"
    const val jakarta_json_api = "jakarta.json:jakarta.json-api:2.1.2"
    const val jakarta_json = "org.glassfish:jakarta.json:2.0.1"
    const val jakarta_persistence_api = "jakarta.persistence:jakarta.persistence-api:3.1.0"
    const val jakarta_servlet_api = "jakarta.servlet:jakarta.servlet-api:6.0.0"
    const val jakarta_transaction_api = "jakarta.transaction:jakarta.transaction-api:2.0.1"
    const val jakarta_validation_api = "jakarta.validation:jakarta.validation-api:3.0.2"
    const val jakarta_ws_rs_api = "jakarta.ws.rs:jakarta.ws.rs-api:3.1.0"
    const val jakarta_xml_bind = "jakarta.xml.bind:jakarta.xml.bind-api:4.0.0"


    // Apache Commons
    const val commons_beanutils = "commons-beanutils:commons-beanutils:1.9.4"
    const val commons_compress = "org.apache.commons:commons-compress:1.23.0"
    const val commons_codec = "commons-codec:commons-codec:1.15"
    const val commons_collections4 = "org.apache.commons:commons-collections4:4.4"
    const val commons_cryto = "org.apache.commons:commons-crypto:1.2.0"
    const val commons_csv = "org.apache.commons:commons-csv:1.10.0"
    const val commons_digest3 = "org.apache.commons:commons-digester3:3.2"
    const val commons_exec = "org.apache.commons:commons-exec:1.3"
    const val commons_io = "commons-io:commons-io:2.11.0"
    const val commons_lang3 = "org.apache.commons:commons-lang3:3.13.0"
    const val commons_logging = "commons-logging:commons-logging:1.2"
    const val commons_math3 = "org.apache.commons:commons-math3:3.6.1"
    const val commons_pool2 = "org.apache.commons:commons-pool2:2.11.1"
    const val commons_rng_simple = "org.apache.commons:commons-rng-simple:1.4"
    const val commons_text = "org.apache.commons:commons-text:1.10.0"
    const val commons_validator = "commons-validator:commons-validator:1.7"

    fun slf4j(module: String, version: String = Versions.slf4j) = "org.slf4j:$module:$version"
    val slf4j_api = slf4j("slf4j-api")
    val slf4j_simple = slf4j("slf4j-simple")
    val slf4j_log4j12 = slf4j("slf4j-log4j2")
    val jcl_over_slf4j = slf4j("jcl-over-slf4j")
    val jul_to_slf4j = slf4j("jul-to-slf4j")
    val log4j_over_slf4j = slf4j("log4j-over-slf4j")

    const val logback = "ch.qos.logback:logback-classic:${Versions.logback}"
    const val logback_core = "ch.qos.logback:logback-core:${Versions.logback}"

    fun log4j(module: String) = "org.apache.logging.log4j:log4j-$module:${Versions.log4j}"
    val log4j_bom = log4j("bom")
    val log4j_api = log4j("api")
    val log4j_core = log4j("core")
    val log4j_jcl = log4j("jcl")
    val log4j_jul = log4j("jul")
    val log4j_slf4j_impl = log4j("slf4j-impl")
    val log4j_web = log4j("web")

    const val findbugs = "com.google.code.findbugs:jsr305:3.0.2"
    const val guava = "com.google.guava:guava:32.1.2-jre"

    const val eclipse_collections = "org.eclipse.collections:eclipse-collections:${Versions.eclipse_collections}"
    const val eclipse_collections_forkjoin =
        "org.eclipse.collections:eclipse-collections-forkjoin:${Versions.eclipse_collections}"
    const val eclipse_collections_testutils =
        "org.eclipse.collections:eclipse-collections-testutils:${Versions.eclipse_collections}"

    // https://github.com/JCTools/JCTools
    const val jctools_core = "org.jctools:jctools-core:${Versions.jctools}"

    const val kryo = "com.esotericsoftware:kryo:5.5.0"
    const val marshalling = "org.jboss.marshalling:jboss-marshalling:2.1.2.Final"
    const val marshalling_river = "org.jboss.marshalling:jboss-marshalling-river:2.1.2.Final"
    const val marshalling_serial = "org.jboss.marshalling:jboss-marshalling-serial:2.1.2.Final"
    const val fury = "org.furyio:fury-core:0.4.1"  // https://mvnrepository.com/artifact/org.furyio/fury-core

    // Spring Boot
    const val spring_boot_dependencies = "org.springframework.boot:spring-boot-dependencies:${Versions.spring_boot}"

    fun spring(module: String) = "org.springframework:spring-$module"
    fun springBoot(module: String) = "org.springframework.boot:spring-boot-$module"
    fun springBootStarter(module: String) = "org.springframework.boot:spring-boot-starter-$module"
    fun springData(module: String) = "org.springframework.data:spring-data-$module"

    fun springSecurity(module: String) = "org.springframework.security:spring-security-$module"

    // Spring Cloud
    const val spring_cloud_dependencies = "org.springframework.cloud:spring-cloud-dependencies:${Versions.spring_cloud}"

    fun springCloud(module: String) = "org.springframework.cloud:spring-cloud-$module"
    fun springCloudStarter(module: String) = "org.springframework.cloud:spring-cloud-starter-$module"

    val spring_cloud_commons = springCloud("commons")
    val spring_cloud_stream = springCloud("stream")
    val spring_cloud_starter_bootstrap = springCloudStarter("bootstrap")

    fun springStatemachine(module: String) =
        "org.springframework.statemachine:spring-statemachine-$module:${Versions.spring_statemachine}"

    val spring_statemachine_bom = springStatemachine("bom")
    val spring_statemachine_core = springStatemachine("core")

    // Smallrye
    fun smallrye(module: String) = "io.smallrye:smallrye-$module"
    fun smallryeReactive(module: String) = "io.smallrye.reactive:smallrye-$module"

    // rest-assured
    fun restAssured(module: String) = "io.rest-assured:$module"
    val rest_assured = restAssured("rest-assured")
    val rest_assured_kotlin = restAssured("kotlin-extensions")

    // Resilience4j
    fun resilience4j(module: String, version: String = Versions.resilience4j) =
        "io.github.resilience4j:resilience4j-$module:$version"

    // resilience4j-bom 은 1.7.1 로 update 되지 않았다 (배포 실수인 듯)
    val resilience4j_bom = resilience4j("bom")
    val resilience4j_all = resilience4j("all")
    val resilience4j_annotations = resilience4j("annotations")
    val resilience4j_bulkhead = resilience4j("bulkhead")
    val resilience4j_cache = resilience4j("cache")
    val resilience4j_circuitbreaker = resilience4j("circuitbreaker")
    val resilience4j_circularbuffer = resilience4j("circularbuffer")
    val resilience4j_consumer = resilience4j("consumer")
    val resilience4j_core = resilience4j("core")
    val resilience4j_feign = resilience4j("feign")
    val resilience4j_framework_common = resilience4j("framework-common")
    val resilience4j_kotlin = resilience4j("kotlin")
    val resilience4j_metrics = resilience4j("metrics")
    val resilience4j_micrometer = resilience4j("micrometer")
    val resilience4j_ratelimiter = resilience4j("ratelimiter")
    val resilience4j_ratpack = resilience4j("ratpack")
    val resilience4j_reactor = resilience4j("reactor")
    val resilience4j_retrofit = resilience4j("retrofit")
    val resilience4j_retry = resilience4j("retry")
    val resilience4j_rxjava2 = resilience4j("rxjava2")
    val resilience4j_rxjava3 = resilience4j("rxjava3")
    val resilience4j_spring = resilience4j("spring")
    val resilience4j_spring_boot2 = resilience4j("spring-boot2")
    val resilience4j_spring_boot3 = resilience4j("spring-boot3")
    val resilience4j_spring_cloud2 = resilience4j("spring-cloud2")
    val resilience4j_timelimiter = resilience4j("timelimiter")
    val resilience4j_vertx = resilience4j("vertx")

    // Bucket4j
    fun bucket4j(module: String) = "com.bucket4j:bucket4j-$module:${Versions.bucket4j}"
    val bucket4j_caffeine = bucket4j("caffeine")
    val bucket4j_core = bucket4j("core")
    val bucket4j_jcache = bucket4j("jcache")
    val bucket4j_jdk8_hazelcast = bucket4j("hazelcast")
    val bucket4j_hazelcast_all = bucket4j("hazelcast-all")
    val bucket4j_ignite = bucket4j("ignite")
    val bucket4j_infinispan_all = bucket4j("infinispan-all")
    val bucket4j_redis = bucket4j("redis")

    // Bucket4j Spring Boot
    // https://mvnrepository.com/artifact/com.giffing.bucket4j.spring.boot.starter/bucket4j-spring-boot-starter
    val bucket4j_spring_boot = "com.giffing.bucket4j.spring.boot.starter:bucket4j-spring-boot-starter:0.9.1"

    // Netty
    fun netty(module: String, version: String = Versions.netty) = "io.netty:netty-$module:$version"
    val netty_bom = netty("bom")
    val netty_all = netty("all")
    val netty_common = netty("common")
    val netty_buffer = netty("buffer")
    val netty_codec = netty("codec")
    val netty_codec_dns = netty("codec-dns")
    val netty_codec_http = netty("codec-http")
    val netty_codec_http2 = netty("codec-http2")
    val netty_codec_socks = netty("codec-socks")
    val netty_handler = netty("handler")
    val netty_handler_proxy = netty("handler-proxy")
    val netty_resolver = netty("resolver")
    val netty_resolver_dns = netty("resolver-dns")
    val netty_resolver_dns_native_macos = netty("resolver-dns-native-macos")
    val netty_transport = netty("transport")
    val netty_transport_native_epoll = netty("transport-native-epoll")
    val netty_transport_native_kqueue = netty("transport-native-kqueue")

    // gRPC
    fun grpc(module: String) = "io.grpc:grpc-$module:${Versions.grpc}"
    val grpc_bom = grpc("bom")
    val grpc_alts = grpc("alts")
    val grpc_api = grpc("api")
    val grpc_auth = grpc("auth")
    val grpc_context = grpc("context")
    val grpc_core = grpc("core")
    val grpc_grpclb = grpc("grpclb")
    val grpc_inprocess = grpc("inprocess")
    val grpc_protobuf = grpc("protobuf")
    val grpc_protobuf_lite = grpc("protobuf-lite")
    val grpc_stub = grpc("stub")
    val grpc_services = grpc("services")
    val grpc_netty = grpc("netty")
    val grpc_netty_shaded = grpc("netty-shaded")
    val grpc_okhttp = grpc("okhttp")
    val grpc_testing = grpc("testing")

    const val grpc_protoc_gen_grpc_java = "io.grpc:protoc-gen-grpc-java:${Versions.grpc}"

    // gRPC Kotlin
    const val grpc_kotlin_stub = "io.grpc:grpc-kotlin-stub:${Versions.grpc_kotlin}"
    const val grpc_protoc_gen_grpc_kotlin = "io.grpc:protoc-gen-grpc-kotlin:${Versions.grpc_kotlin}:jdk8@jar"

    fun protobuf(module: String, version: String = Versions.protobuf) =
        "com.google.protobuf:$module:$version"

    val protobuf_bom = protobuf("protobuf-bom")
    val protobuf_protoc = protobuf("protoc")
    val protobuf_java = protobuf("protobuf-java")
    val protobuf_java_util = protobuf("protobuf-java-util")
    val protobuf_kotlin = protobuf("protobuf-kotlin")

    fun avro(module: String) = "org.apache.avro:$module:${Versions.avro}"
    val avro = avro("avro")
    val avro_ipc = avro("avro-ipc")
    val avro_ipc_netty = avro("avro-ipc-netty")
    val avro_compiler = avro("avro-compiler")
    val avro_protobuf = avro("avro-protobuf")

    // https://mvnrepository.com/artifact/com.github.avro-kotlin.avro4k/avro4k-core
    const val avro_kotlin = "com.github.avro-kotlin.avro4k:avro4k-core:1.8.0"

    fun awsSdk(name: String, version: String = Versions.aws) = "com.amazonaws:aws-java-sdk-$name:$version"
    val aws_bom = awsSdk("bom")
    val aws_java_sdk_s3 = awsSdk("s3")
    val aws_java_sdk_dynamodb = awsSdk("dynamodb")
    val aws_java_sdk_ses = awsSdk("ses")
    val aws_java_sdk_sns = awsSdk("sns")
    val aws_java_sdk_sqs = awsSdk("sqs")
    val aws_java_sdk_sts = awsSdk("sts")
    val aws_java_sdk_ec2 = awsSdk("ec2")
    val aws_java_sdk_test_utils = awsSdk("test-utils")

    fun awsSdkV2(name: String, version: String = Versions.aws2) = "software.amazon.awssdk:$name:$version"
    val aws2_bom = awsSdkV2("bom")
    val aws2_applicationautoscaling = awsSdkV2("applicationautoscaling")
    val aws2_apache_client = awsSdkV2("apache-client")
    val aws2_auth = awsSdkV2("auth")
    val aws2_aws_core = awsSdkV2("aws-core")
    val aws2_aws_crt_client = awsSdkV2("aws-crt-client")
    val aws2_sdk_core = awsSdkV2("sdk-core")
    val aws2_cloudwatch = awsSdkV2("cloudwatch")
    val aws2_cloudwatchevents = awsSdkV2("cloudwatchevents")
    val aws2_cloudwatchlogs = awsSdkV2("cloudwatchlogs")
    val aws2_ec2 = awsSdkV2("ec2")
    val aws2_elasticache = awsSdkV2("elasticache")
    val aws2_kafka = awsSdkV2("kafka")
    val aws2_kms = awsSdkV2("kms")
    val aws2_lambda = awsSdkV2("lambda")
    val aws2_netty_nio_client = awsSdkV2("netty-nio-client")
    val aws2_s3 = awsSdkV2("s3")
    val aws2_s3_transfer_manager = awsSdkV2("s3-transfer-manager")
    val aws2_ses = awsSdkV2("ses")
    val aws2_sqs = awsSdkV2("sqs")
    val aws2_sts = awsSdkV2("sts")
    val aws2_dynamodb_enhanced = awsSdkV2("dynamodb-enhanced")
    val aws2_url_connection_client = awsSdkV2("url-connection-client")
    val aws2_utils = awsSdkV2("utils")
    val aws2_test_utils = awsSdkV2("test-utils")

    // https://docs.aws.amazon.com/ko_kr/sdk-for-java/latest/developer-guide/http-configuration-crt.html
    // https://mvnrepository.com/artifact/software.amazon.awssdk.crt/aws-crt
    const val aws2_aws_crt = "software.amazon.awssdk.crt:aws-crt:${Versions.aws2_crt}"

    // https://docs.aws.amazon.com/sdk-for-kotlin/latest/developer-guide/get-started.html
    // https://mvnrepository.com/artifact/aws.sdk.kotlin
    fun awsKotlin(name: String, version: String = Versions.aws_kotlin) = "aws.sdk.kotlin:$name:$version"
    val aws_kotlin_aws_core = awsKotlin("aws-core")
    val aws_kotlin_aws_config = awsKotlin("aws-config")
    val aws_kotlin_aws_endpoint = awsKotlin("aws-endpoint")
    val aws_kotlin_aws_http = awsKotlin("aws-http")
    val aws_kotlin_cloudwatch = awsKotlin("cloudwatch")
    val aws_kotlin_dynamodb = awsKotlin("dynamodb")
    val aws_kotlin_kafka = awsKotlin("kafka")
    val aws_kotlin_kms = awsKotlin("kms")
    val aws_kotlin_rds = awsKotlin("rds")
    val aws_kotlin_s3 = awsKotlin("s3")
    val aws_kotlin_testing = awsKotlin("testing")

    // AsyncHttpClient
    const val async_http_client = "org.asynchttpclient:async-http-client:${Versions.asynchttpclient}"
    const val async_http_client_extras_retrofit2 =
        "org.asynchttpclient:async-http-client-extras-retrofit2:${Versions.asynchttpclient}"
    const val async_http_client_extras_rxjava2 =
        "org.asynchttpclient:async-http-client-extras-rxjava2:${Versions.asynchttpclient}"

    // Apache HttpComponents
    const val httpclient5 = "org.apache.httpcomponents.client5:httpclient5:${Versions.httpclient5}"
    const val httpclient5_cache = "org.apache.httpcomponents.client5:httpclient5-cache:${Versions.httpclient5}"
    const val httpclient5_fluent = "org.apache.httpcomponents.client5:httpclient5-fluent:${Versions.httpclient5}"
    const val httpclient5_testing = "org.apache.httpcomponents.client5:httpclient5-testing:${Versions.httpclient5}"
    const val httpcore5 = "org.apache.httpcomponents.core5:httpcore5:${Versions.httpclient5}"
    const val httpcore5_h2 = "org.apache.httpcomponents.core5:httpcore5-h2:${Versions.httpclient5}"
    const val httpcore5_reactive = "org.apache.httpcomponents.core5:httpcore5-reactive:${Versions.httpclient5}"
    const val httpcore5_testing = "org.apache.httpcomponents.core5:httpcore5-testing:${Versions.httpclient5}"

    // OpenFeign
    fun feign(module: String) = "io.github.openfeign:feign-$module:${Versions.feign}"
    val feign_bom = feign("bom")
    val feign_core = feign("core")
    val feign_gson = feign("gson")
    val feign_hc5 = feign("hc5")
    val feign_httpclient = feign("httpclient")
    val feign_jackson = feign("jackson")
    val feign_java11 = feign("java11")
    val feign_jaxb = feign("jaxb")
    val feign_jaxrs = feign("jaxrs")
    val feign_jaxrs2 = feign("jaxrs2")
    val feign_kotlin = feign("kotlin")
    val feign_micrometer = feign("micrometer")
    val feign_mock = feign("mock")
    val feign_okhttp = feign("okhttp")
    val feign_reactive_wrappers = feign("reactive-wrappers")
    val feign_ribbon = feign("ribbon")
    val feign_slf4j = feign("slf4j")

    // Retrofit2
    fun retrofit2(module: String) = "com.squareup.retrofit2:$module:${Versions.retrofit2}"
    val retrofit2 = retrofit2("retrofit")
    val retrofit2_adapter_java8 = retrofit2("adapter-java8")
    val retrofit2_adapter_rxjava2 = retrofit2("adapter-rxjava2")
    val retrofit2_adapter_rxjava3 = retrofit2("adapter-rxjava3")
    val retrofit2_converter_jackson = retrofit2("converter-jackson")
    val retrofit2_converter_moshi = retrofit2("converter-moshi")
    val retrofit2_converter_protobuf = retrofit2("converter-protobuf")
    val retrofit2_converter_scalars = retrofit2("converter-scalars")
    val retrofit2_mock = retrofit2("retrofit-mock")

    // https://github.com/JakeWharton/retrofit2-reactor-adapter/
    const val retrofit2_adapter_reactor = "com.jakewharton.retrofit:retrofit2-reactor-adapter:2.1.0"

    // OkHttp3
    fun okhttp(module: String) = "com.squareup.okhttp3:$module:${Versions.okhttp3}"
    val okhttp3_bom = okhttp("okhttp-bom")
    val okhttp3 = okhttp("okhttp")
    val okhttp3_logging_interceptor = okhttp("logging-interceptor")
    val okhttp3_mockwebserver = okhttp("mockwebserver")
    val okhttp3_sse = okhttp("okhttp-sse")
    val okhttp3_urlconnection = okhttp("okhttp-urlconnection")
    val okhttp3_ws = okhttp("okhttp-ws")

    // MapStruct
    const val mapstruct = "org.mapstruct:mapstruct:${Versions.mapstruct}"
    const val mapstruct_processor = "org.mapstruct:mapstruct-processor:${Versions.mapstruct}"

    // Jackson
    const val jackson_bom = "com.fasterxml.jackson:jackson-bom:${Versions.jackson}"

    fun jackson(group: String, module: String, version: String = Versions.jackson): String {
        return if (group == "core") "com.fasterxml.jackson.$group:jackson-$module:$version"
        else "com.fasterxml.jackson.$group:jackson-$group-$module:$version"
    }

    fun jacksonCore(module: String, version: String = Versions.jackson) = jackson("core", module, version)

    val jackson_annotations = jacksonCore("annotations")
    val jackson_core = jacksonCore("core")
    val jackson_databind = jacksonCore("databind")

    fun jacksonDataType(module: String, version: String = Versions.jackson) = jackson("datatype", module, version)
    val jackson_datatype_jsr310 = jacksonDataType("jsr310")
    val jackson_datatype_jsr353 = jacksonDataType("jsr353")
    val jackson_datatype_jdk8 = jacksonDataType("jdk8")
    val jackson_datatype_joda = jacksonDataType("joda")
    val jackson_datatype_guava = jacksonDataType("guava")

    fun jacksonDataFormat(module: String, version: String = Versions.jackson) = jackson("dataformat", module, version)
    val jackson_dataformat_avro = jacksonDataFormat("avro")
    val jackson_dataformat_protobuf = jacksonDataFormat("protobuf")
    val jackson_dataformat_csv = jacksonDataFormat("csv")
    val jackson_dataformat_properties = jacksonDataFormat("properties")
    val jackson_dataformat_yaml = jacksonDataFormat("yaml")

    fun jacksonModule(module: String, version: String = Versions.jackson) = jackson("module", module, version)
    val jackson_module_kotlin = jacksonModule("kotlin")
    val jackson_module_paranamer = jacksonModule("parameter")
    val jackson_module_parameter_names = jacksonModule("parameter-names")
    val jackson_module_afterburner = jacksonModule("afterburner")
    val jackson_module_jsonSchema = jacksonModule("jsonSchema")

    // Json assertions
    const val jsonpath = "com.jayway.jsonpath:json-path:2.7.0"
    const val jsonassert = "org.skyscreamer:jsonassert:1.5.1"

    // GSON
    const val gson = "com.google.code.gson:gson:2.10.1"
    const val gson_javatime_serializers =
        "com.fatboyindustrial.gson-javatime-serialisers:gson-javatime-serialisers:1.1.2"

    // JWT
    fun jjwt(module: String) = "io.jsonwebtoken:jjwt-$module:${Versions.jjwt}"
    val jjwt_api = jjwt("api")
    val jjwt_impl = jjwt("impl")
    val jjwt_jackson = jjwt("jackson")
    val jjwt_extensions = jjwt("extensions")

    // Compression
    const val snappy_java = "org.xerial.snappy:snappy-java:1.1.10.3"
    const val lz4_java = "org.lz4:lz4-java:1.8.0"
    const val zstd_jni = "com.github.luben:zstd-jni:1.5.5-5"
    const val xz = "org.tukaani:xz:1.9"

    // Cryptography
    const val jasypt = "org.jasypt:jasypt:1.9.3"
    const val bouncycastle_bcprov = "org.bouncycastle:bcprov-jdk15on:1.70"
    const val bouncycastle_bcpkix = "org.bouncycastle:bcpkix-jdk15on:1.70"

    // MVEL
    const val mvel2 = "org.mvel:mvel2:2.4.12.Final"

    // Reactor
    const val reactor_bom = "io.projectreactor:reactor-bom:${Versions.reactor_bom}"
    const val reactor_core = "io.projectreactor:reactor-core"
    const val reactor_core_micrometer = "io.projectreactor:reactor-core-micrometer"
    const val reactor_kafka = "io.projectreactor.kafka:reactor-kafka"
    const val reactor_netty = "io.projectreactor.netty:reactor-netty"
    const val reactor_netty_http_brave = "io.projectreactor.netty:reactor-netty-http-brave"
    const val reactor_test = "io.projectreactor:reactor-test"
    const val reactor_tools = "io.projectreactor:reactor-tools"
    const val reactor_kotlin_extensions = "io.projectreactor.kotlin:reactor-kotlin-extensions"

    const val reactor_addons_reactor_adapter = "io.projectreactor.addons:reactor-adapter"
    const val reactor_addons_reactor_extra = "io.projectreactor.addons:reactor-extra"
    const val reactor_addons_reactor_pool = "io.projectreactor.addons:reactor-pool"
    const val reactor_addons_reactor_pool_micrometer = "io.projectreactor.addons:reactor-pool-micrometer"

    // Metrics
    fun metrics(module: String) = "io.dropwizard.metrics:metrics-$module:${Versions.metrics}"

    val metrics_bom = metrics("bom")
    val metrics_annotation = metrics("annotation")
    val metrics_core = metrics("core")
    val metrics_json = metrics("json")
    val metrics_jvm = metrics("jvm")
    val metrics_graphite = metrics("graphite")
    val metrics_healthchecks = metrics("healthchecks")
    val metrics_jcache = metrics("jcache")
    val metrics_jmx = metrics("jmx")

    // Prometheus
    fun prometheusSimple(module: String) = "io.prometheus:simpleclient_$module:${Versions.prometheus}"
    const val prometheus_simpleclient = "io.prometheus:simpleclient:${Versions.prometheus}"
    val prometheus_simpleclient_common = prometheusSimple("common")
    val prometheus_simpleclient_dropwizard = prometheusSimple("dropwizard")
    val prometheus_simpleclient_httpserver = prometheusSimple("httpserver")
    val prometheus_simpleclient_pushgateway = prometheusSimple("pushgateway")
    val prometheus_simpleclient_spring_boot = prometheusSimple("spring_boot")

    val prometheus_simpleclient_tracer_common = prometheusSimple("tracer_common")
    val prometheus_simpleclient_tracer_otel = prometheusSimple("tracer_otel")
    val prometheus_simpleclient_tracer_otel_agent = prometheusSimple("tracer_otel_agent")

    // Micrometer
    fun micrometer(module: String) = "io.micrometer:micrometer-$module"
    val micrometer_bom = micrometer("bom" + ":" + Versions.micrometer)
    val micrometer_core = micrometer("core")
    val micrometer_observation = micrometer("observation")
    val micrometer_observation_test = micrometer("observation-test")
    val micrometer_test = micrometer("test")
    val micrometer_registry_cloudwatch = micrometer("registry-cloudwatch")
    val micrometer_registry_datadog = micrometer("registry-datadog")
    val micrometer_registry_elastic = micrometer("registry-elastic")
    val micrometer_registry_graphite = micrometer("registry-graphite")
    val micrometer_registry_new_relic = micrometer("registry-new-relic")
    val micrometer_registry_prometheus = micrometer("registry-prometheus")
    val micrometer_registry_jmx = micrometer("registry-jmx")

    // Micrometer Tracing
    fun micrometerTracing(module: String) = "io.micrometer:micrometer-tracing-$module:${Versions.micrometerTracing}"
    val micrometer_tracing_bom = micrometerTracing("bom")
    val micrometer_tracing_bridge_brave = micrometerTracing("bridge-brave")
    val micrometer_tracing_bridge_otel = micrometerTracing("bridge-otel")
    val micrometer_tracing_integeration_test = micrometerTracing("integration-test")
    val micrometer_tracing_test = micrometerTracing("test")


    // OpenTelemetry
    fun opentelemetry(module: String): String = "io.opentelemetry:opentelemetry-$module"

    fun opentelemetryInstrumentation(module: String): String = "io.opentelemetry.instrumentation:opentelemetry-$module"

    val opentelemetry_bom = opentelemetry("bom:${Versions.opentelemetry}")
    val opentelemetry_alpha_bom = opentelemetry("bom-alpha:${Versions.opentelemetryAlpha}")
    val opentelemetry_instrumentation_bom_alpha =
        opentelemetryInstrumentation("instrumentation-bom-alpha:${Versions.opentelemetryInstrumentationAlpha}")

    const val opentelemetry_javaagent_remote_path =
        "https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${Versions.opentelemetry}/opentelemetry-javaagent.jar"
    const val opentelemetry_javaagent_local_path = "otel/opentelemetry-javaagent.jar"

    val opentelemetry_api = opentelemetry("api")
    val opentelemetry_extensions_aws = opentelemetry("extension-aws")
    val opentelemetry_extensions_kotlin = opentelemetry("extension-kotlin")

    val opentelemetry_exporter_logging = opentelemetry("exporter-logging")
    val opentelemetry_exporter_otlp = opentelemetry("exporter-otlp")
    val opentelemetry_exporter_otlp_metrics = opentelemetry("exporter-otlp-metrics")
    val opentelemetry_exporter_otlp_trace = opentelemetry("exporter-otlp-trace")
    val opentelemetry_exporter_otlp_http_metrics = opentelemetry("exporter-otlp-http-metrics")
    val opentelemetry_exporter_otlp_http_trace = opentelemetry("exporter-otlp-http-trace")
    val opentelemetry_exporter_prometheus = opentelemetry("exporter-prometheus")

    val opentelemetry_sdk = opentelemetry("sdk")
    val opentelemetry_sdk_metrics = opentelemetry("sdk-metrics")
    val opentelemetry_sdk_trace = opentelemetry("sdk-trace")
    val opentelemetry_sdk_testing = opentelemetry("sdk-testing")
    val opentelemetry_sdk_extensions_aws = opentelemetry("sdk-extension-aws")
    val opentelemetry_sdk_extensions_resources = opentelemetry("sdk-extension-resources")
    val opentelemetry_sdk_extensions_autoconfigure = opentelemetry("sdk-extension-autoconfigure")

    // Opentelemetry Instrumentation
    //
    // https://mvnrepository.com/artifact/io.opentelemetry.instrumentation/opentelemetry-logback-appender-1.0
    val opentelemetry_logback_appender_1_0 = opentelemetryInstrumentation("logback-appender-1.0")

    // https://mvnrepository.com/artifact/io.opentelemetry.instrumentation/opentelemetry-logback-mdc-1.0
    val opentelemetry_logback_mdc_1_0 = opentelemetryInstrumentation("logback-mdc-1.0")

    const val latencyUtils = "org.latencyutils:LatencyUtils:2.0.3"
    const val hdrHistogram = "org.hdrhistogram:HdrHistogram:2.1.11"

    const val reflectasm = "com.esotericsoftware:reflectasm:${Versions.reflectasm}"

    // mongodb 4.x
    fun mongo(module: String, version: String = Versions.mongo_driver) = "org.mongodb:$module:$version"
    val mongo_bson = mongo("bson")
    val mongodb_driver_core = mongo("mongodb-driver-core")
    val mongodb_driver_sync = mongo("mongodb-driver-sync")
    val mongodb_driver_reactivestreams = mongo("mongodb-driver-reactivestreams")
    val mongodb_driver_legacy = mongo("mongodb-driver-legacy")

    // Redis
    const val lettuce_core = "io.lettuce:lettuce-core:${Versions.lettuce}"

    fun redisson(module: String, version: String = Versions.redisson) = "org.redisson:$module:$version"
    val redisson = redisson("redisson")
    val redisson_spring_boot_starter = redisson("redisson-spring-boot-starter")
    val redisson_spring_data_21 = redisson("redisson-spring-data-21")
    val redisson_spring_data_22 = redisson("redisson-spring-data-22")
    val redisson_spring_data_23 = redisson("redisson-spring-data-23")
    val redisson_spring_data_24 = redisson("redisson-spring-data-24")
    val redisson_spring_data_25 = redisson("redisson-spring-data-25")
    val redisson_spring_data_26 = redisson("redisson-spring-data-26")
    val redisson_spring_data_27 = redisson("redisson-spring-data-27")
    val redisson_spring_data_30 = redisson("redisson-spring-data-30")
    val redisson_spring_data_31 = redisson("redisson-spring-data-31")

    // Cassandra
    fun cassandra(module: String, version: String = Versions.cassandra): String =
        "com.datastax.oss:java-driver-$module:$version"

    val cassandra_java_driver_core = cassandra("core")
    val cassandra_java_driver_core_shaded = cassandra("core-shaded")
    val cassandra_java_driver_mapper_processor = cassandra("mapper-processor")
    val cassandra_java_driver_mapper_runtime = cassandra("mapper-runtime")
    val cassandra_java_driver_metrics_micrometer = cassandra("metrics-micrometer")
    val cassandra_java_driver_metrics_microprofile = cassandra("metrics-microprofile")
    val cassandra_java_driver_query_builder = cassandra("query-builder")
    val cassandra_java_driver_test_infra = cassandra("test-infra")

    // ScyllaDB
    fun scyllaJava(module: String, version: String = Versions.scylla_java) = "com.scylladb:java-driver-$module:$version"
    val scylla_java_driver_core = scyllaJava("core")
    val scylla_java_driver_query_builder = scyllaJava("query-builder")
    val scylla_java_driver_mapper_processor = scyllaJava("mapper-processor")
    val scylla_java_driver_mapper_runtime = scyllaJava("mapper-runtime")
    val scylla_java_driver_metrics_micrometer = scyllaJava("metrics-micrometer")

    // ElasticSearch
    fun elasticsearch(module: String) = "org.elasticsearch.client:elasticsearch-$module:${Versions.elasticsearch}"
    val elasticsearch_rest_high_level_client = elasticsearch("rest-high-level-client")
    val elasticsearch_rest_client = elasticsearch("rest-client")
    val elasticsearch_rest_client_sniffer = elasticsearch("rest-client-sniffer")

    // InfluxDB
    const val influxdb_java = "org.influxdb:influxdb-java:2.22"
    const val influxdb_spring_data = "com.github.miwurster:spring-data-influxdb:1.8"

    // RabbitMQ
    const val amqp_client = "com.rabbitmq:amqp-client:5.17.0"

    // Kafka
    fun kafka(module: String) = "org.apache.kafka:$module:${Versions.kafka}"
    val kafka_clients = kafka("kafka-clients")
    val kafka_generator = kafka("generator")
    val kafka_metadata = kafka("kafka-metadata")
    val kafka_raft = kafka("kafka-raft")
    val kafka_server_common = kafka("kafka-server-common")
    val kafka_storage = kafka("kafka-storage")
    val kafka_storage_api = kafka("kafka-storage-api")
    val kafka_streams = kafka("kafka-streams")
    val kafka_streams_test_utils = kafka("kafka-streams-test-utils")
    val kafka_2_13 = kafka("kafka_2.13")

    // Spring Kafka
    const val spring_kafka = "org.springframework.kafka:spring-kafka:${Versions.spring_kafka}"
    const val spring_kafka_test = "org.springframework.kafka:spring-kafka-test:${Versions.spring_kafka}"

    // Pulsar
    const val pulsar_client = "org.apache.pulsar:pulsar-client:3.1.0"

    // Nats
    const val jnats = "io.nats:jnats:2.16.14"     // https://github.com/nats-io/nats.java
    const val nats_spring = "io.nats:nats-spring:0.5.6"  // https://mvnrepository.com/artifact/io.nats/nats-spring
    const val nats_spring_cloud_stream_binder = "io.nats:nats-spring-cloud-stream-binder:0.5.6"


    // Zipkin
    const val zipkin_brave = "io.zipkin.brave:brave:5.15.1"
    const val zipkin_brave_tests = "io.zipkin.brave:brave-tests:5.15.1"

    // Hashicorp Vault
    const val vault_java_driver = "com.bettercloud:vault-java-driver:5.1.0"

    // Hibernate
    fun hibernate(module: String) = "org.hibernate.orm:hibernate-$module:${Versions.hibernate}"
    val hibernate_core = hibernate("core")
    val hibernate_jcache = hibernate("jcache")
    val hibernate_micrometer = hibernate("micrometer")
    val hibernate_testing = hibernate("testing")
    val hibernate_envers = hibernate("envers")
    val hibernate_jpamodelgen = hibernate("jpamodelgen")
    val hibernate_hikaricp = hibernate("hikaricp")
    val hibernate_spatial = hibernate("spatial")

    const val hibernate_reactive_core = "org.hibernate.reactive:hibernate-reactive-core:${Versions.hibernate_reactive}"
    const val javassist = "org.javassist:javassist:3.29.2-GA"

    // Validators
    const val hibernate_validator = "org.hibernate.validator:hibernate-validator:${Versions.hibernate_validator}"
    const val hibernate_validator_annotation_processor =
        "org.hibernate:hibernate-validator-annotation-processor:${Versions.hibernate_validator}"

    // R2DBC (버전은 spring-data 버전을 사용한다)
    fun r2dbc(module: String): String = "io.r2dbc:r2dbc-$module"
    val r2dbc_h2 = r2dbc("h2")
    val r2dbc_pool = r2dbc("pool")
    val r2dbc_spi = r2dbc("spi")

    // 참고 : https://github.com/asyncer-io/r2dbc-mysql
    // NOTE: Spring Boot 3.0+ 에서는 asyncer 1.0.2 를 사용
    // NOTE: Spring Boot 2.7 에서는 asyncer 0.9+ 를 사용
    // NOTE: Spring Boot 2.6 에서는 miku 것을 사용
    // https://github.com/mirromutth/r2dbc-mysql
    // https://github.com/asyncer-io/r2dbc-mysql
    const val r2dbc_mysql_0_9 = "io.asyncer:r2dbc-mysql:0.9.3"
    const val r2dbc_mysql_1_0 = "io.asyncer:r2dbc-mysql:1.0.2"
    const val r2dbc_mysql_0_8 = "dev.miku:r2dbc-mysql:0.8.2.RELEASE"

    // https://github.com/mariadb-corporation/mariadb-connector-r2dbc
    const val r2dbc_mariadb = "org.mariadb:r2dbc-mariadb:1.1.4"

    // https://github.com/pgjdbc/r2dbc-postgresql
    const val r2dbc_postgresql = "org.postgresql:r2dbc-postgresql:1.0.1.RELEASE"

    // QueryDSL
    fun querydsl(module: String) = "com.querydsl:querydsl-$module:${Versions.querydsl}"
    val querydsl_apt = querydsl("apt")
    val querydsl_core = querydsl("core")
    val querydsl_jpa = querydsl("jpa")
    val querydsl_sql = querydsl("sql")
    val querydsl_kotlin = querydsl("kotlin")
    val querydsl_kotlin_codegen = querydsl("kotlin-codegen")

    // MyBais
    const val mybatis = "org.mybatis:mybatis:3.5.13"
    const val mybatis_spring = "org.mybatis:mybatis-spring:2.1.0"
    const val mybatis_dynamic_sql = "org.mybatis.dynamic-sql:mybatis-dynamic-sql:1.5.0"

    // blaze-persistence
    fun blazePersistence(module: String, version: String = Versions.blaze_persistence): String =
        "com.blazebit:blaze-persistence-$module:$version"

    val blaze_persistence_core_api = blazePersistence("core-api")
    val blaze_persistence_core_impl = blazePersistence("core-impl")
    val blaze_persistence_entity_view_processor = blazePersistence("entity-view-processor")
    val blaze_persistence_jpa_criteria_api = blazePersistence("jpa-criteria-api")
    val blaze_persistence_jpa_criteria_impl = blazePersistence("jpa-criteria-impl")

    fun blazePersistenceIntegration(module: String) = blazePersistence("integration-$module")

    val blaze_persistence_integration_quarkus = blazePersistenceIntegration("quarkus")
    val blaze_persistence_integration_hibernate_5 = blazePersistenceIntegration("hibernate-5")
    val blaze_persistence_integration_hibernate_5_6 = blazePersistenceIntegration("hibernate-5.6")
    val blaze_persistence_integration_jackson = blazePersistenceIntegration("jackson")
    val blaze_persistence_integration_jaxrs_jackson = blazePersistenceIntegration("jaxrs-jackson")
    val blaze_persistence_integration_entity_view_spring = blazePersistenceIntegration("entity-view-spring")

    // Javers (https://javers.org - Java Audit library)
    fun javers(module: String) = "org.javers:javers-$module:${Versions.javers}"
    val javers_core = javers("core")
    val javers_spring = javers("spring")
    val javers_spring_jpa = javers("spring-jpa")
    val javers_spring_mongo = javers("spring-mongo")
    val javers_persistence_mongo = javers("persistence-mongo")
    val javers_persistence_sql = javers("persistence-sql")
    val javers_spring_boot_starter_sql = javers("spring-boot-starter-sql")

    // MyBatis Mapping 에 사용한다
    const val byte_buddy = "net.bytebuddy:byte-buddy:1.14.4"

    // https://mvnrepository.com/artifact/com.zaxxer/HikariCP
    const val hikaricp = "com.zaxxer:HikariCP:5.0.1"
    const val tomcat_jdbc = "org.apache.tomcat:tomcat-jdbc:9.0.36"

    const val mysql_connector_j = "com.mysql:mysql-connector-j:8.1.0"
    const val mariadb_java_client = "org.mariadb.jdbc:mariadb-java-client:3.1.4"
    const val postgresql_driver = "org.postgresql:postgresql:42.6.0"
    const val oracle_ojdbc8 = "com.oracle.ojdbc:ojdbc8:19.3.0.0"

    // NOTE: Apache Ignite 에서는 꼭 1.4.197 를 써야 합니다.
    const val h2 = "com.h2database:h2:1.4.197"

    // MyBatis 테스트 시에 h2 v2 를 사용한다
    const val h2_v2 = "com.h2database:h2:2.2.220"
    const val hsqldb = "org.hsqldb:hsqldb:2.5.1"
    const val flyway_core = "org.flywaydb:flyway-core:8.5.9"

    // UUID Generator
    const val java_uuid_generator = "com.fasterxml.uuid:java-uuid-generator:4.2.0"
    const val uuid_creator = "com.github.f4b6a3:uuid-creator:5.3.2"

    // Cache2K
    fun cache2k(module: String, version: String = Versions.cache2k) = "org.cache2k:cache2k-$module:$version"
    val cache2k_api = cache2k("api")
    val cache2k_core = cache2k("core")
    val cache2k_jcache = cache2k("jcache")
    val cache2k_micrometer = cache2k("micrometer")
    val cache2k_spring = cache2k("srping")

    // Caffeine
    fun caffeine(module: String, version: String = Versions.caffeine) = "com.github.ben-manes.caffeine:$module:$version"
    val caffeine = caffeine("caffeine")
    val caffeine_jcache = caffeine("jcache")

    const val ehcache = "org.ehcache:ehcache:${Versions.ehcache}"
    const val ehcache_clustered = "org.ehcache:ehcache-clustered:${Versions.ehcache}"
    const val ehcache_transactions = "org.ehcache:ehcache-transactions:${Versions.ehcache}"

    // Apache Ignite
    fun ignite(module: String, version: String = Versions.ignite) = "org.apache.ignite:ignite-$module:$version"

    val ignite_aop = ignite("aop")
    val ignite_aws = ignite("aws")
    val ignite_cassandra_store = ignite("cassandra-store")
    val ignite_clients = ignite("client")
    val ignite_compress = ignite("compress")
    val ignite_core = ignite("core")
    val ignite_direct_io = ignite("direct-io")
    val ignite_hibernate_core = ignite("hibernate-core")
    val ignite_indexing = ignite("indexing")
    val ignite_jta = ignite("jta")
    val ignite_kafka = ignite("kafka")
    val ignite_kubenetes = ignite("kubenetes")
    val ignite_rest_http = ignite("rest-http")
    val ignite_slf4j = ignite("slf4j")
    val ignite_spring = ignite("spring")
    val ignite_tools = ignite("tools")
    val ignite_web = ignite("web")
    val ignite_zookeeper = ignite("zookeeper")

    // https://ignite.apache.org/docs/latest/extensions-and-integrations/spring/spring-data
    val ignite_spring_data_2_2_ext = ignite("spring-data-2.2-ext", "1.0.0")

    // https://ignite.apache.org/docs/latest/extensions-and-integrations/spring/spring-caching
    val ignite_spring_cache_ext = ignite("spring-cache-ext", "1.0.0")

    const val hazelcast = "com.hazelcast:hazelcast:${Versions.hazelcast}"
    const val hazelcast_spring = "com.hazelcast:hazelcast-spring:${Versions.hazelcast}"
    const val hazelcast_client = "com.hazelcast:hazelcast-client:${Versions.hazelcast_client}"

    // CSV parsers
    // https://mvnrepository.com/artifact/com.univocity/univocity-parsers
    const val univocity_parsers = "com.univocity:univocity-parsers:2.9.1"

    // https://mvnrepository.com/artifact/org.objenesis/objenesis
    const val objenesis = "org.objenesis:objenesis:3.3"

    const val ow2_asm = "org.ow2.asm:asm:${Versions.ow2_asm}"
    const val ow2_asm_commons = "org.ow2.asm:asm-commons:${Versions.ow2_asm}"
    const val ow2_asm_util = "org.ow2.asm:asm-util:${Versions.ow2_asm}"
    const val ow2_asm_tree = "org.ow2.asm:asm-tree:${Versions.ow2_asm}"

    // junit 5.4+ 부터는 junit-jupiter 만 있으면 됩니다.
    const val junit_bom = "org.junit:junit-bom:${Versions.junit_jupiter}"

    fun junitJupiter(module: String) =
        "org.junit.jupiter:junit-jupiter-$module:${Versions.junit_jupiter}"

    const val junit_jupiter = "org.junit.jupiter:junit-jupiter:${Versions.junit_jupiter}"
    val junit_jupiter_api = junitJupiter("api")
    val junit_jupiter_engine = junitJupiter("engine")
    val junit_jupiter_migrationsupport = junitJupiter("migrationsupport")
    val junit_jupiter_params = junitJupiter("params")

    fun junitPlatform(module: String) = "org.junit.platform:junit-platform-$module:${Versions.junit_platform}"

    val junit_platform_commons = junitPlatform("commons")
    val junit_platform_engine = junitPlatform("engine")
    val junit_platform_launcher = junitPlatform("launcher")
    val junit_platform_runner = junitPlatform("runner")
    val junit_platform_suite_api = junitPlatform("suite-api")
    val junit_platform_suite_engine = junitPlatform("suite-engine")

    const val junit_vintage_engine = "org.junit.vintage:junit-vintage-engine:${Versions.junit_jupiter}"

    const val kluent = "org.amshove.kluent:kluent:${Versions.kluent}"
    const val assertj_core = "org.assertj:assertj-core:${Versions.assertj_core}"

    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val springmockk = "com.ninja-squad:springmockk:${Versions.springmockk}"

    const val mockito_core = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockito_junit_jupiter = "org.mockito:mockito-junit-jupiter:${Versions.mockito}"
    const val mockito_kotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0"
    const val jmock_junit5 = "org.jmock:jmock-junit5:2.12.0"

    // Awaitility (https://github.com/awaitility/awaitility)
    const val awaitility = "org.awaitility:awaitility:${Versions.awaitility}"
    const val awaitility_kotlin = "org.awaitility:awaitility-kotlin:${Versions.awaitility}"

    const val datafaker = "net.datafaker:datafaker:${Versions.datafaker}"
    const val snakeyaml = "org.yaml:snakeyaml:${Versions.snakeyaml}"
    const val random_beans = "io.github.benas:random-beans:${Versions.random_beans}"

    const val mockserver_netty = "org.mock-server:mockserver-netty:5.10.0"
    const val mockserver_client_java = "org.mock-server:mockserver-client-java:5.10.0"

    const val system_rules = "com.github.stefanbirkner:system-rules:1.19.0"

    const val jmh_core = "org.openjdk.jmh:jmh-core:${Versions.jmh}"
    const val jmh_generator_annprocess = "org.openjdk.jmh:jmh-generator-annprocess:${Versions.jmh}"

    // Testcontainers
    fun testcontainers(module: String) = "org.testcontainers:$module:${Versions.testcontainers}"

    val testcontainers_bom = testcontainers("testcontainers-bom")
    val testcontainers = testcontainers("testcontainers")
    val testcontainers_junit_jupiter = testcontainers("junit-jupiter")
    val testcontainers_cassandra = testcontainers("cassandra")
    val testcontainers_cockroachdb = testcontainers("cockroachdb")
    val testcontainers_couchbase = testcontainers("couchbase")
    val testcontainers_elasticsearch = testcontainers("elasticsearch")
    val testcontainers_influxdb = testcontainers("influxdb")
    val testcontainers_dynalite = testcontainers("dynalite")
    val testcontainers_mariadb = testcontainers("mariadb")
    val testcontainers_mongodb = testcontainers("mongodb")
    val testcontainers_mysql = testcontainers("mysql")
    val testcontainers_postgresql = testcontainers("postgresql")
    val testcontainers_oracle_xe = testcontainers("oracle-xe")
    val testcontainers_kafka = testcontainers("kafka")
    val testcontainers_pulsar = testcontainers("pulsar")
    val testcontainers_redpanda = testcontainers("redpanda")
    val testcontainers_rabbitmq = testcontainers("rabbitmq")
    val testcontainers_vault = testcontainers("vault")

    // the Atlassian's LocalStack, 'a fully functional local AWS cloud stack'.
    val testcontainers_localstack = testcontainers("localstack")
    val testcontainers_mockserver = testcontainers("mockserver")

    val testcontainers_nginx = testcontainers("nginx")
    val testcontainers_r2dbc = testcontainers("r2dbc")

    val testcontainers_gcloud = testcontainers("gcloud")

    // kubernetes
    val testcontainers_k3s = testcontainers("k3s")

    const val fabric8_kubernetes_client_bom = "io.fabric8:kubernetes-client-bom:5.12.2"
    const val fabric8_kubernetes_client = "io.fabric8:kubernetes-client:5.12.2"
    const val kubernetes_client_java = "io.kubernetes:client-java:15.0.1"

    // Apple Silicon에서 testcontainers 를 사용하기 위해 참조해야 합니다.
    const val jna = "net.java.dev.jna:jna:${Versions.jna}"
    const val jna_platform = "net.java.dev.jna:jna-platform:${Versions.jna}"

    // wiremock
    const val wiremock_jre8 = "com.github.tomakehurst:wiremock-jre8:2.33.2"

    // Springdoc OpenAPI (https://springdoc.org/)
    fun springdocStarter(module: String, version: String = Versions.springdoc_openapi): String =
        "org.springdoc:springdoc-openapi-starter-$module:$version"

    val springdoc_openapi_starter_webmvc_ui = springdocStarter("webmvc-ui")
    val springdoc_openapi_starter_webflux_ui = springdocStarter("webflux-ui")
    const val springdoc_openapi_ui = "org.springdoc:springdoc-openapi-ui:${Versions.springdoc_openapi}"
    const val springdoc_openapi_webmvc_ui = "org.springdoc:springdoc-openapi-webmvc-ui:${Versions.springdoc_openapi}"
    const val springdoc_openapi_webflux_ui = "org.springdoc:springdoc-openapi-webflux-ui:${Versions.springdoc_openapi}"
    const val springdoc_openapi_security = "org.springdoc:springdoc-openapi-security:${Versions.springdoc_openapi}"

    // Swagger
    const val swagger_annotations = "io.swagger:swagger-annotations:${Versions.swagger}"
    const val springfox_boot_starter = "io.springfox:springfox-boot-starter:${Versions.springfox_swagger}"

    // Problem for Spring
    const val problem_spring_web = "org.zalando:problem-spring-web:${Versions.problem}"
    const val problem_spring_webflux = "org.zalando:problem-spring-webflux:${Versions.problem}"
    const val problem_jackson_datatype = "org.zalando:jackson-datatype-problem:0.27.1"  // 기존 버전은 올라가지 않았다 ㅠ.ㅠ

    // https://mvnrepository.com/artifact/com.github.maricn/logback-slack-appender
    const val logback_slack_appender = "com.github.maricn:logback-slack-appender:${Versions.logback_slack_appender}"
    const val sentry_logback = "io.sentry:sentry-logback:${Versions.sentry_logback}"

    // ArchUnit - https://www.archunit.org/userguide/html/000_Index.html
    const val archunit = "com.tngtech.archunit:archunit:${Versions.archunit}"
    const val archunit_junit5 = "com.tngtech.archunit:archunit-junit5:${Versions.archunit}"

    // Detekt Plugins
    const val detekt_formatting = "io.gitlab.arturbosch.detekt:detekt-formatting:${Plugins.Versions.detekt}"

    // WebJars
    fun webjar(module: String, version: String) = "org.webjars:$module:$version"

    // https://mvnrepository.com/artifact/com.sksamuel.scrimage/scrimage-core
    fun scrimage(module: String) = "com.sksamuel.scrimage:scrimage-$module:${Versions.scrimage}"
    val scrimage_core = scrimage("core")
    val scrimage_filters = scrimage("filters")
    val scrimage_webp = scrimage("webp")
}
