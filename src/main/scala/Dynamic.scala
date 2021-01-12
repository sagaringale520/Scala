import org.apache.spark.sql._
import org.apache.spark.sql.functions._
class A {

  def disp()={println("this is parent class")}

}

class B extends  A{

  override def disp()={println("this is child class")}
super.disp()
}


object Dynamic {
  def main(args: Array[String]) {

    var a=new A;
    var b=new B;


    b.disp()

  }
}