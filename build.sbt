organization := "com.github.plippe"
name := "scalatra-standalone"

version := "0.0.3-SNAPSHOT"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.5.0",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210"
)

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo := Some("Sonatype Snapshots Nexus" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")
publishMavenStyle := true
publishArtifact in Test := false

pomIncludeRepository := { _ => false }
pomExtra := {
  <url>https://github.com/Plippe/scalatra-standalone</url>
    <licenses>
      <license>
        <name>Don't be a dick</name>
        <url>http://www.dbad-license.org/</url>
      </license>
    </licenses>
    <scm>
      <url>github.com/Plippe/scalatra-standalone.git</url>
    </scm>
    <developers>
      <developer>
        <name>Philippe Vinchon</name>
        <url>https://github.com/Plippe</url>
      </developer>
    </developers>
}
