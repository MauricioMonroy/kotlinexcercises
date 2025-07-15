package memberFunctions

class MyClass {
    fun print() = println("Hello from MyClass!")
}

// This class demonstrates the use of member functions in Kotlin.
class NyClassWithProperty(var property: Int) {
    fun printProperty() {
        println(this.property) // Accessing the property using `this` keyword
    }
}

// Calling a member function
fun main() {
    val myObject = NyClassWithProperty(10)
    myObject.printProperty()
}


