package com.king.yl.task.puke

//♣,♦,♥,♠
object Huase extends Enumeration with App {

  val MeiHua = Value("♣")
  val FangPian = Value("♦")
  val HongTao = Value("♥")
  val HeiTao = Value("♠")

  println(Huase.MeiHua)
  println(Huase.FangPian)
  println(Huase.HongTao)
  println(Huase.HeiTao)

  def checkColor(c:Huase.Value): Unit ={
    if(c==Huase.MeiHua||c==Huase.HeiTao) print("Black!")
    else print("Red!")

  }

  checkColor(Huase.HeiTao)

}
