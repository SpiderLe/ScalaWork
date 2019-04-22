package com.king.yl.task.jiecheng

object Factorial {

  def main(args: Array[String]): Unit = {

    println(1 to 5 product)
    println(5!)
  }

  implicit def int2MyRichInt(n:Int):MyRichInt = {
      new MyRichInt(n)
  }

  class MyRichInt(n :Int) {
    def ! = {1 to n product}
  }

}

