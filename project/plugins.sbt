addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.16.2")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }
addSbtPlugin("org.typelevel"             % "sbt-typelevel-github-actions" % "0.6.7")