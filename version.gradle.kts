allprojects {
  if (findProperty("otel.stable") != "true") {
    version = "1.11.0-alpha-SNAPSHOT"
  } else {
    version = "1.11.0-SNAPSHOT"
  }
}