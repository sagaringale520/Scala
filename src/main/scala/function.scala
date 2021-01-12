import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object function {
  //def test(a:Int=5,b:Int):Int = { a * 20 }

  def Tprice(unit:Int,price:Double,dis:Option[Double]=Some(0.0)):Double={
    dis match{
      case Some(x)=> unit * price * ( 1 - (x/100))
      case None => unit*price
    }
  }
  def main(args: Array[String]) {

   print(Tprice(2,10.0,None))
   print(Tprice(2,10.0,Some(20.0)))
   print(Tprice(2,10.0))
  }
}