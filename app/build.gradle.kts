//import xyz.jayeshseth.budgetmanager.buildSrc.Libs

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp") version("1.7.21-1.0.8")
}

kotlin {
    sourceSets {
        debug {
            kotlin.srcDir("build/generated/ksp/debug/kotlin")
        }
        release {
            kotlin.srcDir("build/generated/ksp/release/kotlin")
        }
    }
}

android {
    compileSdk = libs.versions.compileSdk.get().toInt()
    namespace = "xyz.jayeshseth.budgetmanager"
    defaultConfig {
        applicationId = "xyz.jayeshseth.budgetmanager"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "0.0.1"
        vectorDrawables.useSupportLibrary = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    val composeBom = platform(libs.androidx.compose.bom)
    implementation(composeBom)
    androidTestImplementation(composeBom)
    implementation(libs.accompanist.adaptive)
    implementation(libs.accompanist.drawablePainter)
    implementation(libs.accompanist.flowLayouts)
    implementation(libs.accompanist.navigationAnimation)
    implementation(libs.accompanist.navigationMaterial)
    implementation(libs.accompanist.pager)
    implementation(libs.accompanist.permissions)
    implementation(libs.accompanist.placeHolder)
    implementation(libs.accompanist.systemUIController)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.benchmark.macrobenchmark.junit4)
    implementation(libs.bundles.compose)
    implementation(libs.androidx.constraintLayout.compose)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.core.splashScreen)
    kapt(libs.androidx.lifecycle.compiler)
    kapt(libs.hilt.ext.compiler)
    kapt(libs.hilt.android.compiler)
    implementation(libs.hilt.android)
    implementation(libs.androidx.lifecycle.viewModel)
    implementation(libs.androidx.lifecycle.viewModel.compose)
    implementation(libs.androidx.lifecycle.livedata)
    implementation(libs.androidx.lifecycle.viewModel.savedState)
    implementation(libs.androidx.lifecycle.runtime)

    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.navigation.compose.hiltNavigation)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.window)
    implementation(libs.google.android.material)
//    // Kotlin
//    implementation Libs.Kotlin.stdlib
//    implementation Libs.Kotlin.gradlePlugin
//    implementation Libs.Kotlin.extensions
//
//    // Coroutines
//    implementation Libs.Coroutines.core
//
//    // Okhttp
//    implementation Libs.SquareUp.Okhttp.okhttp
//    implementation Libs.SquareUp.Okhttp.okhttpLoggingInterceptor
//    implementation Libs.SquareUp.Okhttp.okhttpUrlConnection
//
//    // Retrofit
//    implementation Libs.SquareUp.Retrofit.retrofit
//    implementation Libs.SquareUp.Retrofit.gsonConvertor
//    implementation Libs.SquareUp.Retrofit.moshiConvertor
//    implementation Libs.SquareUp.Retrofit.scalarsConvertor
//
//    // Hilt
//    implementation Libs.Hilt.lifeCycleViewModel
//    implementation Libs.Hilt.hiltAndroid
//    kapt Libs.Hilt.hiltCompiler
//    kapt Libs.Hilt.googleHiltCompiler
//    implementation Libs.Hilt.hiltNavigation
//    implementation Libs.Hilt.googleHilt
//
//    // Compose
//    implementation Libs.AndroidX.Compose.runtime
//    implementation Libs.AndroidX.Compose.foundation
//    implementation Libs.AndroidX.Compose.layout
//    implementation Libs.AndroidX.Compose.activity
//    implementation Libs.AndroidX.Compose.liveData
//
//    implementation Libs.AndroidX.Compose.ui
//    implementation Libs.AndroidX.Compose.constraintLayout
//    implementation Libs.AndroidX.Compose.material
//    implementation Libs.AndroidX.Compose.googleMaterial
//    implementation Libs.AndroidX.Compose.materialIconsExtended
//
//    implementation Libs.AndroidX.Compose.tooling
//    implementation Libs.AndroidX.Compose.toolingPreview
//    debugImplementation Libs.AndroidX.Compose.composeManifest
//
//    // Accompanist
//    implementation Libs.AndroidX.Accompanist.systemUIController
//    implementation Libs.AndroidX.Accompanist.insets
//
//    // Navigation
//    implementation Libs.AndroidX.Navigation.navigation
//    implementation Libs.AndroidX.Navigation.composeDestinations
//    ksp Libs.AndroidX.Navigation.kspComposeDestinations
//
//    // LifeCycle
//    implementation Libs.AndroidX.LifeCycle.viewModel
//    implementation Libs.AndroidX.LifeCycle.liveData
//    implementation Libs.AndroidX.LifeCycle.runtime
//    implementation Libs.AndroidX.LifeCycle.viewModelCompose
//
//    // Room
//    kapt Libs.AndroidX.Room.compiler
//    annotationProcessor Libs.AndroidX.Room.compiler
//    implementation Libs.AndroidX.Room.runtime
//    implementation Libs.AndroidX.Room.ktx
//
//    // Datastore
//    implementation Libs.AndroidX.DataStore.typed
//    implementation Libs.AndroidX.DataStore.preference
//
//    // Others
//    implementation Libs.AndroidX.Others.window
//    implementation Libs.AndroidX.Others.gson
//    implementation Libs.AndroidX.Others.ktx
//    implementation Libs.AndroidX.Others.coil
//    implementation Libs.AndroidX.Others.appcompat
//    implementation Libs.AndroidX.Others.splashScreen
//
//    // Tests
//    // Android Instrumental
//    androidTestImplementation Libs.AndroidX.Test.AndroidInstrumental.junit
//    androidTestImplementation Libs.AndroidX.Test.AndroidInstrumental.androidxJunit
//    androidTestImplementation Libs.AndroidX.Test.AndroidInstrumental.espresso
//    androidTestImplementation Libs.AndroidX.Test.AndroidInstrumental.UIJunit
//    androidTestImplementation Libs.AndroidX.Test.AndroidInstrumental.truth
//    androidTestImplementation Libs.AndroidX.Test.AndroidInstrumental.core
//    androidTestImplementation Libs.AndroidX.Test.AndroidInstrumental.runner
//
//    // Unit
//    testImplementation Libs.AndroidX.Test.Unit.junit
//    testImplementation Libs.AndroidX.Test.Unit.core
//    testImplementation Libs.AndroidX.Test.Unit.coreTesting
//    testImplementation Libs.AndroidX.Test.Unit.truth
//    testImplementation Libs.AndroidX.Test.Unit.roomTesting
}

