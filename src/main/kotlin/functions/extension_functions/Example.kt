package functions.extension_functions

fun String.repeated(): String = this + this + this

fun main() {
    val original = "ha"
    val repeated = original.repeated()
    println(repeated)  // Output: hahaha
}

// Examples of initializing and using the extension function
// val str = "hello"
// println(str.repeated())  // Output: hellohellohello
// val anotherStr = "world"
// println(anotherStr.repeated())  // Output: worldworldworld
