package Basic

 class A {
  
  val cl=10;
  
  def mydef():Unit={
    val d1=45;
    print(cl)
  }
}

object B extends App{
  val p=new A()
  //println(p.cl)
  //println(p.d1)  value not avalable in scope
  println(p.mydef)
  
}