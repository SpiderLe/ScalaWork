package com.king.yl.day03.matchDemo

object match01 {



  def main(args: Array[String]): Unit = {

//    val num : Double = Square(5.0)
//
//    num match{
//      case Square(n) => println(("匹配成功！n = " + n))
//      case _ => "匹配失败！"
//    }
//
//    val namestr = "tom,jack,your"
//
//    namestr match {
//      case Names(a,b,c) => {printf(s"$a,$b,$c")}
//      case _ => println("匹配失败")
//    }

    val user = Map("Tom"->20,"jack"->29)

    for((name,age) <- user if age >= 25){
      println(name+" : " + age)
    }




    //    for (ch <- "+-3!") {
    //      var sign = 0
    //      var digit = 0
    //      ch match {
    //        case '+' => sign = 1
    //        case '-' => sign = -1
    //        // 说明..
    //        case _  => digit = 3
    ////        case _  => sign = 2
    //      }
    //      //
    //      println(ch + " " + sign + " " + digit)
    //    }

    //匹配数组
//        var arr = Array(0)
//
//        arr match{
//          case Array(0) => arr =Array(0)
//          case Array(0, _) => "0 kaitou"
//
//
//          case Array(x,y) => arr=Array(y,x)
//          case _ => print("error!")
//
//        }
//
//        println(arr(0))

    /**
      * 匹配列表
      */
//    for (list <- Array(List(0), List(1, 0), List(88), List(0, 0, 0), List(1, 0, 0))) {
//      val result = list match {
//        case 0 :: Nil => "0" //
//        case x :: y :: Nil => x + " " + y //
//        case 0 :: tail => "0 ..." //
//        case x :: Nil => "x = " + x
//        case _ => "something else"
//      }
//      println(result)
//    }

//    for(pair <- Array((0,1),(1,0),(10,30),(1,1),(1,0,2))){
//      var result = pair match {
//        case (0, _) => "0..."
//        case (x, 0) => "x= "+x
//        case (x, y) => "( "+x+", " + y + " )"
//        case (x, 0,z) => "( "+x+", 0 ," + z+ " )"
//        case _ => "something else"
//      }
//      println(result)
//    }


  }
}

object Square{
  def unapply(a: Double): Option[Double] = {
    println("unapply被调用 "+ a)
    Some(math.sqrt(a))
  }

  def apply(a:Double) = a*a
}

object Names{
  def unapplySeq(str: String):Option[Seq[String]] = {
    if(str.contains(",")) Some(str.split(","))
    else None
  }
}