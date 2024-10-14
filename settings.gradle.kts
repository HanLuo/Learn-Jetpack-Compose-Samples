pluginManagement {
    repositories {

        // 阿里云 Maven 仓库
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }

        // 清华大学开源软件镜像站
        maven { url = uri("https://mirrors.tuna.tsinghua.edu.cn/maven2/") }

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

        // 阿里云 Maven 仓库
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }

        // 清华大学开源软件镜像站
        maven { url = uri("https://mirrors.tuna.tsinghua.edu.cn/maven2/") }

        google()
        mavenCentral()
    }
}

rootProject.name = "Learn-Jetpack-Compose-Samples"
include(":app")
 