name := """server"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  filters,
  "org.firebirdsql.jdbc" % "jaybird" % "2.2.5" pomOnly(),
  "org.codehaus.jackson" % "jackson-mapper-asl" % "1.8.5",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.pauldijou" %% "jwt-play" % "0.9.0"
)

ivyConfiguration ~= { originalIvyConfiguration =>
  val config = originalIvyConfiguration.asInstanceOf[InlineIvyConfiguration]
  val ivyHome = file("./.ivy2")
  val ivyPaths = new IvyPaths(config.paths.baseDirectory, Some(ivyHome))
  new InlineIvyConfiguration(ivyPaths, config.resolvers, config.otherResolvers,
    config.moduleConfigurations, config.localOnly, config.lock,
    config.checksums, config.resolutionCacheDir, config.updateOptions, config.log)
}

resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

fork in run := true