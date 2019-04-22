package com.king.yl.constructor

import scala.beans.BeanProperty


object SpiderMan {

  def main(args: Array[String]): Unit = {

//    val spiderMan = new Person("Tom",27)
//
//    printf(s"My name is %s, I'm %d!",spiderMan.name,spiderMan.age)
    var person1 = new Person1("Tom")
    println(person1.name)

    var person2 = new Person2("jack")
//    println(person2.name)
//    println(person2.pname)
////    person2.pname = "kkkkk"
//    person2.name="jjjjj"
//    println(person2.pname)
//    println(person2.name)

    var person3 = new Person3("hong")
    person3.pname="hei"
    println(person3.pname)
    println(person3.name)

  }

}

class Person1(pname:String){

  @BeanProperty
  var name = pname
}
class Person2(val pname:String){
  @BeanProperty var name = pname
}
class Person3(var pname:String){
  var name = pname
}


