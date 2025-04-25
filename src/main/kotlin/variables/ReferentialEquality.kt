package variables

// Comparison using referential equality
fun main() {
    val first = "first"
    val second = "second"
    var str = "first"

    println(first === str)    // true
    println(first === second) // false
    println(first !== second) // true
    println(second === str)   // false
}


