package com.king.yl.day05.collection

object collectionDemo02 {

  def newlist(n:Int): Int = n*2

  def main(args: Array[String]): Unit = {

//    val list1 = List[Int](2,3,4)
//    var list2 = List[Int]()
//    for (e <- list1){
//      list2 = list2 :+ e*2
//    }
//    println(list2)
//    val list3 = list1.map(newlist)
//    println(list3)

    var mylist = myList()
    val mylist2 = mylist.map(multipe)
    println(mylist2)

  }

  def multipe(n: Int):Int={
    println("multipe被调用！")
    n*n
  }

}


class myList{
  val list1 = List[Int](2,3,4)
  var list2 = List[Int]()
  def map(f:(Int)=>Int):List[Int]={
    for(item <- list1){
      list2 = list2 :+ f(item)
    }
    list2
  }

}
object myList{
  def apply(): myList = new myList()
}
