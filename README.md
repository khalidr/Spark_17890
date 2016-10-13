## General Info
See https://issues.apache.org/jira/browse/SPARK-17890

## Building
    sbt assembly

## Running
Failing runtime test that uses a DataFrame:
    
    spark-submit --num-executors 1 --executor-cores 1 --class Main1 target/scala-2.11/Spark_17890-assembly-1.0.jar
    
Successful runtime test that uses an RDD:
    
    spark-submit --num-executors 1 --executor-cores 1 --class Main target/scala-2.11/Spark_17890-assembly-1.0.jar
   