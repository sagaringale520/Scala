import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object PatternMatching1 {


  def main(args: Array[String]): Unit = {
    var counter = 1
    var num = 5
    if (num == 1) {
      print(s"Factorial of $num is $counter")
    }
    else {}
    var result = for (i <- 1 to num) {
      counter = counter * i
    }
    print(s"Factorial of $num is $counter")
  }

  }