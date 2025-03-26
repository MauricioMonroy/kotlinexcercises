fun check(name: String): String? {
    return if (name.length > 5) null else name
}

fun main() {
    print("Type a name: ")
    val argument = readln()
    val result = check(argument)
    println(
        when {
            result == null -> 0
            result.length < 5 -> result.length
            else -> result
        }
    )
}
