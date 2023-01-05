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
fun main() {

    /*println(sum(a, b))
    printSum()*/
//    var a = 1
//    var s1 = "a is $a"
//    a = 2
//    val s2 = "${s1.replace("is", "was")},but now is $a"
//
//    println(s2)
    println("max of 0 and 42 is ${maxOf(0, 42)}")

}