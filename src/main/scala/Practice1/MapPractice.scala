package Practice1

object MapPractice {

  def main(args: Array[String]): Unit = {

    val firstYear = List("Jan", "Feb", "March")
    var SecondYear = List("Apr", "May", "June")

    println(firstYear ::: SecondYear)
    println(firstYear ++ SecondYear)

    println(firstYear.size)


    for(i <- firstYear){
      println(firstYear)
    }

//    --------------------- ANOTHER WAY "OUR WAY" ---------------------------------

//    var i = 0
//    for(i <- i until firstYear.length){
//      println(firstYear)
//    }

    val numbers = List.range(1, 11)

    println(numbers)
    println( numbers.map( x => x * 2) )

    println(firstYear.map(x => x.substring(0, 1)))

    val newNum = List(1, 4, 2, 89, 22)

    println(newNum.sorted)
    println(newNum.reverse)




  }
}
