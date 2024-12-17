plugins {
    id("java")
    id("org.sonarqube") version "5.1.0.4882"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.apache.commons:commons-lang3:3.12.0")

    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

sonarqube {
    properties {
        property("sonar.projectKey", "R507")
        property("sonar.projectName", "R507")
        property("sonar.sources", "src/main/java")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.token", "sqp_213d6ed17bc92feeb2d7585d977ec3f13e7f9783")
        property("sonar.java.binaries", "build/classes/java/main")
    }
}

tasks.test {
    useJUnitPlatform()
}