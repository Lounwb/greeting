package com.lounwb

val a = 1
val b = 2

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum() {
    println("$a + $b = ${a + b}")
}
/*fun maxOf(a: Int, b: Int): Int{
    if(a>=b){
        return a
    }
    return b
}*/
fun maxOf(a: Int, b: Int) = if (a >= b) a else b
fun describe(obj: Any): String =
    when(obj){
        1   -> "one"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "not a String"
        else -> "unknown"
    }
fun main() {

    /*println(sum(a, b))
    printSum()*/
//    var a = 1
//    var s1 = "a is $a"
//    a = 2
//    val s2 = "${s1.replace("is", "was")},but now is $a"
//
//    println(s2)
//    println("max of 0 and 42 is ${maxOf(0, 42)}")
//    var items = listOf("apple", "banana", "kiwifruit")
//    for (index in items.indices){
//        println("item at $index is ${items[index]}")
//    }
//    var index = 0
//    while(index < items.size){
//        println("item at $index is ${items[index++]}")
//    }
//    println(describe(1))
//    println(describe("Hello"))
//    println(describe(1000L))
//    println(describe(2))
//    println(describe("other"))
//    val x = 10
//    val y = 9
//    if (x in 1..y+1) {
//        println("fits in range")
//    }
//    val list = listOf("a", "b", "c")
//
//    println(list.size)
//    if (-1 !in 0..list.lastIndex) {
//        println("-1 is out of range")
//    }
//    println(list.indices)
//    if (list.size !in list.indices) {
//        println("list size is out of valid list indices range, too")
//    }
//    for(x in 1..5){
//        println(x)
//    }
}