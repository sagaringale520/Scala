object Car extends App {
  def discount[T](dis: T) {
    dis match {
      case x: String => {
        if (x == "ABC") {
          println(10)
        } else {
          println(5)
        }
      }
      case x: Int => {
        println(s"discount is $x")
      }
      case _ => println("invalid code")
    }


    println(discount("ABC"))
    println(discount("NEW"))
    println(discount(50))
    println(discount(20.5))

  }
}