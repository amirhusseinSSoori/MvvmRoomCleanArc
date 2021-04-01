package Dependencies

object BuildScript {
    val build_gradle="com.android.tools.build:gradle:${Versions.buildGradle}"
    val kotlin_gradle="org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinSlib}"
    val hilt_gradle="com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"
    val navigation_gradle="androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"
    val jitpack="https://jitpack.io"
}