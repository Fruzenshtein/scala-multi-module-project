githubOwner := "Fruzenshtein"
githubRepository := "scala-multi-module-project"
githubTokenSource := TokenSource.Environment("GITHUB_TOKEN")
githubActor := sys.env.get("GITHUB_ACTOR").getOrElse("Fruzenshtein")

lazy val common = project.in(file("common"))
  .settings(name := "common")
  .settings(Common.settings)

lazy val util = project.in(file("util"))
  .settings(name := "util")
  .settings(Common.settings)

lazy val app = project.in(file("."))
  .settings(name := "multi-module-lib")
  .settings(Common.settings)
  .dependsOn(common, util)