package com.cekinmezyucel.hackerrank.functionalprogramming.introduction


object HelloWorldNTimes {
  
  def main(args: Array[String]) {
    f(4)
  }
  
  def f(n:Int) =  1 to n foreach {x => println("Hello World")}
  
}