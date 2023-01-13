name := """challengeapi"""
organization := "challengeapi"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava, LauncherJarPlugin)

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  guice,
  javaJpa,
  ehcache,
  javaWs,
  filters,
  "org.junit.jupiter" % "junit-jupiter-engine" % "5.9.1" % Test,
  "org.junit.jupiter" % "junit-jupiter-api" % "5.9.1" % Test
)

