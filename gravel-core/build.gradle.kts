plugins {
    kotlin("plugin.serialization") version Versions.kotlin
}

dependencies {
    implementation(Dependencies.kotlinStd)
    implementation(Dependencies.kotlinxCoroutines)
    implementation(Dependencies.ktorNetwork)
    implementation(Dependencies.kLogging)
    implementation(Dependencies.slf4jSimple)
    implementation(Dependencies.kotlinxSerialization)
    implementation(project(":gravel-api"))
    implementation(project(":gravel-protocol"))
}