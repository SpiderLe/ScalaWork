package com.king.yl.day05.collection

object filterdemo01 {

//  过滤出A开头的字母



  def main(args: Array[String]): Unit = {
    val names:List[String] = List("Tom", "ABCV","JacK", "Heool","Aick","AHB")

    val newnames = names.filter(startWithA)
    println(newnames)
  }

  def startWithA(str:String): Boolean = {

    str.startsWith("A")
  }
}
