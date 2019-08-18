
plugins {
    kotlin("jvm") version "1.3.31"
}

group = "net.jforge.scripting"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation (kotlin("stdlib-jdk8"))
}

//compileKotlin {
//    kotlinOptions.jvmTarget = "1.8"
//}
//compileTestKotlin {
//    kotlinOptions.jvmTarget = "1.8"
//}
