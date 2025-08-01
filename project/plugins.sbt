scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")

resolvers += Resolver.typesafeRepo("releases")

addSbtPlugin("org.playframework" % "sbt-plugin" % "3.0.8")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.12.0")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.3.1")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.4")

evictionErrorLevel := Level.Warn
