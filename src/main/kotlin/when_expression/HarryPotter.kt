package when_expression

fun main() {
    // This program uses a when expression to determine the Hogwarts house based on the first letter of the name
    println("Enter the first letter of your name:")
    val house = readln()

    when (house) {
        "gryffindor" -> println("bravery")
        "hufflepuff" -> println("loyalty")
        "slytherin" -> println("cunning")
        "ravenclaw" -> println("intellect")
        else -> println("not a valid house")
    }
}