package com.king.yl.day04.conversion

object conversionDemo {

  def main(args: Array[String]): Unit = {
    var num : Int = 3.6f
    var num1:Double = 1
//    print(num1)

    implicit val str1: String = "jack"
//    implicit val name: String = "jjjjjjjjj"

    def hello(implicit name: String = "tom"): Unit = {



      println(name + " hello")
    }
    hello //调用.不带()
    //[案例演示+反编译]
  }

  implicit def f1(n:Double):Int={n.toInt}
  implicit def f2(n:Float):Int={n.toInt}




}
