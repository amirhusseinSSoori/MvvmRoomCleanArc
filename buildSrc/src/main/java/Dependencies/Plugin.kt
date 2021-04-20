

import com.android.build.api.dsl.BuildFeatures
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependenciesSpec.androidApp(): PluginDependencySpec =
    id("com.android.application")

fun PluginDependenciesSpec.kotlinAndroid(): PluginDependencySpec =
    kotlin("android")

fun PluginDependenciesSpec.kotlinAndroidExt(): PluginDependencySpec =
    kotlin("android.extensions")

fun PluginDependenciesSpec.kotlinKaptExt(): PluginDependencySpec =
    kotlin("kapt")

fun PluginDependenciesSpec.daggerHilt(): PluginDependencySpec =
    id("dagger.hilt.android.plugin")

fun PluginDependenciesSpec.navigationComponent(): PluginDependencySpec =
    id("androidx.navigation.safeargs.kotlin")


fun PluginDependenciesSpec.dependencyUpdates(): PluginDependencySpec =
    id("com.github.ben-manes.versions").version("0.33.0")

fun BaseAppModuleExtension.setAppConfig() {
    compileSdkVersion(30)
    buildToolsVersion("30.0.3")

    buildFeatures {
        viewBinding = true
    }


    defaultConfig {
        applicationId("com.amirhusseinsoori.mvvmtodolist")
        minSdkVersion(22)
        targetSdkVersion(30)
        versionCode(1)
        versionName("1.0")
        multiDexEnabled = true
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }
    }

fun BaseExtension.useDefaultBuildTypes() = buildTypes {
    getByName("release") {
        isMinifyEnabled = false
        proguardFiles(
            getDefaultProguardFile("proguard-android-optimize.txt"),
            "proguard-rules.pro"
        )
    }
}

fun BaseExtension.activateJava8() = compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8


}



