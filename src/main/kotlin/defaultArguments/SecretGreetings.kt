package defaultArguments

fun greetings(name: String = "secret user"): String {
    return "Hello, $name!"
}

fun main() {
    println("Enter your name")
    readln()
    val result = greetings()

    println(result)
}