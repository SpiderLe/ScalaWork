package com.king.yl.day06.controabs

object Controabs {

  def main(args: Array[String]): Unit = {
    var i = 0
    mywhile(i<10){
      print(i+" ")
      i += 1
    }

  }

  def mywhile(flag: => Boolean)(f: => Unit): Unit = {

    if (flag) {
      f
      mywhile(flag)(f)
    }
  }

}
