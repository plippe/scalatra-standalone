organization := "com.github.plippe"
name := "scalatra-standalone"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.5.0",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210"
)
