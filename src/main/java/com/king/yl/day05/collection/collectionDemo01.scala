package com.king.yl.day05.collection

import scala.collection.mutable.{ArrayBuffer, ListBuffer, Queue}

import scala.collection.mutable


object collectionDemo01 {

  def main(args: Array[String]): Unit = {

//    Set
    /*val s1 = Set(1,2,3)
    val s2 = mutable.Set(1,2,3,4,"kk")
    s2.add("lklkl")
    s2 += 33
    s2 -= 1
    s2.remove(4)
    println(s2)
    for (elem <- s1) {
      var e = elem + "%"
      println(e)
    }*/


//    Map
    val m1 = Map("Hello"->1, "Scala"->2)
    val m2 = mutable.Map("Hello"->1, "Scala"->2,"jjjj"->3)
    m2("zzz") = 44
    m2 += ("cccc"->555)
//    m2 -= ("cccc","zzz")
    m1 + ("Hello"-> 100)
    m1 + ("ssm" -> 250)
//    for(v <- m2){println(v)}
//    for(v <- m2.keys){println(v)}
//    for(v <- m2.values){println(v)}

    println(m1)


//    println(m2)




//    println(m2.get("Hello").get)
//    println(m2.getOrElse("Hello", 101))

    /*if(m2.contains("ee")){
      println(m2("ee"))
    }else{
      println("no word!")
    }*/


//    对偶元组
//    val m3 = mutable.Map(("tom",10),("kack",20),("hah",30))
//    println(m3("tom"))


//    队列
   /* val q1 = new mutable.Queue[Int]
    val list01 = List(1,2,3)
    q1 += 9
    q1 ++= list01
    println(q1)
    val a = q1.dequeue()
    val b = q1.enqueue()
    println(a+ "======"+b)*/

//    可变ListBuffer
    /*val list01 = ListBuffer(1,2,3,"kkk")
    val list02 = list01 :+ 100
    println(list01)
    println(list02)

    println(list01.remove(3))
    println(list01)*/



//    不可变List
   /* val nil = Nil
    print(nil)
    val list01 = List(1,2,3,4,"Hello")
    println(list01(0))
    val list02 = 100 +: list01
    println(list02)

    val list03 = 300::11::list01:::list02:::Nil
    println(list03)*/


/*//    元组
    val t1 = (1,2,3,4,"Hello")
    println(t1._1)
//    println(t1.productElement(0))
//    遍历元组
    for (elem <- t1.productIterator) {println(elem)}*/


//    多维数组
//    val arr3 = Array.ofDim[Int](3,4)
//    arr3(0)(0) = 100
//    for(item <- arr3){
//      for (e <- item){
//        print(e+" ")
//      }
//      println()
//    }


//    val arr = new Array[Int](5)
//
//
//    val arr1 = Array(1,2,3,4)
//    for (i <- arr1) {
//      println(i)
//    }
//
//    for(i <- 0 to arr1.length-1){
//      println(arr1(i))
//    }

//    val arr2 = ArrayBuffer[Int]()
//    arr2.append(10)
//    println(arr2(0))
//    println(arr2.hashCode())
//    arr2.append(20)
//    println(arr2.hashCode())

//    println(arr1.reduce(_ + _))
//    println(arr1.reduce((r, c) => r + c))

//    模拟mkString


  }



}
