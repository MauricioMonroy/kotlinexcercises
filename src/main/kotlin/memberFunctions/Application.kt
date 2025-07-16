package memberFunctions

class Application(val name: String) {
    fun run(string1: String, string2: String, string3: String) {
        println("$name")
        println("$string1")
        println("$string2")
        println("$string3")
    }
}

fun main() {
    val app = Application("My Application")
    app.run("Hello", "World", "!")
    // Output: My Application
    // Hello
    // World
    // !
}