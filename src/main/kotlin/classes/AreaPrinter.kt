package classes

class Rectangle {
    var width: Int = 0
    var height: Int = 0
}

fun printArea(rectangle: Rectangle) {
    val calculateArea = rectangle.width * rectangle.height
    println("Area: $calculateArea")
}

fun main() {
    // Creating an instance of the Rectangle class
    val rectangle1 = Rectangle()
    rectangle1.width = readln().toInt()
    rectangle1.height = readln().toInt()

    // Printing areas
    printArea(rectangle1)
}


