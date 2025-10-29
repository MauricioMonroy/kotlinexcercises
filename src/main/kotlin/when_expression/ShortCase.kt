package when_expression

fun main() {
    println(when (readln().toInt()) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "other"
    })
}
