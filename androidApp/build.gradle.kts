plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "ru.alexnimas.playzone.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "ru.alexnimas.playzone.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":common:umbrella-compose"))
    implementation(Deps.Compose.ui)
    implementation(Deps.Compose.tooling)
    implementation(Deps.Compose.toolingPreview)
    implementation(Deps.Compose.foundation)
    implementation(Deps.Compose.material)
    implementation(Deps.Activity.compose)
}
