package lambdaExpressions

// Syntactic sugar in Kotlin allows for more concise and readable code.
// In these examples, we will see how to use lambda expressions with syntactic sugar.
fun main() {
    // We don't need to specify a function and then take reference from it.
    val originalText = "I don't know... what to say..."
    val textWithoutDots = originalText.filter({ c: Char -> c != '.' })
    println(textWithoutDots) // I don't know what to say

    // Using the 'it' keyword to refer to the single parameter of a lambda expression
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubledNumbers = numbers.map { it * 2 }
    println(doubledNumbers) // [2, 4, 6, 8, 10]

    // Using the 'it' keyword with a filter function
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // [2, 4]

    // Using the 'it' keyword with a forEach function
    numbers.forEach { println(it) } // Prints each number in the list

    // Using the 'it' keyword with a reduce function
    val sum = numbers.reduce { acc, i -> acc + i }
    println(sum) // 15

    // Using the 'it' keyword with a fold function
    val product = numbers.fold(1) { acc, i -> acc * i }
    println(product) // 120

    // Using the 'it' keyword with a mapIndexed function
    val indexedNumbers = numbers.mapIndexed { index, value -> "$index: $value" }
    println(indexedNumbers) // [0: 1, 1: 2, 2: 3, 3: 4, 4: 5]

}
