name := "project-name"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq (

)

//To use the InjectedRoutesController
//routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)
