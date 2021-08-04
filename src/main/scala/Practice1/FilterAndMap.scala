package Practice1

object Practice4 {
  def main(args: Array[String]): Unit = {

    //    def squr(list : List[Int]) : List[Int] = {
    //      list match {
    //          case Nil => List[Int]()
    //          case
    //      }
    //    }

    println(List.range(1, 101)
      .filter(n => Math.sqrt(n).isWhole())
      .filter(n => n > 60)
    )

    val book = List(
      new Book("Programming in Scala", "artima", 22.3),
      new Book("Scala for Impatient", "artimaaaaaaaaa", 44.3),
      new Book("Scala Cookbook", "matha", 22222.3)
    )

   println( book
     .filter(Book => Book.cost < 50.0)
       .map(Book => Book.name)
   )



    println( book
      .filterNot(Book => Book.cost < 50.0)
      .map(Book => (Book.name, "Publisher : " +Book.publication))
    )


    println(book
      .filter(newBook => newBook.name.contains("in"))
      .map(newBook => (newBook.name, newBook.publication))

    )




  }
}

class Book(val name: String,val publication: String, val cost: Double)