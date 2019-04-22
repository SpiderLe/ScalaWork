package com.king.yl.day04.classtest

object MethodExce {

  def main(args: Array[String]): Unit = {

//    println(printStart2(5.3,5.25))

    oddOrOu(6)
  }

  def printStart(a:Int,b:Int)={

    for (elem <- 1 to a) {
      for (elem <- 1 to b) {
        print("*")
      }
      println()
    }
  }
  def printStart2(a:Double,b:Double):Double={
    for (elem <- 1 to 5) {
      for (elem <- 1 to 5) {
        print("*")
      }
      println()
    }
    var len :Double= a
    var width =b
//    var area = len*width
    (len*width).formatted("%.2f").toDouble
  }

  def oddOrOu(a:Int)={

    if(a%2==0) println("ou")
    else println("odd")

  }

}

