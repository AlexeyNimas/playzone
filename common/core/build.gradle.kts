plugins {
    id("multiplatform-setup")
    id("android-setup")
    kotlin("plugin.serialization")
}

repositories {
    mavenCentral()
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(Deps.Kotlin.Serialization.serialization)
                api(Deps.Kotlin.Coroutines.core)

                api(Deps.Ktor.core)
                implementation(Deps.Ktor.json)
                implementation(Deps.Ktor.json)
                implementation(Deps.Ktor.serialization)
                implementation(Deps.Ktor.contentNegotiation)
                implementation(Deps.Ktor.logging)

                api(Deps.Kodein.core)

                api(Deps.SqlDelight.runtime)
            }
        }

        androidMain {
            dependencies {
                implementation(Deps.Ktor.android)
                api(Deps.SqlDelight.android)
            }
        }

        iosMain {
            dependencies {
                implementation(Deps.Ktor.ios)
                api(Deps.SqlDelight.ios)
            }
        }
    }
}
