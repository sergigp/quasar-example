name := "quasar-example"

version := "0.1"

scalaVersion := "2.12.4"

resolvers += Resolver.bintrayRepo("sergigp", "maven")

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.sergigp.quasar" %% "quasar" % "0.1.1",
  "org.scalatest" %% "scalatest" % "3.0.4" % Test,
  "org.scalamock" %% "scalamock-scalatest-support" % "3.6.0" % Test
)

addCommandAlias("c", "compile")

// Tests
addCommandAlias("tc", "test:compile")
addCommandAlias("t", "test")
addCommandAlias("to", "testOnly")
