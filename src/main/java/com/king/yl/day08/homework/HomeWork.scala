package com.king.yl.day08.homework

object HomeWork {

  def main(args: Array[String]): Unit = {

        println(change01(10, Array(1, 2)))

    //    println(swap(Array(1,2,3)).mkString(", "))

//    println(listSum(List(Some(1), None, Some(11), None, Some(10), None)))
//    println(listSum02(List(Some(1), None, Some(11), None, Some(10), None)))

//    println(leafsum(Node(Leaf(10), Node(Node(Leaf(20),Leaf(30)),Leaf(50)))))
//    val tree = List(List(3, 8), 2, List(5))
//    println(leafsum02(tree))




  }

  //5. 大公司面试题: 使用递归
  //假设某国的货币有若干面值，现给一张大面值的货币要兑换成零钱，问有多少种兑换方式

  def change01 (money:Int,coins : Array[Int]):Int={

    if(money==0) {
      1
    }else if(money < 0 || coins.length == 0) {
      0
    }else{
      change01(money, coins.tail) + change01(money-coins.head, coins)
    }
  }

//  def change(money: Int, coins: Array[Int]): Int = {
//
//    if (money == 0) {
//      1
//    } else if (money <= 0 || coins.length == 0) {
//      0
//    } else {
//      change(money, coins.tail) + change(money - coins.head, coins)
//    }
//  }

  //  1. 利用模式匹配，编写一个 swap 函数，交换数组中前两个元素的位置，前提条件是数组长度至少为2
  def swap(array: Array[Int]): Array[Int] = {

    if (array.length <= 2) {
      throw new RuntimeException
    }
    array match {
      case Array(f, s, rest@_*) => Array(s, f) ++ rest
    }
  }

  //  2. 编写一个函数，计算List[Option[Int]] 中所有非None值之和。分别使用 match和不适用match来计算
  def listSum(list: List[Option[Int]]): Int = {

    var sum = 0
    list.foreach {
      case Some(a) => sum += a
      case None =>
    }
    sum
  }

  def listSum02(list: List[Option[Int]]): Int = {

    list.foldLeft(0)({
      case (r, Some(a)) => r+a
      case (r, None) => r
    })
  }

  /**
    * 3. 我们可以用列表制作只在叶子节点存放值的树。举例来说，列表((3 8) 2 (5)) 描述的是如下这样一棵树：
    * *
    * /|\
    * *  *
    * /\   |
    * 3  8  5
    * List[Any] = List(List(3, 8), 2, List(5))
    * 不过，有些列表元素是数字，而另一些是列表。在Scala中，你必须使用List[Any]。
    * 编写一个leafSum函数，计算所有叶子节点中的元素之和.
    */
  def leafsum(tree:MyTree):Int={

    tree match {
      case Leaf(n) => n
      case Node(left,right) => leafsum(left) +leafsum(right)
    }

  }

  def leafsum02(tree:List[Any]):Int={

    var sum = 0
    tree.foreach{
      case a:Int => sum += a
      case list:List[_] => sum += leafsum02(list)
    }

    sum
  }




}
sealed abstract class MyTree
case class Leaf(value : Int) extends MyTree
case class Node(left: MyTree, right: MyTree) extends MyTree




