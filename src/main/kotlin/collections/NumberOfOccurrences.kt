package collections

fun solution(strings: List<String>, str: String): Int {
    // Count the number of occurrences of str in strings
    return strings.count { it == str }
}

fun main() {    
    val inputString = readln().split(" ")
    val occurrences = solution(
        inputString,
        readln()
    )
    println(occurrences)
}