plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(Android.compileSdkVersion)
    buildToolsVersion(Android.buildToolsVersion)

    defaultConfig {
        applicationId = "com.example.paginate"
        minSdkVersion(Android.sampleMinSdkVersion)
        targetSdkVersion(Android.targetSdkVersion)
        versionCode = 1
        versionName = "1.0.0"
    }
}

dependencies {
    implementation(project(":paginate"))

    implementation(Dependencies.appcompat)
    implementation(Dependencies.material)
    implementation(Dependencies.recyclerviewAnimators)
}
