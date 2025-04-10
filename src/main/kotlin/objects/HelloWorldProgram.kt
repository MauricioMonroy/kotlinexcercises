package objects

fun main(args: Array<String>) {
    val myObject = object {
        var myVariable: String = "Hello, Kotlin!"
        val dollar = '$'
        fun printVariable() {
            println(myVariable + dollar)
        }
    }
    myObject.printVariable() // Output: Hello, Kotlin!
}