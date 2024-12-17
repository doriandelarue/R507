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
        property("sonar.sources", "src/main/java/org.example")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.token", "sqp_0fd1c6ffd81a5d6142f394f25994824f6ae961bf")
        property("sonar.java.binaries", "build/classes/java/main/org/example")
    }
}

tasks.test {
    useJUnitPlatform()
}