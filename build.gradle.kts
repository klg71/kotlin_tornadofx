plugins {
    application
    kotlin("jvm") version "1.3.0"
    id("org.openjfx.javafxplugin") version "0.0.7"
}
dependencies {
    compile(kotlin("stdlib-jdk8"))

    compile("no.tornado:tornadofx:1.7.17")
}
repositories {
    mavenCentral()
}

javafx {
    modules("javafx.controls")
    version = "11.0.2"
}

application {
    mainClassName = "de.klg71.tornado.MainApp"
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> { kotlinOptions.jvmTarget = "1.8" }

