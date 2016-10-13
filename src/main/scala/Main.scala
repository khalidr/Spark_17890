import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


object Main extends App{

  val conf = new SparkConf()
  conf.setMaster("local")
  val session = SparkSession.builder()
    .config(conf)
    .getOrCreate()

  import session.implicits._

  val df = session.sparkContext.parallelize(List(1,2,3)).toDF

  println("flatmapping ...")
  df.flatMap(_ => Seq.empty[Foo])

  println("mapping...")
  df.map(_ => Seq.empty[Foo]) //spark-submit fails here

}
object Main1 extends App{

  val conf = new SparkConf()
  conf.setMaster("local")
  val session = SparkSession.builder()
    .config(conf)
    .getOrCreate()

  val rdd = session.sparkContext.parallelize(List(1,2,3))

  println("flatmapping ...")
  rdd.flatMap(_ => Seq.empty[Foo])

  println("mapping...")
  rdd.map(_ => Seq.empty[Foo]) //works fine when using an RDD

}
case class Foo(value:String)
