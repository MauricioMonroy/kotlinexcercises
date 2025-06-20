package strings

fun main() {
    val input = readln()
    if (input.isEmpty()) {
        println("")
        return
    }
    val firstSymbol = input.first()
    when (firstSymbol) {
        'i' -> {
            val numberPart = input.drop(1)
            try {
                println(numberPart.toInt() + 1)
            } catch (e: NumberFormatException) {
                println(input)
            }
        }

        's' -> {
            println(input.drop(1).reversed())
        }

        else -> {
            println(input)
        }
    }
}