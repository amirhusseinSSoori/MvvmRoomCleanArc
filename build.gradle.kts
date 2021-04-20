

// Top-level build file where you can add configuration options common to all sub-projects/modules.



//plugins {
//    dependencyUpdates()
//}
buildscript {

    repositories {
        google()
        jcenter()
        maven { url = uri(Dependencies.BuildScript.jitpack)  }
    }
    dependencies {
        classpath (Dependencies.BuildScript.build_gradle)
        classpath (Dependencies.BuildScript.kotlin_gradle)
        classpath (Dependencies.BuildScript.hilt_gradle)
        classpath (Dependencies.BuildScript.navigation_gradle)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri(Dependencies.BuildScript.jitpack)  }
    }
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}

//tasks.named("dependencyUpdates", com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class.java).configure {
//
//    // optional parameters
//    checkForGradleUpdate = true
//    outputFormatter = "json"
//    outputDir = "build/dependencyUpdates"
//    reportfileName = "report"
//}