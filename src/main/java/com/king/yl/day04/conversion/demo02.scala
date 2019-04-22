package com.king.yl.day04.conversion

object demo02 {

  def main(args: Array[String]): Unit = {

      //DB1会对应生成隐式类
      implicit class DB1(val m: MySQL1) {
        def addSuffix(): String = {
          m + " scala"
        }
      }
      val mysql1 = new MySQL1
      mysql1.sayOk()
      //mysql1.addSuffix() ==> DB1$1(mysql1).addSuffix()
      //DB1$1(mysql1)返回的类型是 ImplicitClass$DB1$2
      println(mysql1.addSuffix())
    }//案例演示+说明


}

class MySQL1 {
  def sayOk(): Unit = {
    println("MYSQL sayOk")
  }
}

class DB1{}
