configurations {
    testImplementation.get().extendsFrom(compileOnly.get(), runtimeOnly.get())
}

dependencies {

    implementation(Libs.kommons_core)
    implementation(Libs.kommons_cache)
    implementation(Libs.kommons_coroutines)
    implementation(Libs.kommons_json)
    implementation(Libs.kommons_spring_support)
    testImplementation(Libs.kommons_junit5)
}
