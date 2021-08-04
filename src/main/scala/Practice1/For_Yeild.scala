package Practice1

object For_Yeild {

  def main(args: Array[String]): Unit = {


    val book = List(
      new forYeildBook("Programming in Scala", "artima", 22.3),
      new forYeildBook("Scala for Impatient", "artimaaaaaaaaa", 44.3),
      new forYeildBook("Scala Cookbook", "matha", 22222.3)
    )

    println(book
      .filter(Book => Book.cost < 30.0)
      .map(Book => Book.name)
    )

    var a = for (b <- book if (b.cost < 30.0)) yield ("Publication : " + b.publication, "Name : " + b.name)
    println(a)

    val s8 = new Model("S8", 689.00, 5.8)
    val s8Plus = new Model("S8+", 779.00, 6.2)

    val IphoneX = new Model("IphoneX", 999.00, 5.8)
    val Iphone8 = new Model("Iphone8", 689.00, 5.8)
    val Iphone7 = new Model("Iphone7", 999.00, 5.8)

    val samsung = new Phone("Samsung", List(s8, s8Plus))
    val Apple = new Phone("Apple", List(Iphone8, IphoneX))

    val phones = List(samsung, Apple)

    println()
    println()
    println()
    println()

//    println(
//      phones
//        .flatMap(x => x.models.filter(
//          ph => ph.price < 700
//        )
//        )
//        .map(x => x.)
//
//    )


    println(
      phones
        .flatMap( x => x.models.filter(
            xy => xy.price < 700
          ).map( ph => s"(${ph.name} ,${x.companyName})") )
    )
    println()
    println()

    println(
      for {
        ph <- phones
        md <- ph.models if md.price < 700
      } yield s"( ${ph.companyName}, ${md.name} )"
    )


    println()
    println()

    var abc =
      for{
        ph1 <- phones
        ph2 <- phones if ph1.companyName == ph2.companyName
        md1 <- ph1.models
        md2 <- ph2.models if md1.name != md2.name && md1.size < 6.0 && md2.size < 6.0
      } yield (ph1.companyName)

    println(abc.distinct)



  }
}


class forYeildBook(val name: String, val publication: String, val cost: Double)

class Model(val name: String, val price: Double, val size: Double)

class Phone(val companyName: String, val models: List[Model])
