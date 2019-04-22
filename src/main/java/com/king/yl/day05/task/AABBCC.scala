package com.king.yl.day05.task

import scala.collection.mutable.ArrayBuffer


object AABBCC {

  //  val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
  //  将sentence 中各个字符，通过foldLeft存放到 一个ArrayBuffer中
  def main(args: Array[String]): Unit = {

    val sentence = "AAAAAABBCCCCCDDDDDDD"
    var arrayBuffer = ArrayBuffer[Char]()

    sentence.foldLeft(arrayBuffer)(putChar)
    println(arrayBuffer)


  }

  def putChar(arr:ArrayBuffer[Char], c:Char):ArrayBuffer[Char]={

    arr.append(c)
    arr

  }

}
