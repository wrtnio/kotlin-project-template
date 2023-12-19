configurations {
    testImplementation.get().extendsFrom(compileOnly.get(), runtimeOnly.get())
}

dependencies {

    // Modules
    implementation(project(":core"))
    implementation(project(":messages"))

    implementation(Libs.kommons_core)
    testImplementation(Libs.kommons_junit5)
}
