package com.king.yl.day05.collection

object scanerdemo01 {

  def main(args: Array[String]): Unit = {

    val res01 = (1 to 5).scanLeft(5)(sub)
    val res02 = (1 to 5).scanRight(5)(sum)
    val res03 = (1 to 5).scan(5)(sum)
    val res04 = (1 to 5).scanLeft(5)(sum)



    println(res01)
    println(res02)
    println(res03)
    println(res04)

  }

  def sub(n1:Int,n2:Int):Int={

    n1-n2
  }
  def sum(n1:Int,n2:Int):Int={

    n1+n2
  }
}
