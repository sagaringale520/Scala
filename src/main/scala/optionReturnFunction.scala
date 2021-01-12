import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object optionReturnFunction {

  def main(args: Array[String]): Unit = {
    var month = "january"
    val season = month match {
      case x if (x.contains("jan")) => "winter"
      case _  => "summer"
    }
    println(s"The season is : $season")
  }

  }
