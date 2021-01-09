import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object loopWhileDo {
  def main(args: Array[String]) {
var a=5;
    var b=10;



    do
    {
      println(b)
      b=b-1
    } while (b <= 10 && b >= 5)

  }
}