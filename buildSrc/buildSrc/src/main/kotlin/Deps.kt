object Deps {

    object Kodein {
        private const val version = "7.20.2"
        const val core = "org.kodein.di:kodein-di:$version"
    }

    object Kotlin {
        private const val version = "1.9.0"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

        object Serialization {
            private const val version = "1.9.0"
            const val gradlePlugin = "org.jetbrains.kotlin:kotlin-serialization:$version"
            const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0"
        }

        object Coroutines {
            private const val version = "1.7.3"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        }
    }

    object Compose {
        private const val version = "1.5.1"
        const val gradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:$version"
        const val ui = "androidx.compose.ui:ui:$version"
        const val tooling = "androidx.compose.ui:ui-tooling:$version"
        const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$version"
        const val foundation = "androidx.compose.foundation:foundation:$version"
        const val material = "androidx.compose.material:material:$version"
    }

    object Activity {
        private const val version = "1.7.2"
        const val compose = "androidx.activity:activity-compose:$version"
    }

    object Android {
        private const val version = "8.1.2"
        const val gradlePlugin = "com.android.tools.build:gradle:$version"
    }

    object Ktor {
        private const val version = "2.3.4"
        const val core = "io.ktor:ktor-client-core:$version"
        const val json = "io.ktor:ktor-client-json:$version"
        const val ios = "io.ktor:ktor-client-ios:$version"
        const val serialization = "io.ktor:ktor-serialization-kotlinx-json:$version"
        const val contentNegotiation = "io.ktor:ktor-client-content-negotiation:$version"
        const val logging = "io.ktor:ktor-client-logging:$version"
        const val android = "io.ktor:ktor-client-android:$version"
        const val okhttp = "io.ktor:ktor-client-okhttp:$version"
    }

    object SqlDelight {
        private const val version = "1.5.5"
        const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:$version"
        const val runtime = "com.squareup.sqldelight:runtime:$version"
        const val android = "com.squareup.sqldelight:android-driver:$version"
        const val ios = "com.squareup.sqldelight:native-driver:$version"
    }
}
