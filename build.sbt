name := "spark-playground-sbt"

version := "0.1"

scalaVersion := "2.11.10"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.6"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.6"
// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.6" % "provided"

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "_" + sv.binary + "-"  + module.revision + "." + artifact.extension
}
