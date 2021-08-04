package Practice1

object Practice2 {

  def main(args: Array[String]): Unit = {

    def reverse(list : List[Int]) : List[Int] ={
      list match {
        case head :: tail => reverse(tail) :+ head
        case Nil => List[Int]()
      }
    }


    val myList = List.range(1, 11)
    println(reverse(myList))

    println(myList.head)

  }


}
