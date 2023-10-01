plugins {
    kotlin("multiplatform")
    kotlin("kapt")
}

kotlin {
    androidTarget()
    ios()
}
