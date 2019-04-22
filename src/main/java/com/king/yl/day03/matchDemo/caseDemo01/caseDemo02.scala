package com.king.yl.day03.matchDemo.caseDemo01

object caseDemo02 {

  //给你一个集合val list = List(1, 2, 3, 4, "abc") ，请完成如下要求:
  //将集合list中的所有数字+1，并返回一个新的集合
  //要求忽略掉 非数字 的元素，即返回的 新的集合 形式为 (2, 3, 4, 5)

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, "abc")

//    println(list.filter(f1).map(f3).map(f2))

//    var newList = list.map(addOne)
//    println(newList)

    val partialFunction = new PartialFunction[Any, Int]{

      override def isDefinedAt(x: Any) = {
        println("x= " + x)
        x.isInstanceOf[Int]
      }


      override def apply(v1: Any): Int = {
        println("v1= " + v1)
        v1.asInstanceOf[Int] + 1
      }
    }

    val newList = list.collect(partialFunction)
    println(newList)


  }
  def addOne(n:Any): Any ={

    n match{
      case x:Int => x+1
      case _ =>
    }

  }

  def f1 (n:Any): Boolean ={

    n.isInstanceOf[Int]

  }

  def f2(n:Int): Int ={
    n*n
  }

  def f3(n:Any): Int = {
    n.asInstanceOf[Int]
  }

}
