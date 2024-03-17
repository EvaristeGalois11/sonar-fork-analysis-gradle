plugins {
    java
    id("com.diffplug.spotless")
}

group = "org.example.sonar-fork-analysis"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.compileJava {
    options.release = 21
}

tasks.test {
    useJUnitPlatform()
}

spotless {
    java {
        googleJavaFormat()
        importOrder()
        removeUnusedImports()
        formatAnnotations()
    }
}
