package types_and_data_structures.floating_point

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val x = (c - b) / a // solve for x in the equation ax + b = c
    if (a == 0.0) {
        println("Division by zero is not allowed")
    } else {
        println(x)
    }
}

//@file:Suppress("All")
//fun main() = List(3) { readln().toDouble() }.let {
//    print((it[2].minus(it[1])).div(it[0]))
//}