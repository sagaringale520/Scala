import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object patternWithOption {
  def main(args: Array[String]) {

    def pto(opt:Option[String]):String={
      opt match{
        case Some(value) => s"$value"
        case None => "empty"
      }
    }

    //var input=pto(Some("test"))
    var input=pto(None)
    print(input)

  }
}