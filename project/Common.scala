import sbt._
import Keys._

object Common {

  val settings: Seq[Def.Setting[_]] = Seq(
    organization := "com.app",
    version := "0.1",
    scalaVersion := "2.12.8",
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-unchecked",
      "-language:existentials",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:postfixOps",
      "-Xfuture",
      "-Ypartial-unification"
    )
  )

}
