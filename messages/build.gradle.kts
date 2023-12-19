configurations {
    testImplementation.get().extendsFrom(compileOnly.get(), runtimeOnly.get())
}

dependencies {

    implementation(project(":core"))

    implementation(Libs.kommons_core)
    testImplementation(Libs.kommons_junit5)
}
