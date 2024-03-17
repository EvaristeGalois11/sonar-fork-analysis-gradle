plugins {
    id("java")
}

group = "org.example.sonar-fork-analysis"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.compileJava {
    options.release = 21
}

tasks.test {
    useJUnitPlatform()
}