ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .settings(
    name := "SparkRDDLab",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "3.5.3"
    )
  )