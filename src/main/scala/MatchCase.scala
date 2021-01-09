object MatchCase extends App{
val month="feb"
  val season = month match{
    case "jan" | "feb" => "winter"
    case "mar"=> "summer"
    case "apr" => "summer"
    case _ => "rainy"
  }

  println(s"this is a $season")

}
