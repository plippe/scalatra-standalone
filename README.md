# Scalatra Standalone

[Scalatra][scalatra] is a simple, accessible and free web micro-framework.

Scalatra applications can be deployed to a [servlet container][scalatra-servlet-container]
or as [standalone applications][scalatra-standalone]. The later allows the applications
to easily be packaged, and deployed, but required some boilerplate.

This library adds the required boilerplate code for a standalone scalatra app.


### Installing scalatra-standalone

To add `scalatra-standalone` library to your application, a single update is required.

```sbt
// in build.sbt
libraryDependencies += "com.github.plippe" % "scalatra-standalone" % "x.y.z"
mainClass in (Compile, run) := Some("com.github.plippe.scalatra.standalone.JettyLauncher")
```

### Using scalatra-standalone

```sh
# Start application under default port, 8080
sbt run

# Start application under custom port
export PORT=9000
sbt run

# Package with [sbt-native-packager][sbt-native-packager]
sbt universal:packageBin
sbt docker:publishLocal
...
```

[scalatra]: http://scalatra.org
[scalatra-servlet-container]: http://scalatra.org//guides/2.5/deployment/servlet-container.html
[scalatra-standalone]: http://scalatra.org/guides/2.5/deployment/standalone.html
[sbt-native-packager]: https://github.com/sbt/sbt-native-packager