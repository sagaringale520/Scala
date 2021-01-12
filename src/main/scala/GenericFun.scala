import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object GenericFun {
  //def discount(dis:String)={if(dis=="ABC"){println(10)}else println(5)}
  //def discount(dis:Int)={println(dis)}

def discount[T](dis: T) ={
  dis match{
    case a:String=>{if(dis=="ABC"){10}else 5}
    case b:Int => {dis}
    case _ => "discount not applied"
  }
}

  def main(args: Array[String]) {
//discount("NEW")
//discount(50)
    println(discount("ABC"))
    println(discount("NEW"))
    println(discount(50))
    println(discount(50.0))
  }
}