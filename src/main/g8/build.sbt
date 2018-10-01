import Dependencies._

lazy val root = (project in file(".")).
  enablePlugins(CucumberPlugin).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "$scala_version$",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "$name$"
  )
  // test dependencies
  .settings(
  libraryDependencies ++= cucumber,
  libraryDependencies += scalaTest,
    CucumberPlugin.monochrome := false,
    CucumberPlugin.glue := "classpath:steps",
    CucumberPlugin.features := List("classpath:features")
  )