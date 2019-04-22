package com.king.yl.day04.playgame

object Showplayers {

  def main(args: Array[String]): Unit = {
    val tom = new Player("Tom")
    val jack = new Player("jack")
    val jim = new Player("jim")

    Player.joingame(tom)
    Player.joingame(jack)
    Player.joingame(jim)

    Player.shownum
  }


}

class Player(pname: String) {

  val name = pname

}

object Player {

  var playerNum: Int = 0

  def joingame(p: Player) = {
    printf("%s 加入游戏！", p.name)
    playerNum += 1
  }

  def shownum = {
    printf("当前有 %d个Player!", playerNum)
  }
}