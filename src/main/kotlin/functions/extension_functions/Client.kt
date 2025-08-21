package functions.extension_functions

// It is possible to add extension functions to existing classes in Kotlin.
class Client(val name: String, val age: Int)

// Here we define an extension function for the Client class that returns a string with the client's name and age.
// This function can be called on any instance of the Client class.
fun Client.getInfo() = "$name $age"

// Creating an instance of Client and using the extension function to get the client's information.
val client1 = Client("John", 42)
fun main() {
    println(client1.getInfo())  // Output: John 42
}
