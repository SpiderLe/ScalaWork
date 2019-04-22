package com.king.yl.demo2

import scala.beans.BeanProperty

class User( name:String, age:Int) {

  private var value = 0
//  private[this] var value = 0

//  @BeanProperty var name:String = _

  def add() { value += 1 }

  def isLess(other:User)=value < other.value





}
