package objects

class Example {
    private val msg = "Hi, I am a Kotlin object. " // Private property of the class

    // Copying by reference
    private val msg2 = msg + "This copy is private to the class." // Another private property

    // Mutability
    // val is immutable, var is mutable
    private var a: Int = 100
    private val anotherA: Int = a

    // Another example of mutability
    private var d1: Double = 1.5
    private val d2 = d1

    fun printMsg() {
        println(msg)
        println(msg.length)
        println(msg.reversed())
        println(msg.repeat(3))
        println(msg2)
        println("The value of a is $a")
        println(a == anotherA) // Comparing the values of a and anotherA
        println(a === anotherA) // Comparing the references of a and anotherA
        a = 200 // Changing the value of a
        println("The value of a is $a")
        println(a == anotherA) // Comparing the values of a and anotherA
        println(a === anotherA) // Comparing the references of a and anotherA
        println(d1 === d2) // true
        d1 += 1            // d1 is 2.5 now
        println(d1 === d2) // false
    }
}
fun main() {
    val obj = Example()
    obj.printMsg()
}

