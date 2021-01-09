import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import scala.util.Random

object Practice {
  def main(args: Array[String]) {


    var months=List("jan","feb","march")

    var season=for (month <- months) yield {
      {
        month match {
          case "jan" => "winter"
          case "feb" => "winter"
          case "march" => "winter"
        }
      }
    }
    print(season)


  }
}


