name := "JobcoinMixer"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "spray repo" at "http://repo.spray.io"

val SPRAY_VERSION = "1.3.2"

libraryDependencies ++=
  Seq(
    "io.spray" %% "spray-json" % SPRAY_VERSION,
    "io.spray" %% "spray-routing" % SPRAY_VERSION,
    "io.spray" %% "spray-client" % SPRAY_VERSION,
    "io.spray" %% "spray-can" % SPRAY_VERSION,
    "com.typesafe.slick" %% "slick" % "3.1.1",
    "org.slf4j" % "slf4j-nop" % "1.6.4",
    "com.typesafe.akka" %% "akka-actor" % "2.4.14",
    "com.h2database" % "h2" % "1.4.193",
    "mysql" % "mysql-connector-java" % "6.0.5",
    "org.json4s" % "json4s-native_2.11" % "3.5.0"
  )

