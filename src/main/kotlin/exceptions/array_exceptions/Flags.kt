package exceptions.array_exceptions

fun main() {
    val flags = booleanArrayOf(true, false, true)
    println(flags[-1]) // This will throw ArrayIndexOutOfBoundsException
//    println(flags[0])  // This will print: true
//    println(flags[4])  // This will throw ArrayIndexOutOfBoundsException
//    println(flags[3]) // This will throwArrayIndexOutOfBoundsException
}