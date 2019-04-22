package com.king.yl.day05.collection

object folddemo01 {

  def main(args: Array[String]): Unit = {

    val list = List(1,9)


    val res01 = list.foldLeft(1)(minus)   //-9

    val res = (1 /: list)(minus)          //-9

    val res02 = list.foldRight(2)(minus)  //-6

    val res03 = (list :\ 2)(minus)         //-6


    println(res)
    println(res01)
    println(res02)
    println(res03)

  }
  def minus(n1:Int, n2:Int):Int={
    n1 - n2
  }

}
