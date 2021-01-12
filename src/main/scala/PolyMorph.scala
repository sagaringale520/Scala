import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object PolyMorph {
  def sum(a:Int,b:Int)={println("first")}
  def sum(a:Int,b:Int,c:Int)=println("second")
  def sum(a:Double,b:Double)=println("third")
  def main(args: Array[String]) {
//call
    println(sum(10,20))
    println(sum(10,20,30))
      println(sum(10.0,20.0))



  }
}