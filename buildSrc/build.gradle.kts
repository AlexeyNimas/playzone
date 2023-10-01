plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    mavenLocal()
    google()
    maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(Deps.Kotlin.gradlePlugin)
    implementation(Deps.Compose.gradlePlugin)
    implementation(Deps.Android.gradlePlugin)
    implementation(Deps.Kotlin.Serialization.gradlePlugin)
    implementation(Deps.SqlDelight.gradlePlugin)
}

kotlin {
    sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}
