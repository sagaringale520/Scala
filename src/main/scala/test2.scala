import org.apache.spark.sql._
import org.apache.spark.sql.functions._

import scala.util.control.Breaks
import scala.util.control.Breaks.break
object test2 {
  def main(args: Array[String]) {

    for (i <- 1 to 10) {
    {
     /* if (i==5) break
      else println(i) */

      for (j <- 1 to 10 ) {
        print(i * j )
        print(" ")
      }
println()
    }

    }

    var a=45

  }
}