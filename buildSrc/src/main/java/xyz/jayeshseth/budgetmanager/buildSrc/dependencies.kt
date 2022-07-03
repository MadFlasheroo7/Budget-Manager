package xyz.jayeshseth.budgetmanager.buildSrc

object Versions {
    const val room = "2.4.2"
    const val roomAlpha = "2.5.0-alpha02"
    const val okhttp = "4.10.0"
    const val Kotlin = "1.6.20"
    const val retrofit = "2.9.0"
    const val viewModel = "2.5.0"
    const val viewModelAlpha = "2.6.0-alpha01"
    const val coroutine = "1.6.0"
    const val devCompose = "1.2.0-rc03"
    const val stableCompose = "1.1.1"
    const val composeCompiler = "1.2.0"
    const val googleMaterial = "1.6.1"
    const val activityCompose = "1.4.0"
    const val constraintLayout = "1.0.1"
    const val hilt = "1.0.0"
    const val navigation = "2.5.0"
    const val raamcostaNavigation = "1.6.12-beta"
    const val hiltViewModel = "1.0.0-alpha03"
    const val accompanist_insets = "0.24.13-rc"
    const val accompanist_webView = "0.24.13-rc"
    const val accompanist_drawablePainter = "0.15.0"
    const val accompanist_navigationAnimation = "0.24.13-rc"
    const val accompanist_pager = "0.24.13-rc"
    const val accompanist_permissions = "0.24.13-rc"
    const val accompanist_swipeRefresh = "0.24.13-rc"
    const val coil = "2.1.0"
    const val liveData = "1.1.1"
    const val lifecycleRuntime = "2.5.0"
    const val accompanist_systemUiController = "0.24.13-rc"
}

object Libs {

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.Kotlin}"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin}"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.Kotlin}"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    }

    object SquareUp {
        object Okhttp {
            const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
            const val okhttpUrlConnection = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
            const val okhttpLoggingInterceptor = "com.squareup.okhttp3:okhttp-urlconnection:${Versions.okhttp}"
        }

        object Retrofit {
            const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
            const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
            const val moshiConvertor = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
            const val scalarsConvertor = "com.squareup.retrofit2:converter-scalars:${Versions.retrofit}"
        }
    }

    object Hilt {
        const val lifeCycleViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModel}"
        const val googleHilt = "com.google.dagger:hilt-android:2.40.5"
        const val googleHiltCompiler = "com.google.dagger:hilt-android-compiler:2.37"
        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hilt}"
        const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:${Versions.hilt}"
    }

    object AndroidX {
        object Compose {
            const val snapshot = ""
            const val m3snapshot = ""
            const val runtime = "androidx.compose.runtime:runtime:${Versions.stableCompose}"
            const val foundation = "androidx.compose.foundation:foundation:${Versions.stableCompose}"
            const val layout = "androidx.compose.foundation:foundation-layout:${Versions.stableCompose}"
            const val activity = "androidx.activity:activity-compose:${Versions.activityCompose}"
            const val liveData = "androidx.compose.runtime:runtime-livedata:${Versions.liveData}"

            const val ui = "androidx.compose.ui:ui:${Versions.stableCompose}"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:${Versions.constraintLayout}"
            const val material = "androidx.compose.material:material:${Versions.stableCompose}"
            const val googleMaterial = "com.google.android.material:material:${Versions.googleMaterial}"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.stableCompose}"

            const val tooling = "androidx.compose.ui:ui-tooling:${Versions.stableCompose}"
            const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.stableCompose}"
            const val composeManifest = "androidx.compose.ui:ui-test-manifest:${Versions.devCompose}"
        }

        object Accompanist {
            const val systemUIController = "com.google.accompanist:accompanist-systemuicontroller:${Versions.accompanist_systemUiController}"
            const val insets = "com.google.accompanist:accompanist-insets:${Versions.accompanist_insets}"
        }

        object Navigation {
            const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
            const val composeDestinations = "io.github.raamcosta.compose-destinations:core:${Versions.raamcostaNavigation}"
            const val kspComposeDestinations = "io.github.raamcosta.compose-destinations:ksp:${Versions.raamcostaNavigation}"
        }

        object LifeCycle {
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.4.1"
            const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.4.1"
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.1"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.0-alpha03"
        }

        object Room {
            const val runtime = "androidx.room:room-runtime:${Versions.room}"
            const val ktx = "androidx.room:room-ktx:${Versions.room}"
            const val compiler = "androidx.room:room-compiler:${Versions.room}"
        }

        object DataStore {
            const val typed = "androidx.datastore:datastore:1.0.0"
            const val preference = "androidx.datastore:datastore-preferences:1.0.0"
        }

        object Others {
            const val window = "androidx.window:window:1.0.0"
            const val gson = "com.google.code.gson:gson:2.9.0"
            const val ktx = "androidx.core:core-ktx:1.7.0"
            const val coil = "io.coil-kt:coil-compose:${Versions.coil}"
            const val appcompat = "androidx.appcompat:appcompat:1.4.1"
            const val splashScreen = "androidx.core:core-splashscreen:1.0.0-beta02"
        }

        object Test {
            object AndroidInstrumental {
                const val junit = "junit:junit:4.13.2"
                const val androidxJunit = "androidx.test.ext:junit:1.1.3"
                const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
                const val UIJunit = "androidx.compose.ui:ui-test-junit4:1.1.1"
                const val truth = "androidx.arch.core:core-testing:2.1.0"
                const val core = "com.google.truth:truth:1.1.3"
                const val runner = "androidx.test:runner:1.4.0"
            }

            object Unit {
                const val junit = "junit:junit:4.13.2"
                const val core = "androidx.test:core:1.4.0"
                const val coreTesting = "androidx.arch.core:core-testing:2.1.0"
                const val truth = "com.google.truth:truth:1.1.3"
                const val roomTesting = "androidx.room:room-testing"
            }
        }
    }

    object Urls {
        const val composeSnapshotRepo = "https://androidx.dev/snapshots/builds/" +
                "${Libs.AndroidX.Compose.snapshot}/artifacts/repository/"
        const val composeMaterial3SnapshotRepo = "https://androidx.dev/snapshots/builds/" +
                "${Libs.AndroidX.Compose.m3snapshot}/artifacts/repository/"
        const val accompanistSnapshotRepo = "https://oss.sonatype.org/content/repositories/snapshots"
    }
}