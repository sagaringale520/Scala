

object AnyValRef extends  App {
/*
  var a=5
  var l1=List(10)

  def printAny(x:Any)=println(x)
  def printAnyVal(x:AnyVal)=println(x)
  def printAnyRef(x:AnyRef)=println(x)

  printAny(a)
  printAny(l1)

*/

//2 inputs from user
  println("Enter First number")
  var num1=readInt()
  println("Enter Second number")
  var num2=readInt()

  // sum logic

  var result=num1+num2

  //result
println(s"the addition of $num1 and $num2 = $result")

 //var c ="the addition of" + $num1 +  "and" +  $num2 + "="  $result

  println(s"the addition of $num1 and $num2 = ${num1+num2}")

}