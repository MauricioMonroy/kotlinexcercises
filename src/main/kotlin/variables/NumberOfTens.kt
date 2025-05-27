package variables

fun main() {
    val number = readln()?.toIntOrNull() ?: return
    val tens = (kotlin.math.abs(number) / 10) % 10
    println(tens)
}