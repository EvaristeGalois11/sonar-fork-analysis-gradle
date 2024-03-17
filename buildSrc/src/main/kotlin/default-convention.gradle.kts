plugins {
    java
    jacoco
    com.diffplug.spotless
}

group = "org.example.sonar-fork-analysis"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.compileJava {
    options.release = 21
}

tasks.jacocoTestReport {
    enabled = false
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.10.2")
        }
    }
}

spotless {
    java {
        googleJavaFormat()
        importOrder()
        removeUnusedImports()
        formatAnnotations()
    }
}
