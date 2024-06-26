package com.example.myapplication.kotlinex

class Mydemo {

    fun main() {
        var someLamda : (Int,Int) -> Int = {a:Int,b:Int -> a+b}
        var lamda1:(Int,Int,String)->Int =
            {
                    a,b,c ->
                println("message is "+c)
                a*b
            }
        println(lamda1(5,6,"welcome"))

        println(someLamda(10,20))
        // var otherLamda : (Int,Int,String) -> Int = {a:Int,b:Int,msg:String -> println(msg) a+b}
    }

    var lamda : (Int) -> Int = { a -> a*a}

    fun operation(): (Int) -> Int {                                     // 1
        // return lamda
        return ::square
    }

    fun square(x: Int) = x * x
}