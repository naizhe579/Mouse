plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

val groupIdStr: String = "cn.naizhe579"
val artifactIdStr: String = "net"
val versionInt: Int = 2
val versionStr: String = "${versionInt}.0"

android {
    namespace = "cn.naizhe579.net"
    compileSdk = 33
    version = versionInt

    defaultConfig {
        minSdk = 19

        consumerProguardFiles("consumer-rules.pro")

        aarMetadata {
            minCompileSdk = 33
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

dependencies {

    //不需要混淆
    api("androidx.core:core-ktx:1.9.0")
    api("androidx.appcompat:appcompat:1.6.1")
    //缓存
    api("com.tencent:mmkv:1.2.16")
    //RxJava
    api("io.reactivex.rxjava2:rxandroid:2.1.1")
    api("io.reactivex.rxjava2:rxjava:2.2.21")

    //需要混淆
    //GSON
    api("com.google.code.gson:gson:2.10.1")
    //okhttp
    //noinspection GradleDependency
    api("com.squareup.okhttp3:okhttp:3.12.13")
    //noinspection GradleDependency
    api("com.squareup.okhttp3:logging-interceptor:3.12.13")
    //Retrofit2
    //noinspection GradleDependency
    api("com.squareup.retrofit2:retrofit:2.6.4")
    //noinspection GradleDependency
    api("com.squareup.retrofit2:converter-gson:2.6.4")
    //noinspection GradleDependency
    api("com.squareup.retrofit2:converter-scalars:2.6.4")
    //noinspection GradleDependency
    api("com.squareup.retrofit2:adapter-rxjava2:2.6.4")
    //下载
    api("com.liulishuo.okdownload:okdownload:1.0.7")
    api("com.liulishuo.okdownload:sqlite:1.0.7")
    api("com.liulishuo.okdownload:okhttp:1.0.7")

}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = groupIdStr
            artifactId = artifactIdStr
            version = versionStr

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}