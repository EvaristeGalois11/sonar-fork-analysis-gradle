plugins {
    alias(libs.plugins.sonar)
}

sonar {
    properties {
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.organization", "evaristegalois")
        property("sonar.projectKey", "EvaristeGalois11_sonar-fork-analysis-gradle")
        property(
            "sonar.coverage.jacoco.xmlReportPaths",
            "${projectDir}/report-aggregate/build/reports/jacoco/testCodeCoverageReport/testCodeCoverageReport.xml"
        )
    }
}
