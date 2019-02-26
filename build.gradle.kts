plugins {
    application
    kotlin("jvm") version "1.3.0"

    // We need the javafx plugin since java 11
    id("org.openjfx.javafxplugin") version "0.0.7"
}
dependencies {
    compile(kotlin("stdlib-jdk8"))

    // Add the tornadofx dependency
    compile("no.tornado:tornadofx:1.7.17")
}
repositories {
    mavenCentral()
}

javafx {

    // Declare the javafx modules we need to use
    modules("javafx.controls")
}

application {

    // Declare the main class for the application plugin
    mainClassName = "de.klg71.tornado.MainApp"
}

// Set the jvmTarget to 1.8 to support inlining
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> { kotlinOptions.jvmTarget = "1.8" }

