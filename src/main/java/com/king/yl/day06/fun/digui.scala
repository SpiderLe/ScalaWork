package com.king.yl.day06.fun

object digui {

//  斐波那契数列
//  1 1 2 3 5 8 13 ...
  def main(args: Array[String]): Unit = {

  var list = List(1,2,3,4)

  println(fibo(3))

}

//  普通递归
  def fibo(n:Int):Int={
    if (n<=2) 1
    else fibo(n-1) + fibo(n-2)
  }

//

}
