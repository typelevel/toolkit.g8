lazy val root = (project in file("."))
  .settings(
    name := "Typelevel Toolkit template",
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns),
    ThisBuild / githubWorkflowPublishTargetBranches := Seq(),
    ThisBuild / githubWorkflowScalaVersions         := Seq("2.12"),
    ThisBuild / githubWorkflowBuild                 :=
      Seq(WorkflowStep.Sbt(List("g8Test"), name = Some("Testing template"))),
  )
