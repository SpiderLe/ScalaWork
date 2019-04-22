package com.king.yl.day07

object fortest {

  def main(args: Array[String]): Unit = {
    val r1 = 1 to 10
    println(r1.reverse)
    for (i <- r1) {
      print(i + " ")
    }

    println()

    // [1, 10) 前闭后开的区间
    val r2 = 1 until 10
    println(r2)
    for (i <- r2) {
      print(i + " ")
    }
  }

  val names = "tomjack"
  println(names)
  for (name <- names) {
    println(name)
  }

  //  for (i <- 1 to 9) {
  //    for (j <- i to 9) {
  //      print(j + " * " + i + " = " + i * j + "\t");
  //    }
  //    println
  //  }
  //
  //  for (i <- 1 to 9) {
  //    for (j <- 1 to i) {
  //      print(j + " * " + i + " = " + i * j + "\t");
  //    }
  //    println
  //  }

  for {
    i <- 1 to 9   // 后面的分号可以省略了
    j <- 1 to i
  } {
    print(j + " * " + i + " = " + i * j + "\t")
    if (i == j) println()
  }



}
