package annotations

// The whole file
// @file:Suppress("unused") // This annotation suppresses warnings for the entire file

fun oneStatement() {
    @Suppress("CanBeVal")
    var number = 45       // Warning will disappear from here
    var anotherNumber = 5 // Warning will still appear here
    println(number)
    println(anotherNumber)
}

// no warning at all!
@Suppress("CanBeVal")
fun wholeFunction() {
    var number = 45
    var anotherNumber = 5
    println(number)
    println(anotherNumber)
}

// The whole class
// Zero warnings
@Suppress("unused")
class MyClass {
    fun printNumber() {
        /*..*/
    }

    fun sumNumber() {
        /*..*/
    }
}

fun main() {
    oneStatement()
    wholeFunction()
    val myClass = MyClass()
    myClass.printNumber()
    myClass.sumNumber()
    // Uncomment the line below to test with a different input
    // println("This is a test for the main function.")
}





