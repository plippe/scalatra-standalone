scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.5.0",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

enablePlugins(JettyPlugin)
