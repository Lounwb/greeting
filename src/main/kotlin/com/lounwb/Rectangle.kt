package com.lounwb


class Rectangle (var height: Double, var length: Double): Shape(){
    var perimeter = (height + length)*2
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(5.0, 3.0)
    println("The perimeter of rectangle is ${rectangle.perimeter}")

}