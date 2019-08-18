
plugins {
    `java-library`
    kotlin("jvm") version "1.3.31"
}

group = "net.jforge.scripting"
version = "1.0-SNAPSHOT"

//sourceCompatibility = 1.8

repositories {
    mavenCentral()
    maven {
        setUrl("https://dl.bintray.com/kotlin/kotlin-dev/")
    }
}

dependencies {
    implementation (project(":greetings"))
    implementation (kotlin("stdlib-jdk8"))
    implementation (kotlin("reflect"))
    implementation (kotlin("script-runtime"))
    implementation (kotlin("compiler-embeddable"))
    implementation (kotlin("scripting-compiler-embeddable"))
    implementation (kotlin("script-util"))
    testImplementation ("junit:junit:4.12")
}

//compileKotlin {
//    kotlinOptions.jvmTarget = "1.8"
//}
//compileTestKotlin {
//    kotlinOptions.jvmTarget = "1.8"
//}
