name := "Spark_17890"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.0.0"
val jsonVersion = "3.2.11"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % Provided,
  "org.apache.spark" %% "spark-sql" % sparkVersion % Provided,
  "org.apache.spark" %% "spark-hive" % sparkVersion % Provided,
  "org.apache.spark" %% "spark-yarn" % sparkVersion % Provided
)

mainClass in assembly := Some("Main")