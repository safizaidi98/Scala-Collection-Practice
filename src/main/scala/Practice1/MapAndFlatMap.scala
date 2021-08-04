package Practice1

object Practice3 {

  def main(args: Array[String]): Unit = {

    def upperCase(list : List[String]) : List[String] ={
      list match {
          case Nil => List[String]()
          case head :: tail => head.toUpperCase :: upperCase(tail)
      }
    }

    val firstYear = List("jan", "feb", "march")

//    println(upperCase(firstYear))
    println( firstYear
      .map( x => x.toUpperCase())
        .map(x => x.substring(0, 3))
    )


    val apple = new Phone("Apple", List("IphoneX", "Iphone 8"))
    val google = new Phone("Google", List("Pixel 1", "Pixel 2"))

    val phoneList = List(apple, google)

    println(phoneList.map( x => x.models))
    println(phoneList.flatMap( x => x.models))


    val fact = (input: Int) => if( (input / 3.0).isWhole() ){
      Some(input)
    } else None


//    val myList =
      println(List.range(1, 11).map( x => fact(x)))
      println(List.range(1, 11).flatMap( x => fact(x)))




  }

}

class Phone(val name : String, val models : List[String])