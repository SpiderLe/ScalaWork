package com.king.yl.day03.matchDemo

object matchTest {

  def main(args: Array[String]): Unit = {

    val a = 10
    val b = 20
    var res:Double = 0

    val oper = '+'

    oper match{
      case '+' => res = a + b
      case '-' => res = a - b
      case '*' => res = a * b
      case '%' => res = a / b
      case _ => println("input error!")
    }
    println(res)
  }
}
