package extension_functions

fun Double.addInt(i: Int) = this + i.toDouble()

val result = 5.5.addInt(10)
// The receiver type is Double
// The receiver object is 5.5

fun main() {
    println(result)  // Output: 15.5
}

