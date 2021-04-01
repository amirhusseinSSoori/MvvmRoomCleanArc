import Dependencies.*
plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-android-extensions")
    id("dagger.hilt.android.plugin")

}

android {
    compileSdkVersion (30)
    buildToolsVersion ("30.0.3")

    defaultConfig {
        applicationId ("com.amirhusseinsoori.mvvmtodolist")
        minSdkVersion (22)
        targetSdkVersion (30)
        versionCode (1)
        versionName ("1.0")
        multiDexEnabled = true
        testInstrumentationRunner ("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility (JavaVersion.VERSION_1_8)
        targetCompatibility (JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = ("1.8")
    }
}

dependencies {

    implementation (Dep.kotlin_stdlib)
    implementation (Dep.androidx_core)
    implementation (Dep.androidx_appcompat)
    implementation (Dep.android_material)
    implementation (Dep.constraintlayout)
    testImplementation (Dep.junit)
    androidTestImplementation (Dep.ext_junit)
    androidTestImplementation (Dep.espresso_core)


    //------------hilt -----------------------------------------

    implementation(Dep.hilt_android)
    kapt(Dep.hilt_compile)
    implementation(Dep.hilt_lifecycle)


    //-------------Navigation component----------------------

    implementation(Dep.navigation_fragment_ktx)
    implementation(Dep.navigation_ui_ktx)


    //----------------Room------------------------------
    implementation(Dep.room_runtime)
    kapt(Dep.room_compiler)
    implementation(Dep.room_ktx)


    //--------------kotlinx-coroutines----------------

    implementation(Dep.coroutines)
    implementation(Dep.coroutines_core)
    implementation(Dep.lifecycle)

   //--------------util----------------
    implementation (Dep.multidex)

}