package com.king.yl.day03.matchDemo.caseDemo01

object CaseDemo01 {

  def main(args: Array[String]): Unit = {
//    val amt = Currency(29.95, "RMB")
//    val amt1 = amt.copy() //创建了一个新的对象，但是属性值一样
//    val amt2 = amt.copy(value = 19.95) //创建了一个新对象，但是修改了货币单位
//    val amt3 = amt.copy(unit = "英镑")//..
//    println(amt)
//    println(amt2)
//    println(amt3)


    List(1, 3, 5, 9) match { //修改并测试
      //1.两个元素间::叫中置表达式,至少first，second两个匹配才行.
      //2.first 匹配第一个 second 匹配第二个, rest 匹配剩余部分(5,9)
      case first :: second :: rest => println(first +" "+ second +" " + rest.length + " "+ rest) //
      case _ => println("匹配不到...")
    }


  }

}



abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount
case object NoAmount extends Amount
