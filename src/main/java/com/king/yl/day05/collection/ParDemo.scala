package com.king.yl.day05.collection

object ParDemo {

  def main(args: Array[String]): Unit = {

    val res01 = (0 to 100).map{case _ => Thread.currentThread().getName}.distinct
    val res02 = (0 to 100).par.map{case _ => Thread.currentThread().getName}.distinct

    println(res01)
    println("--------------------------")
    println(res02)
  }

}
