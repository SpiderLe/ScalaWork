package com.king.yl.day04.fun01

object funDemo {

  def main(args: Array[String]): Unit = {

//    偏函数
    val list3 = List(1, 2, 3, 4,1.2,"ABC").collect{
      case i: Int => i + 1
      case i:Double => i*2
    }
//    println(list3)

    val name = List("Tom", "Hello", "JAcK")
    val newName:List[String] = name.map(toUpper)
    println(newName)

    val newName1:List[String] = for(str <- name) yield str.toUpperCase
    println(newName1)


  }

  def toUpper(str:String): String ={

    str.toUpperCase

  }
}
