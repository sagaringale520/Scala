package Basic

object StringFunctions extends App{
  var s:String="sagar INGALE"
  
  println("size of String : " + s.size)
  println("drop(2) : " + s.drop(2))
  println("take(2) of String : " + s.take(2))
  println("length of String : " + s.length)
  println("foreach of String : " + s.foreach(print))
  println("Capatilize of String : " + s.capitalize)
  println("toUpperCase of String : " + s.toUpperCase)
  println("toLowerCase of String : " + s.toLowerCase)
  println("ReplaceAll of String : " + s.replaceAll("a","M"))
  println("replacde of String : " + s.replace("a","M"))
  println("split of String : " + s.split(" "))
  println("toType of String : " + "100".toInt)
  println("CharAt of String : " + s.charAt(2))
  println("trim of String : " + s.trim)
  println("Contains of String : " + s.contains("n"))
  println("DropRight2 of String : " + s.dropRight(2))
  println("ReplaceFirst of String : " + s.size)
  println("repleceFirst of String : " + s.replaceFirst("a", "M"))
  println("startWith of String : " + s.startsWith("s"))
  println("endWith of String : " + s.endsWith("E"))
  println("takeRight2 of String : " + s.takeRight(2))
}