package Practice1

object fold_reduce {

  def main(args: Array[String]): Unit = {

    var sum = (a : Int, b:Int) => a + b

    val list = List.range(0 ,6)

    println(list.map(x => x))
    println(list.foldLeft(0)( (result:Int, head:Int) => sum(result, head) ))
    println(list.foldLeft(0)( (result:Int, head:Int) => result + head ))
    println(list.foldLeft(0)( _+_ ))

    val houseRent = new SalaryComponent("benefit", 40)
    val medic = new SalaryComponent("benefit", 5)
    val pension = new SalaryComponent("deduction", 3)
    val IncTax = new SalaryComponent("deduction", 20)

    val component = List(houseRent, medic, pension, IncTax)

    val baseSalary : Double = 15000

    val values = component.foldLeft(baseSalary)( (amnt : Double, SalComp : SalaryComponent) =>
    SalComp.componentType match {
        case "benefit" => amnt * (1 + SalComp.amountPercentage/100)
        case "deduction" => amnt * (1 - SalComp.amountPercentage/100)

    }
    )

    println(values)







  }
}

class SalaryComponent(val componentType : String, val amountPercentage : Double)