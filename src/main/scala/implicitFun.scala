import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object implicitFun {
  def main(args: Array[String]) {

    implicit val z = 3
    def multiply(a:Int)(implicit b: Int) = a * b

    // Implicit parameter will be passed here
    val result = (multiply(10)(20))

    // It will print 30 as a result
    println(result)
  }
}