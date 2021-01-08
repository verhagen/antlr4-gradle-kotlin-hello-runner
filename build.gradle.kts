plugins {
    java
    eclipse
    application
    antlr
}

repositories {
    jcenter()
}

dependencies {
    antlr("org.antlr:antlr4:4.9.1")

    implementation("org.antlr:antlr4:4.5.3")

    testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

application {
    // Define the main class for the application.
    getMainClass().set("HelloRunner")
}

tasks.withType<AntlrTask> {
    //source("src/main/antlr")
    //source("build/generated-src/antlr4")
}
tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf("-visitor", "-long-messages")
}
tasks.test {
    // Use junit platform for unit tests.
    useJUnitPlatform()
}
