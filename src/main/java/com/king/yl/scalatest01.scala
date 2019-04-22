package com.king.yl

import scala.io.StdIn

object scalatest01 {

  def main(args: Array[String]): Unit = {


    var stu1 = new Person
    stu1.name = "ton"
    stu1.age = 23

    var stu2 = stu1
    stu1.name = "jack"

    println(stu2.name)
    //    for推导
    //    var arr = for(i <- 1 to 10 reverse ) yield i*i
    //    println(arr)

//    val a: Double = 25
//    print(sqrt(a))
    //    val str = StdIn.readLine("please input!")
    //    println(str)

    //    var a = 10
    //    val b : Double = a
    //    val c = "HELLO GOT!"
    //    val name =
    //      """
    //        |李四
    //        |yon
    //        |tom
    //        |yang""".stripMargin
    //    val age = 28
    //    println(c)
    //    printf("我是 %s, 今年 %d岁！", name, age)
    //    printf(s"我是 ${name+"father"}, 今年 ${age + 2}岁！")
    //
    //    def hello(): Unit ={
    //
    //    }
  }

  def sqrt(d: Double) = {
    if (d >= 0) {
      Math.sqrt(d)
    }else{
      throw new  NumberFormatException
    }
  }
}
class Person{
  var name : String = _
  var age : Int = _

}
