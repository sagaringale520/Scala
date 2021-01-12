object Varargs {
  def main(args: Array[String]): Unit = {
    def AV(name:String*)={for (i <- name) {println(i)}}

    AV("Sagar","Ingale","Pune")


  }
}
