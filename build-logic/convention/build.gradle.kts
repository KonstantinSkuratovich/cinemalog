plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidLibraryConvention") {
            id = "cinemalog.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
    }
}