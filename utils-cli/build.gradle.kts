import org.gradle.api.JavaVersion.VERSION_1_8

plugins {
  alias(libs.plugins.kotlin)
}

group = "org.wdt.utils.cli"
version = rootProject.version

repositories {
  mavenCentral()
}

dependencies {
  implementation(libs.stdlib.jdk8)
  testImplementation(libs.stdlib.test)
}

publishing {
  publications {
    create<MavenPublication>("maven") {
      pom {
        name = "utils-cli"
        url = "https://github.com/wdtve/utils"
        groupId = "org.wdt.utils.cli"
        artifactId = "utils-cli"
        version = project.version.toString()
        developers {
          developer {
            id = "Wdt~"
            name = "Wdt~"
            email = "yuwenshuxue1@outlook.com"
          }
        }
        from(components["kotlin"])
      }
    }
  }
}

java {
  targetCompatibility = VERSION_1_8
  sourceCompatibility = VERSION_1_8
}

kotlin {
  jvmToolchain(8)
}

tasks.test {
  useJUnitPlatform()
}