package types_and_data_structures.strings.substring

import java.util.Locale.getDefault

fun main() {
    val greeting = "Hello, Kotlin!"
    println(greeting.substring(7, 13)) // Output: Kotlin
    println(greeting.take(5))  // Output: Hello
    println(greeting.drop(7))  // Output: Kotlin!
    println(greeting.removePrefix("Hello, ")) // Output: Kotlin!
    println(greeting.removeSuffix("Kotlin!")) // Output: Hello,

    // Additional examples
    println(greeting.substringAfter(", ")) // Output: Kotlin!
    println(greeting.substringBefore("!")) // Output: Hello, Kotlin
    println(greeting.substringAfterLast("o")) // Output: , Kotlin!
    println(greeting.substringBeforeLast("o")) // Output: Hello, K

    // Replacing parts of the string
    println(greeting.replace("Kotlin", "World")) // Output: Hello, World!
    println(greeting.replaceFirst("l", "L")) // Output: HeLlo, Kotlin!
    println(greeting.replaceAfter(", ", "Java!")) // Output: Hello, Java!
    println(greeting.replaceBefore("Kotlin", "Hi")) // Output: HiKotlin
    println(greeting.replaceAfterLast("o", " everyone!")) // Output: Hello, Ko everyone!
    println(greeting.replaceBeforeLast("o", "Greetings")) // Output: Greetingsotlin

    // Changing case
    println(greeting.uppercase()) // Output: HELLO, KOTLIN!
    println(greeting.lowercase()) // Output: hello, kotlin!
    println(greeting.replaceFirstChar { if (it.isLowerCase()) it.titlecase(getDefault()) else it.toString() }) // Output: Hello, kotlin!
    println(greeting.replaceFirstChar { it.lowercase(getDefault()) }) // Output: hello, Kotlin!
}