package com.king.yl.task.point

/***
  *  定义一个 Point 类和一个伴生对象,
  *  使得我们可以不用 new 而直接用 Point(3,4)
  *  来构造 Point 实例
  */

class Point(px:Double, py:Double) {

  var x = px
  var y = py

}

object Point{

  //apply
  def apply(px:Double,py:Double):Point = new Point(px:Double,py:Double)

}

