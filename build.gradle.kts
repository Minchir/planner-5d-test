import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "planner.test"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.3.0")
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.3.0")
    implementation("org.seleniumhq.selenium:selenium-chromium-driver:4.3.0")
    implementation("org.seleniumhq.selenium:selenium-api:4.3.0")
    implementation("org.seleniumhq.selenium:selenium-remote-driver:4.3.0")
    implementation("junit:junit:4.13.2")
    implementation("org.testng:testng:7.6.1")
    testImplementation(kotlin("test"))
    testImplementation("junit:junit:3.8.2")
}


tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}