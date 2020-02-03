


lazy val commonSettings = Seq(
  scalaVersion := "2.12.10",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test ,
  name := "Scala_lab1",
  version := "0.1"
)

lazy val `stage2-3` = project
  .in(file("stage2-3"))
  .settings(
    commonSettings
  )

lazy val `stage4` = project
  .in(file("stage4"))
  .settings(
    commonSettings
  )
lazy val `root` = project
  .in(file("."))
  .aggregate(`stage4`, `stage2-3`)


