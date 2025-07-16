package constructors

class Point2D(val x: Double, val y: Double)

fun main() {
    val point = Point2D(3.0, 4.0)
    println("Point coordinates: (${point.x}, ${point.y})")
}