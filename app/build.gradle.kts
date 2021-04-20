plugins {
    androidApp()
    kotlinAndroid()
    kotlinAndroidExt()
    kotlinKaptExt()
    daggerHilt()
    navigationComponent()



}

android {
    setAppConfig()
    useDefaultBuildTypes()
    activateJava8()
    kotlinOptions {
        jvmTarget = ("1.8")
        freeCompilerArgs += ("-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi")
    }

}

dependencies {

    implementation(Dependencies.Dep.kotlin_stdlib)
    implementation(Dependencies.Dep.androidx_core)
    implementation(Dependencies.Dep.androidx_appcompat)
    implementation(Dependencies.Dep.android_material)
    implementation(Dependencies.Dep.constraintlayout)
    testImplementation(Dependencies.Dep.junit)
    androidTestImplementation(Dependencies.Dep.ext_junit)
    androidTestImplementation(Dependencies.Dep.espresso_core)


    //------------hilt -----------------------------------------

    implementation(Dependencies.Dep.hilt_android)
    kapt(Dependencies.Dep.hilt_compile)
    implementation(Dependencies.Dep.hilt_lifecycle)


    //-------------Navigation component----------------------

    implementation(Dependencies.Dep.navigation_fragment_ktx)
    implementation(Dependencies.Dep.navigation_ui_ktx)


    //----------------Room------------------------------
    implementation(Dependencies.Dep.room_runtime)
    kapt(Dependencies.Dep.room_compiler)
    implementation(Dependencies.Dep.room_ktx)

    //----------------dataStore----------------------

    implementation(Dependencies.Dep.dataStore)
    implementation(Dependencies.Dep.dataStoreCore)
    implementation(Dependencies.Dep.preferences)
    implementation(Dependencies.Dep.preferences_core)


    //--------------kotlinx-coroutines----------------

    implementation(Dependencies.Dep.coroutines)
    implementation(Dependencies.Dep.coroutines_core)
    implementation(Dependencies.Dep.lifecycle)

    //--------------util----------------
    implementation(Dependencies.Dep.multidex)
    //---------------lifecycle------------------

    implementation(Dependencies.Dep.liveData)
    implementation(Dependencies.Dep.javaCommon)



    //------------------fragment-------------------
    implementation(Dependencies.Dep.fragment)

}

kapt {
    correctErrorTypes = true
}