plugins {
    id("java")
}

group = "de.duglab"
version = "2.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":lib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
