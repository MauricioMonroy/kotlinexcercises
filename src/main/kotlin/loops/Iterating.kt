package loops

fun iterateNumbers() {
    for (i in 1..5) {
        println(i)
    }
}

fun iterateExcludingUpperLimit() {
    for (i in 1 until 5) {
        println(i)
    }
}

fun iterateCharacters() {
    for (c in 'a'..'f') {
        println(c)
    }
}

fun iterateWithStep() {
    for (i in 1..8 step 2) {
        println(i)
    }
}

fun iterateThroughString() {
    val str = "Hello"
    for (c in str) {
        println(c)
    }
}

fun iterateBackwards() {
    for (i in 5 downTo 1) {
        println(i)
    }
}

fun main() {
    println("Iterating numbers from 1 to 5:")
    iterateNumbers()

    println("\nIterating numbers from 1 to 5 (excluding upper limit):")
    iterateExcludingUpperLimit()

    println("\nIterating types_and_data_structures.characters from 'a' to 'f':")
    iterateCharacters()

    println("\nIterating numbers from 1 to 8 with step 2:")
    iterateWithStep()

    println("\nIterating through the string 'Hello':")
    iterateThroughString()

    println("\nIterating backwards from 5 to 1:")
    iterateBackwards()
}