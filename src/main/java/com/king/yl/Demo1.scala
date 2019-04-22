package com.king.yl

object Demo1 {

  def main(args: Array[String]): Unit = {

    println(a)
    println(b)
    println(c)

    println(a)
    println(b)
    println(c)

  }

  def a = {

    println("a...")
    1
  }

  val b = {
    println("b...")
    2
  }

  lazy val c = {
    println("c...")
    3
  }

}
