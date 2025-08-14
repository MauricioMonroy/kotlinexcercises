package collections.set.mutable_set

fun division(first: Set<Int>, second: Set<Int>): Set<Int> {
    val divisor = second.size
    return first.filter { num -> divisor != 0 && num % divisor == 0 }.toSet()
}

fun main() {
    val set1 = readln().split(" ").map { it.toInt() }.toSet()
    val set2 = readln().split(" ").map { it.toInt() }.toSet()
    val result = division(set1, set2)
    // printing the result without the commas
    println(result.joinToString(" "))
}