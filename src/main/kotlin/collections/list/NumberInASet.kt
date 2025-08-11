package collections.list

fun main() {
    val n = readln().toInt()
    val numbers = mutableListOf<String>()
    for (i in 1..n) {
        numbers.add(readln())
    }
    val numberToCheck = readln()
    println(if (numbers.contains(numberToCheck)) "YES" else "NO")
}