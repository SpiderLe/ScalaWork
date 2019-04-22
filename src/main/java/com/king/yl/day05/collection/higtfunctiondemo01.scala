package com.king.yl.day05.collection

object higtfunctiondemo01 {

  def main(args: Array[String]): Unit = {

    val names:List[String] = List("Tom", "JacK", "Heool")
    val newNames01 :List[String]= names.map(toUpper)
    val newNames02  = names.flatMap(toUpper)
    println(newNames01)
    println(newNames02)


  }

  def toUpper(str:String):String={

    str.toUpperCase
  }
}
