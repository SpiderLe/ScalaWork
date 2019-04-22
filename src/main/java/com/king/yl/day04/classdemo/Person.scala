package com.king.yl.day04.classdemo

class Person {

  var name: String = _
  val age: Short = 25
  protected val iphone:String = "123121231"
  private var address: String = _
  protected val call: String = "11111125200"

  def sayhi = {
    print("Hi!")
  }

  private def saybay = {
    print("baybay!")
  }

  protected[classdemo] def eat = {
    print("eat!")
  }
}

object Person {

  val person = new Person
  person.address
  person.eat
  person.iphone

}

class Son extends Person {

  def demo = {
    this.iphone
    this.eat
  }

}

object Son {
  def main(args: Array[String]): Unit = {

    val son = new Son
    son.name
    son.iphone


    son.eat

  }
}


