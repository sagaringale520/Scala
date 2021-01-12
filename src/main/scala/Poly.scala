import org.apache.spark.sql._
import org.apache.spark.sql.functions._

class Poly {
  def sum(a:Int,b:Int)={a+b}
  def sum(a:Int,b:Int,c:Int)={a+b+c}
  def sum(a:Double,b:Double)={a+b}


}

object Poly {
  def main(args: Array[String]) {

    val a=new Poly
    println(a.sum(1,2))
    println(a.sum(1,2,3))
    println(a.sum(10.0,20.0))

  }
}