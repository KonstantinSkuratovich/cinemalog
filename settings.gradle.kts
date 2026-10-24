pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CinemaLog"
include(":app")
include(
    ":core:network",
    ":core:database",
    ":core:datastore",
    ":core:data",
    ":core:designsystem",
)
include(
    ":feature:account",
    ":feature:details",
    ":feature:diary",
    ":feature:discover",
    ":feature:live",
    ":feature:search",
    ":feature:settings",
)
