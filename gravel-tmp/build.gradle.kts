dependencies {
    implementation(Dependencies.kotlinStd)
    implementation(Dependencies.kotlinxCoroutines)
    implementation(Dependencies.ktorNetwork)
    implementation(Dependencies.kLogging)
    implementation(Dependencies.slf4jSimple)
    implementation(Dependencies.kotlinxSerialization)
    implementation(project(":gravel-bot"))
    api(project(":gravel-protocol-1_17_1"))
}