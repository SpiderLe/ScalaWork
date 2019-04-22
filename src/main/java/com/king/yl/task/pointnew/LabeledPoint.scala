package com.king.yl.task.pointnew

class LabeledPoint() extends PointNew {

  var labeled : String = _
//  override var x = _
//  override var y = _

  def this(p_labeled:String, px:Double, py:Double){
    this()
    var labeled : String = p_labeled
  }

}
