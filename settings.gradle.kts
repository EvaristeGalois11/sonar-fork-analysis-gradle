rootProject.name = "sonar-fork-analysis-gradle"
include("fizzbuzz", "swap-case", "composite", "report-aggregate")
System.setProperty("sonar.gradle.skipCompile", "true")
