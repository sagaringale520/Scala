object impPara extends  App {

  def Tprice(unit: Int, price: Double, dis: Option[Int]) = {
    dis match {
      case Some(value) => {
        var new_val = value.toFloat
        unit * price * (1 - new_val / 100)
      }
      case None => unit * price

      case _ => "invalid code"
    }
  }


  println(Tprice(10,10.0,Some(30)))
  println(Tprice(10,10.0,None))
 // println(Tprice(10,10.0,Some("test")))

}