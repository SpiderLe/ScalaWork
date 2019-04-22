package com.king.yl.day05.task

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object AABBCCcount {

  //val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
  //1. 使用映射集合，统计一句话中，各个字母出现的次数
  //2. 返回: Map(H->{0}, e -> {1, 5, 6}, ...)   数字其实是下标
  def main(args: Array[String]): Unit = {

    val sentence = "AAAAAAABBCCCDDDD"
    val map1 = mutable.Map[Char,Int]()

    sentence.foldLeft(map1)(charCount)

    println(map1)

  }

//  1.统计一句话中，各个字母出现的次数
  def charCount(map:mutable.Map[Char,Int],c:Char):mutable.Map[Char,Int]={
    map += (c -> (map.getOrElse(c,0)+1))
  }

//  2.返回: Map(H->{0}, e -> {1, 5, 6}, ...)   数字其实是下标
//  def charIndex(map:mutable.Map[Char,ListBuffer[Int]],c : Char):mutable.Map[Char,ListBuffer[Int]]={
//
//
//
//  }
}
