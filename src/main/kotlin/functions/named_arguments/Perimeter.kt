// The perimeter() function calculate the perimeter of a polygon with 3 or 4 vertices.
// Vertices are represented by X and Y coordinates, and are passed sequentially.

import kotlin.math.*

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = x1, y4: Double = y1): Double {
    return if (x4 == x1 && y4 == y1) {
        hypot(x1 - x2, y1 - y2) + hypot(x2 - x3, y2 - y3) + hypot(x3 - x1, y3 - y1)
    } else {
        hypot(x1 - x2, y1 - y2) + hypot(x2 - x3, y2 - y3) + hypot(x3 - x4, y3 - y4) + hypot(x4 - x1, y4 - y1)
    }
}

fun main() {
   println(perimeter(0.0, 0.0, 12.0, 0.0, 0.0, 5.0))
}
