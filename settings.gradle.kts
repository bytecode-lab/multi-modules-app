pluginManagement {
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
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MultiModuleExampleApp"
include(":app")
include(":module-a")
include(":module-b")
include(":module-c")
include(":module-d")
include(":module-e")
include(":module-f")
include(":module-g")
include(":module-h")
include(":module-i")
include(":module-j")
include(":module-k")
include(":app-demo")
include(":wear-app")
