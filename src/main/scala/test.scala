import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object test {
  def main(args: Array[String]) {
    val spark = SparkSession.builder.master("local[*]").appName("test").getOrCreate()
    //    val ssc = new StreamingContext(spark.sparkContext, Seconds(10))
    val sc = spark.sparkContext

    import spark.implicits._
    import spark.sql

    sc.setLogLevel("ERROR")

    val a=Array (1,2,3,4)

    val rdd1=sc.parallelize(a)
    rdd1.foreach(println)


    spark.stop()
  }
}