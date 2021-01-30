package Basic

object ForLoop extends App{
  //assigned numeric range Binding
  //for ( i <- 1 to 5)
    //println(i)
    
    val dayOfWeek:List[Int]=List(1,2,3,4,5,6,7)
    
    //value Binding
   for (p <- dayOfWeek){
     println (p)
     if (p==6 || p==7)
       println("Its WeekEnd")
   }
    
    //for loop expression
    val p=for (i <- 1 to 5) yield i*3
    print(p)
    
    //for loop with if condition
    for (a <- 1 to 5 if a==5)
    {
      println("value 5 is present in loop")
    }
    
    //Nested For Loop
    for (i <- 1 to 5) 
    {
      for (j <- 1 to 10)
      {
        println(i * j)
      }
    }
      
}

