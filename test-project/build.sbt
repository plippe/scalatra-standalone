scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.5.0",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

enablePlugins(JettyPlugin)

libraryDependencies += "com.github.plippe" %% "scalatra-standalone" % "0.0.1-SNAPSHOT"
mainClass in (Compile, run) := Some("com.github.plippe.scalatra.standalone.JettyLauncher")