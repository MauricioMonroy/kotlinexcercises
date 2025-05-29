package ranges

fun main() {
    // You can combine ranges using standard logical operators
    println("Enter three integers (a, b, c):")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    // Combine ranges using logical operators
    val withinCombined = c in a..b || c in b..a // a <= c <= b || b <= c <= a
    println("Is $c within the combined ranges [$a, $b] or [$b, $a]? $withinCombined")

    // Assigning the result to a variable that can be used later
    val isWithinCombined = c in a..b || c in b..a
    if (isWithinCombined) {
        println("$c is within the combined ranges.")
    } else {
        println("$c is outside the combined ranges.")
    }
    // Iterate over the combined ranges
    println("Iterating over the combined ranges:")
    for (i in a..b) {
        println(i)
    }
    for (i in b..a) {
        println(i)
    }
    // Note: The ranges are inclusive, so both endpoints are included in the iteration
}