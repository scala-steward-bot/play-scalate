scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")

resolvers += Resolver.typesafeRepo("releases")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.5")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.6")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.1.1")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.1")

