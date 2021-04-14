package Dependencies

object Dep {


    //----------------  main  ------------------
    val kotlin_stdlib="org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinSlib}"
    val androidx_core="androidx.core:core-ktx:${Versions.coreKtx}"
    val androidx_appcompat="androidx.appcompat:appcompat:${Versions.appcompat}"
    val android_material="com.google.android.material:material:${Versions.material}"
    val constraintlayout="androidx.constraintlayout:constraintlayout:${Versions.constraint}"



    //-------------------- test --------------------------
    val junit="junit:junit:${Versions.junitVersion}"
    val ext_junit="androidx.test.ext:junit:${Versions.extJunit}"
    val espresso_core="androidx.test.espresso:espresso-core:${Versions.espressoCore}"

    //--------------coroutines----------------
    val coroutines ="org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    val coroutines_core="org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    val lifecycle="androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"


    //--------------room----------------
    val room_runtime="androidx.room:room-runtime:${Versions.roomVersion}"
    val room_compiler="androidx.room:room-compiler:${Versions.roomVersion}"
    val room_ktx="androidx.room:room-ktx:${Versions.roomVersion}"

    //-----------------DataStore-------------------------------
    val dataStore="androidx.datastore:datastore:${Versions.dataStore}"
    val dataStoreCore="androidx.datastore:datastore-core:${Versions.dataStore}"
    val preferences="androidx.datastore:datastore-preferences:${Versions.dataStore}"
    val preferences_core="androidx.datastore:datastore-preferences-core:${Versions.dataStore}"



    //--------------hilt----------------
    val hilt_android ="com.google.dagger:hilt-android:${Versions.hiltVersion}"
    val hilt_compile ="com.google.dagger:hilt-compiler:${Versions.hiltVersion}"
    val hilt_lifecycle ="androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltLifecycle}"


    //-------------Navigation component----------------------
    val navigation_fragment_ktx ="androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    val navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"



    val multidex = "androidx.multidex:multidex:${Versions.multidex_version}"

}