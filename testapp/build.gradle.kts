plugins {
    id("com.vaadin")
    id("application")
}

dependencies {
    implementation(project(":vaadin-boot"))
    implementation("org.slf4j:slf4j-simple:2.0.0")
    implementation("com.vaadin:vaadin-core:23.2.6") {
        exclude(module = "javax.annotation-api")
    }

    testImplementation("org.slf4j:slf4j-simple:2.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

application {
    mainClass.set("com.example.Main")
}
