plugins {
    kotlin("jvm") version "1.5.0" apply false
}

allprojects {

    group = "xyz.ixidi"
    version = "1.0"

}

subprojects {

    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "11"
        }
    }

}