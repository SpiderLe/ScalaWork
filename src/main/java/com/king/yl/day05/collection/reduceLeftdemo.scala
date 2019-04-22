package com.king.yl.day05.collection

object reduceLeftdemo {

  def main(args: Array[String]): Unit = {
    val list = List(2,3,4,1,100,0,5,7)
    val res01 = list.reduceLeft(sum)
    val res02 = list.reduceRight(sum)
    val res03:Int = list.reduceLeft(min)
    val res04:Int = list.reduceLeft(max)


//    println(res01)
//    println(res02)
//    println(res03)
    println(res04)
  }

  def sum(n1:Int, n2:Int):Int={
    n1 - n2
  }
  def min(n1:Int, n2:Int):Int={
     if(n1 > n2) n2 else n1
  }
  def max(n1:Int, n2:Int):Int={
     if(n1 < n2) n2 else n1
  }

}
