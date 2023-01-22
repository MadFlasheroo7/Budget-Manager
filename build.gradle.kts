buildscript {
    repositories {
        google()
        mavenCentral()
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false
    alias(libs.plugins.jetbrains.kotlin.serialization) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.secrets) apply false
    id("com.github.ben-manes.versions") version ("0.44.0")
    id("nl.littlerobots.version-catalog-update") version ("0.7.0")
}
//task clean(type: Delete) {
//    delete rootProject.buildDir
//}