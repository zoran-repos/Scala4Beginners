// build.sbt
name := "Scala4Beginners"

version := "0.1"

scalaVersion := "3.5.0"

javacOptions ++= Seq("--release", "21")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.18" % Test
)