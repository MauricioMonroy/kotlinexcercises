package whenExpression

fun main() {
    val string1 = readln()
    val processorOperator = readln()
    val string2 = readln()

    when (processorOperator) {
        "equals" -> println(string1 == string2)
        "plus" -> println(string1 + string2)
        "endsWith" -> println(string1.endsWith(string2))
        else -> println("Unknown operation")
    }
}