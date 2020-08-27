plugins {
    id("com.android.library")
}

android {
    compileSdkVersion(Android.compileSdkVersion)
    buildToolsVersion(Android.buildToolsVersion)

    defaultConfig {
        minSdkVersion(Android.minSdkVersion)
    }
}

dependencies {
    implementation(Dependencies.recyclerview)
}

apply(from = rootProject.file("gradle/maven-push.gradle"))
