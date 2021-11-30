dependencies {
    implementation(Dependencies.kotlinStd)
    implementation(Dependencies.kotlinxCoroutines)
    implementation(Dependencies.kLogging)
    implementation(Dependencies.slf4jSimple)
    implementation(Dependencies.kotlinxSerialization)
    api(project(":gravel-core"))
}