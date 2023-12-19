configurations {
    testImplementation.get().extendsFrom(compileOnly.get(), runtimeOnly.get())
}

dependencies {

    implementation(Libs.kommons_core)
    testImplementation(Libs.kommons_junit5)
}
