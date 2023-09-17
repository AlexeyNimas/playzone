object Deps {

    object Kotlin {
        private const val version = "1.9.0"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
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
        private const val version = "8.1.1"
        const val gradlePlugin = "com.android.tools.build:gradle:$version"
    }
}
